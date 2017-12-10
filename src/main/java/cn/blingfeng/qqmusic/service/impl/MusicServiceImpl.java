package cn.blingfeng.qqmusic.service.impl;

import cn.blingfeng.qqmusic.pojo.*;
import cn.blingfeng.qqmusic.service.MusicService;
import cn.blingfeng.qqmusic.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.imageio.stream.ImageInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : blingfeng
 * @date : 2017/12/10
 * @description
 **/
@Service
@Slf4j
public class MusicServiceImpl implements MusicService {
    @Override
    public DisslistResult dissList(String uin) {
        String musicUrl = "https://c.y.qq.com/rsc/fcgi-bin/fcg_get_profile_homepage.fcg?g_tk=590160334&loginUin=" + uin + "&hostUin=0&format=jsonp&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0&cid=205360838&ct=20&userid=" + uin + "&reqfrom=1&reqtype=0";
        String prefer = "http://y.qq.com/m/client/profile/prefer.html?userid=" + uin;
        RestTemplate template = new RestTemplate();
        QDisslist disslist = template.getForObject(musicUrl, QDisslist.class);
        DisslistResult musicResult = new DisslistResult();
        musicResult.setUin(uin);
        musicResult.setCode(disslist.getCode());
        musicResult.setTaste(prefer);
        musicResult.setName(disslist.getData().getCreator().getNick());
        List<cn.blingfeng.qqmusic.pojo.List> dissList = disslist.getData().getMydiss().getList();
        List<DisslistBean> disslistBeanList = dissList.stream().map(e -> new DisslistBean(e.getPicurl(), e.getTitle(), Long.parseLong(e.getSubtitle().substring(0, e.getSubtitle().indexOf("首"))), e.getDissid())).collect(Collectors.toList());
        musicResult.setDisslist(disslistBeanList);
        return musicResult;
    }

    @Override
    public DissContentResult dissContentList(String dissId) {
        String result = "";
        String url = "https://c.y.qq.com/qzone/fcg-bin/fcg_ucc_getcdinfo_byids_cp.fcg?type=1&json=1&utf8=1&onlysong=0&disstid=" + dissId + "&format=jsonp&g_tk=5381&loginUin=0&hostUin=0&format=jsonp&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0";
        BufferedReader in = null;
        DissContentResult dissContentResult = null;
        try {
            String urlNameString = url;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("authority", "c.y.qq.com");
            connection.setRequestProperty("referer", "https://y.qq.com/n/yqq/playlist/" + dissId + ".html");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            result = result.substring(result.indexOf("(") + 1, result.lastIndexOf(")"));

            QDissContent qDissContent = JsonUtil.jsonToPojo(result, QDissContent.class);
            dissContentResult = new DissContentResult();
            dissContentResult.setTotal_song_num(qDissContent.getCdlist().get(0).getTotal_song_num());
            dissContentResult.setLogo(qDissContent.getCdlist().get(0).getLogo());
            dissContentResult.setDiss_name(qDissContent.getCdlist().get(0).getDissname());
            dissContentResult.setCreate_time(qDissContent.getCdlist().get(0).getCtime());
            dissContentResult.setSong_list(qDissContent.getCdlist().get(0).getSonglist().stream().map(e -> new SongListBean(e.getAlbummid(), e.getAlbumname(), e.getInterval(), e.getSongmid(), e.getSongname(), e.getSinger().stream().map(x -> new SingerBean(x.getMid(), x.getName())).collect(Collectors.toList()))).collect(Collectors.toList()));
        } catch (Exception e) {
            log.error("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return dissContentResult;
    }

    @Override
    /**
     * 先获取vkey，然后获得真实链接
     */
    public String songUrl(String guid, String songmid) {
        String filename = "C400" + songmid + ".m4a";
        String url = "https://c.y.qq.com/base/fcgi-bin/fcg_music_express_mobile3.fcg?g_tk=515559997&loginUin=845356194&hostUin=0&format=json&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0&cid=205361747&uin=845356194&songmid=" + songmid + "&filename=" + filename + "&guid=" + guid;
        BufferedReader in = null;
        String result = "";
        QMusicVkey qMusicVkey = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("content-type", "application/json;charset=UTF-8");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

            qMusicVkey = JsonUtil.jsonToPojo(result, QMusicVkey.class);
        } catch (Exception e) {
            log.error("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        try {
            if (in != null) {
                in.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String vkey = qMusicVkey.getData().getItems().get(0).getVkey();
        String songUrl = "http://dl.stream.qqmusic.qq.com/" + filename + "?vkey=" + vkey + "&guid=" + guid + "&uin=845356194&fromtag=66";
        return songUrl;
    }


}

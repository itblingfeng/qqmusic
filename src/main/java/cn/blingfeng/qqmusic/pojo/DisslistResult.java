package cn.blingfeng.qqmusic.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : blingfeng
 * @date : 2017/12/10
 * @description
 **/
@NoArgsConstructor
@Data
public class DisslistResult {

    /**
     * code : 0
     * uin : 845356193
     * name : ☞小资不再是梦☜
     * taste : http://y.qq.com/m/client/profile/prefer.html?userid=845356193
     * disslist : [{"diss_cover":"http://y.gtimg.cn/mediastyle/global/img/cover_qzone.png","diss_name":"QZone背景音乐","song_num":5,"id":0},{"diss_cover":"http://y.gtimg.cn/mediastyle/global/img/cover_like.png","diss_name":"我喜欢","song_num":1,"id":1726298844},{"diss_cover":"http://y.gtimg.cn/music/photo/album_300/65/300_albumpic_964565_0.jpg","diss_name":"我最爱听","song_num":1,"id":1726298845},{"diss_cover":"http://y.gtimg.cn/music/photo/album_300/39/300_albumpic_89139_0.jpg","diss_name":"默认收藏","song_num":0,"id":1726298846}]
     */

    private int code;
    private String uin;
    private String name;
    private String taste;
    private List<DisslistBean> disslist;
}

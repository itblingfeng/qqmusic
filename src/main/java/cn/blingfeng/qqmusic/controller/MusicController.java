package cn.blingfeng.qqmusic.controller;

import cn.blingfeng.qqmusic.exception.MusicException;
import cn.blingfeng.qqmusic.pojo.*;
import cn.blingfeng.qqmusic.service.MusicService;
import cn.blingfeng.qqmusic.utils.JsonUtil;
import lombok.experimental.var;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : blingfeng
 * @date : 2017/12/09
 * @description
 **/
@RestController
@Slf4j
@RequestMapping("/api/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    /**
     * 获取用户歌单
     *
     * @param uin
     * @return
     * @throws IOException
     */
    @GetMapping("/disslist")
    public DisslistResult disslist(@RequestParam("uin") String uin) throws IOException {

        if (StringUtils.isEmpty(uin)) {
            throw new MusicException(1);
        }
        DisslistResult musicResult = musicService.dissList(uin);
        return musicResult;
    }

    /**
     * 获取歌单内容
     * @param dissListId
     * @return
     */
    @GetMapping("/disscontent")
    public DissContentResult dissContent(@RequestParam("id") String dissListId) {
        if (StringUtils.isEmpty(dissListId)) {
            throw new MusicException(1);
        }
        DissContentResult dissContentResult = musicService.dissContentList(dissListId);
        return dissContentResult;
    }

    /**
     * 获取歌曲原始地址
     * @param guid
     * @param songmid
     * @return
     */
    @GetMapping("/song")
    public String song(@RequestParam("guid") String guid,
                       @RequestParam("songmid") String songmid) {
        String url = musicService.songUrl(guid, songmid);
        return url;
    }
}

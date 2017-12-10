package cn.blingfeng.qqmusic.service;

import cn.blingfeng.qqmusic.pojo.DissContentResult;
import cn.blingfeng.qqmusic.pojo.DisslistResult;
import cn.blingfeng.qqmusic.pojo.QMusicVkey;

/**
 * @author : blingfeng
 * @date : 2017/12/10
 * @description
 **/
public interface MusicService {
    /**
     * 获取歌单列表
     * @param uin
     * @return
     */
    DisslistResult dissList(String uin);


    DissContentResult dissContentList(String dissContentId);

    String songUrl(String guid,String songmid);
}

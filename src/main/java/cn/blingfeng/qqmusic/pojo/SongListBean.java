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
public class SongListBean {
    /**
     * albummid : 001ZW6Fc0dTqRp
     * albumname : 2006KTV点唱精选国语总排行
     * interval : 04:29
     * songmid : 002VW6Rj4OxilU
     * songname : 死了都要爱
     * singer : [{"mid":"002m2KUd0283YC","name":"信乐团"}]
     */

    private String albummid;
    private String albumname;
    private String interval;
    private String songmid;
    private String songname;
    private List<SingerBean> singer;

    public SongListBean(String albummid, String albumname, String interval, String songmid, String songname, List<SingerBean> singer) {
        this.albummid = albummid;
        this.albumname = albumname;
        this.interval = interval;
        this.songmid = songmid;
        this.songname = songname;
        this.singer = singer;
    }
}

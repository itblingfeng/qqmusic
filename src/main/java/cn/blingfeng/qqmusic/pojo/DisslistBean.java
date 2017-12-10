package cn.blingfeng.qqmusic.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : blingfeng
 * @date : 2017/12/10
 * @description
 **/
@NoArgsConstructor
@Data
public class DisslistBean {
    /**
     * diss_cover : http://y.gtimg.cn/mediastyle/global/img/cover_qzone.png
     * diss_name : QZone背景音乐
     * song_num : 5
     * id : 0
     */

    private String diss_cover;
    private String diss_name;
    private long song_num;
    private int id;

    public DisslistBean(String diss_cover, String diss_name, long song_num, int id) {
        this.diss_cover = diss_cover;
        this.diss_name = diss_name;
        this.song_num = song_num;
        this.id = id;
    }
}

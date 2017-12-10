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
public class List {
    /**
     * dissid : 1963659359
     * dirid : 4
     * picurl :
     * title : 啊啊
     * subtitle : 0首    9次播放
     * icontype : 0
     * iconurl :
     * isshow : 1
     */

    private int dissid;
    private int dirid;
    private String picurl;
    private String title;
    private String subtitle;
    private int icontype;
    private String iconurl;
    private int isshow;
}

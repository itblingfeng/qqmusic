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
public class Myradio {
    /**
     * title : 主播电台 0
     * jumpurl : https://y.qq.com/m/client/personal_radio/index.html?uin=845356194
     * jumpkey : radio_more
     * laypic : https://y.gtimg.cn/music/common/upload/t_cm3_photo_publish/132769.png
     * totalcnt : 0
     * list : []
     */

    private String title;
    private String jumpurl;
    private String jumpkey;
    private String laypic;
    private int totalcnt;
    private List<?> list;
}

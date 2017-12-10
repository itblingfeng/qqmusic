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
public class Mymusic {
    /**
     * title : 喜欢
     * picurl : http://y.gtimg.cn/music/photo_new/T002R300x300M000001ZW6Fc0dTqRp.jpg
     * laypic : http://y.gtimg.cn/music/photo_new/T011M000003y0CAs30Zplm.png
     * subtitle : 17首单曲
     * jumpurl : http://y.qq.com/w/taoge.html?ADTAG=profile_h5&id=1963659358
     * jumptype : 0
     * jumpkey :
     * id : 1963659358
     * music_bykey : {"url_key":"w_taoge","url_params":"ADTAG=profile_h5&id=1963659358"}
     * type : 1
     * num0 : 17
     * num1 : 0
     * num2 : 0
     */

    private String title;
    private String picurl;
    private String laypic;
    private String subtitle;
    private String jumpurl;
    private int jumptype;
    private String jumpkey;
    private String id;
    private ShareBykey music_bykey;
    private int type;
    private int num0;
    private int num1;
    private int num2;
}

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
public class Medal {
    /**
     * flag : 0
     * iconurl : http://y.gtimg.cn/music/icon/h5/medal_g.png
     * jumpurl : http://y.qq.com/m/medal/index.html
     * jumpkey : ia_singer_metal_index
     * medal_bykey : {"url_key":"ia_singer_metal_index","url_params":""}
     */

    private int flag;
    private String iconurl;
    private String jumpurl;
    private String jumpkey;
    private ShareBykey medal_bykey;
}

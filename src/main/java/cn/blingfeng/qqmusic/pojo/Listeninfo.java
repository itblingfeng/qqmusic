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
public class Listeninfo {
    /**
     * iconurl : http://y.gtimg.cn/music/icon/h5/listen/lv3.png
     * jumpurl : http://y.qq.com/m/acclevel/index.html?uin=845356194
     * jumpkey : ia_my_acclevel
     * listen_bykey : {"url_key":"acclevel_index","url_params":"uin=845356194"}
     */

    private String iconurl;
    private String jumpurl;
    private String jumpkey;
    private ShareBykey listen_bykey;
}

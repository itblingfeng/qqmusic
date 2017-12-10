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
public class Typeinfo {
    /**
     * type : 0
     * jumpurl : http://y.qq.com/m/client/profile/prefer.html?ADTAG=share&_wv=1&userid=845356194#wechat_redirect
     * cfinfo_bykey : {"url_key":"profile_prefer","url_params":"ADTAG=share&userid=845356194"}
     * jumpkey : ia_taste_info_jump
     * iconurl :
     */

    private int type;
    private String jumpurl;
    private ShareBykey cfinfo_bykey;
    private String jumpkey;
    private String iconurl;
}

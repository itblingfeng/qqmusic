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
public class Cfinfo {
    /**
     * title :
     * jumpurl : http://y.qq.com/m/client/profile/prefer.html?ADTAG=share&_wv=1&userid=845356194#wechat_redirect
     * jumpkey : ia_taste_info_jump
     * cfinfo_bykey : {"url_key":"profile_prefer","url_params":"ADTAG=share&userid=845356194"}
     * similar : 0
     */

    private String title;
    private String jumpurl;
    private String jumpkey;
    private ShareBykey cfinfo_bykey;
    private int similar;
}

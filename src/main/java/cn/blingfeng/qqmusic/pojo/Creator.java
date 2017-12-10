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
public class Creator {
    /**
     * nick : .
     * headpic : http://thirdqq.qlogo.cn/g?b=sdk&k=JIcCYThDO5QXNyRhBekOTA&s=140&t=1501082848
     * ifpic :
     * uin : 845356194
     * forbidden : 0
     * is_bind_weibo : 0
     * weibo_uid :
     * weibo_nick :
     * extra :
     * singerinfo : {"singerid":0}
     * uin_web : 845356194
     * encrypt_uin : Nevkoi4soKEP
     * isfollow : 0
     * islock : 0
     * shareurl : http://y.qq.com/m/share/profile/index.html?userid=845356194
     * share_bykey : {"url_key":"share_profile_index","url_params":"userid=845356194"}
     * jumpkey : ia_share_profile
     * typeinfo : {"type":0,"jumpurl":"http://y.qq.com/m/client/profile/prefer.html?ADTAG=share&_wv=1&userid=845356194#wechat_redirect","cfinfo_bykey":{"url_key":"profile_prefer","url_params":"ADTAG=share&userid=845356194"},"jumpkey":"ia_taste_info_jump","iconurl":""}
     * lvinfo : [{"iconurl":"http://y.gtimg.cn/music/icon/v1/pc/svip_g.png","jumpurl":"http://y.qq.com/m/myservice/index.html","jumpkey":"ia_default_my_vip","lvinfo_bykey":{"url_key":"my_service_index","url_params":""}}]
     * medal : {"flag":0,"iconurl":"http://y.gtimg.cn/music/icon/h5/medal_g.png","jumpurl":"http://y.qq.com/m/medal/index.html","jumpkey":"ia_singer_metal_index","medal_bykey":{"url_key":"ia_singer_metal_index","url_params":""}}
     * listeninfo : {"iconurl":"http://y.gtimg.cn/music/icon/h5/listen/lv3.png","jumpurl":"http://y.qq.com/m/acclevel/index.html?uin=845356194","jumpkey":"ia_my_acclevel","listen_bykey":{"url_key":"acclevel_index","url_params":"uin=845356194"}}
     * backpic : {"picurl":"http://y.gtimg.cn/music/photo_new/T011M000001FIOvt4VuPOb.png","type":4,"title":""}
     * cfinfo : {"title":"","jumpurl":"http://y.qq.com/m/client/profile/prefer.html?ADTAG=share&_wv=1&userid=845356194#wechat_redirect","jumpkey":"ia_taste_info_jump","cfinfo_bykey":{"url_key":"profile_prefer","url_params":"ADTAG=share&userid=845356194"},"similar":0}
     * nums : {"visitornum":0,"fansnum":0,"follownum":4,"followusernum":0,"followsingernum":4,"frdnum":0}
     */

    private String nick;
    private String headpic;
    private String ifpic;
    private int uin;
    private int forbidden;
    private int is_bind_weibo;
    private String weibo_uid;
    private String weibo_nick;
    private String extra;
    private Singerinfo singerinfo;
    private String uin_web;
    private String encrypt_uin;
    private int isfollow;
    private int islock;
    private String shareurl;
    private ShareBykey share_bykey;
    private String jumpkey;
    private Typeinfo typeinfo;
    private Medal medal;
    private Listeninfo listeninfo;
    private Backpic backpic;
    private Cfinfo cfinfo;
    private Nums nums;
    private List<Lvinfo> lvinfo;
}

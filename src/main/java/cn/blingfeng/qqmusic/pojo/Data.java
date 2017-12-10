package cn.blingfeng.qqmusic.pojo;

import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : blingfeng
 * @date : 2017/12/10
 * @description
 **/
@NoArgsConstructor
@lombok.Data
public class Data {
    /**
     * creator : {"nick":".","headpic":"http://thirdqq.qlogo.cn/g?b=sdk&k=JIcCYThDO5QXNyRhBekOTA&s=140&t=1501082848","ifpic":"","uin":845356194,"forbidden":0,"is_bind_weibo":0,"weibo_uid":"","weibo_nick":"","extra":"","singerinfo":{"singerid":0},"uin_web":"845356194","encrypt_uin":"Nevkoi4soKEP","isfollow":0,"islock":0,"shareurl":"http://y.qq.com/m/share/profile/index.html?userid=845356194","share_bykey":{"url_key":"share_profile_index","url_params":"userid=845356194"},"jumpkey":"ia_share_profile","typeinfo":{"type":0,"jumpurl":"http://y.qq.com/m/client/profile/prefer.html?ADTAG=share&_wv=1&userid=845356194#wechat_redirect","cfinfo_bykey":{"url_key":"profile_prefer","url_params":"ADTAG=share&userid=845356194"},"jumpkey":"ia_taste_info_jump","iconurl":""},"lvinfo":[{"iconurl":"http://y.gtimg.cn/music/icon/v1/pc/svip_g.png","jumpurl":"http://y.qq.com/m/myservice/index.html","jumpkey":"ia_default_my_vip","lvinfo_bykey":{"url_key":"my_service_index","url_params":""}}],"medal":{"flag":0,"iconurl":"http://y.gtimg.cn/music/icon/h5/medal_g.png","jumpurl":"http://y.qq.com/m/medal/index.html","jumpkey":"ia_singer_metal_index","medal_bykey":{"url_key":"ia_singer_metal_index","url_params":""}},"listeninfo":{"iconurl":"http://y.gtimg.cn/music/icon/h5/listen/lv3.png","jumpurl":"http://y.qq.com/m/acclevel/index.html?uin=845356194","jumpkey":"ia_my_acclevel","listen_bykey":{"url_key":"acclevel_index","url_params":"uin=845356194"}},"backpic":{"picurl":"http://y.gtimg.cn/music/photo_new/T011M000001FIOvt4VuPOb.png","type":4,"title":""},"cfinfo":{"title":"","jumpurl":"http://y.qq.com/m/client/profile/prefer.html?ADTAG=share&_wv=1&userid=845356194#wechat_redirect","jumpkey":"ia_taste_info_jump","cfinfo_bykey":{"url_key":"profile_prefer","url_params":"ADTAG=share&userid=845356194"},"similar":0},"nums":{"visitornum":0,"fansnum":0,"follownum":4,"followusernum":0,"followsingernum":4,"frdnum":0}}
     * mymusictype : TA的音乐
     * mymusic : [{"title":"喜欢","picurl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001ZW6Fc0dTqRp.jpg","laypic":"http://y.gtimg.cn/music/photo_new/T011M000003y0CAs30Zplm.png","subtitle":"17首单曲","jumpurl":"http://y.qq.com/w/taoge.html?ADTAG=profile_h5&id=1963659358","jumptype":0,"jumpkey":"","id":"1963659358","music_bykey":{"url_key":"w_taoge","url_params":"ADTAG=profile_h5&id=1963659358"},"type":1,"num0":17,"num1":0,"num2":0},{"title":"那年今日","picurl":"http://y.gtimg.cn/music/photo_new/T011M000001uq3c24THbxs.jpg","laypic":"http://y.gtimg.cn/music/photo_new/T011M000003eWhtd0N6zFl.png","subtitle":"时间匆匆仍有你的音乐相伴","jumpurl":"http://y.qq.com/m/client/theday/index.html?ADTAG=profile_h5&fuin=845356194&fnick=.","jumptype":1,"jumpkey":"ia_year_of_today","id":"0","music_bykey":{"url_key":"theday_index","url_params":"ADTAG=profile_h5&fuin=845356194&fnick=."},"type":2}]
     * mydiss : {"num":4,"title":"歌单","laypic":"https://y.gtimg.cn/music/common/upload/t_cm3_photo_publish/132770.png","jumpurl":"http://www.qq.com","list":[{"dissid":1963659359,"dirid":4,"picurl":"","title":"啊啊","subtitle":"0首    9次播放    ","icontype":0,"iconurl":"","isshow":1},{"dissid":1963659360,"dirid":3,"picurl":"","title":"啊啊啊","subtitle":"0首    9次播放    ","icontype":0,"iconurl":"","isshow":1},{"dissid":1963659361,"dirid":2,"picurl":"","title":"我最爱听","subtitle":"1首    12次播放    ","icontype":0,"iconurl":"","isshow":1},{"dissid":1963659362,"dirid":1,"picurl":"","title":"默认收藏","subtitle":"24首    12次播放    ","icontype":0,"iconurl":"","isshow":1}]}
     * video : {"num":0,"title":"","jumpurl":"","jumpkey":"ia_post_video_more","list":[]}
     * myarticle : {"title":"专栏文章 0","jumpurl":"https://y.qq.com/m/client/personal_magazine/index.html?uin=845356194","jumpkey":"magazine_more","laypic":"https://y.gtimg.cn/music/common/upload/t_cm3_photo_publish/132771.png","totalcnt":0,"list":[]}
     * myradio : {"title":"主播电台 0","jumpurl":"https://y.qq.com/m/client/personal_radio/index.html?uin=845356194","jumpkey":"radio_more","laypic":"https://y.gtimg.cn/music/common/upload/t_cm3_photo_publish/132769.png","totalcnt":0,"list":[]}
     */

    private Creator creator;
    private String mymusictype;
    private Mydiss mydiss;
    private Video video;
    private Myarticle myarticle;
    private Myradio myradio;
    private List<Mymusic> mymusic;
}

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
public class Lvinfo {
    /**
     * iconurl : http://y.gtimg.cn/music/icon/v1/pc/svip_g.png
     * jumpurl : http://y.qq.com/m/myservice/index.html
     * jumpkey : ia_default_my_vip
     * lvinfo_bykey : {"url_key":"my_service_index","url_params":""}
     */

    private String iconurl;
    private String jumpurl;
    private String jumpkey;
    private ShareBykey lvinfo_bykey;
}

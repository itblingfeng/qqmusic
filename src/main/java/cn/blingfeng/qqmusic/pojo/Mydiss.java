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
public class Mydiss {
    /**
     * num : 4
     * title : 歌单
     * laypic : https://y.gtimg.cn/music/common/upload/t_cm3_photo_publish/132770.png
     * jumpurl : http://www.qq.com
     * list : [{"dissid":1963659359,"dirid":4,"picurl":"","title":"啊啊","subtitle":"0首    9次播放    ","icontype":0,"iconurl":"","isshow":1},{"dissid":1963659360,"dirid":3,"picurl":"","title":"啊啊啊","subtitle":"0首    9次播放    ","icontype":0,"iconurl":"","isshow":1},{"dissid":1963659361,"dirid":2,"picurl":"","title":"我最爱听","subtitle":"1首    12次播放    ","icontype":0,"iconurl":"","isshow":1},{"dissid":1963659362,"dirid":1,"picurl":"","title":"默认收藏","subtitle":"24首    12次播放    ","icontype":0,"iconurl":"","isshow":1}]
     */

    private int num;
    private String title;
    private String laypic;
    private String jumpurl;
    private java.util.List<List> list;
}

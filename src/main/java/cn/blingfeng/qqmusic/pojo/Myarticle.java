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
public class Myarticle {
    /**
     * title : 专栏文章 0
     * jumpurl : https://y.qq.com/m/client/personal_magazine/index.html?uin=845356194
     * jumpkey : magazine_more
     * laypic : https://y.gtimg.cn/music/common/upload/t_cm3_photo_publish/132771.png
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

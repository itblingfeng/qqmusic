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
public class Video {
    /**
     * num : 0
     * title :
     * jumpurl :
     * jumpkey : ia_post_video_more
     * list : []
     */

    private int num;
    private String title;
    private String jumpurl;
    private String jumpkey;
    private List<?> list;
}

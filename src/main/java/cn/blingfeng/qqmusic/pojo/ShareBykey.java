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
public class ShareBykey {
    /**
     * url_key : share_profile_index
     * url_params : userid=845356194
     */

    private String url_key;
    private String url_params;
}

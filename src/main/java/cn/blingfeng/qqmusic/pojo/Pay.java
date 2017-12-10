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
public class Pay {
    /**
     * payalbum : 0
     * payalbumprice : 0
     * paydownload : 1
     * payinfo : 1
     * payplay : 0
     * paytrackmouth : 1
     * paytrackprice : 200
     * timefree : 0
     */

    private int payalbum;
    private int payalbumprice;
    private int paydownload;
    private int payinfo;
    private int payplay;
    private int paytrackmouth;
    private int paytrackprice;
    private int timefree;
}

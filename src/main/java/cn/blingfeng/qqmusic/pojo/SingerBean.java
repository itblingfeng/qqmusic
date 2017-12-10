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
public class SingerBean {
    /**
     * mid : 002m2KUd0283YC
     * name : 信乐团
     */

    private String mid;
    private String name;

    public SingerBean(String mid, String name) {
        this.mid = mid;
        this.name = name;
    }
}

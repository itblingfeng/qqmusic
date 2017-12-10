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
public class QData {
    /**
     * expiration : 80400
     * items : [{"subcode":0,"songmid":"000YU69H3N55rZ","filename":"C400000YU69H3N55rZ.m4a","vkey":"B4E7572D9EC2D9B3139CBAB1D155066F1BE05E9179507EBD7B10ED154F6C70C7E6ABF2665F27D9E4F7F41BECB23A183D988B6D372CAFB83C"}]
     */

    private String expiration;
    private List<Items> items;
}

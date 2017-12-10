package cn.blingfeng.qqmusic.exception;

import lombok.Data;

/**
 * @author : blingfeng
 * @date : 2017/12/09
 * @description
 **/
@Data
public class MusicException extends RuntimeException {
    private Integer code;

   public MusicException(Integer code) {
        super();
        this.code = code;
    }

}

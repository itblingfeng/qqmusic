package cn.blingfeng.qqmusic.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : blingfeng
 * @date : 2017/12/10
 * @description
 **/
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Singer {
    /**
     * id : 0
     * name : 六哲
     * FI : 0
     */

    private String id;
    private String name;
    private String mid;
//http://dl.stream.qqmusic.qq.com/C400004WAfxJ1q8L9h.m4a?vkey=947D4A629AEA4912CC608E16013A6392E936A7AF1D979910175FCE4F401278DCC0BF60F2B65C19ACEDCDCB5BFA8A4581DA624E245F2BD108&guid=6141019828&uin=845356194&fromtag=66
//http://dl.stream.qqmusic.qq.com/C400004WAfxJ1q8L9h.m4a?vkey=FBE95606620155BF9E417B66D0A0F03EA57DD3C07A29FA46C00E30252976E35FA06CC5D8DF1CB4367652526F89C65B09FB0104C4C264D6FA&guid=4911233751&uin=845356194&fromtag=66
}

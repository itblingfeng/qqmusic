package cn.blingfeng.qqmusic.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : blingfeng
 * @date : 2017/12/10
 * @description
 **/
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Songlist {
    /**
     * songid : 842121207
     * songname : 被伤过的心可以爱谁
     * xerror : 0
     * status : 1
     * albumid : 0
     * albumname :
     * singer : [{"id":0,"name":"六哲","FI":0}]
     * format :
     * interval : 0
     * songurl : http://m.yy.com/s/hd/liuzhe/music/20100301063507360.mp3
     * switch : 1049363
     * songtype : 1
     * type : 1
     * alertid : 0
     * msgid : 0
     * FI : 0
     * albumdesc :
     * albummid : 002Neh8l0uciQZ
     * belongCD : 11
     * cdIdx : 0
     * isonly : 1
     * label : 5764624977789714433
     * pay : {"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0}
     * preview : {"trybegin":54048,"tryend":76877,"trysize":366131}
     * rate : 0
     * size128 : 3581117
     * size320 : 8929849
     * size5_1 : 0
     * sizeape : 25245000
     * sizeflac : 26093502
     * sizeogg : 5156630
     * songmid : 003aAYrm3GE0Ac
     * songorig : 稻香
     * strMediaMid : 003aAYrm3GE0Ac
     * stream : 9
     * vid : l0013kgn1be
     */

    private String songid;
    private String songname;
    private int xerror;
    private int status;
    private int albumid;
    private String albumname;
    private String format;
    private String interval;
    private String songurl;
    private int switchX;
    private int songtype;
    private int type;
    private int alertid;
    private int msgid;
    private int FI;
    private String albumdesc;
    private String albummid;
    private int belongCD;
    private int cdIdx;
    private int isonly;
    private String label;
    private Pay pay;
    private Preview preview;
    private int rate;
    private int size128;
    private int size320;
    private int size5_1;
    private int sizeape;
    private int sizeflac;
    private int sizeogg;
    private String songmid;
    private String songorig;
    private String strMediaMid;
    private int stream;
    private String vid;
    private List<Singer> singer;
}

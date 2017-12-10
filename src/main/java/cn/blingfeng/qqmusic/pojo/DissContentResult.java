package cn.blingfeng.qqmusic.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author : blingfeng
 * @date : 2017/12/10
 * @description
 **/
@NoArgsConstructor
@Data
public class DissContentResult {

    /**
     * diss_name : 我喜欢
     * logo : http://y.gtimg.cn/mediastyle/y/img/cover_love_300.jpg
     * create_time : 1970-01-01 08:00:00
     * total_song_num : 17
     * song_list : [{"albummid":"001ZW6Fc0dTqRp","albumname":"2006KTV点唱精选国语总排行","interval":"04:29","songmid":"002VW6Rj4OxilU","songname":"死了都要爱","singer":[{"mid":"002m2KUd0283YC","name":"信乐团"}]},{"albummid":"003pKram2DPwm5","albumname":"Love Me Like You Do (From \"Fifty Shades of Grey\")","interval":"04:10","songmid":"001zhxVn0sqZ45","songname":"Love Me Like You Do","singer":[{"mid":"001YMoro1NL5hU","name":"Ellie Goulding"}]},{"albummid":"001Vc5MJ1dD7JX","albumname":"Booty Music","interval":"03:01","songmid":"002FG4QA260Osi","songname":"Booty Music","singer":[{"mid":"000qLy4P0Lv0tl","name":"Git Fresh"}]},{"albummid":"0011epgo3Ehr9D","albumname":"原来我一直都不孤单","interval":"04:21","songmid":"00455Vhj4KuMaA","songname":"有没有人告诉你","singer":[{"mid":"002PZBgg1S9xPX","name":"陈楚生"}]},{"albummid":"003V9BFL4aZjC3","albumname":"Timbaland Presents: Shock Value","interval":"03:04","songmid":"003goMP61RK1mV","songname":"Apologize","singer":[{"mid":"0019fymM3ZZ1oi","name":"Timbaland"},{"mid":"0004LscG3FtUDz","name":"OneRepublic"}]},{"albummid":"004UJiGZ41RuhZ","albumname":"肩上蝶","interval":"04:16","songmid":"001qULbd2IPmXQ","songname":"肩上蝶","singer":[{"mid":"004YXxql1sSr2o","name":"金志文"},{"mid":"000GppZv1jpHAR","name":"汤晓菲"}]},{"albummid":"004JF1BR18UKuH","albumname":"忘情1015精选辑","interval":"03:35","songmid":"002YWMiQ2rB62Q","songname":"突然的自我","singer":[{"mid":"0036ERbx4IUm9V","name":"伍佰"},{"mid":"001CQmvD1BBmPI","name":"China Blue"}]},{"albummid":"002vmOxc3x7FWa","albumname":"Meteora","interval":"03:07","songmid":"000NoGoK0AfdxL","songname":"Numb","singer":[{"mid":"003wI8vE3k8cTY","name":"Linkin Park"}]},{"albummid":"002jdoFu0AblRY","albumname":"无限速","interval":"02:51","songmid":"0041Bv0h1lYeAE","songname":"无限速","singer":[{"mid":"003LaMHm42u7qS","name":"本兮"},{"mid":"0040Eq913AwwEZ","name":"阿悄"}]},{"albummid":"00472CVU4VP4I3","albumname":"Fade","interval":"04:22","songmid":"0015PB9N15aKo2","songname":"Fade","singer":[{"mid":"0020PeOh4ZaCw1","name":"Alan Walker"}]},{"albummid":"001ZaCQY2OxVMg","albumname":"   ","interval":"03:31","songmid":"003Co01007kdTm","songname":"倾尽温柔","singer":[{"mid":"003LaMHm42u7qS","name":"本兮"},{"mid":"0040Eq913AwwEZ","name":"阿悄"}]},{"albummid":"000N6ujD1nCGYQ","albumname":"哭笑不得","interval":"04:33","songmid":"0008UZqr4AmJGz","songname":"哭笑不得","singer":[{"mid":"0040Eq913AwwEZ","name":"阿悄"}]},{"albummid":"003M67BS2mu7TQ","albumname":"莎话","interval":"03:10","songmid":"002EE1PN0rMsY9","songname":"梦境三国","singer":[{"mid":"0040Eq913AwwEZ","name":"阿悄"}]},{"albummid":"002dxkHP2hiwFe","albumname":"中国好声音第四季 第4期","interval":"03:51","songmid":"0003dc9z32ZXkz","songname":"野子 (Live)","singer":[{"mid":"000oPzI03cxZHW","name":"晨悠组合"}]},{"albummid":"004E0Y0A0R8FYZ","albumname":"Special Thanks To\u2026","interval":"03:58","songmid":"004IsqcS2BilGv","songname":"你的背包","singer":[{"mid":"003Nz2So3XXYek","name":"陈奕迅"}]},{"albummid":"003xpVKT3C9KpA","albumname":"G-DRAGON 2ND ALBUM : COUP D`ETAT","interval":"03:46","songmid":"003GBUdq4W6cOD","songname":"삐딱하게 (Crooked) (狂放)","singer":[{"mid":"000t2qd13dLpae","name":"G-DRAGON (权志龙)"}]}]
     */

    private String diss_name;
    private String logo;
    private Date create_time;
    private int total_song_num;
    private List<SongListBean> song_list;
}

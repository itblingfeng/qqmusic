# qqmusic
QQ音乐接口

api：
 ```html
GET /api/music/disslist
```
param: 
<table>
<tr>
<td>序号</td>
<td>参数</td>
<td>类型</td>
<td>说明</td>
</tr>
<tr>
<td>1</td>
<td>uin</td>
<td>String</td>
<td>用户的QQ号</td>
</tr>
</table>
back:

```json
{
    "code": 0,
    "uin": "845356194",
    "name": ".",
    "taste": "http://y.qq.com/m/client/profile/prefer.html?userid=845356194",
    "disslist": [
        {
            "diss_cover": "",
            "diss_name": "啊啊",
            "song_num": 0,
            "id": 1963659359
        },
        {
            "diss_cover": "",
            "diss_name": "啊啊啊",
            "song_num": 0,
            "id": 1963659360
        },
        {
            "diss_cover": "",
            "diss_name": "我最爱听",
            "song_num": 1,
            "id": 1963659361
        },
        {
            "diss_cover": "http://y.gtimg.cn/music/photo/album_500/70/500_albumpic_8370_0.jpg",
            "diss_name": "默认收藏",
            "song_num": 25,
            "id": 1963659362
        }
    ]
}
```

api: 
```html
GET /api/music/disscontent
```
param: 
<table>
<tr>
<td>序号</td>
<td>参数</td>
<td>类型</td>
<td>说明</td>
</tr>
<tr>
<td>1</td>
<td>id</td>
<td>String</td>
<td>歌单id</td>
</tr>
</table>

back:
```json
{
    "diss_name": "默认收藏",
    "logo": "http://y.gtimg.cn/music/photo/album_300/70/300_albumpic_8370_0.jpg",
    "create_time": 1264180041,
    "total_song_num": 25,
    "song_list": [
        {
            "albummid": "004UUP4h2fn0nD",
            "albumname": "干脆",
            "interval": "232",
            "songmid": "000YU69H3N55rZ",
            "songname": "梦一场",
            "singer": [
                {
                    "mid": "003LCFXH0eodXv",
                    "name": "那英"
                }
            ]
        },
        {
            "albummid": null,
            "albumname": "",
            "interval": "0",
            "songmid": null,
            "songname": "被伤过的心可以爱谁",
            "singer": [
                {
                    "mid": null,
                    "name": "六哲"
                }
            ]
        },
       
        {
            "albummid": "002g6zv02X7SNi",
            "albumname": "JJ陆",
            "interval": "218",
            "songmid": "003h3CYS3UxDB4",
            "songname": "小酒窝 (国语)",
            "singer": [
                {
                    "mid": "001BLpXF2DyJe2",
                    "name": "林俊杰"
                },
                {
                    "mid": "000N3nfJ398H07",
                    "name": "蔡卓妍"
                }
            ]
        },
        {
            "albummid": "002mGsM62gHnX9",
            "albumname": "晴天娃娃",
            "interval": "284",
            "songmid": "000wLMCo17Z56n",
            "songname": "我太乖",
            "singer": [
                {
                    "mid": "003UoVkR2GDjGX",
                    "name": "江语晨"
                }
            ]
        }
    ]
}
```
api：

```html
GET /api/music/song
```

param:

<table>
<tr>
<td>序号</td>
<td>参数</td>
<td>类型</td>
<td>说明</td>
</tr>
<tr>
<td>1</td>
<td>guid</td>
<td>String</td>
<td>guid(通过UTC时间)生成</td>
</tr>
<tr>
<td>2</td>
<td>songmid</td>
<td>String</td>
<td>歌曲mid</td>
</tr>
</table>

back:

```json
http://dl.stream.qqmusic.qq.com/C400004WAfxJ1q8L9h.m4a
?vkey=D29B2671E5D02D82B71EF798EE32B8B736675755D083995919A1E108094BEFD062F8E4858D6F6B1CE7B61EE99DE223DCA7637A806D1E7D30
&guid=3657032000
&uin=845356194
&fromtag=66
```

guid生成代码

```javascript
var t = (new Date).getUTCMilliseconds();
_guid = Math.round(2147483647 * Math.random()) * t % 1e10;
```


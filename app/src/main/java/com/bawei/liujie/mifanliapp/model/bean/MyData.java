package com.bawei.liujie.mifanliapp.model.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 类的作用:
 * author: 刘婕
 * date:2017/9/7
 */

public class MyData {

    /**
     * home_recommend_subjects : [{"second_name":"","goods_list":[{"normal_price":61650,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/549e5b95137a68079d1efb63905488cc.jpeg","event_type":0,"sales":458,"goods_id":1879561,"short_name":"Nutrilon鑽峰叞鐗涙爮 濠村効濂剁矇4娈� 1鍛ㄥ瞾浠ヤ笂 800鍏媆/缃� 4缃愯","quantity":7492,"logo":"","is_app":0,"price":61550,"market_price":103320,"goods_name":"銆愯嵎鍏扮洿渚涖\u20ac慛utrilon鑽峰叞鐗涙爮 濠村効濂剁矇4娈� 1鍛ㄥ瞾浠ヤ笂 800鍏媆/缃� 4缃愯","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/eb6131ffcb9cc1867016e7ab350340bd.jpeg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/767d5b326b1e16ddeb71fe0f22ad8a33.jpeg","is_onsale":1},{"normal_price":65000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-01/cbc48fb51a9f71ab69e4c2fe8e7e7854.jpeg","event_type":0,"sales":577,"goods_id":1879566,"short_name":"Aptamil 寰峰浗鐖变粬缇� 濠村効濂剁矇 2娈� 800鍏媆/缃� 4缃� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂璐�","quantity":1153,"logo":"","is_app":0,"price":64680,"market_price":147270,"goods_name":"銆愬痉鍥界洿渚涖\u20ac慉ptamil 寰峰浗鐖变粬缇� 濠村効濂剁矇 2娈� 800鍏媆/缃� 4缃� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂璐�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-01/64b18ba5fa23126d7f26ed724bc0fd3c.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-01/71ec47de5ac0f155fb2149e95ba13ed0.jpeg","is_onsale":1},{"normal_price":16330,"thumb_url":"http://omsproductionimg.yangkeduo.com/20170519/100558xB88cQlJ4ot8zS","event_type":0,"sales":265,"goods_id":3705889,"short_name":"寰风埍3娈甸檺閲忕鍒�","quantity":14861,"logo":"","is_app":0,"price":16230,"market_price":38510,"goods_name":"銆愬痉鍥界洿渚涖\u20ac慉ptamil 寰峰浗鐖变粬缇� 濠村効濂剁矇 3娈� 800鍏� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂璐�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/20170519/100559ZNKQgvQUYdkLyU","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/20170519/100558VsVNiDtYnFemF6","is_onsale":1},{"normal_price":32000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1609125987562148/FxpjQiYD507vQtlVoVdoYREoyFrBLOLa.jpg","event_type":0,"sales":2294,"goods_id":590230,"short_name":"缇庣礌浣冲効(Friso)閲戣杈冨ぇ濠村効閰嶆柟濂剁矇3娈�900g*2缃�","quantity":4006,"logo":"","is_app":0,"price":31900,"market_price":41600,"goods_name":"銆愯嵎鍏拌繘鍙ｃ\u20ac戠編绱犱匠鍎�(Friso)閲戣杈冨ぇ濠村効閰嶆柟濂剁矇3娈�900g*2缃�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1609125987562148/7AQZ9aN6nFNU1AiKbms11dokdnRJPnF6.jpg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/MOBUB9HMvDvnR9taEFGcIQIeLkyMwXgj.jpg","is_onsale":1},{"normal_price":16330,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/f6ea2859099da40b0d9032def0758ae9.jpeg","event_type":0,"sales":978,"goods_id":11265942,"short_name":"寰风埍2娈靛叏缃戞渶浣�","quantity":34791,"logo":"","is_app":0,"price":16230,"market_price":33350,"goods_name":"銆愬痉鍥界洿渚涖\u20ac慉ptamil 寰峰浗鐖变粬缇� 濠村効濂剁矇 2娈� 800鍏� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂璐�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/64609fe634141f0e0a1666278e4217df.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/6ef78f7cbadcb92b9d484b1049c523d9.jpeg","is_onsale":1},{"normal_price":16600,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/d4fbe673837619fb9e6b67bd543989e9.jpeg","event_type":0,"sales":187,"goods_id":12085594,"short_name":"鑻卞浗鐖变粬缇庡ザ绮夌櫧閲戠増1娈�2娈�3娈� Aptamil閾傞噾鐗�800鍏嬪疂瀹濆┐骞煎効閰嶆柟鐗涘ザ绮夊師瑁呮鍝�","quantity":26813,"logo":"","is_app":0,"price":15800,"market_price":20000,"goods_name":"銆愯嫳鍥借繘鍙ｃ\u20ac戣嫳鍥界埍浠栫編濂剁矇鐧介噾鐗�1娈�2娈�3娈� Aptamil閾傞噾鐗�800鍏嬪疂瀹濆┐骞煎効閰嶆柟鐗涘ザ绮夊師瑁呮鍝�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/2d9bf5a416b0cb137bfdf54039b717d2.jpeg","customer_num":2,"country":"鑻卞浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/525998070795b78b872ad47451e13d07.jpeg","is_onsale":1},{"normal_price":6900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-16/2bc70ed36e093418cb2082c73c1a8172.jpeg","event_type":0,"sales":109,"goods_id":28594608,"short_name":"缇庣礌3娈靛搧鐗屾巿鏉�","quantity":941,"logo":"","is_app":0,"price":5900,"market_price":11800,"goods_name":"銆愯嵎鍏扮洿渚涖\u20ac戙\u20ac愬搧鐗屾巿鏉冿紝瀹樻柟姝ｅ搧銆戣嵎鍏癏ero Baby缇庣礌濂剁矇3娈碉紙10-12涓湀瀹濆疂锛�800g","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-16/e7ac159fab1021d22cb3b08878d22d22.jpeg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-04-25/fb91292bedc7d63cbe2681cc625faf38.jpeg","is_onsale":1},{"normal_price":88800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/9c77747631bab97237cdc816ca10253b.jpeg","event_type":0,"sales":101,"goods_id":61490755,"short_name":"銆愯嵎鍏板浗瀹濆ザ绮夈\u20ac戣嵎鍏扮墰鏍忓ザ绮�1/2/3/4/5/6娈� 1/2娈�850g 3/4/5娈�800g  6缃愯","quantity":399,"logo":"","is_app":0,"price":87900,"market_price":129900,"goods_name":"銆愯嵎鍏扮洿閭\u20ac戙\u20ac愯嵎鍏板浗瀹濆ザ绮夈\u20ac戣嵎鍏扮墰鏍忓ザ绮�1/2/3/4/5/6娈� 1/2娈�850g 3/4/5娈�800g  6缃愯","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/5dea4546ebb4f324a180492e9f5a4613.jpeg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-22/a61b135a91252bd7e3f66c9a16281952.jpeg","is_onsale":1},{"normal_price":26900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-23/6b8dcc8aadca0e55ab8358dc3acaf26e.jpeg","event_type":0,"sales":132,"goods_id":12580277,"short_name":"鑽峰叞鐗涙爮1娈典袱缃愯","quantity":1768,"logo":"","is_app":0,"price":25000,"market_price":39900,"goods_name":"銆愯嵎鍏扮洿渚涖\u20ac戣嵎鍏扮墰鏍� Nutrilon 骞煎┐鍎垮ザ绮�1娈�2缃愯 850g*2","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-23/ba1c4b99b1701a6c2010eae10117d006.jpeg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-23/aebb09adb0eb52bb37ebd76db55fe918.jpeg","is_onsale":1},{"normal_price":19500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/9c4a16f825af36d5e734ae42f9d5d0fe.jpeg","event_type":0,"sales":290,"goods_id":18457276,"short_name":"190涓ょ綈鍗婁环娓呬粨","quantity":1211,"logo":"","is_app":0,"price":19000,"market_price":29900,"goods_name":"銆愬痉鍥界洿渚涖\u20ac戙\u20ac愪袱缃�190 鎶㈠畬鎭㈠鍘熶环銆慉ptamil 鐖变粬缇庡┐鍎块厤鏂瑰ザ绮塸re娈�0~6M 800g*2缃�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/0b7499d33e2c8108c7dfd59e6e8f01ec.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-07/b742f1904d4afa18c85049e498cb4ebf.jpeg","is_onsale":1}],"home_banner_width":1000,"goods_num":35,"sales":23310,"home_banner_height_2":375,"position":30,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/435be166de9366ff4a163834a71db69c.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1503417600,"subject":"杩涘彛濂剁矇涓撳尯锛屽ぇ鐗屼綆鑷充簲鎶橈紒","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/a579a316bbc17ac6066aa471296ed0ea.jpeg","column_num":1,"share_image":"","desc":"璁╁疂瀹濆悆鐨勬斁蹇儈姝ｅ搧淇濊瘉锛屽寘绋庡寘閭紒","type":"haitao_recommend","subject_id":3257},{"second_name":"","goods_list":[{"normal_price":890,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/5d58bebb49069f4e801ddc7d8e5ab3f9.jpeg","event_type":0,"sales":13740,"goods_id":156714,"short_name":"鑺辩帇瓒呭\u20ac间綋楠岃鍏ㄧ爜","quantity":5686,"logo":"","is_app":0,"price":790,"market_price":18000,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戞棩鏈姳鐜嬬焊灏胯￥/鎷夋媺瑁�10娆句换閫夈\u20ac愯秴鍊间綋楠岃銆戙\u20ac愬亣涓\u20ac缃氬崄銆�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/b2276b7a7aa1ef907390c6c589904daa.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-26/d53cd9856642f76efdcff20ccfb99a53.jpeg","is_onsale":1},{"normal_price":19200,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-28/1d530e26da1c8f47eb709b66a68d90f2.jpeg","event_type":0,"sales":12,"goods_id":34356333,"short_name":"鑺辩帇L54鍗曡89.5","quantity":988,"logo":"","is_app":0,"price":17900,"market_price":29900,"goods_name":"銆愭棩鏈洿渚涖\u20ac戜袱琚嬨\u20ac愭槑鏄熺焊灏胯￥銆戞渶鏂扮増鑺辩帇L54 Kao Merries 濠村効绾稿翱瑁� L54鐗�*2浠�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-28/2c18a9d4956598bbbe904e7dd469c200.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-28/a9f68526d414104975e7f06a54f2176c.jpeg","is_onsale":1},{"normal_price":6000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/c1b1701a7631f093e933dcd6801a0be6.jpeg","event_type":0,"sales":355,"goods_id":49579452,"short_name":"澶х帇绾稿翱瑁ょ壒浠风鍒�","quantity":1693,"logo":"","is_app":0,"price":5500,"market_price":15600,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愰檺鏃剁壒浠枫\u20ac戞棩鏈ぇ鐜婫OO.N澶х帇绾稿翱瑁54","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/715f6b67d7b1bc13dba330ef0ef007c0.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/9eadd74ffc7c0c5e1942caadca359deb.jpeg","is_onsale":1},{"normal_price":8200,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/18c69174b99d08e9493204ecae37cd50.jpeg","event_type":0,"sales":0,"goods_id":68684123,"short_name":"澶х帇缁碋 NB90绾稿翱瑁�","quantity":200,"logo":"","is_app":0,"price":7890,"market_price":28900,"goods_name":"銆愭棩鏈洿渚涖\u20ac戞棩鏈珿OON澶х帇缁碋绯诲垪绾稿翱瑁� 鏂扮敓鍎縉B90鐗�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/e5ccd3660172f2eba567da24580c1aca.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/6f5cdfe8c7fd03340dcaa815bfb939b7.jpeg","is_onsale":1},{"normal_price":12800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-03/0556d253b26df226433ef181783b8d17.jpeg","event_type":0,"sales":710,"goods_id":2438166,"short_name":"寰峰浗娴蜂鸡鍝堜集锛圚elenHarper锛夎秴钖勮垝閫傚┐鍎跨焊灏胯￥灏夸笉婀� 杩蜂綘鍙穃/涓彿/澶у彿/鍔犲ぇ鍙凤紙寰峰浗鍘熻杩涘彛锛�","quantity":1671,"logo":"","is_app":0,"price":10800,"market_price":29600,"goods_name":"銆愬痉鍥借繘鍙ｃ\u20ac戝痉鍥芥捣浼﹀搱浼紙HelenHarper锛夎秴钖勮垝閫傚┐鍎跨焊灏胯￥灏夸笉婀� 杩蜂綘鍙穃/涓彿/澶у彿/鍔犲ぇ鍙凤紙寰峰浗鍘熻杩涘彛锛�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-03/334f202ace17a18d2d186eca9a186543.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/SRE9unSq9EDmgRFH2tVCxL3vIOOvYHoE.jpg","is_onsale":1},{"normal_price":7000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-23/4abdf6c487a9bc3965a96fd442e0291c.jpeg","event_type":0,"sales":1827,"goods_id":6111405,"short_name":"鑺辩帇L54浣庤嚦92","quantity":4339,"logo":"","is_app":0,"price":6780,"market_price":19000,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愭柊鍖呰銆戞棩鏈姳鐜嬬焊灏胯￥L54浣庤嚦92/NB90/S82/M64/L54/XL44灏夸笉婀垮娆句换鎰忛\u20ac夈\u20ac愬亣涓\u20ac缃氬崄銆�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-23/94169c21eda73ae69f2478d317225688.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-20/050f91b21da5497c3bd8304a4414a9ec.jpeg","is_onsale":1},{"normal_price":11900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-30/d1d29c0e622af91b751a2528532ffa9c.jpeg","event_type":0,"sales":1504,"goods_id":56268958,"short_name":"鍗婁环锛佽姳鐜嬩袱鍖呰","quantity":802,"logo":"","is_app":0,"price":7900,"market_price":40000,"goods_name":"銆愭棩鏈洿渚涖\u20ac戙\u20ac愰檺鏃跺崐浠枫\u20ac戙\u20ac�2鍖匼/4鍖呰銆� 鑺辩帇Merries 濡欒\u20ac岃垝灏夸笉婀縉B60/S54/M64/鎷夋媺瑁L38銆愪繚绋庡尯鍙戣揣銆�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-30/8ef97fbf8d72079dade6eaad939ff9b1.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-27/1ed980a633c05da94eea6d5511ae5be8.jpeg","is_onsale":1},{"normal_price":8800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-08/4e16e00ebd3ba15ab79e647ed7398dfd.jpeg","event_type":0,"sales":6165,"goods_id":531750,"short_name":"棣欐腐甯钘\u2033崌绾х増瓒呰杽鍏ㄨ姱浣撴媺鎷夎￥M60/L56/XL52/XXL48鐗囦笉璧峰潹涓嶆柇灞傜敺濂冲疂瀹濋\u20ac氱敤","quantity":13141,"logo":"","is_app":0,"price":6900,"market_price":45800,"goods_name":"銆愰娓繘鍙ｃ\u20ac戦娓府瀵宠棥鍗囩骇鐗堣秴钖勫叏鑺綋鎷夋媺瑁60/L56/XL52/XXL48鐗囦笉璧峰潹涓嶆柇灞傜敺濂冲疂瀹濋\u20ac氱敤","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-13/05f66446901e1860753e58b6abf01f70.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1174159/SBzkufewQRYhEFHs1VTEnVM0FtfIghx6.jpg","is_onsale":1},{"normal_price":11600,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1606060327141090/4mtjEebt60CB8LoDyYjCk0FgtdPKUFfw.jpg","event_type":0,"sales":130,"goods_id":154023,"short_name":"灏ゅΞ浣矼oony澧為噺瑁呯焊灏胯￥NB111/S102/M78/L68/鎷夋媺瑁54/XL46鐢峰コ","quantity":2414,"logo":"","is_app":0,"price":11500,"market_price":29900,"goods_name":"銆愭棩鏈洿渚涖\u20ac戝挨濡匠Moony澧為噺瑁呯焊灏胯￥NB111/S102/M78/L68/鎷夋媺瑁54/XL46鐢峰コ","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1606060327141090/XfOhDduPg8rkjo2WYcijQtc3rexKWim6.jpg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/313922/JRL53Am4iVQQZUO47TnnwFu4SgiW986T.jpg","is_onsale":1},{"normal_price":12000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-03/85147f8b4a0078a8d16d95731fea9cf0.jpeg","event_type":0,"sales":445,"goods_id":2199202,"short_name":"銆愰珮绔郴鍒椼\u20ac戞棩鏈挨濡匠鑷劧鐨囧绯诲垪绾稿翱瑁ゆ爣鍑嗚 鍔犻噺瑁� NB S M L","quantity":5470,"logo":"","is_app":0,"price":11800,"market_price":18900,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愰珮绔郴鍒椼\u20ac戞棩鏈挨濡匠鑷劧鐨囧绯诲垪绾稿翱瑁ゆ爣鍑嗚 鍔犻噺瑁� NB S M L","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-03/69cdeeb5c4b4f5bde1b4e6823c280266.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/vRfzgO7daKR6ihN5taBXyGzp2IIYubCg.jpg","is_onsale":1}],"home_banner_width":1000,"goods_num":31,"sales":84829,"home_banner_height_2":375,"position":30,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/101cc33f41ee7049ef3b7a6c5fc4324b.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1503417600,"subject":"杩涘彛绾稿翱瑁や笓鍖猴紝浣庝环绛変綘鎶紒","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/ffe9b261355d05e943b932a48deaff5e.jpeg","column_num":1,"share_image":"","desc":"缁欏疂瀹濇渶娓╂煍鐨勮垝閫傦紝姝ｅ搧淇濊瘉锛屽寘绋庡寘閭紒","type":"haitao_recommend","subject_id":3258},{"second_name":"","goods_list":[{"normal_price":1330,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-01/6c9c663dc11ed1d786d783d4ce040f57.jpeg","event_type":0,"sales":533,"goods_id":39836824,"short_name":"淇勫紡鍙屽北鎻愭媺绫宠嫃","quantity":18317,"logo":"","is_app":0,"price":1230,"market_price":4900,"goods_name":"銆愪縿缃楁柉杩涘彛銆戙\u20ac愪縿缃楁柉鍙屽北鍙ｅ懗鎻愭媺绫宠嫃銆戜縿寮忚渹铚滄彁鎷夌背鑻忓叓鎷�700鍏�,淇勫紡鍙屽北鍙ｅ懗500g*2涓垨1涓崈灞傝泲绯曡タ寮忓す蹇冪硶鐐�,铔嬬硶,","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/336e58f72fd5fa56d8f1d9c9cefdcc11.jpeg","customer_num":2,"country":"淇勭綏鏂�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-18/0f180c04ab56c10692c312ff5f8bd761.jpeg","is_onsale":1},{"normal_price":3200,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/ca190f0b569c76e3261bf3580fd793fa.jpeg","event_type":0,"sales":1029,"goods_id":66303265,"short_name":"涔�2閫�1  鏈ㄧ摐蹇\u20ac熶赴鑳�","quantity":98970,"logo":"","is_app":0,"price":2550,"market_price":10000,"goods_name":"銆愬彴婀捐繘鍙ｃ\u20ac戙\u20ac愪拱2閫�1銆戝彴婀炬湪鐡滆憶鏍瑰崌鏉尪 銆愬揩閫熶赴鑳搞\u20ac戙\u20ac愭湀鏈堝彉澶с\u20ac� 10澶〢鍙楤 30澶〣鍙楧 銆愪钩鎴胯交鏉�2娆\u2033彂鑲层\u20ac�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/de201719f6b074254ff73425751e3b55.jpeg","customer_num":2,"country":"鍙版咕","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-28/dd258795624dae024bbaccabd8f5cb87.jpeg","is_onsale":1},{"normal_price":12800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/ffd223268f7d67df2d76aa7439acfcea.jpeg","event_type":0,"sales":141,"goods_id":72360726,"short_name":"銆愰檺閲忕壒浠枫\u20ac戠墶铔庢潪鑽夌墖60绮掋\u20ac愯ˉ鑲惧浐绮惧欢鏃跺．闃炽\u20ac戙\u20ac愮壒浠蜂績閿\u20ac銆戣儨杩囨帆缇婅椏娴风嫍涓� 3鐡朵竴涓枟绋嬶紝涓嶇\u2016锛熶綘璇曡瘯锛侊紒","quantity":1259,"logo":"","is_app":0,"price":2390,"market_price":18800,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愰檺閲忕壒浠枫\u20ac戠墶铔庢潪鑽夌墖60绮掋\u20ac愯ˉ鑲惧浐绮惧欢鏃跺．闃炽\u20ac戙\u20ac愮壒浠蜂績閿\u20ac銆戣儨杩囨帆缇婅椏娴风嫍涓� 3鐡朵竴涓枟绋嬶紝涓嶇\u2016锛熶綘璇曡瘯锛侊紒","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/993acc5be5d189663228c8dc49ef427e.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/580c5793fa1c555bf10241620b5b31f8.jpeg","is_onsale":1},{"normal_price":1090,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/d70114db41b04c5ee2a8b3c19f14d140.jpeg","event_type":0,"sales":109,"goods_id":72300941,"short_name":"銆愰檺閲忕壒浠枫\u20ac戙\u20ac愬崄缃愯銆慙otte涔愬ぉ鐖变笂鑺﹁崯鑺﹁崯鍛抽ギ鏂欒姦鑽熸眮 180ml/姣忕綈 缇庣櫧鑲岃偆 闆堕瑙ｆ复楗枡澶滃閫氬閲庨蹇呭","quantity":691,"logo":"","is_app":0,"price":990,"market_price":12800,"goods_name":"銆愰煩鍥借繘鍙ｃ\u20ac戙\u20ac愰檺閲忕壒浠枫\u20ac戙\u20ac愬崄缃愯銆慙otte涔愬ぉ鐖变笂鑺﹁崯鑺﹁崯鍛抽ギ鏂欒姦鑽熸眮 180ml/姣忕綈 缇庣櫧鑲岃偆 闆堕瑙ｆ复楗枡澶滃閫氬閲庨蹇呭","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/5d7c2e1c7042653f4522d20d65f193a3.jpeg","customer_num":2,"country":"闊╁浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/f62961de0d1f5286de1c2ff4e55b1368.jpeg","is_onsale":1},{"normal_price":21900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/e6165a5b7d6a746d80fab92763de02da.jpeg","event_type":0,"sales":1155,"goods_id":2127994,"short_name":"瑗跨彮鐗橠O绾ц浼嫆骞茬孩钁¤悇閰掔孩閰�750ml*6鐡� 鏁寸瑁呫\u20ac愪袱绉嶈禒鍝佸彲閫夈\u20ac�","quantity":1943,"logo":"","is_app":0,"price":18800,"market_price":168800,"goods_name":"銆愯タ鐝墮杩涘彛銆戣タ鐝墮DO绾ц浼嫆骞茬孩钁¤悇閰掔孩閰�750ml*6鐡� 鏁寸瑁呫\u20ac愪袱绉嶈禒鍝佸彲閫夈\u20ac�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/3b090db01d2e126210b31cc30b9701f0.jpeg","customer_num":2,"country":"瑗跨彮鐗�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/a76292608019be23966cd09fa147b1ef.jpeg","is_onsale":1},{"normal_price":3200,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/3af1ec80ab0520a36ccc1b8d4d7e86a1.jpeg","event_type":0,"sales":63830,"goods_id":10834308,"short_name":"涔�3閫�2 蹇\u20ac熷噺鑲ラ\u20ac氫究","quantity":36169,"logo":"","is_app":0,"price":1990,"market_price":16800,"goods_name":"銆愬彴婀捐繘鍙ｃ\u20ac戙\u20ac愰檺閲忕壒浠枫\u20ac戙\u20ac愪拱3閫�2銆戝彴婀炬姽鑼堕叺绱犳闅忎究鏋� 銆愬揩閫熷噺鑲� 鎺掓瘨閫氫究銆戙\u20ac�7澶╁嚮婧冭倸瀛愯禈鑲夛紝鏁堟灉濂戒笉鍙嶅脊銆� 鏈堢槮15鏂�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/a744ec75cfc74a2be23224ffbad39a90.jpeg","customer_num":2,"country":"鍙版咕","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/09643388d2c51525ee83ed7541da85ac.jpeg","is_onsale":1},{"normal_price":1980,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/afc1f04f9c0daa27111cac23a5185f5b.jpeg","event_type":0,"sales":759,"goods_id":9108,"short_name":"椹潵瑗夸簹鐗硅壊EGO妞板瓙绯曡蒋绯栨暎绉�500g","quantity":9241,"logo":"","is_app":0,"price":1480,"market_price":2500,"goods_name":"銆愰┈鏉ヨタ浜氳繘鍙ｃ\u20ac戦┈鏉ヨタ浜氱壒鑹睧GO妞板瓙绯曡蒋绯栨暎绉�500g","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/270c2563ee293d616793ebf67d822e8b.jpeg","customer_num":2,"country":"椹潵瑗夸簹","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/srewSLvr6Y81YKHq6CDbOyd0sqyRGT6s.jpg","is_onsale":1},{"normal_price":2500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/f941bedcaf04c05ea338eadf73f42cbb.jpeg","event_type":0,"sales":247,"goods_id":50282348,"short_name":"婢抽棬杩涘彛棣欒楸块奔涓�","quantity":6753,"logo":"","is_app":0,"price":1980,"market_price":6800,"goods_name":"銆愭境闂ㄨ繘鍙ｃ\u20ac戙\u20ac�3鐩掕 娆茬舰涓嶈兘鐨勯浂椋熴\u20ac戞境闂ㄩ璁伴笨楸间笣160g 鏂圭洅瑁呯壒浜ф捣鍛� 鍘熷懗杈ｅ懗鐑ゅ師鍛崇儰杈ｅ懗鍥涘懗鍙\u20ac� 3鐩掕/4鐩掕","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/034c39fae7209678670f7cf85c54bce3.jpeg","customer_num":2,"country":"婢抽棬","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/ef0a252a71adf80790daed97b7caecfe.jpeg","is_onsale":1},{"normal_price":3300,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-26/968879cae465166f7cf26f8dd5b40846.jpeg","event_type":0,"sales":1586,"goods_id":13649116,"short_name":"銆愪袱鑹插彲閫夈\u20ac戝湡鑰冲叾鏉忚劘鑲夋潖骞叉棤鏍告潖鑲夊共鏉忚劘铚滈ク瀛曞鏋滃共鏋滆劘闆堕500g鍖呴偖","quantity":18788,"logo":"","is_app":0,"price":2680,"market_price":6800,"goods_name":"銆愬湡鑰冲叾杩涘彛銆戙\u20ac愪袱鑹插彲閫夈\u20ac戝湡鑰冲叾鏉忚劘鑲夋潖骞叉棤鏍告潖鑲夊共鏉忚劘铚滈ク瀛曞鏋滃共鏋滆劘闆堕500g鍖呴偖","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-26/bf543f7ae5ccad0109ca51c3055821de.jpeg","customer_num":2,"country":"鍦熻\u20ac冲叾","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-26/83a66a5423f8731cbc3dc97a0dc85fac.jpeg","is_onsale":1},{"normal_price":6900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-08/566355bab4676f7dfced4b9e42a053ca.jpeg","event_type":0,"sales":23137,"goods_id":266601,"short_name":"娉曞浗鍘熻杩涘彛鎹锋．浼犲(浼犺)绾㈤厭骞茬孩钁¤悇閰�750ml*2鐡剁ぜ鐩掕閫佺ぜ銆愰珮妗ｇ毊鐩�+閰掑叿4浠跺閫佺ぜ蹇呭銆�","quantity":486863,"logo":"","is_app":0,"price":6000,"market_price":232800,"goods_name":"銆愭硶鍥借繘鍙ｃ\u20ac戞硶鍥藉師瑁呰繘鍙ｆ嵎妫紶濂�(浼犺)绾㈤厭骞茬孩钁¤悇閰�750ml*2鐡剁ぜ鐩掕閫佺ぜ銆愰珮妗ｇ毊鐩�+閰掑叿4浠跺閫佺ぜ蹇呭銆�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/5c5789c1ae1900bc3d3ccbcdee80912b.jpeg","customer_num":2,"country":"娉曞浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-08/ebc4b3bcd5690815c145aee793d83eb9.jpeg","is_onsale":1}],"home_banner_width":1000,"goods_num":80,"sales":1075412,"home_banner_height_2":375,"position":3,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-07-12/4849dd5496c0390d0a9ea135d3bc0729.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1489766400,"subject":"娓搁亶鍏ㄧ悆锛屼笉濡傚悆閬嶄笘鐣�","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-03-16/97077b4764779e825f959210e1a80067.jpeg","column_num":2,"share_image":"","desc":"娴锋窐椋熷搧涓撳満锛屽姪浣犲悆閬嶅叏鐞冪編椋燂紒姝ｅ搧淇濊瘉锛屽寘绋庡寘閭紒","type":"haitao_recommend","subject_id":1147},{"second_name":"","goods_list":[{"normal_price":3990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-24/67040657efe5e9948cb0048863d8cc8d.jpeg","event_type":0,"sales":3941,"goods_id":654140,"short_name":"瀵肩寮忔湀缁忔澂濮ㄥ宸�","quantity":29506,"logo":"","is_app":0,"price":2790,"market_price":5990,"goods_name":"銆愬痉鍥借繘鍙ｃ\u20ac慣maxx鍐呯疆鍗敓妫夋潯 20鏀贩鍚堣 鍖呴偖 鍗敓宸炬瀵肩寮忔湀缁忔澂濮ㄥ宸� 娣峰悎鍨�+鏅\u20ac氬瀷+閲忓ぇ鍨�+瓒呭ぇ鍨嬨\u20ac愬洓绉嶅瀷鍙峰彲閫夈\u20ac�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-24/6e5ee545bdc42152b12ef258730f64ac.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1316699/aKXZSXaULkJ2aZ2ezVIqPahUDIAu3BBb.jpg","is_onsale":1},{"normal_price":2100,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-17/0b9f4c20663fea162b7ef408085d9ab3.jpeg","event_type":0,"sales":189469,"goods_id":273099,"short_name":"涓夎壊鐗欒啅 涔�3閫�1 涔�4閫�2","quantity":5258,"logo":"","is_app":0,"price":1580,"market_price":3100,"goods_name":"銆愭剰澶у埄杩涘彛銆戙\u20ac愪拱3閫�1 涔�4閫�2銆戜笁鑹茬墮鑶廇quafresh 闄ゅ彛鑷編鐧藉幓榛勫幓鐑熸笉鎶楄繃鏁�100ML","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-17/a948f5310e96eeede0cb2f715acfa0ff.jpeg","customer_num":2,"country":"鎰忓ぇ鍒�","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/587175/BGwVsKJMtuDkcLkzv5InyhJXzH8KPIYZ.jpg","is_onsale":1},{"normal_price":4490,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/6a828372f2bfba8112759072f359a7ff.jpeg","event_type":0,"sales":210,"goods_id":72583489,"short_name":"66L鐗涙触甯冪汉鏀剁撼绠遍挗鏋�","quantity":3290,"logo":"","is_app":0,"price":2490,"market_price":6990,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愬崌绾ф66L鍔犲己閽㈡灦鏄撴竻娲椼\u20ac慒ashow Life鐗涙触甯冪汉鏀剁撼绠遍挗鏋跺偍鐗╂姌鍙犵洅澶у彿妫夎鏀剁撼琚嬭。鐗╂湇鏁寸悊绠�66L","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/df106908740dc22eecc2f6e420331cea.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/a93680e5b73d966b0996c51ac9a0a579.jpeg","is_onsale":1},{"normal_price":36800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/231c1045bc406fd65af363edaba4b334.jpeg","event_type":0,"sales":638,"goods_id":69466193,"short_name":"鐢靛姩姣涘瓟娓呮磥鍣ㄥ幓榛戝ご","quantity":9362,"logo":"","is_app":0,"price":11800,"market_price":39800,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愬惛榛戝ご绁炲櫒 鍛婂埆鑽夎帗榧汇\u20ac戙\u20ac愰\u20ac侀粦澶村鍑烘恫濂楄銆戠湡绌哄鍑虹數鍔ㄥ惛绮夊埡灏忔皵娉＄編瀹逛华姣涘瓟娓呮磥鍣ㄥ幓榛戝ご浠櫒","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/fd10ba0c762fa65353afa88fab7cb708.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/1ace633553528e71bd1a1d136705fa8b.jpeg","is_onsale":1},{"normal_price":7890,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-02/aba46648bcc428b979ecedaf7b2541c9.jpeg","event_type":0,"sales":5346,"goods_id":42060446,"short_name":"鐢靛姩纭呰兌鑴搁儴娲侀潰浠�","quantity":44654,"logo":"","is_app":0,"price":6580,"market_price":36900,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愭棩鏈師瑁呮鍝併\u20ac戞磥闈华纭呰兌鑴搁儴娓呮磥姣涘瓟榛戝ご鐢靛姩缇庡浠礂鑴稿埛缇庣櫧娲楄劯绁炲櫒","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-28/a1db83c71186c3ab71ebdac797076e97.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-02/aa9175075ba0cdef5c73214fff138634.jpeg","is_onsale":1},{"normal_price":1290,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/46cd630d47d71284cc53e2f41f29470a.jpeg","event_type":0,"sales":974,"goods_id":68324905,"short_name":"鏃ユ湰纾ㄨ剼鍣ㄥ婊戝弻鑴�","quantity":1026,"logo":"","is_app":0,"price":990,"market_price":2200,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愬彲鎷嗚璁� 瀚╂粦鍙岃剼銆戞棩鏈繘鍙ｇ（鑴氬櫒鍘绘鐨\u20ac佽導纾ㄨ剼鐭充慨鑴氬伐鍏疯剼搴曞幓鑴氱毊涓嶉攬閽㈡悡鑴氭澘","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/36bbc426bface1bea7245940fa0ed432.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/c7aa9cdb55ee58954befb3fc4e9619e5.jpeg","is_onsale":1},{"normal_price":1090,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/ed600d4f1e3be37460697fa8e9b928c8.jpeg","event_type":0,"sales":338,"goods_id":53198767,"short_name":"闊╁浗鏈壊鎶界焊宸句笉婕傜櫧","quantity":2962,"logo":"","is_app":0,"price":980,"market_price":11900,"goods_name":"銆愰煩鍥借繘鍙ｃ\u20ac戙\u20ac�4鍖�8鍖�24鍖呫\u20ac�3灞�100鎶介煩鍥借繘鍙ｇ畝娌愮绾ょ淮鏈壊鎶界焊宸剧焊宸剧焊鎶戒笉婕傜櫧瀹剁敤姣嶅┐閫傜敤鎶界焊鎵瑰彂","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/7275f621cc54b0090997278cfc3cdc83.jpeg","customer_num":2,"country":"闊╁浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-11/fc63f854ebf2fede5d68558bce79b2d0.jpeg","is_onsale":1},{"normal_price":13800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/652d2eaeeb3daebc8303bda402397e90.jpeg","event_type":0,"sales":9532,"goods_id":960811,"short_name":"鏉叿鐔婂崌绾ф姘村６甯﹀惛绠�","quantity":7386,"logo":"","is_app":0,"price":7500,"market_price":29800,"goods_name":"銆愰煩鍥借繘鍙ｃ\u20ac戙\u20ac愭渶鏂板崌绾ф銆戞澂鍏风唺鍎跨姘村６銆愪竴鏉袱鐢ㄥ効绔ヤ繚娓╂澂銆戝洓瀛ｉ\u20ac氱敤鍏嶈垂鍒诲瓧閫佸惛鍢�630ML鍎跨姘存澂瀹濆疂甯﹀惛绠°\u20ac�304鍖荤敤涓嶉攬閽\u20ac\u20ac�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/a54dc13b2938b23cdbc7d4d40eba08eb.jpeg","customer_num":2,"country":"闊╁浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/2165335/DOvtIqYR0TAZqgoGhPN9GiWVS5k0YS3L.jpg","is_onsale":1},{"normal_price":1200,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/8b8e0684dbe64f5bbed76cc2189d34bf.jpeg","event_type":0,"sales":185,"goods_id":63010274,"short_name":"鏃ユ湰澶氬姛鑳介暱鏌勫瀮鍦鹃挸","quantity":1815,"logo":"","is_app":0,"price":990,"market_price":2600,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愬鍔熻兘鍨冨溇閽炽\u20ac戞棩鏈繘鍙ｅ瀮鍦鹃挸闀挎焺鎷剧墿鍣ㄥ崼鐢熷す鐜崼鍗敓閽冲彇鐗╁櫒鍔犲浐鎹\u2033瀮鍦惧す瀛愪竴浠惰","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/f25fff48ca2114360fe8b28a7b4b5937.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/167965ea197a20bcbe49e880898dc643.jpeg","is_onsale":1},{"normal_price":11800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/1f1e3bb508926d85f05561543e42e40b.jpeg","event_type":0,"sales":94,"goods_id":70827704,"short_name":"楹﹂キ鐭虫棤鐑熸懂鐑や竴浣撻攨","quantity":406,"logo":"","is_app":0,"price":10800,"market_price":32500,"goods_name":"銆愰煩鍥借繘鍙ｃ\u20ac戙\u20ac愰害楗煶涓ょ敤鐏攨鐑よ倝涓\u20ac浣撳搴仛浼氬繀澶囥\u20ac慏K楹﹂キ鐭充笉绮樻按涓嶆簿娌规棤鐑熸懂鐑ょ伀閿呬竴浣撻攨鐑ょ洏涔岄緹閿呯數鐏攨鐓潰鐓彍瀹跺涵鐢�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/616a39e772cbb58f721f48c86ff7cfd2.jpeg","customer_num":2,"country":"闊╁浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/40ff6a99fcb6f43495ba2666f92d3895.jpeg","is_onsale":1}],"home_banner_width":1000,"goods_num":137,"sales":919860,"home_banner_height_2":375,"position":6,"home_banner_height":547,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-03-19/674b9de77f5facc3dd63563420da825e.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1489593600,"subject":"瀹跺眳绮鹃\u20ac夛紝鎵撶牬搴曚环鐪嬭繖閲岋紒","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-03-19/029ad4d84db925bcd48cff06c69c85e3.jpeg","column_num":2,"share_image":"","desc":"娴锋窐瀹跺眳鍒嗙被锛屾鍝佷繚璇侊紝鍖呯◣鍖呴偖锛�","type":"haitao_recommend","subject_id":1153},{"second_name":"","goods_list":[{"normal_price":4990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/0f0359e840f1615853a3dd383799a3da.jpeg","event_type":0,"sales":793,"goods_id":71544648,"short_name":"銆愰檺鏃跺崐浠枫\u20ac戙\u20ac�7澶╁幓娉曚护绾� 棰堥儴鎬ф劅瀚╂粦銆戦娓瓟鍔涘尰鐢熺娉曚护绾瑰鑲ら湝绁涢绾�80g 棰堣剸琛ユ按淇濇箍缇庣櫧 绁涢粦鑹茬礌鐨偆鎻愭媺绱ц嚧","quantity":3207,"logo":"","is_app":0,"price":1990,"market_price":9900,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愰檺鏃跺崐浠枫\u20ac戙\u20ac�7澶╁幓娉曚护绾� 棰堥儴鎬ф劅瀚╂粦銆戦娓瓟鍔涘尰鐢熺娉曚护绾瑰鑲ら湝绁涢绾�80g 棰堣剸琛ユ按淇濇箍缇庣櫧 绁涢粦鑹茬礌鐨偆鎻愭媺绱ц嚧","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/ac149c2caa976a9aacfa610019cb6543.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/6cf8683849f5d4c77732eb0887d78af5.jpeg","is_onsale":1},{"normal_price":3800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/b68025ad651d2cb8eb27a8bb91f552e8.jpeg","event_type":0,"sales":1011,"goods_id":1228985,"short_name":"婢虫床姝ｅ搧婢充僵灏擮PPERT娣卞眰淇濇箍婊嬪吇缁电緤娌规鼎鑲ら湝80g 鐢峰コ閫傜敤闈㈤湝","quantity":454,"logo":"","is_app":0,"price":2800,"market_price":8800,"goods_name":"銆愭境澶у埄浜氳繘鍙ｃ\u20ac戞境娲叉鍝佹境浣╁皵OPPERT娣卞眰淇濇箍婊嬪吇缁电緤娌规鼎鑲ら湝80g 鐢峰コ閫傜敤闈㈤湝","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/217d67e91115039fa675f1bf1983a2ed.jpeg","customer_num":2,"country":"婢冲ぇ鍒╀簹","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/GUzK8B2KdowDdmGpObFI6kojJ5QaTzYP.jpg","is_onsale":1},{"normal_price":3800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/cf03f285ca9c1628f6433b1a3d837bc7.jpeg","event_type":0,"sales":283,"goods_id":10335467,"short_name":"銆�7澶╀慨鎶よ冻璺熷共瑁傘\u20ac戣冻闇滄姢瓒宠啅鍘婚櫎姝荤毊150ml/鏀� 闃插共瑁傛粙娑︽姢鐞嗕钩闇� 淇濇箍娑﹁冻","quantity":9716,"logo":"","is_app":0,"price":3300,"market_price":4590,"goods_name":"銆愪縿缃楁柉杩涘彛銆戙\u20ac�7澶╀慨鎶よ冻璺熷共瑁傘\u20ac戣冻闇滄姢瓒宠啅鍘婚櫎姝荤毊150ml/鏀� 闃插共瑁傛粙娑︽姢鐞嗕钩闇� 淇濇箍娑﹁冻","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/cd8ed9015604cc09389824d44cc55323.jpeg","customer_num":2,"country":"淇勭綏鏂�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/41a34c481e53d7fcb98e6c277581ae63.jpeg","is_onsale":1},{"normal_price":2790,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/33349f5a8c3786586e135ed70a8d0ae8.jpeg","event_type":0,"sales":3400,"goods_id":3153817,"short_name":"Mistine 绔嬩綋3D涓夊悎涓\u20ac鐪夌瑪鐪夌矇鏌撶湁鑶� 闃叉按闃叉睏涓嶆檿鏌�2.5ML","quantity":8430,"logo":"","is_app":0,"price":2490,"market_price":9900,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac慚istine 绔嬩綋3D涓夊悎涓\u20ac鐪夌瑪鐪夌矇鏌撶湁鑶� 闃叉按闃叉睏涓嶆檿鏌�2.5ML","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/a132ef150f66c006fc1d20f14d2d8185.jpeg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/mwJq2v8cqOisVEQ0YhtKFPpiab0FAT7l.jpg","is_onsale":1},{"normal_price":3990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/7be53f7bf4c6a9b28ba2cf5cfbafb16b.jpeg","event_type":0,"sales":301,"goods_id":68531752,"short_name":"銆愰檷浠峰啿閲忋\u20ac戙\u20ac愭湀鐦�20鏂ゃ\u20ac戠氦浣撶槮韬湝鍑忚偉鐦﹁韩闇滈娓繘鍙ashow Life鐦﹁叞韬劯澶ц吙闇滃噺澶ц倸瀛愮噧鑴傚噺鑴傝偑绮炬补150g","quantity":199,"logo":"","is_app":0,"price":2390,"market_price":5990,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愰檷浠峰啿閲忋\u20ac戙\u20ac愭湀鐦�20鏂ゃ\u20ac戠氦浣撶槮韬湝鍑忚偉鐦﹁韩闇滈娓繘鍙ashow Life鐦﹁叞韬劯澶ц吙闇滃噺澶ц倸瀛愮噧鑴傚噺鑴傝偑绮炬补150g","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/18c194fe4e98356de33077c9903b2384.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/9bc29b12946b95bc1926289a0f640343.jpeg","is_onsale":1},{"normal_price":2500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/d64696d80d2c5f1fe23e73f493bc559b.jpeg","event_type":0,"sales":1385,"goods_id":71062602,"short_name":"銆愪拱浜岄\u20ac佷竴 鍛婂埆涓诲鎵� 鎾曞嚭瀚╃櫧鍙屾墜銆態ADERCILL鐗涘ザ铚傝湝鎵嬭啘鎵嬭湣150g 淇濇箍婊嬫鼎鎵嬭冻閮ㄧ編鐧借ⅹ鐤ょ棔鍘昏璐ㄨ\u20ac佽導姝荤毊","quantity":8615,"logo":"","is_app":0,"price":1990,"market_price":9900,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愪拱浜岄\u20ac佷竴 鍛婂埆涓诲鎵� 鎾曞嚭瀚╃櫧鍙屾墜銆態ADERCILL鐗涘ザ铚傝湝鎵嬭啘鎵嬭湣150g 淇濇箍婊嬫鼎鎵嬭冻閮ㄧ編鐧借ⅹ鐤ょ棔鍘昏璐ㄨ\u20ac佽導姝荤毊","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/bd731363946709aea05e9217899d2a25.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/20ed7e92132f0b7ad94e057bbad3532e.jpeg","is_onsale":1},{"normal_price":2900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/004cfe2d9d3547ffd4c90325b7cad3a5.jpeg","event_type":0,"sales":1425,"goods_id":69195475,"short_name":"銆愪拱涓\u20ac閫佷竴 銆戙\u20ac�7澶╁憡鍒剼姘斻\u20ac戝幓鑴氭皵鑴氱矇鎶戣弻闄ゅ懗闄よ嚟鑴氬幓鑴氭皵鑷紓鍛虫潃鑿屽厠鏄熸鐥掗櫎鑴氱硿鐑傝剼鑷剼鐥掓按娉¤劚鐨剼绮�","quantity":1075,"logo":"","is_app":0,"price":1790,"market_price":7900,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愪拱涓\u20ac閫佷竴 銆戙\u20ac�7澶╁憡鍒剼姘斻\u20ac戝幓鑴氭皵鑴氱矇鎶戣弻闄ゅ懗闄よ嚟鑴氬幓鑴氭皵鑷紓鍛虫潃鑿屽厠鏄熸鐥掗櫎鑴氱硿鐑傝剼鑷剼鐥掓按娉¤劚鐨剼绮�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/84796a3bd6330928fd80ae160a3f9053.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/a1ee7e435c520ecd14d76012454a8c6d.jpeg","is_onsale":1},{"normal_price":2100,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-17/0b9f4c20663fea162b7ef408085d9ab3.jpeg","event_type":0,"sales":189469,"goods_id":273099,"short_name":"涓夎壊鐗欒啅 涔�3閫�1 涔�4閫�2","quantity":5258,"logo":"","is_app":0,"price":1580,"market_price":3100,"goods_name":"銆愭剰澶у埄杩涘彛銆戙\u20ac愪拱3閫�1 涔�4閫�2銆戜笁鑹茬墮鑶廇quafresh 闄ゅ彛鑷編鐧藉幓榛勫幓鐑熸笉鎶楄繃鏁�100ML","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-17/a948f5310e96eeede0cb2f715acfa0ff.jpeg","customer_num":2,"country":"鎰忓ぇ鍒�","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/587175/BGwVsKJMtuDkcLkzv5InyhJXzH8KPIYZ.jpg","is_onsale":1},{"normal_price":3200,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/6c08632d53a37180f198691c5cfd14d5.jpeg","event_type":0,"sales":5425,"goods_id":3811867,"short_name":"銆�0鐟曠柕0鏂戠偣 璁╄\u20ac佸叕鏇寸埍鑷繁銆憁istine缇界考闄剁摲绮夐ゼ閬憰鎸佷箙鎺ф补瀹氬缇庣櫧闃叉檼闃叉按 10g","quantity":1270,"logo":"","is_app":0,"price":2790,"market_price":8900,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戙\u20ac�0鐟曠柕0鏂戠偣 璁╄\u20ac佸叕鏇寸埍鑷繁銆憁istine缇界考闄剁摲绮夐ゼ閬憰鎸佷箙鎺ф补瀹氬缇庣櫧闃叉檼闃叉按 10g","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/4b361a4bba45b587abbd72c34c25f6cc.jpeg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-15/9a1016e5dbecc1a33dd81eb4565e7676.jpeg","is_onsale":1},{"normal_price":5800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/c8c2f5ecdaa7387bc5ab8b53e144aae5.jpeg","event_type":0,"sales":80,"goods_id":26724270,"short_name":"娉板浗TREECHADA绱犻闇滃鐢熻８濡嗛伄鐟曚繚婀胯ˉ姘村鍓嶆彁浜殧绂绘噿浜洪潰闇�50ml","quantity":4920,"logo":"","is_app":0,"price":4680,"market_price":8800,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戞嘲鍥絋REECHADA绱犻闇滃鐢熻８濡嗛伄鐟曚繚婀胯ˉ姘村鍓嶆彁浜殧绂绘噿浜洪潰闇�50ml","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/d8d704454084ab3945718e64edf80e9a.jpeg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/acdaa2038feff20a4afe56e8eaeca34b.jpeg","is_onsale":1}],"home_banner_width":1000,"goods_num":158,"sales":870318,"home_banner_height_2":375,"position":9,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-03-16/2e2d7b8350e447b2b1c1c170bded61f7.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1489593600,"subject":"鎶よ偆缇庡绉樼睄锛屼綆鑷�9.9鍏�","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-03-16/51fde1cfd9abf477ac94f562a5f29798.jpeg","column_num":2,"share_image":"","desc":"濂崇缇庤偆绉樼睄锛屼綆鑷�22.9鍏�","type":"haitao_recommend","subject_id":1144},{"second_name":"","goods_list":[{"normal_price":2690,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/bd4490515ec4024743729ce64ecdd74c.jpeg","event_type":0,"sales":856,"goods_id":62357973,"short_name":"銆愰檺閲忔姌鎵ｃ\u20ac戙\u20ac愬叏妫夊娆惧彲閫夈\u20ac�2017绉嬭鏂版绾闀胯T鎭ゅコ瀛︾敓闊╁浗鍩虹娆炬睏琛潯琛ｇ櫨鎼畝绾﹀嵃鑺卞渾棰嗘墦搴曡～灏忔竻鏂版樉鐦︿笂琛�","quantity":71271,"logo":"","is_app":0,"price":2390,"market_price":6900,"goods_name":"銆愬瓱鍔犳媺鍥借繘鍙ｃ\u20ac戙\u20ac愰檺閲忔姌鎵ｃ\u20ac戙\u20ac愬叏妫夊娆惧彲閫夈\u20ac�2017绉嬭鏂版绾闀胯T鎭ゅコ瀛︾敓闊╁浗鍩虹娆炬睏琛潯琛ｇ櫨鎼畝绾﹀嵃鑺卞渾棰嗘墦搴曡～灏忔竻鏂版樉鐦︿笂琛�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/eae07762a127f477fe5d8e47ab43ac37.jpeg","customer_num":2,"country":"瀛熷姞鎷夊浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/9a48e18da197f6463243c640b1f69c15.jpeg","is_onsale":1},{"normal_price":7500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/2759a72d8ed5ce07a44c47be54789b53.jpeg","event_type":0,"sales":543,"goods_id":70086824,"short_name":"銆愰檺閲忔姌鎵�100浠姐\u20ac�  Spountin2017绉嬪啲瑁呮瘺琛ｉ拡缁囩敺澹紑琛嚎琛ｆ疆鐢疯闈掑勾淇韩娆捐杽娆惧濂�","quantity":359,"logo":"","is_app":0,"price":6990,"market_price":78800,"goods_name":"銆愯嫳鍥借繘鍙ｃ\u20ac戙\u20ac愰檺閲忔姌鎵�100浠姐\u20ac�  Spountin2017绉嬪啲瑁呮瘺琛ｉ拡缁囩敺澹紑琛嚎琛ｆ疆鐢疯闈掑勾淇韩娆捐杽娆惧濂�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/27db48dd4b29771d43e6dab24c90a5ef.jpeg","customer_num":2,"country":"鑻卞浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/289f72e1fc02bf3b6341483fda0307ea.jpeg","is_onsale":1},{"normal_price":4250,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/96bfb9e309cf2102182ad9b2d9e57233.jpeg","event_type":0,"sales":568,"goods_id":67683844,"short_name":"銆愮瀛ｆ柊娆俱\u20ac慥ANVENE 涓\u20ac鏉\u2033ソ瑁ゅ瓙闇\u20ac瑕佹棤鏁版鏀硅壇 鍥涢潰寮瑰姏闈㈡枡浠跨毊瑁� 鍔犵粧鏄剧槮楂樿叞澶х爜鐨￥","quantity":5780,"logo":"","is_app":0,"price":3990,"market_price":18888,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愮瀛ｆ柊娆俱\u20ac慥ANVENE 涓\u20ac鏉\u2033ソ瑁ゅ瓙闇\u20ac瑕佹棤鏁版鏀硅壇 鍥涢潰寮瑰姏闈㈡枡浠跨毊瑁� 鍔犵粧鏄剧槮楂樿叞澶х爜鐨￥","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/177f59e0bf3d03e458e6146b9f385604.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/9b35cfd6568a1787204b587cbe3cb96f.jpeg","is_onsale":1},{"normal_price":4590,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/8eff77b17edfbb54d8a89ecd89eb949c.jpeg","event_type":0,"sales":203,"goods_id":68505369,"short_name":"銆愭礇鍑屻\u20ac戙\u20ac愮簿鍝佸崼琛� 涓嶈捣鐞冦\u20ac佷笉鎺夎壊銆戠瀛ｆ柊鍝佺函鑹插瓧姣嶅嵃鑺辫繛甯芥娊缁冲闄㈤瀹芥澗鐧炬惌濂抽暱琚栧崼琛RA1023-2079","quantity":1297,"logo":"","is_app":0,"price":3990,"market_price":39800,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愭礇鍑屻\u20ac戙\u20ac愮簿鍝佸崼琛� 涓嶈捣鐞冦\u20ac佷笉鎺夎壊銆戠瀛ｆ柊鍝佺函鑹插瓧姣嶅嵃鑺辫繛甯芥娊缁冲闄㈤瀹芥澗鐧炬惌濂抽暱琚栧崼琛RA1023-2079","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/55b169812394851289774ad0e2ac5434.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/929162f89894dcc1ae1deefb7dae9ae2.jpeg","is_onsale":1},{"normal_price":3990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/2596357d7835c55fd6fa11f9d2a3e152.jpeg","event_type":0,"sales":771,"goods_id":72646527,"short_name":"绉\u20ac瀹濊帀 娲炲鏉剧墰浠斾節鍒嗚￥濂冲搱浼﹀灝瑁ょ炕杈圭洿绛掗煩鐗堜篂涓愯￥","quantity":2709,"logo":"","is_app":0,"price":2990,"market_price":29800,"goods_name":"銆愰娓繘鍙ｃ\u20ac戠瀹濊帀 娲炲鏉剧墰浠斾節鍒嗚￥濂冲搱浼﹀灝瑁ょ炕杈圭洿绛掗煩鐗堜篂涓愯￥","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/b76b964207f5ea7c2a8dce24d5216933.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/76b29b737922ed263e66a82d4f1f3a12.jpeg","is_onsale":1},{"normal_price":7590,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/25c7064e5cafda10ea687d148ac34150.jpeg","event_type":0,"sales":407,"goods_id":69452889,"short_name":"spountin鍗拌姳娓╁彉鍗。2017绉嬪啲瑁呯敺瑁呮柊鍝佺敺澹渾棰嗗澶翠笂琛ｆ疆娴佹椂灏氭皵璐ㄧ櫨鎼浼戦棽杩愬姩鍗。","quantity":1642,"logo":"","is_app":0,"price":6990,"market_price":68800,"goods_name":"銆愯嫳鍥借繘鍙ｃ\u20ac憇pountin鍗拌姳娓╁彉鍗。2017绉嬪啲瑁呯敺瑁呮柊鍝佺敺澹渾棰嗗澶翠笂琛ｆ疆娴佹椂灏氭皵璐ㄧ櫨鎼浼戦棽杩愬姩鍗。","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/2307837cc630ec503a7d4dc422a1ba91.jpeg","customer_num":2,"country":"鑻卞浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/4a05736644805fdb7fc5ed31ceaab68b.jpeg","is_onsale":1},{"normal_price":3990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/d87116ba4be435c53dc1431488e98e42.jpeg","event_type":0,"sales":64,"goods_id":67488618,"short_name":"銆愮鍐繀澶囥\u20ac戙\u20ac愭缇庢椂灏氥\u20ac慓LAVNCNY 淇濇殩鏃跺皻鍥村肪 濂虫槬绉嬪啲瀛ｉ煩鐗堟姭鑲╀袱鐢ㄤ繚鏆栫罕宸炬矙婊╁肪 瓒呭ぇ娴疯竟闃叉檼涓濆肪","quantity":1936,"logo":"","is_app":0,"price":3680,"market_price":16800,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愮鍐繀澶囥\u20ac戙\u20ac愭缇庢椂灏氥\u20ac慓LAVNCNY 淇濇殩鏃跺皻鍥村肪 濂虫槬绉嬪啲瀛ｉ煩鐗堟姭鑲╀袱鐢ㄤ繚鏆栫罕宸炬矙婊╁肪 瓒呭ぇ娴疯竟闃叉檼涓濆肪","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/b796ab525fae0aee96f7214c12ee4ae1.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/f0a36c73c37ff58f65773d5bfdaf8380.jpeg","is_onsale":1},{"normal_price":4280,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/e22daf718df2bfc4634aa969bf46afb9.jpeg","event_type":0,"sales":56,"goods_id":71671020,"short_name":"susanny 鑸掗\u20ac備竴鐗囧紡鏃犻挗鍦堣仛鎷㈡枃鑳� 闆舵潫缂氳垝閫傜編鑳屽唴琛� 浼氬懠鍚哥殑杩愬姩鏂囪兏","quantity":3859,"logo":"","is_app":0,"price":3890,"market_price":6900,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac憇usanny 鑸掗\u20ac備竴鐗囧紡鏃犻挗鍦堣仛鎷㈡枃鑳� 闆舵潫缂氳垝閫傜編鑳屽唴琛� 浼氬懠鍚哥殑杩愬姩鏂囪兏","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/e6cd4f4f465d8dea413dcffe9ca876b7.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/413367de59e272ea7462f9a77bdcda2f.jpeg","is_onsale":1},{"normal_price":2990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/a866beb9324dbee2c0af66113cd16525.jpeg","event_type":0,"sales":426,"goods_id":68519562,"short_name":"銆愰檺閲忕壒浠枫\u20ac戝叏妫夐暱琚朤鎭ゆ槬绉嬫瀹芥澗澶х爜鐢锋仱闀胯鑳栧瓙绾鍔犺偉鍔犲ぇ鐮佺敺瑁呰偉浣瑃鎭ょ敺澶у彿鐮佺鍐墦搴曡～涓婅。澶栫┛闈掑皯骞村反楠忔柉","quantity":53574,"logo":"","is_app":0,"price":2880,"market_price":7900,"goods_name":"銆愬瓱鍔犳媺鍥借繘鍙ｃ\u20ac戙\u20ac愰檺閲忕壒浠枫\u20ac戝叏妫夐暱琚朤鎭ゆ槬绉嬫瀹芥澗澶х爜鐢锋仱闀胯鑳栧瓙绾鍔犺偉鍔犲ぇ鐮佺敺瑁呰偉浣瑃鎭ょ敺澶у彿鐮佺鍐墦搴曡～涓婅。澶栫┛闈掑皯骞村反楠忔柉","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/66e34d4d8c3a00a1d3a97f56abff945a.jpeg","customer_num":2,"country":"瀛熷姞鎷夊浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/c6afa12c00d5cf79963763ca649e76a9.jpeg","is_onsale":1},{"normal_price":4490,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/278478d45ad2468ee3e5c58f1ac5e835.jpeg","event_type":0,"sales":1287,"goods_id":37722855,"short_name":"銆愰珮鍝佽川銆戠鍐柊娆剧函鑹插崐楂橀缇婄粧琛コ寮忕緤缁掕～淇韩姣涜。閽堢粐鎵撳簳琛� 绉嬭 鍐","quantity":200913,"logo":"","is_app":0,"price":3990,"market_price":48800,"goods_name":"銆愭触宸村竷闊﹁繘鍙ｃ\u20ac戙\u20ac愰珮鍝佽川銆戠鍐柊娆剧函鑹插崐楂橀缇婄粧琛コ寮忕緤缁掕～淇韩姣涜。閽堢粐鎵撳簳琛� 绉嬭 鍐","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/1d718bc674d52f0c51da140a266b7ab5.jpeg","customer_num":2,"country":"娲ュ反甯冮煢","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/m5I2xUDOPHpI4hMtvUkvMGEAtfO4GXKi.jpg","is_onsale":1}],"home_banner_width":1000,"goods_num":98,"sales":151462,"home_banner_height_2":375,"position":12,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-03-16/2d17a6b1f34140761091669994f62820.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1489593600,"subject":"鏂板搧鏈嶉グ銆佸唴琛ｄ簭鏈竻浠撱\u20ac愪粎姝や竴澶┿\u20ac�","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-03-16/355b40d05da32ad61f76bcb7126f28b4.jpeg","column_num":2,"share_image":"","desc":"鏂板搧鏈嶉グ銆佸唴琛ｄ簭鏈竻浠撱\u20ac愪粎姝や竴澶┿\u20ac慭n","type":"haitao_recommend","subject_id":1145},{"second_name":"","goods_list":[{"normal_price":5790,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/8a81cc951e99d6905ca9a40c94ab698e.jpeg","event_type":0,"sales":213,"goods_id":73218713,"short_name":"Artlike濂崇绉嬪濂楄鍎跨瀹濆疂淇濇殩涓婅。鎵撳簳闀胯￥涓や欢濂桝R173022","quantity":787,"logo":"","is_app":0,"price":4790,"market_price":29900,"goods_name":"銆愰娓繘鍙ｃ\u20ac慉rtlike濂崇绉嬪濂楄鍎跨瀹濆疂淇濇殩涓婅。鎵撳簳闀胯￥涓や欢濂桝R173022","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/3a9a700633f91185f7fb1494ab8fe5fd.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/3d33faed5881569b5073c7f208152f1a.jpeg","is_onsale":1},{"normal_price":1280,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/60c6aeffa02e059a73bbd13f6aba2c87.jpeg","event_type":0,"sales":156,"goods_id":70111725,"short_name":"瀹濆疂闃叉粦鍔犲帤鍦版澘琚�","quantity":1444,"logo":"","is_app":0,"price":990,"market_price":5900,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愮鍐柊娆俱\u20ac� 銆愬瑙勬牸鍙\u20ac夈\u20ac戠鍐┐鍎胯瀛愬疂瀹濋槻婊戝湴鏉胯 鐝婄憵缁掔敺濂崇鍔犲帤琚� 鍗￠\u20ac氱珛浣撶強鐟氱粧鏉惧彛瀛︽琚�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/ef5c72e7096dcaa5a42d7563786f4ec6.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/ad41e1c44762c1fa8be22ed8bc39f6a2.jpeg","is_onsale":1},{"normal_price":2900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/7e70efbc79e0ff0292e3419eaaa05e51.jpeg","event_type":0,"sales":115,"goods_id":5270793,"short_name":"娆х洘鏍囧噯A绫荤函妫�","quantity":3610,"logo":"","is_app":0,"price":1900,"market_price":15800,"goods_name":"銆愬瓱鍔犳媺鍥借繘鍙ｃ\u20ac戙\u20ac愯棌闈掕壊鐗逛环銆慉VIONETA绔ヨ2017鏂版绉嬫鐢峰コ绔鎭ょ函妫夐暱琚栨墦搴曡～鍚告睏涓嶈お鑹蹭笉璧风悆鐢峰濂冲涓婅。鍎跨绉嬪3456宀�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/1cde3ed901ab64641709976b21132deb.jpeg","customer_num":2,"country":"瀛熷姞鎷夊浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-20/bf3f9b199accfdf367795b32fe38c7fa.jpeg","is_onsale":1},{"normal_price":6800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/9f6c05c2ceccc9d32b6942c81a13fa49.jpeg","event_type":0,"sales":248,"goods_id":67090599,"short_name":"瀛︾敓鍙岃偐鍖呭甫鍙嶅厜鏉�","quantity":206,"logo":"","is_app":0,"price":4990,"market_price":69900,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愬紑瀛﹀鐗规儬銆戝皬瀛︾敓涔﹀寘甯︽枃鍏风洅鐢峰コ鍙岃偐鑳屽寘鏂版甯﹀弽鍏夋潯闃叉按鑰愮（鍎跨涔﹀寘鍙嶅厜","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/f90caef33c77ae27b3c633accca78e1c.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/9b7dd909632ee94716a3880c5154ac25.jpeg","is_onsale":1},{"normal_price":5500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-29/ddaddfabc914b8cd4d4869f13099d106.jpeg","event_type":0,"sales":86,"goods_id":16027129,"short_name":"Sam and Sydney 灏忕绉嬭鏂版濂楄鐢峰疂瀹濊繍鍔ㄥ崼琛ｄ袱浠跺闊╃増1-3宀�2鍎跨鏄ョ瀛ｉ暱琚栬。鏈�","quantity":566,"logo":"","is_app":0,"price":3990,"market_price":15900,"goods_name":"銆愰娓繘鍙ｃ\u20ac慡am and Sydney 灏忕绉嬭鏂版濂楄鐢峰疂瀹濊繍鍔ㄥ崼琛ｄ袱浠跺闊╃増1-3宀�2鍎跨鏄ョ瀛ｉ暱琚栬。鏈�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-29/bf975d9891869a60f3cc911b53411a57.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-29/7c0e7f658633bcdb2854f380dd782a51.jpeg","is_onsale":1},{"normal_price":3500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/55195bb839431fc513cc98562cb601b0.jpeg","event_type":0,"sales":18,"goods_id":71752229,"short_name":"I.K鍗拌薄绔ュ勾1-8宀佸効绔ヤ紤闂插瑁呭疂瀹濋暱琚栭暱瑁や袱浠跺","quantity":382,"logo":"","is_app":0,"price":3200,"market_price":9900,"goods_name":"銆愯嫳鍥借繘鍙ｃ\u20ac慖.K鍗拌薄绔ュ勾1-8宀佸効绔ヤ紤闂插瑁呭疂瀹濋暱琚栭暱瑁や袱浠跺","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/8423264deb3926f1bbbd3c9e38544862.jpeg","customer_num":2,"country":"鑻卞浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/ef15bd103443fe4f98633e7bb05cab65.jpeg","is_onsale":1},{"normal_price":850,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/55fa24aa145ab7db9754ae0bb0ecb39a.jpeg","event_type":0,"sales":844,"goods_id":6750896,"short_name":"鍘熺増绉樺瘑鑺卞洯娑傝壊涔�","quantity":272,"logo":"","is_app":0,"price":750,"market_price":4300,"goods_name":"銆愰煩鍥借繘鍙ｃ\u20ac戠瀵嗚姳鍥� 姝ｇ増鎺堟潈鎵嬬粯娑傝壊涔� 绉樺瘑鐨勫涵闄ecret garden鍑忓帇娑傞甫濉壊鏈垚浜鸿В鍘嬮煩鏂囩増/鑻辨枃鐗�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/6513e8a3a88843a3dfb674af9d6331ad.jpeg","customer_num":2,"country":"闊╁浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-07/4574bf051c77a7c72d96e3c63b7f1295.jpeg","is_onsale":1},{"normal_price":3990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/e5e4a3349df3de57a1a5730c71a0bc40.jpeg","event_type":0,"sales":110,"goods_id":69585759,"short_name":"銆愮鍐柊娆俱\u20ac慻o-coo!!濠村効绔ヤ繚鏆у附瀛� 绉嬪啲瀛ｇ敺濂崇瀹濆疂甯藉瓙 鍎跨鍔犵粧鍔犲帤淇濇殩甯芥姢鑰冲附 鐢峰コ鍎跨灏忓濂楀ご甯�","quantity":1890,"logo":"","is_app":0,"price":3680,"market_price":15800,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愮鍐柊娆俱\u20ac慻o-coo!!濠村効绔ヤ繚鏆у附瀛� 绉嬪啲瀛ｇ敺濂崇瀹濆疂甯藉瓙 鍎跨鍔犵粧鍔犲帤淇濇殩甯芥姢鑰冲附 鐢峰コ鍎跨灏忓濂楀ご甯�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/3eb9c314c27082bf967537a0fc345c2f.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/b4b034598f3ad7c5e57d81b7ed1a1332.jpeg","is_onsale":1},{"normal_price":7080,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/616ec874e1a85a10aa3ee4c17daf48ad.jpeg","event_type":0,"sales":1651,"goods_id":2927052,"short_name":"瀹樻柟鎺堟潈鐔婃湰澹繚娓╂澂","quantity":1025,"logo":"","is_app":0,"price":6980,"market_price":19800,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愬紑瀛﹀銆戙\u20ac愭鍝佹巿鏉冦\u20ac戠唺鏈＋淇濇俯鏉効绔ユ按澹跺甫鍚哥姘存澂銆愰\u20ac佹澂鍒枫\u20ac戝疂瀹濈敺濂冲鐢熸垚浜轰究鎼轰袱鐢ㄩ槻婕忔按鏉瓙600ML","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/0ddfe487715cf3c8c5687173339d7b45.jpeg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/6807239/Zcjuu0Y7LfOcwcpl7shKTMJvM9c4ceGG.jpg","is_onsale":1},{"normal_price":4900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-16/e5a5937f95952ce5bf27feaeb20d359a.jpeg","event_type":0,"sales":6,"goods_id":5270767,"short_name":"avioneta绔ヨ 2017鏄ョ鏂版鏃跺皻鐧炬惌闀胯T鎭�3-7宀佸コ瀛╁瓙绉嬫涓婅。鍏ㄦ鎵撳簳琛叏鍥藉寘閭�","quantity":944,"logo":"","is_app":0,"price":3900,"market_price":15800,"goods_name":"銆愬瓱鍔犳媺鍥借繘鍙ｃ\u20ac慳vioneta绔ヨ 2017鏄ョ鏂版鏃跺皻鐧炬惌闀胯T鎭�3-7宀佸コ瀛╁瓙绉嬫涓婅。鍏ㄦ鎵撳簳琛叏鍥藉寘閭�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-16/3ceca005f65b16b27e2494e492df95c4.jpeg","customer_num":2,"country":"瀛熷姞鎷夊浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-04-14/1fa4a8e00880ff9772a892f124855570.jpeg","is_onsale":1}],"home_banner_width":1000,"goods_num":79,"sales":99786,"home_banner_height_2":375,"position":15,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-03-16/166ad005f9fdf8a5d400d0b02bcc47cf.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1489593600,"subject":"鍏ㄧ悆姣嶅┐锛岀瑁呬綆鑷�3鎶樿捣","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-03-16/9c5d94d7a42be7597a9c195d388512d3.jpeg","column_num":2,"share_image":"","desc":"杩涘彛鏄ュ绔ヨ浣庤嚦19.9锛岀珛鍗虫姠璐�","type":"haitao_recommend","subject_id":1146},{"second_name":"","goods_list":[{"normal_price":3200,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-24/fe2b65b725ac17c17c1e055429d32674.jpeg","event_type":0,"sales":4017,"goods_id":14154653,"short_name":"涔�3閫�2 鍑忚偉澶ч害鑻ュ彾闈掓眮","quantity":84871,"logo":"","is_app":0,"price":2350,"market_price":10000,"goods_name":"銆愬彴婀捐繘鍙ｃ\u20ac戙\u20ac愪拱3閫�2锛岄\u20ac佸悓娆俱\u20ac戝ぇ楹﹁嫢鍙舵棩鏈潚姹� 7澶╃敥鎺夊皬鑲氬瓙姘存《鑵� 鏈堢槮30鏂� 閫氫究鎺掕偁姣掑噺鑲�60g/鐩�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-30/27b26602046fec07220e6448fcb41ef6.jpeg","customer_num":2,"country":"鍙版咕","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-27/540fbfdbb243b3516819a5024be8028d.jpeg","is_onsale":1},{"normal_price":7000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/d2W50CnibQvBWkdfCmABS4RxoFBzmTzi.jpg","event_type":0,"sales":18476,"goods_id":1883120,"short_name":"鐨囨眽鍫� 渚跨涓� 娓呭渚挎帓姣� 鍘荤棙绁涙枒鍏婚 400绮掕","quantity":15024,"logo":"","is_app":0,"price":6800,"market_price":15800,"goods_name":"銆愭棩鏈洿閭\u20ac戠殗姹夊爞 渚跨涓� 娓呭渚挎帓姣� 鍘荤棙绁涙枒鍏婚 400绮掕","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/Kr3Gh6S4GZd53W40G0sCI3JVKUzVlhla.jpg","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/vdy1196JXWUTfvzU4nZ5pJQ6cJPIsfTf.jpg","is_onsale":1},{"normal_price":8000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1607275899473205/YX2Y7KQk6ZtwIC2a29mzfRFtYNylpWQL.jpg","event_type":0,"sales":65577,"goods_id":328531,"short_name":"涔愬悍鑶�500g 娓呰偁绾や綋","quantity":74824,"logo":"","is_app":0,"price":6590,"market_price":9800,"goods_name":"銆愭境澶у埄浜氳繘鍙ｃ\u20ac戙\u20ac愭竻鑲犵氦浣撱\u20ac慛u-lax涔愬悍鑶忕函澶╃劧鏋滆敩鑶� 500g娓呰偁鎺掓瘨 濂借繃涓崕鑲氳剱璐�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/bd99f9b9ae6f4d5c02b605a5e4c91807.jpeg","customer_num":2,"country":"婢冲ぇ鍒╀簹","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1607275899473205/lzOXiC52BIn3itcfNwvtKcPolbauu1LP.jpg","is_onsale":1},{"normal_price":10900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/10a566bf2343908e26aa3a7ce0dd48a3.jpeg","event_type":0,"sales":10,"goods_id":38466168,"short_name":"鏍戣帗閰� 鐕冭剛鐦﹁韩鑳跺泭","quantity":90,"logo":"","is_app":0,"price":8900,"market_price":13900,"goods_name":"銆愭境澶у埄浜氱洿閭\u20ac戙\u20ac愬墠100鍚嶇壒浠枫\u20ac� 婢充箰缁翠粬EnerVite鏍戣帗閰兌鍥� 鐕冭剛鐦﹁韩 30绮抃/鐡� 涓\u20ac鐡惰 杈ｅ瀛﹂櫌鎺ㄨ崘","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/c1e0f97441185ae2542b843de7e43d3a.jpeg","customer_num":2,"country":"婢冲ぇ鍒╀簹","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/3491b8986ff7b83f8fa14de7e56158c5.jpeg","is_onsale":1},{"normal_price":11900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/3d0581a68e0f394386d78bf872bd63c0.jpeg","event_type":0,"sales":15,"goods_id":32329613,"short_name":"钘ら粍鏋滃噺鑲ヨ兌鍥�","quantity":485,"logo":"","is_app":0,"price":9900,"market_price":19900,"goods_name":"銆愮編鍥界洿閭\u20ac慦ooHoo瓒呯骇钘ら粍鏋滃噺鑲ョ槮韬兌鍥�180绮�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/4f62e0a9194bf116ddcb24a3c62b014c.jpeg","customer_num":2,"country":"缇庡浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-26/6bfa010bc8259a6d7e1b6db6aa436611.jpeg","is_onsale":1},{"normal_price":14200,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1705029583083613/Pj8oDYGD6RBwtkYBgMkQNiN1O2vvmlBw.jpg","event_type":0,"sales":1233,"goods_id":6480978,"short_name":"搴峰疂鑾� 鐦﹁叞鐗�","quantity":1867,"logo":"","is_app":0,"price":9900,"market_price":19900,"goods_name":"銆愮編鍥借繘鍙ｃ\u20ac戙\u20ac愪拱2绔嬪噺20 锛屼拱3绔嬪噺30銆戠編鍥戒骇搴峰疂鑾辩槮鑵扮墖 缁嗚叞鐗囩粏鍠滈敪缁嗚叞鑶抽绾ょ淮濉戣吙濉戣叞90鐗�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-15/f59cc76705dfae6e2c3069d386e5a448.jpeg","customer_num":2,"country":"缇庡浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/14436385/3QaLLonr2wh86rH1TxRkFqzbIunSwP5C.jpg","is_onsale":1},{"normal_price":23000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-13/a9d4a9ece44904bf0f8505a784c63d6b.jpeg","event_type":0,"sales":140,"goods_id":6426878,"short_name":"herbalife搴峰疂鑾卞叏鑳借剛鑲噧鑴傜墖浣愬姏鐗囧叏闈㈠噺浣撻噸鎺у揩閫熷噺鑲�90绮掔摱","quantity":160,"logo":"","is_app":0,"price":22900,"market_price":32900,"goods_name":"銆愮編鍥借繘鍙ｃ\u20ac慼erbalife搴峰疂鑾卞叏鑳借剛鑲噧鑴傜墖浣愬姏鐗囧叏闈㈠噺浣撻噸鎺у揩閫熷噺鑲�90绮掔摱","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-13/94d0cb19f8d727bc07db834ccfb871b1.jpeg","customer_num":2,"country":"缇庡浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/14434105/TOOC4VJwzieNHvZZWBw9YpsYdg78ttR7.jpg","is_onsale":1},{"normal_price":6500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-16/343e688810dbfc462792b776a5166861.jpeg","event_type":0,"sales":4024,"goods_id":953603,"short_name":"娉板浗colly鍙剁豢绱犲吇棰滄不渚跨闄嶈绯栨竻瀹夸究澧炲己鍏嶇柅鍔涙竻鑲犺儍75g","quantity":2178,"logo":"","is_app":0,"price":5500,"market_price":9800,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戞嘲鍥絚olly鍙剁豢绱犲吇棰滄不渚跨闄嶈绯栨竻瀹夸究澧炲己鍏嶇柅鍔涙竻鑲犺儍75g","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-16/6b804cd47f8f515bfff11552d5933c2d.jpeg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-16/4dfdbd1b1b50b08c153ef510f430ddde.jpeg","is_onsale":1},{"normal_price":11000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/a65385236f2058296bb3694a7e1ce62e.jpeg","event_type":0,"sales":204,"goods_id":7300056,"short_name":"GNC鐡滄媺绾崇槮韬墖","quantity":296,"logo":"","is_app":0,"price":8300,"market_price":18900,"goods_name":"銆愰娓洿閭\u20ac戠編鍥� 鍋ュ畨鍠� GNC Burn 60 鐡滄媺绾�60鐗� 鎺у埗浣撻噸鐦﹁韩鐕冪儳鑴傝偑 鎻愰珮鍩虹浠ｈ阿","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/894b108ab1db5a728aa74095f7da9416.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-15/6e137c157d689b9c312cd3fc9a9677ba.jpeg","is_onsale":1},{"normal_price":3200,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-25/478121947f1111089e41589b7e9304f1.jpeg","event_type":0,"sales":17101,"goods_id":13228188,"short_name":"涔�2閫�1 寮烘晥鍑忚偉閰电礌姊�","quantity":71787,"logo":"","is_app":0,"price":2350,"market_price":10000,"goods_name":"銆愬彴婀捐繘鍙ｃ\u20ac戙\u20ac愪拱2琚嬮\u20ac�1琚嬨\u20ac戝彴婀剧帿鐟伴叺绱犳闅忎究鏋� 7澶╁嚮婧冭禈鑲夛紝涓嶅弽寮癸紒 楂樻晥鍑忚偉鏈堢槮15鏂�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/738f8387b96ccc0cfb2581c3e96c6362.jpeg","customer_num":2,"country":"鍙版咕","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-25/b0ef27d6a929499006af4de0ee64530f.jpeg","is_onsale":1}],"home_banner_width":1000,"goods_num":55,"sales":698022,"home_banner_height_2":375,"position":18,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-07-06/06b703bf90c8ad7553c9a96bfd108283.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1499184000,"subject":"鍑忚偉蹇呯湅锛佽秴鍏ㄦ敾鐣� 鍙19.9璧�","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-07-06/95c2054b37cf0a1eeb9565987edc99de.jpeg","column_num":2,"share_image":"","desc":"浣犵瀹岀編澶忓ぉ灏卞樊涓\u20ac涓涪灏忚倝鑲�","type":"haitao_recommend","subject_id":2246},{"second_name":"","goods_list":[{"normal_price":990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-26/f127be2b10ee4308e38fe6a93f1f896f.jpeg","event_type":0,"sales":3928,"goods_id":57337045,"short_name":"娉板浗缇庡懗鐑樼儰妞板瓙鐗�","quantity":5971,"logo":"","is_app":0,"price":680,"market_price":8000,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戞嘲鍥界壒浜х編鍛崇儤鐑ゆぐ瀛愮墖鏃犳坊鍔犵唺鐚皬浜孭ANDAXIAOER鍖呴偖鍔炲叕瀹ゅ皬鍚冨効绔ヤ笅鍗堣尪钀ュ吇鏃╅棣欒剢鍙彛浼戦棽椋熷搧杩涘彛闆堕澶хぜ鍖�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/92992f59937173249ef5eac2e8880f58.jpeg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-17/32fdb452550927fd82604fb42ca65ace.jpeg","is_onsale":1},{"normal_price":2990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1610169483992978/qtNHv3H9buGiQBVGvLq1yo1m07RcUykM.jpg","event_type":0,"sales":58085,"goods_id":852790,"short_name":"Tipo闈㈠寘骞� 2琚嬭","quantity":68915,"logo":"","is_app":0,"price":2890,"market_price":5200,"goods_name":"銆愯秺鍗楄繘鍙ｃ\u20ac戙\u20ac�2*30灏忓寘銆�2琚嬭秺鍗桾ipo闈㈠寘骞�300g*2琚�  楦¤泲闈㈠寘骞茬墰濂跺懗楗煎共鍔炲叕瀹ら浂椋熷皬鍚�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-19/7666c959a12f204056ea82c2030856d3.jpeg","customer_num":2,"country":"瓒婂崡","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1610169483992978/1Q9l99548iPQ1dSJkSQSF2OluwL7sjz7.jpg","is_onsale":1},{"normal_price":5300,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/f94374e2482c502acb29b0c5749faac6.jpeg","event_type":0,"sales":31647,"goods_id":148619,"short_name":"4鏂わ紒淇勭綏鏂硸鏋滃ぇ绀煎寘  瓒呭\u20ac奸噺璐╁厓鏃� 鏂板勾 鐢滆湝濠氬簡鍠滅硸闆堕鍚传鐨硸宸у厠鍔涢吀濂跺▉鍖栫硸澹姏鏋舵澗闇茬硸纭硸杞硸","quantity":32353,"logo":"","is_app":0,"price":4790,"market_price":9500,"goods_name":"銆愪縿缃楁柉杩涘彛銆�4鏂わ紒淇勭綏鏂硸鏋滃ぇ绀煎寘  瓒呭\u20ac奸噺璐╁厓鏃� 鏂板勾 鐢滆湝濠氬簡鍠滅硸闆堕鍚传鐨硸宸у厠鍔涢吀濂跺▉鍖栫硸澹姏鏋舵澗闇茬硸纭硸杞硸","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/0802c999b04837f9502c3cec53314c9d.jpeg","customer_num":2,"country":"淇勭綏鏂�","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1606039505901353/axUFKhvggG4IX5qhiZ5AUW4xPHu1AGMd.jpg","is_onsale":1},{"normal_price":1850,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-24/5acb7f0c0cb681898a86b98d4a33b519.jpeg","event_type":0,"sales":1201,"goods_id":3249418,"short_name":"鍗\u2033叾璇烘灉鍐诲竷涓佸竷鐢� 鑺掓灉/棣欒妺/閰稿ザ鍛� 澶氬彛鍛冲彲閫夋嫨 360g*2","quantity":3602,"logo":"","is_app":0,"price":1720,"market_price":3200,"goods_name":"銆愰娓繘鍙ｃ\u20ac戝崱鍏惰鏋滃喕甯冧竵甯冪敻 鑺掓灉/棣欒妺/閰稿ザ鍛� 澶氬彛鍛冲彲閫夋嫨 360g*2","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-24/b7616fdf3eca9008d873c1d1b4c931a1.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-24/c181945cb0df5676949131093568f5c6.jpeg","is_onsale":1},{"normal_price":1390,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/079e3b0210f9bfbdf9bfd42186ec803e.jpeg","event_type":0,"sales":147,"goods_id":36187312,"short_name":"閲戝暒鍝╃偢鐚毊70鍏�","quantity":3355,"logo":"","is_app":0,"price":1280,"market_price":2900,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戙\u20ac愯ˉ鍏呰兌鍘熻泲鐧� 缇庡鍏婚 娉板浗鎷涚墝闆堕 鍚冭揣蹇呭銆戞嘲鍥介噾鍟﹀摡鐐哥尓鐨�70鍏� 榛勯噾棣欒剢鍙ｅ彛鐣欓 娉板浗鐐哥尓鐨嵆椋熷師鍛抽杈ｅ懗鐚毊","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/904dbc64982834004c76ba4a576eec59.jpeg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/dd95a08ab2abd907cdc07040c1343a66.jpeg","is_onsale":1},{"normal_price":1188,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-10/96760e1a10d537d278f0326e68b31a67.jpeg","event_type":0,"sales":3670,"goods_id":10143534,"short_name":"娉板浗閲戞灂澶存Υ鑾插共","quantity":17839,"logo":"","is_app":0,"price":966,"market_price":23800,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戙\u20ac愯秴濂藉悆鐨勬Υ鑾插共銆� 娉板浗閲戞灂澶存Υ鑾插共660g/220g/110g鏈\u20ac鍒掔畻 闆堕姘存灉骞茶姃鏋滃共榫欑溂骞�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/06313a1825743cf87e258c3833914d88.jpeg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-10/e6a2691eb64ae01b878dd3539696a569.jpeg","is_onsale":1},{"normal_price":1100,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/b6b9d627bd64a44e3a0d9bffe7efb318.jpeg","event_type":0,"sales":18,"goods_id":39257710,"short_name":"濡欏楸块奔鍗疯櫨鐗�","quantity":9982,"logo":"","is_app":0,"price":990,"market_price":6800,"goods_name":"銆愰┈鏉ヨタ浜氳繘鍙ｃ\u20ac戦┈鏉ヨタ浜氬濡欓笨楸煎嵎铏炬潯铏剧墖60鍏媆/琚� 澶氱缁勫悎澶氱鍙ｅ懗","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/2c0b83c057b956a820bdc7b1a105df2f.jpeg","customer_num":2,"country":"椹潵瑗夸簹","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/e9666a4ec3c8d25b3e95dfc53d952592.jpeg","is_onsale":1},{"normal_price":3500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1606019270367760/WMfPPaZNppjFgmXehFUgoAvkt759EEAs.jpg","event_type":0,"sales":26440,"goods_id":146824,"short_name":"銆愮浜屼欢31鍏冦\u20ac戣秺鍗楀叓濠嗚叞鏋滃甫鐨偔鐑ц叞鏋� 410鍏� 闈炴补鐐告棤瑁圭矇","quantity":3449,"logo":"","is_app":0,"price":3300,"market_price":6900,"goods_name":"銆愯秺鍗楄繘鍙ｃ\u20ac戙\u20ac愮浜屼欢31鍏冦\u20ac戣秺鍗楀叓濠嗚叞鏋滃甫鐨偔鐑ц叞鏋� 410鍏� 闈炴补鐐告棤瑁圭矇","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1606019270367760/qO1ySoMqbjlJCofdUMh4Ihu8PHCHv9PB.jpg","customer_num":2,"country":"瓒婂崡","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1606019270367760/eO6AscQjzQTZDMYAzpghN66baYvfAS6w.jpg","is_onsale":1},{"normal_price":4500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-19/228280217d1f9e8d77b22778e787d556.jpeg","event_type":0,"sales":31,"goods_id":25604362,"short_name":"2鍖呰 浣充箰瀹氬ザ鐗�","quantity":369,"logo":"","is_app":0,"price":3400,"market_price":4900,"goods_name":"銆愭剰澶у埄杩涘彛銆戙\u20ac�2鍖呰銆戜匠涔愬畾Galatine闃挎媺涓佸阀鍏嬪姏鑽夎帗鍛冲師鍛冲ザ鐗�100g*2琚�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-19/83f8588768a1a5f6bdbeee768e7f192e.jpeg","customer_num":2,"country":"鎰忓ぇ鍒�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-19/7881b385f3b51174f0823b563e9650c1.jpeg","is_onsale":1},{"normal_price":2980,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-20/3d5f273a368b18696436d92aa36f05ef.jpeg","event_type":0,"sales":547,"goods_id":60209630,"short_name":"涓借姖澹撼瀹濆笣濂堕叒鍛冲▉鍖栭ゼ骞插す蹇冮ゼ骞茶姖蹇冩鐜夌背妫掗浂椋�58g*10鍖�,145g*5鐩掔瓑澶氳鏍艰繋涓澶т績涓借姖澹編鍛冲鏃�","quantity":1904,"logo":"","is_app":0,"price":1880,"market_price":5800,"goods_name":"銆愬嵃搴﹀凹瑗夸簹杩涘彛銆戜附鑺濆＋绾冲疂甯濆ザ閰懗濞佸寲楗煎共澶瑰績楗煎共鑺濆績妫掔帀绫虫闆堕58g*10鍖�,145g*5鐩掔瓑澶氳鏍艰繋涓澶т績涓借姖澹編鍛冲鏃�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/4e69d54d111466b30a7914a9683000c1.jpeg","customer_num":2,"country":"鍗板害灏艰タ浜�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-20/42db2f39b0fcc98046b2efcea5e619e6.jpeg","is_onsale":1}],"home_banner_width":1000,"goods_num":87,"sales":594161,"home_banner_height_2":375,"position":21,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-07-11/85b44e614a117b898fedf13dd4109892.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1499529600,"subject":"鐖斤紒鍚冨悆闆堕杩借拷鍓�   9.9绂忓埄瀹犲潖浣 ","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-07-09/bad4dd21c71145104fc4b7643bbbfa6e.jpeg","column_num":2,"share_image":"","desc":"杩藉墽蹇呭  瀹呬汉绂忓埄","type":"haitao_recommend","subject_id":2361},{"second_name":"","goods_list":[{"normal_price":4800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-04-11/5ea3403cd55286f7dd4eb3a13b64c8b4.gif","event_type":0,"sales":18244,"goods_id":458328,"short_name":"姘存灉鏃犵硸楹︾墖1050g 婢虫床鍗抽鐕曢害鐗囨棭椁愰害鐗囪惀鍏昏胺鐗╁厤鐓棤绯栫矖绮啿楗\u20ac愰鍗蜂拱2浠界珛鍑�3鍏冦\u20ac�","quantity":51756,"logo":"","is_app":0,"price":3980,"market_price":16000,"goods_name":"銆愰娓繘鍙ｃ\u20ac戞按鏋滄棤绯栭害鐗�1050g 婢虫床鍗抽鐕曢害鐗囨棭椁愰害鐗囪惀鍏昏胺鐗╁厤鐓棤绯栫矖绮啿楗\u20ac愰鍗蜂拱2浠界珛鍑�3鍏冦\u20ac�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-14/6ff3bee16ccdb23d6576b63119500b90.jpeg","customer_num":2,"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-28/5831aed687d1f4d8c9b4cd2b100e169b.jpeg","is_onsale":1},{"normal_price":4990,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/c8ced55790b2b80af4c84746e42229fc.jpeg","event_type":0,"sales":907,"goods_id":7640347,"short_name":"銆愰檺閲�300浠界壒浠枫\u20ac戠尗灞庡挅鍟\u2032笁鍚堜竴鐧藉挅鍟\u2033師鍛崇壒娴撴彁绁為\u20ac熸憾鍔炲叕瀹ゅ挅鍟�20g*20鍖呫\u20ac愬ザ棣欐祿閮佷笉鍙戣儢 鐢橀唶鑺抽涓嶄激鑳冦\u20ac�","quantity":4793,"logo":"","is_app":0,"price":2290,"market_price":6800,"goods_name":"銆愬嵃搴﹀凹瑗夸簹杩涘彛銆戙\u20ac愰檺閲�300浠界壒浠枫\u20ac戠尗灞庡挅鍟\u2032笁鍚堜竴鐧藉挅鍟\u2033師鍛崇壒娴撴彁绁為\u20ac熸憾鍔炲叕瀹ゅ挅鍟�20g*20鍖呫\u20ac愬ザ棣欐祿閮佷笉鍙戣儢 鐢橀唶鑺抽涓嶄激鑳冦\u20ac�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/0306761e7bdc1030ea502b8dce3b4ee6.jpeg","customer_num":2,"country":"鍗板害灏艰タ浜�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/d1e532069137f10079eded3f62feae6b.jpeg","is_onsale":1},{"normal_price":1780,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-25/4e6405a183140ae1a1557d25d73b57ff.jpeg","event_type":0,"sales":12698,"goods_id":302556,"short_name":"楂樼瓔闈㈢矇2KG/琚�","quantity":37518,"logo":"","is_app":0,"price":1290,"market_price":4300,"goods_name":"銆愪縿缃楁柉杩涘彛銆戜縿缃楁柉椹厠鍙戦珮绛嬮潰绮�2KG/琚� 鍋囦竴璧斿崄 瀹跺涵鍖呴ズ瀛愰潰鏉￠潰鍖呴閫�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-25/ddfba093b045ea568472954fa02504db.jpeg","customer_num":2,"country":"淇勭綏鏂�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-25/07ce28d95bb9f856720b771c9f299b0b.jpeg","is_onsale":1},{"normal_price":7380,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/c442668a8dd3f3c5fc56cb899d1db0e3.jpeg","event_type":0,"sales":184,"goods_id":673282,"short_name":"瀹朵箰姘忛鐢滅帀绫崇墖175g+鍙彲鐜夌背鐗�190g+鍙彲鐞�170g+璋疯剢鏍�150g璋风墿鏃╅4鐩掗噺璐╄","quantity":816,"logo":"","is_app":0,"price":5900,"market_price":11600,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戝涔愭皬棣欑敎鐜夌背鐗�175g+鍙彲鐜夌背鐗�190g+鍙彲鐞�170g+璋疯剢鏍�150g璋风墿鏃╅4鐩掗噺璐╄","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/d394c147ecd2ad35d265f95d659fad24.jpeg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/483f09d944de53b8485bf27beaa4d667.jpeg","is_onsale":1},{"normal_price":2590,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1609247830731374/zZ3So03FcXVNBqxnCIjpCuVkt4G5XiEv.jpg","event_type":0,"sales":1716,"goods_id":669584,"short_name":"闊╁浗娓呭噣鍥荆妞掗叡500g 椤烘槍鎷岄キ閰� 鐢滆荆閰卞師瑁呰繘鍙�","quantity":8283,"logo":"","is_app":0,"price":2490,"market_price":2990,"goods_name":"銆愰煩鍥借繘鍙ｃ\u20ac戦煩鍥芥竻鍑\u20ac鍥荆妞掗叡500g 椤烘槍鎷岄キ閰� 鐢滆荆閰卞師瑁呰繘鍙�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1609247830731374/W47FVcCA8aBGkvn32P2Ebxa2uWKgKUqg.jpg","customer_num":2,"country":"闊╁浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1609247830731374/DB09GIp5sHW9dQuhcFMsrtJmhKaWq1R0.jpg","is_onsale":1},{"normal_price":4300,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-16/c2ec457dc753750ae4af3d83c76b9d14.jpeg","event_type":0,"sales":90,"goods_id":54624169,"short_name":"濂崇帇鎸囧畾 鍏ㄩ害璋风墿","quantity":910,"logo":"","is_app":0,"price":2880,"market_price":19900,"goods_name":"銆愯嫳鍥借繘鍙ｃ\u20ac戣嫳濂崇帇鎸囧畾鏃╅  Weetabix缁村楹﹀叏楹﹁惀鍏昏胺鐗╂棭椁愬皬楗�430g 楂樼氦缁村叏楹﹂害鐗� 鑻卞浗鐨囧鏃╅楹︾墖 浣庣硸浣庤剛鍏ㄩ害楹︾墖","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-16/909647e661878efaebfcc91b1c7268ba.jpeg","customer_num":2,"country":"鑻卞浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-13/dd140b3c2311c59a69cd6e7737d5feea.png","is_onsale":1},{"normal_price":1090,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-19/59ccb9c1caf1d42800862cfb12e5db3a.jpeg","event_type":0,"sales":8951,"goods_id":6510543,"short_name":"鎰忓ぇ鍒╅潰 鍘熻杩涘彛鑾埄鎰忛潰濂楄10浜轰唤鎰忛潰鎰忕矇缁勫悎鎰忓ぇ鍒╅潰鏉\u2033椁愬瑙勬牸 鎯呬汉鑺傛氮婕� 鑾埄鎴栬\u20ac呯櫨閽�","quantity":23336,"logo":"","is_app":0,"price":990,"market_price":9900,"goods_name":"銆愭剰澶у埄杩涘彛銆戞剰澶у埄闈� 鍘熻杩涘彛鑾埄鎰忛潰濂楄10浜轰唤鎰忛潰鎰忕矇缁勫悎鎰忓ぇ鍒╅潰鏉\u2033椁愬瑙勬牸 鎯呬汉鑺傛氮婕� 鑾埄鎴栬\u20ac呯櫨閽�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-19/fda0ccd06aaae5552c55293ffce022ac.jpeg","customer_num":2,"country":"鎰忓ぇ鍒�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-05-03/772acdc493df3912978c2e1a1df18a6a.jpeg","is_onsale":1},{"normal_price":7900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/47c5b31c9e6b85133cc3f6c95520f3f6.jpeg","event_type":0,"sales":144,"goods_id":25997900,"short_name":"銆愰檺閲忕壒浠枫\u20ac戝痉浜氬痉鍥藉師瑁呰繘鍙ｉ吀鐗涘ザ200ml*10鐩掑父娓╁師鍛抽吀濂惰繘鍙ｉ吀濂朵钩绀肩洅瑁� 浠呴檺鍓�100浠斤紒","quantity":5556,"logo":"","is_app":0,"price":4590,"market_price":8500,"goods_name":"銆愬痉鍥借繘鍙ｃ\u20ac戙\u20ac愰檺閲忕壒浠枫\u20ac戝痉浜氬痉鍥藉師瑁呰繘鍙ｉ吀鐗涘ザ200ml*10鐩掑父娓╁師鍛抽吀濂惰繘鍙ｉ吀濂朵钩绀肩洅瑁� 浠呴檺鍓�100浠斤紒","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/a3a7691b55028a56a5ca20ec43e74cb7.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-24/8860c3608c36303d20d4d00c42cd6adb.jpeg","is_onsale":1},{"normal_price":13900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-13/9f2929e47e069926d7636045a54522da.jpeg","event_type":0,"sales":312,"goods_id":55381110,"short_name":"娉板浗鍘熻杩涘彛娉扮幉鐝戞嘲鍥借寜鑾夐绫�10kg澶х背20鏂よ禒閫佸皬娌�400ml","quantity":19686,"logo":"","is_app":0,"price":11800,"market_price":15900,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戞嘲鍥藉師瑁呰繘鍙ｆ嘲鐜茬彂娉板浗鑼夎帀棣欑背10kg澶х背20鏂よ禒閫佸皬娌�400ml","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-13/199012eaf4b175bf61259609edf9e9a6.jpeg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-13/8496ea2890b9b9937c8f744734fdc444.jpeg","is_onsale":1},{"normal_price":2500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-14/415c8f3fb23dc39be972c19764f78512.jpeg","event_type":0,"sales":1854,"goods_id":1779700,"short_name":"鍐涘伐閫熼鐗涜倝缃愬ご500g/缃愩\u20ac愭暟閲忓彲閫夈\u20ac�","quantity":298171,"logo":"","is_app":0,"price":2190,"market_price":9900,"goods_name":"銆愪縿缃楁柉杩涘彛銆戝啗宸ラ\u20ac熼鐗涜倝缃愬ご500g/缃愩\u20ac愭暟閲忓彲閫夈\u20ac�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-06/22f3262950c3c7edb01576ddbd1eb12f.jpeg","customer_num":2,"country":"淇勭綏鏂�","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/xuwyg9dQfFYab4EYS4mNHIEHYPAG3nSu.jpg","is_onsale":1}],"home_banner_width":1000,"goods_num":80,"sales":502203,"home_banner_height_2":375,"position":24,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-07-09/fc4393ada082b632507399f527b6a833.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1499529600,"subject":"鍐嶅繖鍐嶆噿涔熶笉瑕佸繕浜嗗悆鏃╅  浣庤嚦9.9","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-07-09/34b0c1710bd4032f5e8c0029ee489a4f.jpeg","column_num":2,"share_image":"","desc":"鍐嶅繖鍐嶆噿涔熶笉瑕佸繕浜嗗悆鏃╅","type":"haitao_recommend","subject_id":2360},{"second_name":"","goods_list":[{"normal_price":5600,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/695a5c6431118b48f20bc644975805bb.jpeg","event_type":0,"sales":26167,"goods_id":4695644,"short_name":"銆愬牚姣旇倝姣掗拡 涓\u20ac鍛ㄨ鏁堛\u20ac戙\u20ac愯倝姣掔簿鍗� 鍑忛緞绁炲櫒 閫熸晥绱ц嚧鍘荤粏绾广\u20ac戦珮涓介泤濞滅溂闇滈珮鏁堝幓缁嗙汗鐪艰榛戠溂鍦�30ml","quantity":4833,"logo":"","is_app":0,"price":3800,"market_price":19900,"goods_name":"銆愰煩鍥借繘鍙ｃ\u20ac戙\u20ac愬牚姣旇倝姣掗拡 涓\u20ac鍛ㄨ鏁堛\u20ac戙\u20ac愯倝姣掔簿鍗� 鍑忛緞绁炲櫒 閫熸晥绱ц嚧鍘荤粏绾广\u20ac戦珮涓介泤濞滅溂闇滈珮鏁堝幓缁嗙汗鐪艰榛戠溂鍦�30ml","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/70f75d471b415527e3bc3667017bd338.jpeg","customer_num":2,"country":"闊╁浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-04-13/842d5f0e89fa3b72ba265e9885ad1232.jpeg","is_onsale":1},{"normal_price":34000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-15/e5f8820fa9ebe2f878d748c88e386ee4.jpeg","event_type":0,"sales":2345,"goods_id":2871,"short_name":"銆愯禒鍖栧妫夈\u20ac慐steeLauder/闆呰瘲鍏伴粵ANR灏忔鐡剁溂闇�15ml绮惧崕闇滆嚧缁嗙汗榛戠溂鍦堣ˉ姘存姉鐨�","quantity":227,"logo":"","is_app":0,"price":29400,"market_price":56900,"goods_name":"銆愮編鍥借繘鍙ｃ\u20ac戙\u20ac愯禒鍖栧妫夈\u20ac慐steeLauder/闆呰瘲鍏伴粵ANR灏忔鐡剁溂闇�15ml绮惧崕闇滆嚧缁嗙汗榛戠溂鍦堣ˉ姘存姉鐨�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/913cdc1863d7951f3e38d096983a7811.jpeg","customer_num":2,"country":"缇庡浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1512046687373343/23z56ZbfnA2mkUrDbAejA0ePf8GkdyvY.jpg","is_onsale":1},{"normal_price":11800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1608230236471129/l7RbXWFMyXgyiIGqSLJNzAeuWTzCpBEL.jpg","event_type":0,"sales":3991,"goods_id":469242,"short_name":"娉板浗铔囨瘨闈㈣啘VOODOO鐫＄湢闈㈣啘鍏嶆礂鎶楄\u201c缇庣櫧绁涙枒鍗囩骇 绱ц嚧淇濇箍琛ユ按闈㈤湝30g","quantity":1,"logo":"","is_app":0,"price":9800,"market_price":16800,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戞嘲鍥借泧姣掗潰鑶淰OODOO鐫＄湢闈㈣啘鍏嶆礂鎶楄\u201c缇庣櫧绁涙枒鍗囩骇 绱ц嚧淇濇箍琛ユ按闈㈤湝30g","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1608230236471129/yLSXihVVHpchlI9C7Y4qRZj9iGcKCWkd.jpg","customer_num":2,"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1022172/Owhz3KvoQ3ob9DgxtR1QTm0jYRQspElb.jpg","is_onsale":1},{"normal_price":4700,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/AjYN6A47GrUlQKfRPENZ1zdSDfogqGuI.jpg","event_type":0,"sales":24342,"goods_id":1294557,"short_name":"銆愬痉鍥借秴绾уソ鐢ㄧ殑鐜诲翱閰搞\u20ac戣姯涔愰泤鐜诲翱閰告祿缂╃簿鍗庣粡鍏哥郴鍒� 3娆惧彲閫夈\u20ac愭姉鐨辩編鐧借ˉ姘淬\u20ac�","quantity":640,"logo":"","is_app":0,"price":4450,"market_price":9800,"goods_name":"銆愬痉鍥借繘鍙ｃ\u20ac戙\u20ac愬痉鍥借秴绾уソ鐢ㄧ殑鐜诲翱閰搞\u20ac戣姯涔愰泤鐜诲翱閰告祿缂╃簿鍗庣粡鍏哥郴鍒� 3娆惧彲閫夈\u20ac愭姉鐨辩編鐧借ˉ姘淬\u20ac�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-14/51c1907e07ebbe9b8a8ea2a64727ba4c.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1611252960119102/gUmWlOkFW5iFCLSlUoUcmsCTBHFg9L5B.jpg","is_onsale":1},{"normal_price":4000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/9fWe12KwbWmQ1Ohxm0tF2CtQ3gFeJ1vb.jpg","event_type":0,"sales":1331,"goods_id":1188704,"short_name":"銆愭姉鐨辩揣鑷淬\u20ac戝痉鍥借姯涔愰泤绮惧崕鑳跺泭3鐩掕 7绮�*3鐩�  4娆惧彲閫� 琛ユ按淇濇箍/鍘婚粦鐪煎湀/鎶楃毐绱ц嚧/鎶楄\u201c鑰�","quantity":1124,"logo":"","is_app":0,"price":3850,"market_price":9900,"goods_name":"銆愬痉鍥借繘鍙ｃ\u20ac戙\u20ac愭姉鐨辩揣鑷淬\u20ac戝痉鍥借姯涔愰泤绮惧崕鑳跺泭3鐩掕 7绮�*3鐩�  4娆惧彲閫� 琛ユ按淇濇箍/鍘婚粦鐪煎湀/鎶楃毐绱ц嚧/鎶楄\u201c鑰�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-26/b21b19deea2afed280e8a30740e527a1.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/5vKX2JhWxQERzToJHO2wldOMmZWCGVho.jpg","is_onsale":1},{"normal_price":11520,"thumb_url":"http://omsproductionimg.yangkeduo.com/20170323/190312WBYHAOipEx5W5i","event_type":0,"sales":9,"goods_id":1895699,"short_name":"Fracora 鑳庣洏绱犲鏁堝悎涓\u20ac缇庡闈㈤湝 65鍏媆/鏀� 澶氭晥鍚堜竴","quantity":67,"logo":"","is_app":0,"price":11420,"market_price":22270,"goods_name":"銆愭棩鏈洿渚涖\u20ac慒racora 鑳庣洏绱犲鏁堝悎涓\u20ac缇庡闈㈤湝 65鍏媆/鏀� 澶氭晥鍚堜竴","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/20170323/190312DU7KhyZwnD80FF","customer_num":2,"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/20170323/190312X5G7a2zYaD2diI","is_onsale":1},{"normal_price":6800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-03-27/11670365ec27052839164012e7c67e35.jpeg","event_type":0,"sales":637,"goods_id":1199543,"short_name":"寰峰浗鑺箰闆匓alea鐜诲翱閰告棩闇淺/鏅氶湝绱ц嚧鎻愭媺 鑳跺師铔嬬櫧淇濇箍 50ml 2娆鹃\u20ac夋嫨","quantity":793,"logo":"","is_app":0,"price":6500,"market_price":9900,"goods_name":"銆愬痉鍥借繘鍙ｃ\u20ac戝痉鍥借姯涔愰泤Balea鐜诲翱閰告棩闇淺/鏅氶湝绱ц嚧鎻愭媺 鑳跺師铔嬬櫧淇濇箍 50ml 2娆鹃\u20ac夋嫨","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/Rc7o1LnVdzmZnHtZsG4FgstNalDih7n4.jpg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/OUugmHR5TzrPqJ3RYeLcCLO6phkT24sd.jpg","is_onsale":1},{"normal_price":48000,"thumb_url":"http://testpddimg.yangkeduo.com/goods/d41d8cd98f5dbe9cb02772fafc998335f0bf7eb31f.jpg","event_type":0,"sales":27,"goods_id":62234,"short_name":"闊╁浗 楂樹附闆呭Coreana娑傛姽寮� SHO 鑲夋瘨鏉嗚弻绮惧崕娑�28鏀�+2鏀溂闇滅ぜ鐩掕銆愬叏鍥藉寘閭\u20ac�","quantity":145,"logo":"","is_app":0,"price":43500,"market_price":119800,"goods_name":"銆愰煩鍥借繘鍙ｃ\u20ac戦煩鍥� 楂樹附闆呭Coreana娑傛姽寮� SHO 鑲夋瘨鏉嗚弻绮惧崕娑�28鏀�+2鏀溂闇滅ぜ鐩掕銆愬叏鍥藉寘閭\u20ac�","hd_thumb_url":"http://testpddimg.yangkeduo.com/goods/d41d8cd98f76995298f5b4254955445e9dff04e0f5.jpg","customer_num":2,"country":"闊╁浗","image_url":"http://testpddimg.yangkeduo.com/goods/d41d8cd98ff31569c778e6d3ad1d4359e5eed2686a.jpg","is_onsale":1},{"normal_price":49900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1608162960113571/erScPFNSIC1D58rZDPRCHviCzVsJ777Y.jpg","event_type":0,"sales":34,"goods_id":427479,"short_name":"寰峰浗濂㈠崕Dermaroller鐜诲翱閰稿師娑瞈/寰拡 30鏀�*1.5ml 椤轰赴鍖呴偖 濂借幈鍧炲コ绁炲尽鐢ㄥ搧","quantity":36,"logo":"","is_app":0,"price":49800,"market_price":99900,"goods_name":"銆愬痉鍥借繘鍙ｃ\u20ac戝痉鍥藉ア鍗嶥ermaroller鐜诲翱閰稿師娑瞈/寰拡 30鏀�*1.5ml 椤轰赴鍖呴偖 濂借幈鍧炲コ绁炲尽鐢ㄥ搧","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1608162960113571/s1Lx8cLDguCVs0NoBrnyTIMUmXXzs3mo.jpg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1304890/O3MCfz53yXe9uTpLnNQ9S9RlnGwFLa8d.jpg","is_onsale":1},{"normal_price":8000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1611087435932049/9GaEpQKg0JF9Qfbp8JkPe5Bkk8JKGdbG.jpg","event_type":0,"sales":13466,"goods_id":1077189,"short_name":"銆愮幓灏块吀绱ц嚧鎻愭媺 娣＄粏绾� 閫嗛緞鍙樺皯濂炽\u20ac慏erma E/寰风帥渚濈幓灏块吀琛ユ按淇濇箍鐪奸湝14g","quantity":2374,"logo":"","is_app":0,"price":3990,"market_price":18800,"goods_name":"銆愮編鍥界洿渚涖\u20ac戙\u20ac愮幓灏块吀绱ц嚧鎻愭媺 娣＄粏绾� 閫嗛緞鍙樺皯濂炽\u20ac慏erma E/寰风帥渚濈幓灏块吀琛ユ按淇濇箍鐪奸湝14g","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-16/899fdb3b5d8d17ff8136c0bf932c70f7.jpeg","customer_num":2,"country":"缇庡浗","image_url":"http://omsproductionimg.yangkeduo.com/images/goods/1611087435932049/gh64BY5tq6F8mIceYEOBchIjbY2MHklk.jpg","is_onsale":1}],"home_banner_width":1000,"goods_num":21,"sales":108041,"home_banner_height_2":375,"position":27,"home_banner_height":375,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/2017-08-07/b1248d24d70a6da086eaa582995b354a.jpeg","rank_subject_priority":0,"home_banner_width_2":1000,"start_time":1499529600,"subject":"鐢ㄨ繖浜涙墦閫犱笉鑰佺璇濓紝浣庤嚦33.9","home_banner":"http://omsproductionimg.yangkeduo.com/images/2017-08-07/7af08f17c4bd50b31afce57baab7c259.jpeg","column_num":2,"share_image":"","desc":"娴锋窐绁涚毐鐗瑰垔锛屾鍝佷繚璇侊紝鍖呯◣鍖呴偖","type":"haitao_recommend","subject_id":2363}]
     * goods_list : [{"normal_price":36800,"cnt":638,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/231c1045bc406fd65af363edaba4b334.jpeg","event_type":0,"market_price":39800,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愬惛榛戝ご绁炲櫒 鍛婂埆鑽夎帗榧汇\u20ac戙\u20ac愰\u20ac侀粦澶村鍑烘恫濂楄銆戠湡绌哄鍑虹數鍔ㄥ惛绮夊埡灏忔皵娉＄編瀹逛华姣涘瓟娓呮磥鍣ㄥ幓榛戝ご浠櫒","goods_id":69466193,"short_name":"銆愬惛榛戝ご绁炲櫒 鍛婂埆鑽夎帗榧汇\u20ac戙\u20ac愰\u20ac侀粦澶村鍑烘恫濂楄銆戠湡绌哄鍑虹數鍔ㄥ惛绮夊埡灏忔皵娉＄編瀹逛华姣涘瓟娓呮磥鍣ㄥ幓榛戝ご浠櫒","group":{"customer_num":2,"price":11800},"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-01/1ace633553528e71bd1a1d136705fa8b.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/fd10ba0c762fa65353afa88fab7cb708.jpeg","is_app":0},{"normal_price":1500,"cnt":31076,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/dfaa2fe7324fb343d1b744d96da0b223.jpeg","event_type":0,"market_price":6800,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愬幓姹�  娓呮磥銆慏aisy Leaf灏忕櫧闉嬫竻娲佸埛闉嬪瓙娓呮磥鍓傚幓榛勫鐧芥摝闉嬫礂闉嬫礂鐧藉幓姹\u2033墏100ml","goods_id":62985082,"short_name":"銆愬幓姹�  娓呮磥銆慏aisy Leaf灏忕櫧闉嬫竻娲佸埛闉嬪瓙娓呮磥鍓傚幓榛勫鐧芥摝闉嬫礂闉嬫礂鐧藉幓姹\u2033墏100ml","group":{"customer_num":2,"price":990},"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/4a4fa3463d7b02737b70345960bdbd8a.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/236953b14ed09ce256cdbf8a66e6db77.jpeg","is_app":0},{"normal_price":4900,"cnt":2826,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/250cc1771ee671e46a0a1817359516ba.jpeg","event_type":0,"market_price":7900,"goods_name":"銆愭剰澶у埄杩涘彛銆戙\u20ac愪拱涓\u20ac閫佷簩銆戙\u20ac愯垝姣旀嫇銆戣繘鍙ｆ寜鍘嬪紡鐗欒啅 250g*1/娴峰鍝佺墝 缇庣櫧鍘诲彛鑷幓榛勫幓鐗欐笉鎴愪汉鐗欒啅 鎷�1鐡堕\u20ac佺墮鍒�2鏀�","goods_id":60197002,"short_name":"銆愪拱涓\u20ac閫佷簩銆戙\u20ac愯垝姣旀嫇銆戣繘鍙ｆ寜鍘嬪紡鐗欒啅 250g*1/娴峰鍝佺墝 缇庣櫧鍘诲彛鑷幓榛勫幓鐗欐笉鎴愪汉鐗欒啅 鎷�1鐡堕\u20ac佺墮鍒�2鏀�","group":{"customer_num":2,"price":3600},"country":"鎰忓ぇ鍒�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-21/59ee4c41a86850ce6c2ece2d177f4605.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/44ff63684c613744e7b0dd398e93387a.jpeg","is_app":0},{"normal_price":3200,"cnt":63830,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/3af1ec80ab0520a36ccc1b8d4d7e86a1.jpeg","event_type":0,"market_price":16800,"goods_name":"銆愬彴婀捐繘鍙ｃ\u20ac戙\u20ac愰檺閲忕壒浠枫\u20ac戙\u20ac愪拱3閫�2銆戝彴婀炬姽鑼堕叺绱犳闅忎究鏋� 銆愬揩閫熷噺鑲� 鎺掓瘨閫氫究銆戙\u20ac�7澶╁嚮婧冭倸瀛愯禈鑲夛紝鏁堟灉濂戒笉鍙嶅脊銆� 鏈堢槮15鏂�","goods_id":10834308,"short_name":"銆愰檺閲忕壒浠枫\u20ac戙\u20ac愪拱3閫�2銆戝彴婀炬姽鑼堕叺绱犳闅忎究鏋� 銆愬揩閫熷噺鑲� 鎺掓瘨閫氫究銆戙\u20ac�7澶╁嚮婧冭倸瀛愯禈鑲夛紝鏁堟灉濂戒笉鍙嶅脊銆� 鏈堢槮15鏂�","group":{"customer_num":2,"price":1990},"country":"鍙版咕","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/09643388d2c51525ee83ed7541da85ac.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/a744ec75cfc74a2be23224ffbad39a90.jpeg","is_app":0},{"normal_price":2200,"cnt":29718,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-22/abab325567dcf456cd7c94cb744eb837.jpeg","event_type":0,"market_price":15800,"goods_name":"銆愬彴婀捐繘鍙ｃ\u20ac戙\u20ac愪拱3鐩掗\u20ac�2鐩掋\u20ac戦闈\u2033彴婀炬捣鐙椾父銆愮敺浜鸿ˉ鑲惧浐绮� 鎻愬崌鎴樻枟鍔涘湥鍝併\u20ac戜笉纭紵浣犺瘯璇曪紒銆�5鐡朵竴鍛ㄦ湡銆�30绮掕銆愬巶瀹剁壒浠蜂績閿\u20ac銆�","goods_id":62222098,"short_name":"銆愪拱3鐩掗\u20ac�2鐩掋\u20ac戦闈\u2033彴婀炬捣鐙椾父銆愮敺浜鸿ˉ鑲惧浐绮� 鎻愬崌鎴樻枟鍔涘湥鍝併\u20ac戜笉纭紵浣犺瘯璇曪紒銆�5鐡朵竴鍛ㄦ湡銆�30绮掕銆愬巶瀹剁壒浠蜂績閿\u20ac銆�","group":{"customer_num":2,"price":1950},"country":"鍙版咕","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-22/7289313277cb7b4bfca7f256da04903d.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-24/9696c5ec7d19a44f8cd4e54e034ef7af.jpeg","is_app":0},{"normal_price":7490,"cnt":599,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/d8662deb87e7a7f2f6ab540097cdd79b.jpeg","event_type":0,"market_price":129900,"goods_name":"銆愯嫳鍥借繘鍙ｃ\u20ac慡pountin銆� 闄愰噺鐗逛环100浠姐\u20ac�2017鐖嗘绉嬪鐢峰＋闀胯t鎭棰嗘柊娆剧敺瑁呴潚骞磋杽娆� 闊╃増淇韩澶х爜閽堢粐鎵撳簳绾胯～","goods_id":71404662,"short_name":"Spountin銆� 闄愰噺鐗逛环100浠姐\u20ac�2017鐖嗘绉嬪鐢峰＋闀胯t鎭棰嗘柊娆剧敺瑁呴潚骞磋杽娆� 闊╃増淇韩澶х爜閽堢粐鎵撳簳绾胯～","group":{"customer_num":2,"price":6990},"country":"鑻卞浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/bf4cce40da1c5302e8722e6f6b22e6c4.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/e64a2bf1672618125b25396c8b76a556.jpeg","is_app":0},{"normal_price":19800,"cnt":7666,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-31/f2456014ebe613d60607c2dd9c977c22.jpeg","event_type":0,"market_price":19900,"goods_name":"銆愮編鍥借繘鍙ｃ\u20ac戙\u20ac愰檺閲忚浜�500鍙般\u20ac慙ACASA 澶氬姛鑳芥Θ姹佹満杩蜂綘鎼呮媽鏈轰究鎼哄紡鏋滄眮鏈哄師姹佹満鍏ㄨ嚜鍔ㄥ皬鍨嬫Θ姹佹澂鏋滄眮鏂欑悊鏈鸿眴娴嗘満 鍙屾澂","goods_id":24939486,"short_name":"銆愰檺閲忚浜�500鍙般\u20ac慙ACASA 澶氬姛鑳芥Θ姹佹満杩蜂綘鎼呮媽鏈轰究鎼哄紡鏋滄眮鏈哄師姹佹満鍏ㄨ嚜鍔ㄥ皬鍨嬫Θ姹佹澂鏋滄眮鏂欑悊鏈鸿眴娴嗘満 鍙屾澂","group":{"customer_num":2,"price":8900},"country":"缇庡浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/62fe9572a98851eeb99744e6625b7698.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-20/764b39f02d66f672ed49370718bd9d4f.jpeg","is_app":0},{"normal_price":1990,"cnt":23795,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-15/ff5b1170ac1df4fdcb21411b7eaa315c.jpeg","event_type":0,"market_price":5900,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愰檺閲忔姠 涔颁簩閫佷竴 7澶╂墦閫犲婊戣倢鑲ゃ\u20ac態ADERCILL 鍘昏璐ㄧ礌娲侀潰鍟柋鍏ㄨ韩鍘绘鐨枡鐦╅浮鐨偆鍘婚粦澶寸敺濂抽\u20ac氱敤120g","goods_id":6804074,"short_name":"銆愰檺閲忔姠 涔颁簩閫佷竴 7澶╂墦閫犲婊戣倢鑲ゃ\u20ac態ADERCILL 鍘昏璐ㄧ礌娲侀潰鍟柋鍏ㄨ韩鍘绘鐨枡鐦╅浮鐨偆鍘婚粦澶寸敺濂抽\u20ac氱敤120g","group":{"customer_num":2,"price":1500},"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-14/866c71c28cdccb8c4ee9e39533e76f36.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-20/0f0acce1ce84ff130f43348c95a07c36.jpeg","is_app":0},{"normal_price":2790,"cnt":11234,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-09/a4876c94c31c753b24e3feaf0fb36a46.jpeg","event_type":0,"market_price":3990,"goods_name":"銆愪縿缃楁柉杩涘彛銆戙\u20ac�7澶╄鏁� 30澶╃敓鍙戙\u20ac戠函妞嶇墿钃栭夯娌圭敓鍙戞按30ml/鐡� 闃茶劚鍙戜績杩涘ご鍙戠敓闀� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂 婊嬪吇鍙戞牴浠庡ご鍋氳捣","goods_id":8373998,"short_name":"銆�7澶╄鏁� 30澶╃敓鍙戙\u20ac戠函妞嶇墿钃栭夯娌圭敓鍙戞按30ml/鐡� 闃茶劚鍙戜績杩涘ご鍙戠敓闀� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂 婊嬪吇鍙戞牴浠庡ご鍋氳捣","group":{"customer_num":2,"price":2500},"country":"淇勭綏鏂�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-09/8d6c13338bb502d650b38c36764bc91e.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/ebb0c303fcc6a18505322dcc560e1f43.jpeg","is_app":0},{"normal_price":19800,"cnt":5930,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-10/8f22ae80a08e00913b2fc0067849138a.jpeg","event_type":0,"market_price":39800,"goods_name":"銆愬痉鍥借繘鍙ｃ\u20ac戣壘寰锋柉涓嶇矘閿呯倰閿呭钩搴曟棤娑傚眰楹﹂キ鐭充笉娌鹃攨鏃犳补鐑熺噧姘旂數纾佺倝閫氱敤閿呭叿32cm鐐掑嫼 鍘ㄦ埧鐐掕彍閿呴搧閿�30寰峰浗閿呭叿骞冲簳閿� 鐓庨攨鍖呴偖","goods_id":63086213,"short_name":"鑹惧痉鏂笉绮橀攨鐐掗攨骞冲簳鏃犳秱灞傞害楗煶涓嶆簿閿呮棤娌圭儫鐕冩皵鐢电鐐夐\u20ac氱敤閿呭叿32cm鐐掑嫼 鍘ㄦ埧鐐掕彍閿呴搧閿�30寰峰浗閿呭叿骞冲簳閿� 鐓庨攨鍖呴偖","group":{"customer_num":2,"price":8800},"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-15/defe549667f7e54d60f132a4c3dfb46c.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/6595f92cfe9bb1978857888f856f8ec5.jpeg","is_app":0},{"normal_price":7000,"cnt":1752,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-28/4f6d105004838968db1479e01aca40a4.jpeg","event_type":0,"market_price":10000,"goods_name":"銆愬痉鍥借繘鍙ｃ\u20ac戙\u20ac怱ENAINS銆戝ご閮ㄦ寜鎽╁櫒鐢靛姩澶寸毊鎸夋懇缁忕粶姊冲瓙鑴戣交鏉鹃渿鍔ㄩ槻鑴辩毊绁炲櫒杩蜂綘","goods_id":10692391,"short_name":"銆怱ENAINS銆戝ご閮ㄦ寜鎽╁櫒鐢靛姩澶寸毊鎸夋懇缁忕粶姊冲瓙鑴戣交鏉鹃渿鍔ㄩ槻鑴辩毊绁炲櫒杩蜂綘","group":{"customer_num":2,"price":3900},"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-13/8ddff41aa33c28ef551a8fa410f30fd4.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-03/9c625140d23fb5e12d7cd824ed56e7f1.jpeg","is_app":0},{"normal_price":3990,"cnt":4492,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-29/7f780f8b1a630f474eefb5b0899b79c9.jpeg","event_type":0,"market_price":5000,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戙\u20ac�20澶╀粠A鍒癉寮烘晥涓拌兏 涔颁簩閫佷竴銆戞嘲鍥藉師瑁呰繘鍙Y閲庤憶鏍逛赴鑳搁湝99%澧炲ぇ 涓拌兏浜у搧杩滆秴涓拌兏绮炬补涓拌兏鑽创浠� 50g","goods_id":8568717,"short_name":"銆�20澶╀粠A鍒癉寮烘晥涓拌兏 涔颁簩閫佷竴銆戞嘲鍥藉師瑁呰繘鍙Y閲庤憶鏍逛赴鑳搁湝99%澧炲ぇ 涓拌兏浜у搧杩滆秴涓拌兏绮炬补涓拌兏鑽创浠� 50g","group":{"customer_num":2,"price":2990},"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-28/6472ba3cbb234fb2c0602d62bce3feb5.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/9714516fc33a31df1139f96c7acd7d40.jpeg","is_app":0},{"normal_price":7600,"cnt":3874,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/7fc09b46e4c886d1006e4b29cdd604d3.jpeg","event_type":0,"market_price":29800,"goods_name":"銆愭柊瑗垮叞杩涘彛銆戠泭鏅鸿ˉ鑴戝姪闀块珮 鍋ュ．楠ㄨ川 鏀瑰杽澶辩湢澶氭睏鑵拌吙鍏宠妭鐥� 鏂拌タ鍏板ソ鍋ュ悍goodhealth 閽欑墖100绮� 浼樿川缇婂ザ鎻愬彇","goods_id":41961425,"short_name":"鐩婃櫤琛ヨ剳鍔╅暱楂� 鍋ュ．楠ㄨ川 鏀瑰杽澶辩湢澶氭睏鑵拌吙鍏宠妭鐥� 鏂拌タ鍏板ソ鍋ュ悍goodhealth 閽欑墖100绮� 浼樿川缇婂ザ鎻愬彇","group":{"customer_num":2,"price":5900},"country":"鏂拌タ鍏�","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-02/c6c54097eaa6cb863f492d7c9bc4ae5d.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/ac9bdb0c0d229b53d87c9a06fb5626c3.jpeg","is_app":0},{"normal_price":2500,"cnt":1385,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/d64696d80d2c5f1fe23e73f493bc559b.jpeg","event_type":0,"market_price":9900,"goods_name":"銆愰娓繘鍙ｃ\u20ac戙\u20ac愪拱浜岄\u20ac佷竴 鍛婂埆涓诲鎵� 鎾曞嚭瀚╃櫧鍙屾墜銆態ADERCILL鐗涘ザ铚傝湝鎵嬭啘鎵嬭湣150g 淇濇箍婊嬫鼎鎵嬭冻閮ㄧ編鐧借ⅹ鐤ょ棔鍘昏璐ㄨ\u20ac佽導姝荤毊","goods_id":71062602,"short_name":"銆愪拱浜岄\u20ac佷竴 鍛婂埆涓诲鎵� 鎾曞嚭瀚╃櫧鍙屾墜銆態ADERCILL鐗涘ザ铚傝湝鎵嬭啘鎵嬭湣150g 淇濇箍婊嬫鼎鎵嬭冻閮ㄧ編鐧借ⅹ鐤ょ棔鍘昏璐ㄨ\u20ac佽導姝荤毊","group":{"customer_num":2,"price":1990},"country":"棣欐腐","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/20ed7e92132f0b7ad94e057bbad3532e.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/bd731363946709aea05e9217899d2a25.jpeg","is_app":0},{"normal_price":3300,"cnt":11031,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/ab68fe004aec36c994e8a1708a52183c.jpeg","event_type":0,"market_price":8900,"goods_name":"銆愭境闂ㄨ繘鍙ｃ\u20ac戙\u20ac愭境闂ㄩ璁般\u20ac戠墰鑲夌矑 275g*2/3/4鐩� 4绉嶅彛鍛冲彲閫�  澶т汉灏忓閮藉枩娆㈢殑鐗涜倝骞�  涔板氨閫佽埅绌虹壒渚涢樋鑳惰湝鏋�  濂藉悆鍒掔畻","goods_id":6578377,"short_name":"銆愭境闂ㄩ璁般\u20ac戠墰鑲夌矑 275g*2/3/4鐩� 4绉嶅彛鍛冲彲閫�  澶т汉灏忓閮藉枩娆㈢殑鐗涜倝骞�  涔板氨閫佽埅绌虹壒渚涢樋鑳惰湝鏋�  濂藉悆鍒掔畻","group":{"customer_num":2,"price":2490},"country":"婢抽棬","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-23/cb23ed152dec804728f8efa8b7363d8b.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/11991abefba3e6d208061db7ba560d4c.jpeg","is_app":0},{"normal_price":1290,"cnt":974,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/46cd630d47d71284cc53e2f41f29470a.jpeg","event_type":0,"market_price":2200,"goods_name":"銆愭棩鏈繘鍙ｃ\u20ac戙\u20ac愬彲鎷嗚璁� 瀚╂粦鍙岃剼銆戞棩鏈繘鍙ｇ（鑴氬櫒鍘绘鐨\u20ac佽導纾ㄨ剼鐭充慨鑴氬伐鍏疯剼搴曞幓鑴氱毊涓嶉攬閽㈡悡鑴氭澘","goods_id":68324905,"short_name":"銆愬彲鎷嗚璁� 瀚╂粦鍙岃剼銆戞棩鏈繘鍙ｇ（鑴氬櫒鍘绘鐨\u20ac佽導纾ㄨ剼鐭充慨鑴氬伐鍏疯剼搴曞幓鑴氱毊涓嶉攬閽㈡悡鑴氭澘","group":{"customer_num":2,"price":990},"country":"鏃ユ湰","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/c7aa9cdb55ee58954befb3fc4e9619e5.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/36bbc426bface1bea7245940fa0ed432.jpeg","is_app":0},{"normal_price":4100,"cnt":349,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/be77420a098f46635626aea6f4c5abfa.jpeg","event_type":0,"market_price":8800,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戙\u20ac愰\u20ac熸晥娲侀潰 鍙渶涓\u20ac鍒嗛挓 浜彈娓呴\u20ac忕編鑲屻\u20ac戞嘲鍥絪a.ad.na鑾庢绾虫磥闈华姣涘瓟娓呮磥鍣ㄧ數鍔ㄨ秴澹版尝闇囧姩缇庡浠鍝�","goods_id":69843111,"short_name":"銆愰\u20ac熸晥娲侀潰 鍙渶涓\u20ac鍒嗛挓 浜彈娓呴\u20ac忕編鑲屻\u20ac戞嘲鍥絪a.ad.na鑾庢绾虫磥闈华姣涘瓟娓呮磥鍣ㄧ數鍔ㄨ秴澹版尝闇囧姩缇庡浠鍝�","group":{"customer_num":2,"price":3990},"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-02/7bef38c4c2fe00be31c2ecc4296cdd10.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/43503b19411c8d805eb4a837ceda97af.jpeg","is_app":0},{"normal_price":6800,"cnt":2309,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-14/f09cbe27cf24863b4785eab0683a587a.jpeg","event_type":0,"market_price":39800,"goods_name":"銆愭硶鍥借繘鍙ｃ\u20ac戜袱鏀ぜ鐩掕娉曞浗娉㈠皵澶氬師鐡惰繘鍙ｇ孩閰掑搱鎷滃嫆璋稟OP绾у共绾㈣憽钀勯厭2*750ml绀肩洅涓ゆ敮瑁�","goods_id":40177933,"short_name":"涓ゆ敮绀肩洅瑁呮硶鍥芥尝灏斿鍘熺摱杩涘彛绾㈤厭鍝堟嫓鍕掕胺AOP绾у共绾㈣憽钀勯厭2*750ml绀肩洅涓ゆ敮瑁�","group":{"customer_num":2,"price":4600},"country":"娉曞浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-14/b0ab499867a1c55ccfe8ea8a1afaf19e.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-06/395be27e29f5b53b8ae4687b21ec8adf.jpeg","is_app":0},{"normal_price":8900,"cnt":4320,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/179c7befa0f3dfccce07d8289eaa3b61.jpeg","event_type":0,"market_price":19800,"goods_name":"銆愮椴佺洿閭\u20ac戠敺鏍规灉鐜涘崱/鐜涘挅鑳跺泭100绮掑墠鍒楄吅琛ヨ偩澹槼寤舵椂鐜涘崱绮剧墖绉橀瞾姝ｅ搧Super Natural鎴愬勾鐢锋\u20acт繚鍋ュ搧","goods_id":50697160,"short_name":"鐢锋牴鏋滅帥鍗/鐜涘挅鑳跺泭100绮掑墠鍒楄吅琛ヨ偩澹槼寤舵椂鐜涘崱绮剧墖绉橀瞾姝ｅ搧Super Natural鎴愬勾鐢锋\u20acт繚鍋ュ搧","group":{"customer_num":2,"price":6200},"country":"绉橀瞾","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/6f5787be1767a60a04907057fd72e2a4.jpeg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-20/86b4ae80d86e74630dc8feb6785c4da0.jpeg","is_app":0},{"normal_price":23800,"cnt":569,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/720d8a4c8c8752250672351d8dd73087.jpeg","event_type":0,"market_price":26800,"goods_name":"銆愭嘲鍥借繘鍙ｃ\u20ac戙\u20ac愪拱涓\u20ac閫佷竴銆戞嘲鍥芥鍝乂entry涔宠兌鏋曞ご 鎸夋懇鎶ら鏋曚繚鍋ラ绮掓灂鑺� 澶╃劧涔宠兌姗¤兌骞虫粦棰堟鏋曘\u20ac愰\u20ac佸悓娆句钩鑳舵灂銆�","goods_id":26153642,"short_name":"銆愪拱涓\u20ac閫佷竴銆戞嘲鍥芥鍝乂entry涔宠兌鏋曞ご 鎸夋懇鎶ら鏋曚繚鍋ラ绮掓灂鑺� 澶╃劧涔宠兌姗¤兌骞虫粦棰堟鏋曘\u20ac愰\u20ac佸悓娆句钩鑳舵灂銆�","group":{"customer_num":2,"price":14400},"country":"娉板浗","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/NYgMjxLE0VShYTaVsO5RhY6f0Eia8NxU.jpg","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/4a0d38e369bed278d7067c52c049b2e5.jpeg","is_app":0}]
     * country_list : [{"second_name":"","position":0,"home_banner_width":1000,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/goods/287/qVvXvWhGgupiV65mUE9GdPuZl1CCYyax.jpg","home_banner":"http://omsproductionimg.yangkeduo.com/goods/dd5a6e9548/234/234/82791c42e1f0b27a4bc9e04a3a6d6393.jpg","desc":"鐢熸椿缁嗚妭鐪嬪矝鍥斤紒鏃ユ湰濂借揣涓撳満锛屾埑>>","subject":"鏃ユ湰棣�","home_banner_width_2":1000,"share_image":"","type":"country","home_banner_height_2":375,"home_banner_height":547,"subject_id":287},{"second_name":"","position":0,"home_banner_width":1000,"home_banner_2":"http://omsproductionimg.yangkeduo.com/images/goods/94/RHmKVkwMmY1DC9NhuTjal24aKREgHla1.jpg","home_banner":"http://omsproductionimg.yangkeduo.com/goods/f25677a59a/234/234/fd47aa51c9cf65d4fb1aa005b6e41e66.jpg","desc":"浜哄湪鎬濆瘑杈撅紝璐у凡鍏堝埌瀹讹紒娉¤彍鍥藉ソ璐т笓鍦猴紝鎴�>>","subject":"闊╁浗棣�","home_banner_width_2":1000,"share_image":"","type":"country","home_banner_height_2":375,"home_banner_height":547,"subject_id":94}]
     * server_time : 1504754005
     * promotion_list : []
     */

    @SerializedName("server_time")
    private int serverTime;
    private List<HomeRecommendSubjectsBean> home_recommend_subjects;
    @SerializedName("goods_list")
    private List<GoodsListBeanX> goodsList;
    @SerializedName("country_list")
    private List<CountryListBean> countryList;
    @SerializedName("promotion_list")
    private List<?> promotionList;

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }

    public List<HomeRecommendSubjectsBean> getHome_recommend_subjects() {
        return home_recommend_subjects;
    }

    public void setHome_recommend_subjects(List<HomeRecommendSubjectsBean> home_recommend_subjects) {
        this.home_recommend_subjects = home_recommend_subjects;
    }

    public List<GoodsListBeanX> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsListBeanX> goodsList) {
        this.goodsList = goodsList;
    }

    public List<CountryListBean> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<CountryListBean> countryList) {
        this.countryList = countryList;
    }

    public List<?> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<?> promotionList) {
        this.promotionList = promotionList;
    }

    public static class HomeRecommendSubjectsBean {
        /**
         * second_name :
         * goods_list : [{"normal_price":61650,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/549e5b95137a68079d1efb63905488cc.jpeg","event_type":0,"sales":458,"goods_id":1879561,"short_name":"Nutrilon鑽峰叞鐗涙爮 濠村効濂剁矇4娈� 1鍛ㄥ瞾浠ヤ笂 800鍏媆/缃� 4缃愯","quantity":7492,"logo":"","is_app":0,"price":61550,"market_price":103320,"goods_name":"銆愯嵎鍏扮洿渚涖\u20ac慛utrilon鑽峰叞鐗涙爮 濠村効濂剁矇4娈� 1鍛ㄥ瞾浠ヤ笂 800鍏媆/缃� 4缃愯","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/eb6131ffcb9cc1867016e7ab350340bd.jpeg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-08/767d5b326b1e16ddeb71fe0f22ad8a33.jpeg","is_onsale":1},{"normal_price":65000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-01/cbc48fb51a9f71ab69e4c2fe8e7e7854.jpeg","event_type":0,"sales":577,"goods_id":1879566,"short_name":"Aptamil 寰峰浗鐖变粬缇� 濠村効濂剁矇 2娈� 800鍏媆/缃� 4缃� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂璐�","quantity":1153,"logo":"","is_app":0,"price":64680,"market_price":147270,"goods_name":"銆愬痉鍥界洿渚涖\u20ac慉ptamil 寰峰浗鐖变粬缇� 濠村効濂剁矇 2娈� 800鍏媆/缃� 4缃� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂璐�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-01/64b18ba5fa23126d7f26ed724bc0fd3c.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-01/71ec47de5ac0f155fb2149e95ba13ed0.jpeg","is_onsale":1},{"normal_price":16330,"thumb_url":"http://omsproductionimg.yangkeduo.com/20170519/100558xB88cQlJ4ot8zS","event_type":0,"sales":265,"goods_id":3705889,"short_name":"寰风埍3娈甸檺閲忕鍒�","quantity":14861,"logo":"","is_app":0,"price":16230,"market_price":38510,"goods_name":"銆愬痉鍥界洿渚涖\u20ac慉ptamil 寰峰浗鐖变粬缇� 濠村効濂剁矇 3娈� 800鍏� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂璐�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/20170519/100559ZNKQgvQUYdkLyU","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/20170519/100558VsVNiDtYnFemF6","is_onsale":1},{"normal_price":32000,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1609125987562148/FxpjQiYD507vQtlVoVdoYREoyFrBLOLa.jpg","event_type":0,"sales":2294,"goods_id":590230,"short_name":"缇庣礌浣冲効(Friso)閲戣杈冨ぇ濠村効閰嶆柟濂剁矇3娈�900g*2缃�","quantity":4006,"logo":"","is_app":0,"price":31900,"market_price":41600,"goods_name":"銆愯嵎鍏拌繘鍙ｃ\u20ac戠編绱犱匠鍎�(Friso)閲戣杈冨ぇ濠村効閰嶆柟濂剁矇3娈�900g*2缃�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/goods/1609125987562148/7AQZ9aN6nFNU1AiKbms11dokdnRJPnF6.jpg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/unknown/0/MOBUB9HMvDvnR9taEFGcIQIeLkyMwXgj.jpg","is_onsale":1},{"normal_price":16330,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/f6ea2859099da40b0d9032def0758ae9.jpeg","event_type":0,"sales":978,"goods_id":11265942,"short_name":"寰风埍2娈靛叏缃戞渶浣�","quantity":34791,"logo":"","is_app":0,"price":16230,"market_price":33350,"goods_name":"銆愬痉鍥界洿渚涖\u20ac慉ptamil 寰峰浗鐖变粬缇� 濠村効濂剁矇 2娈� 800鍏� 鏂拌\u20ac佸寘瑁呴殢鏈哄彂璐�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-31/64609fe634141f0e0a1666278e4217df.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-21/6ef78f7cbadcb92b9d484b1049c523d9.jpeg","is_onsale":1},{"normal_price":16600,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/d4fbe673837619fb9e6b67bd543989e9.jpeg","event_type":0,"sales":187,"goods_id":12085594,"short_name":"鑻卞浗鐖变粬缇庡ザ绮夌櫧閲戠増1娈�2娈�3娈� Aptamil閾傞噾鐗�800鍏嬪疂瀹濆┐骞煎効閰嶆柟鐗涘ザ绮夊師瑁呮鍝�","quantity":26813,"logo":"","is_app":0,"price":15800,"market_price":20000,"goods_name":"銆愯嫳鍥借繘鍙ｃ\u20ac戣嫳鍥界埍浠栫編濂剁矇鐧介噾鐗�1娈�2娈�3娈� Aptamil閾傞噾鐗�800鍏嬪疂瀹濆┐骞煎効閰嶆柟鐗涘ザ绮夊師瑁呮鍝�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/2d9bf5a416b0cb137bfdf54039b717d2.jpeg","customer_num":2,"country":"鑻卞浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-21/525998070795b78b872ad47451e13d07.jpeg","is_onsale":1},{"normal_price":6900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-16/2bc70ed36e093418cb2082c73c1a8172.jpeg","event_type":0,"sales":109,"goods_id":28594608,"short_name":"缇庣礌3娈靛搧鐗屾巿鏉�","quantity":941,"logo":"","is_app":0,"price":5900,"market_price":11800,"goods_name":"銆愯嵎鍏扮洿渚涖\u20ac戙\u20ac愬搧鐗屾巿鏉冿紝瀹樻柟姝ｅ搧銆戣嵎鍏癏ero Baby缇庣礌濂剁矇3娈碉紙10-12涓湀瀹濆疂锛�800g","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-16/e7ac159fab1021d22cb3b08878d22d22.jpeg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-04-25/fb91292bedc7d63cbe2681cc625faf38.jpeg","is_onsale":1},{"normal_price":88800,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/9c77747631bab97237cdc816ca10253b.jpeg","event_type":0,"sales":101,"goods_id":61490755,"short_name":"銆愯嵎鍏板浗瀹濆ザ绮夈\u20ac戣嵎鍏扮墰鏍忓ザ绮�1/2/3/4/5/6娈� 1/2娈�850g 3/4/5娈�800g  6缃愯","quantity":399,"logo":"","is_app":0,"price":87900,"market_price":129900,"goods_name":"銆愯嵎鍏扮洿閭\u20ac戙\u20ac愯嵎鍏板浗瀹濆ザ绮夈\u20ac戣嵎鍏扮墰鏍忓ザ绮�1/2/3/4/5/6娈� 1/2娈�850g 3/4/5娈�800g  6缃愯","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-05/5dea4546ebb4f324a180492e9f5a4613.jpeg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-22/a61b135a91252bd7e3f66c9a16281952.jpeg","is_onsale":1},{"normal_price":26900,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-23/6b8dcc8aadca0e55ab8358dc3acaf26e.jpeg","event_type":0,"sales":132,"goods_id":12580277,"short_name":"鑽峰叞鐗涙爮1娈典袱缃愯","quantity":1768,"logo":"","is_app":0,"price":25000,"market_price":39900,"goods_name":"銆愯嵎鍏扮洿渚涖\u20ac戣嵎鍏扮墰鏍� Nutrilon 骞煎┐鍎垮ザ绮�1娈�2缃愯 850g*2","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-23/ba1c4b99b1701a6c2010eae10117d006.jpeg","customer_num":2,"country":"鑽峰叞","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-06-23/aebb09adb0eb52bb37ebd76db55fe918.jpeg","is_onsale":1},{"normal_price":19500,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-25/9c4a16f825af36d5e734ae42f9d5d0fe.jpeg","event_type":0,"sales":290,"goods_id":18457276,"short_name":"190涓ょ綈鍗婁环娓呬粨","quantity":1211,"logo":"","is_app":0,"price":19000,"market_price":29900,"goods_name":"銆愬痉鍥界洿渚涖\u20ac戙\u20ac愪袱缃�190 鎶㈠畬鎭㈠鍘熶环銆慉ptamil 鐖变粬缇庡┐鍎块厤鏂瑰ザ绮塸re娈�0~6M 800g*2缃�","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-03/0b7499d33e2c8108c7dfd59e6e8f01ec.jpeg","customer_num":2,"country":"寰峰浗","image_url":"http://omsproductionimg.yangkeduo.com/images/2017-07-07/b742f1904d4afa18c85049e498cb4ebf.jpeg","is_onsale":1}]
         * home_banner_width : 1000
         * goods_num : 35
         * sales : 23310
         * home_banner_height_2 : 375
         * position : 30
         * home_banner_height : 375
         * home_banner_2 : http://omsproductionimg.yangkeduo.com/images/2017-08-24/435be166de9366ff4a163834a71db69c.jpeg
         * rank_subject_priority : 0
         * home_banner_width_2 : 1000
         * start_time : 1503417600
         * subject : 杩涘彛濂剁矇涓撳尯锛屽ぇ鐗屼綆鑷充簲鎶橈紒
         * home_banner : http://omsproductionimg.yangkeduo.com/images/2017-08-24/a579a316bbc17ac6066aa471296ed0ea.jpeg
         * column_num : 1
         * share_image :
         * desc : 璁╁疂瀹濆悆鐨勬斁蹇儈姝ｅ搧淇濊瘉锛屽寘绋庡寘閭紒
         * type : haitao_recommend
         * subject_id : 3257
         */

        @SerializedName("second_name")
        private String secondName;
        private int home_banner_width;
        private int goods_num;
        private int sales;
        private int home_banner_height_2;
        private int position;
        private int home_banner_height;
        private String home_banner_2;
        private int rank_subject_priority;
        private int home_banner_width_2;
        private int start_time;
        private String subject;
        private String home_banner;
        private int column_num;
        private String share_image;
        private String desc;
        private String type;
        private int subject_id;
        private List<GoodsListBean> goods_list;

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public int getHome_banner_width() {
            return home_banner_width;
        }

        public void setHome_banner_width(int home_banner_width) {
            this.home_banner_width = home_banner_width;
        }

        public int getGoods_num() {
            return goods_num;
        }

        public void setGoods_num(int goods_num) {
            this.goods_num = goods_num;
        }

        public int getSales() {
            return sales;
        }

        public void setSales(int sales) {
            this.sales = sales;
        }

        public int getHome_banner_height_2() {
            return home_banner_height_2;
        }

        public void setHome_banner_height_2(int home_banner_height_2) {
            this.home_banner_height_2 = home_banner_height_2;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getHome_banner_height() {
            return home_banner_height;
        }

        public void setHome_banner_height(int home_banner_height) {
            this.home_banner_height = home_banner_height;
        }

        public String getHome_banner_2() {
            return home_banner_2;
        }

        public void setHome_banner_2(String home_banner_2) {
            this.home_banner_2 = home_banner_2;
        }

        public int getRank_subject_priority() {
            return rank_subject_priority;
        }

        public void setRank_subject_priority(int rank_subject_priority) {
            this.rank_subject_priority = rank_subject_priority;
        }

        public int getHome_banner_width_2() {
            return home_banner_width_2;
        }

        public void setHome_banner_width_2(int home_banner_width_2) {
            this.home_banner_width_2 = home_banner_width_2;
        }

        public int getStart_time() {
            return start_time;
        }

        public void setStart_time(int start_time) {
            this.start_time = start_time;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getHome_banner() {
            return home_banner;
        }

        public void setHome_banner(String home_banner) {
            this.home_banner = home_banner;
        }

        public int getColumn_num() {
            return column_num;
        }

        public void setColumn_num(int column_num) {
            this.column_num = column_num;
        }

        public String getShare_image() {
            return share_image;
        }

        public void setShare_image(String share_image) {
            this.share_image = share_image;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(int subject_id) {
            this.subject_id = subject_id;
        }

        public List<GoodsListBean> getGoods_list() {
            return goods_list;
        }

        public void setGoods_list(List<GoodsListBean> goods_list) {
            this.goods_list = goods_list;
        }

        public static class GoodsListBean {
            /**
             * normal_price : 61650
             * thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-08-08/549e5b95137a68079d1efb63905488cc.jpeg
             * event_type : 0
             * sales : 458
             * goods_id : 1879561
             * short_name : Nutrilon鑽峰叞鐗涙爮 濠村効濂剁矇4娈� 1鍛ㄥ瞾浠ヤ笂 800鍏媆/缃� 4缃愯
             * quantity : 7492
             * logo :
             * is_app : 0
             * price : 61550
             * market_price : 103320
             * goods_name : 銆愯嵎鍏扮洿渚涖€慛utrilon鑽峰叞鐗涙爮 濠村効濂剁矇4娈� 1鍛ㄥ瞾浠ヤ笂 800鍏媆/缃� 4缃愯
             * hd_thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-08-08/eb6131ffcb9cc1867016e7ab350340bd.jpeg
             * customer_num : 2
             * country : 鑽峰叞
             * image_url : http://omsproductionimg.yangkeduo.com/images/2017-08-08/767d5b326b1e16ddeb71fe0f22ad8a33.jpeg
             * is_onsale : 1
             */

            private int normal_price;
            private String thumb_url;
            private int event_type;
            private int sales;
            private int goods_id;
            private String short_name;
            private int quantity;
            private String logo;
            private int is_app;
            private int price;
            private int market_price;
            private String goods_name;
            private String hd_thumb_url;
            private int customer_num;
            private String country;
            private String image_url;
            private int is_onsale;

            public int getNormal_price() {
                return normal_price;
            }

            public void setNormal_price(int normal_price) {
                this.normal_price = normal_price;
            }

            public String getThumb_url() {
                return thumb_url;
            }

            public void setThumb_url(String thumb_url) {
                this.thumb_url = thumb_url;
            }

            public int getEvent_type() {
                return event_type;
            }

            public void setEvent_type(int event_type) {
                this.event_type = event_type;
            }

            public int getSales() {
                return sales;
            }

            public void setSales(int sales) {
                this.sales = sales;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public String getShort_name() {
                return short_name;
            }

            public void setShort_name(String short_name) {
                this.short_name = short_name;
            }

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public int getIs_app() {
                return is_app;
            }

            public void setIs_app(int is_app) {
                this.is_app = is_app;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getMarket_price() {
                return market_price;
            }

            public void setMarket_price(int market_price) {
                this.market_price = market_price;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getHd_thumb_url() {
                return hd_thumb_url;
            }

            public void setHd_thumb_url(String hd_thumb_url) {
                this.hd_thumb_url = hd_thumb_url;
            }

            public int getCustomer_num() {
                return customer_num;
            }

            public void setCustomer_num(int customer_num) {
                this.customer_num = customer_num;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public int getIs_onsale() {
                return is_onsale;
            }

            public void setIs_onsale(int is_onsale) {
                this.is_onsale = is_onsale;
            }
        }
    }

    public static class GoodsListBeanX {
        /**
         * normal_price : 36800
         * cnt : 638
         * thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-09-01/231c1045bc406fd65af363edaba4b334.jpeg
         * event_type : 0
         * market_price : 39800
         * goods_name : 銆愭棩鏈繘鍙ｃ€戙€愬惛榛戝ご绁炲櫒 鍛婂埆鑽夎帗榧汇€戙€愰€侀粦澶村鍑烘恫濂楄銆戠湡绌哄鍑虹數鍔ㄥ惛绮夊埡灏忔皵娉＄編瀹逛华姣涘瓟娓呮磥鍣ㄥ幓榛戝ご浠櫒
         * goods_id : 69466193
         * short_name : 銆愬惛榛戝ご绁炲櫒 鍛婂埆鑽夎帗榧汇€戙€愰€侀粦澶村鍑烘恫濂楄銆戠湡绌哄鍑虹數鍔ㄥ惛绮夊埡灏忔皵娉＄編瀹逛华姣涘瓟娓呮磥鍣ㄥ幓榛戝ご浠櫒
         * group : {"customer_num":2,"price":11800}
         * country : 鏃ユ湰
         * image_url : http://omsproductionimg.yangkeduo.com/images/2017-09-01/1ace633553528e71bd1a1d136705fa8b.jpeg
         * hd_thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-09-06/fd10ba0c762fa65353afa88fab7cb708.jpeg
         * is_app : 0
         */

        private int normal_price;
        private int cnt;
        private String thumb_url;
        private int event_type;
        private int market_price;
        private String goods_name;
        private int goods_id;
        private String short_name;
        private GroupBean group;
        private String country;
        private String image_url;
        private String hd_thumb_url;
        private int is_app;

        public int getNormal_price() {
            return normal_price;
        }

        public void setNormal_price(int normal_price) {
            this.normal_price = normal_price;
        }

        public int getCnt() {
            return cnt;
        }

        public void setCnt(int cnt) {
            this.cnt = cnt;
        }

        public String getThumb_url() {
            return thumb_url;
        }

        public void setThumb_url(String thumb_url) {
            this.thumb_url = thumb_url;
        }

        public int getEvent_type() {
            return event_type;
        }

        public void setEvent_type(int event_type) {
            this.event_type = event_type;
        }

        public int getMarket_price() {
            return market_price;
        }

        public void setMarket_price(int market_price) {
            this.market_price = market_price;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public int getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(int goods_id) {
            this.goods_id = goods_id;
        }

        public String getShort_name() {
            return short_name;
        }

        public void setShort_name(String short_name) {
            this.short_name = short_name;
        }

        public GroupBean getGroup() {
            return group;
        }

        public void setGroup(GroupBean group) {
            this.group = group;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getHd_thumb_url() {
            return hd_thumb_url;
        }

        public void setHd_thumb_url(String hd_thumb_url) {
            this.hd_thumb_url = hd_thumb_url;
        }

        public int getIs_app() {
            return is_app;
        }

        public void setIs_app(int is_app) {
            this.is_app = is_app;
        }

        public static class GroupBean {
            /**
             * customer_num : 2
             * price : 11800
             */

            private int customer_num;
            private int price;

            public int getCustomer_num() {
                return customer_num;
            }

            public void setCustomer_num(int customer_num) {
                this.customer_num = customer_num;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }
    }

    public static class CountryListBean {
        /**
         * second_name :
         * position : 0
         * home_banner_width : 1000
         * home_banner_2 : http://omsproductionimg.yangkeduo.com/images/goods/287/qVvXvWhGgupiV65mUE9GdPuZl1CCYyax.jpg
         * home_banner : http://omsproductionimg.yangkeduo.com/goods/dd5a6e9548/234/234/82791c42e1f0b27a4bc9e04a3a6d6393.jpg
         * desc : 鐢熸椿缁嗚妭鐪嬪矝鍥斤紒鏃ユ湰濂借揣涓撳満锛屾埑>>
         * subject : 鏃ユ湰棣�
         * home_banner_width_2 : 1000
         * share_image :
         * type : country
         * home_banner_height_2 : 375
         * home_banner_height : 547
         * subject_id : 287
         */

        private String second_name;
        private int position;
        private int home_banner_width;
        private String home_banner_2;
        private String home_banner;
        private String desc;
        private String subject;
        private int home_banner_width_2;
        private String share_image;
        private String type;
        private int home_banner_height_2;
        private int home_banner_height;
        private int subject_id;

        public String getSecond_name() {
            return second_name;
        }

        public void setSecond_name(String second_name) {
            this.second_name = second_name;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getHome_banner_width() {
            return home_banner_width;
        }

        public void setHome_banner_width(int home_banner_width) {
            this.home_banner_width = home_banner_width;
        }

        public String getHome_banner_2() {
            return home_banner_2;
        }

        public void setHome_banner_2(String home_banner_2) {
            this.home_banner_2 = home_banner_2;
        }

        public String getHome_banner() {
            return home_banner;
        }

        public void setHome_banner(String home_banner) {
            this.home_banner = home_banner;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getHome_banner_width_2() {
            return home_banner_width_2;
        }

        public void setHome_banner_width_2(int home_banner_width_2) {
            this.home_banner_width_2 = home_banner_width_2;
        }

        public String getShare_image() {
            return share_image;
        }

        public void setShare_image(String share_image) {
            this.share_image = share_image;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getHome_banner_height_2() {
            return home_banner_height_2;
        }

        public void setHome_banner_height_2(int home_banner_height_2) {
            this.home_banner_height_2 = home_banner_height_2;
        }

        public int getHome_banner_height() {
            return home_banner_height;
        }

        public void setHome_banner_height(int home_banner_height) {
            this.home_banner_height = home_banner_height;
        }

        public int getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(int subject_id) {
            this.subject_id = subject_id;
        }
    }
}

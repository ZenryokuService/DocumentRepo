# Java言語とは
**概要**
Javaは世界中で使用されているプログラミング言語です。**主にスピードと安定性が重視される**システムの構築に使用されることが多い。

＜使用例＞
* 銀行: 顧客管理、預金口座管理などの基幹システムや決済を行うための他銀行との取引処理を行うシステム etc...
* 証券: 基幹システムをはじめ、証券取引を行うためのWebシステム、オペレーターが使用する取引が成立したかどうかを入力するシステム etc...
* 基幹システム: 会社さんが仕事をスムーズに行うためのシステム、主に在庫管理、勤怠管理、売上管理・・・業務に携わる機能を網羅している巨大システム etc...


## イントロダクション
Javaというプログラム言語では、大体のことができます。Webアプリケーション、スマホアプリ、通常のPCで動くアプリケーションなど。
Iotや、人工知能の分野にも使用することができます。

1. Webアプリケーション
   <iframe width="560" height="315" src="https://www.youtube.com/embed/LkjETT0ZKA8" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
2. スマホアプリ
    <iframe width="560" height="315" src="https://www.youtube.com/embed/Eu5wAvbj4Nw" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
3. 通常のPC
    <iframe width="560" height="315" src="https://www.youtube.com/embed/9XJicRt_FaI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
4. Iot
   <iframe width="596" height="335" src="https://www.youtube.com/embed/C0FK7d4dJ5k" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
5. 人工知能
   <iframe width="560" height="315" src="https://www.youtube.com/embed/DLngS77atps" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

## 実際に動くものを見て動かす。
上に挙げたような、大規模システムの構築は出来ないのでサンプルとして作成したTextRpgゲーム」をみながら理解していきます。
＜サンプル動画＞

### ゲームの特徴
* ゲームブックのように、ストーリーを進めていき、最終的にゴール(エンディング)を迎える形のゲームです。
* ストーリーは「XXX_stroy.txt」に指定の形で記述することで、作成者が自由にストーリーを作成することができます。
* Job.xml, Monster.xml, Command.xmlなどのXMLファイルで使用する職業、コマンド、モンスターを定義することができます。

### ストーリーを作る
ゲームのストーリーは、シーンごとに作成します。例えば序章の場合小説のように文章を書くだけでよいですが、
このゲームでは、序章の部分を1つのシーンとして扱いますので下のように「枠」で囲う必要があります。

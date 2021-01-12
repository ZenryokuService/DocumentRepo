## 本日の体験メニューについて
プログラミング言語の**Java**を使ってゲームをします。
そして、皆でバトルします。

# Robocode
これから、プレーするゲームの名前です。インターネットで検索するときは「robocode インストール」と検索するとインストーラー(jarファイル)
をダウンロードできます。

### 準備済みの設定
1. 文字の大きさを変更してあります。

## 初期画面について
起動すると下のような画面が見れます。

![初期画面](./img/firstView.png)

#### ①メニュー
使うもの、のみを記載しています。
* Battle:
 1. 新規バトル(New)
 2. バトルを開く(Open)
* Robot:
 1. ソースエディタ(Source editor)
 2. ほかのロボ、チーム取り込み(import robot or team)
 3. JARファイルの作成(Package robot or team)
* Options:
 1. 環境設定(Preference),
 2. Roboのキャッシュをクリア(Clean robo cache)
* Help:  ヘルプ

## 動かしてみよう
まずは、サンプルバトルを動かしてみます。下の手順で動かしてください。

Step1 メニューから「Battle」をクリック
 ![](./img/OpenBattle1.png)

Step2 sample.battleファイルをクリック
 ![](./img/OpenBattle2.png)

Step3 Start Battleをクリック
![](./img/OpenBattle3.png)

Step4 Stopでバトルを修了する
　![](./img/OpenBattle4.png)

動いているのをみて、どんな動きをしているか観察してみてください。



<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>


## オリジナル・ロボを作ろう
オリジナルのロボを作ります。下の手順でロボの作成準備をしてください。
Step1 メニューから「Robo」をクリックし、「Source Editor」をクリック
 ![](./img/Source1_n.png)

Step2 ソースエディタを開き、New -> Roboをクリック
 ![](./img/Source2_n.png)

Step3 ロボの名前を入力する
 ![](./img/Source3.png)

Step4 ロボのファイルを配置するパッケージの名前を入力する ※ロボの名前には「OrignalRobo」という名前を津得たので、赤線部にロボの名前が表示されています。
 ![](./img/Source4.png)

Step5 テンプレートのロボが作成されるので、オリジナルのロボに改造しましょう。
 ![](./img/Source5.png)

 <br/>
 <br/>
 <br/>
 <br/>
 <br/>

## ロボの仕組みを知ろう
ロボは次の状態の時の**動きを定義**することでどのように動くか決まります。
* 通常時
* 敵をスキャンした時
* 自分が弾に当たった時
* 壁にぶつかった時

それぞれの**動きを定義**しているのが、次のメソッドというものです。
* 通常時: run()
* 敵をスキャンした時: onScannedRobot()
* 自分が弾に当たった時: onHitByBullet()
* 壁にぶつかった時: onHitWall()

#### 通常時の動き
ロボを作成したばかりの状態ではロボは**通常時**に下のように動きます。
1. 100前に進む
2. 主砲を右へ360度回転
3. 100後退する
2. 主砲を右へ360度回転

#### 敵をスキャンした時
ロボを作成したばかりの状態ではロボは**敵をスキャンした時**に下のように動きます。
1. 弾を発射する: fire(1);

#### 自分が弾に当たった時
ロボを作成したばかりの状態ではロボは**自分が弾に当たった時**に下のように動きます。
1. 10後退する: back(10);

#### 壁にぶつかった時
ロボを作成したばかりの状態ではロボは**壁にぶつかった時**に下のように動きます。
1. 20後退する: back(20);


## ロボへ命令する
サンプルバトルを見たときに、ロボはどのような動きをしていたでしょうか？
少なくとも「ジャンプ」はしていませんでした。ロボに出せる「命令」は決まっているのです。そして、下の表のように「命令」が決まっています。

つまり「命令」を組み合わせてオリジナルのロボを作成します。

|返り値|メソッド名|振る舞い(処理の内容)|
| ---- | ------- | ---------------- |
|void|ahead(double distance)|ロボットを前方に移動させます。|
|void|back(double distance)|ロボットを後方に移動させます。|
|void|doNothing()|このロボットの今回の順番では、何も動作を行いません。|
|void|fire(double power)|弾丸を発射します。|
|void|scan()|他のロボットを探します。|
|void|setColors(Color robotColor, Color gunColor, Color radarColor)|このメソッドは、ロボットの色を設定するために呼び出します。|
|void|stop()|動作をすべて停止し、 後で resume() 呼び出しを使って再開できるよう、保存します。|
|void|stop(boolean overwrite)|動作をすべて停止し、 後で resume() 呼び出しを使って再開できるよう、保存します。|
|void|turnGunLeft(double degrees)|ロボットの大砲を回転させます。|
|void|turnGunRight(double degrees)|ロボットの大砲を回転させます。|
|void|turnLeft(double degrees)|ロボットを回転させます。|
|void|turnRight(double degrees)|ロボットを回転させます。|

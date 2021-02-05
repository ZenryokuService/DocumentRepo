# PHP Eclipseでサーバーを立てる

* **参考サイト**
 1. [Eclipseseセットアップ](https://www.eclipse.org/pdt/help/html/running_php_web_pages.htm)
 2. [PHP built-in-server](https://www.php.net/manual/ja/features.commandline.webserver.php)
 3. [Derby Tutorial](https://www.finddevguides.com/Apache-derby-quick-guide)
 4. [Derby Settinup](https://www.finddevguides.com/Apache-derby-environment-setup)

##### 結論：built-in-serverを使用するほうが早い、そしてPHPとEclipseを連携するメリットはあまりないように思える。


## Eclipse連携に関して
Eclipseと連携するような、Tomcatみたいにできなかった、というかそのような記述が見当たらなかった。

あくまでもテキストEditorとしてEclipseを使用する程度。

## PHP built-in-Server
上記のリンク先にある内容をまとめる

下のようなコマンドで、カレントディレクトリをドキュメントルートとしたウェブサーバーを起動できる
前提としては、**php.exeを環境変数**に設定しておく必要がある

> php -S localhost:8000

サーブレットのように、リクエストハンドラーとして「router」を使用することができる。

> php -S localhost:8000 router.php

```
<?php
// router.php
if (preg_match('/\.(?:png|jpg|jpeg|gif)$/', $_SERVER["REQUEST_URI"])) {
    // リクエストされたリソースをそのままの形式で扱います。
    return false;    
} else {
    echo "<p>Welcome to PHP</p>";
}
?>
```

## Derby Setup

## Derby Network Server mode
### ネットワークサーバーモードでのDerbyの実行
#### 手順まとめ
＜**embedded driver**＞
1. 解凍したフォルダを、DERBY_HOMEを環境変数に設定する ->例) C:\\derby_X.XXX-bin\\
2. ```ij```コマンドを実行する
3. ```run 'ToursDB_schema.sql';```を実行
4. ```run 'loadTabels.sql';```を実行
5. これでテーブルが作成されるのでSQLを実行してみる

* [コマンド一覧](http://db.apache.org/derby/docs/10.10/tools/rtoolsijcomrefdescribe.html)
 - SHOW TABLES;
 - SHOW VIEWS;

 [JavaDB日本語メモサイト](http://www.ne.jp/asahi/hishidama/home/tech/java/javadb.html)

### Eclipseのプラグインを使用する
1. Eclipseマーケットプレイスから取得する。

2. Help -> Markt place
 ![DerbyPlugin](./img/DerbyPlugin3.png)

3. ヘッダメニューから「データベース」を選択
 ![DerbyPlugin2](./img/DerbyPlugin2.png)

4. 使用するDBを選択する
 ![DerbyPlugin](./img/DerbyPlugin.png)

### まとめ
結局のところは、EclipseでDBなどの管理するツール及びドライバは祖あるが、PHPをコントロールしようとしたら、DB(Derbyと)連動させるためのドライバがなかったので、別に作成する必要がある。。。



#### 手順オリジナル(参考サイトのコピー)
参考サイトから引っ張りました。
>Apache Derbyをネットワークサーバーモードでインストールするには、 derbynet.jar および derbytools.jar ファイルをCLASSPATHに含める必要があります。
>
> または、 setNetworkServerCP コマンドを実行して、必要なjarファイルのクラスパスを設定できます。 Apache Derbyの bin ディレクトリを参照し、以下に示すようにこのファイルを実行します-
>
> C:\Derby\bin>setNetworkServerCP.bat
> C:\Users\MYUSER>cd %DERBY_HOME%/bin
> C:\Derby\bin>SET DERBY_INSTALL=C:\Derby
> C:\Derby\bin>set
> CLASSPATH=C:\Derby\lib\derbynet.jar;C:\Derby\lib\derbytools.jar;C:\Derby/lib/de
> rbyoptionaltools.jar;C:\Users\finddevguides\Google
> Drive\Office\Derby\derby_zip\New folder\db-derby-10.12.1.1-
> bin\lib;C:\EXAMPLES_\Task\jars\*;C:\EXAMPLES\jars\mysql-connector-java-5.1.40-
> bin.jar;C:\Users\finddevguides\Google Drive\Office\37.Junit
> Update\jars;C:\Program Files\Apache Software Foundation\Tomcat
> 8.5\lib\*;C:\Derby\lib\*;
> サーバーモードでのDerbyの起動
> コマンド startNetworkServer を実行して、Network Serverを起動できます。 Apache Derbyの bin ディレクトリを参照し、次のようにこのコマンドを実行します-
>
> C:\Derby\bin>startNetworkServer
> Fri Jan 04 11:20:30 IST 2019 : Security manager installed using the Basic
> server security policy.
> Fri Jan 04 11:20:30 IST 2019 : Apache Derby Network Server - 10.14.2.0 -
> (1828579) started and ready to accept connections on port 1527
> または、以下に示すように derbyrun.jar を使用してサーバーを起動できます-
>
> C:\Users\MYUSER>cd %DERBY_HOME%/lib
> C:\Derby\lib>java -jar derbyrun.jar server start
> Fri Jan 04 11:27:20 IST 2019: Security manager installed using the Basic server
> security policy.
> Fri Jan 04 11:27:21 IST 2019: Apache Derby Network Server - 10.14.2.0 -
> (1828579) started and ready to accept connections on port 1527
> ネットワーククライアント
> クライアントで、jarファイル derbyclient.jar および derbytools.jar をCLASSPATHに追加します。 または、以下に示すように setNetworkClientCP コマンドを実行します-
>
> C:\Users\MYUSER>cd %DERBY_HOME%/bin
> C:\Derby\bin>setNetworkClientCP
> C:\Derby\bin>SET DERBY_HOME=C:\Derby
> C:\Derby\bin>set
> CLASSPATH=C:\Derby\lib\derbyclient.jar;C:\Derby\lib\derbytools.jar;C:\Derby/lib
> /derbyoptionaltools.jar;C:\Derby\lib\derby.jar;C:\Derby\lib\derbytools.jar;C:\D
> erby/lib/derbyoptionaltools.jar;C:\Users\finddevguides\Google
> Drive\Office\Derby\derby_zip\New folder\db-derby-10.12.1.1-
> bin\lib;C:\EXAMPLES_\Task\jars\*;C:\EXAMPLES\jars\mysql-connector-java-5.1.40-
> bin.jar;C:\Users\finddevguides\Google Drive\Office\37.Junit
> Update\jars;C:\Program Files\Apache Software Foundation\Tomcat
> 8.5\lib\*;C:\Derby\lib\*;

## DerbyのEclipse連携
> Apache Derby Eclipse環境
> Eclipseを使用して、必要なすべてのjarファイルのビルドパスを設定する必要があります。
>
> ステップ1：プロジェクトを作成し、ビルドパスを設定する
> Eclipseを開き、サンプルプロジェクトを作成します。 プロジェクトを右クリックし、オプション Build Path→ Configure Build Pathを以下のように選択します-
>
> [ビルドパスの構成](https://www.finddevguides.com/index.php?title=%E7%89%B9%E5%88%A5:%E3%82%A2%E3%83%83%E3%83%97%E3%83%AD%E3%83%BC%E3%83%89&wpDestFile=/apache_derby/configure_build_path.jpg)
>
> *Libraries* タブの *Java Build Path* フレームで、 *Add External JARs* をクリックします。
> [Javaビルドパス](https://www.finddevguides.com/index.php?title=%E7%89%B9%E5%88%A5:%E3%82%A2%E3%83%83%E3%83%97%E3%83%AD%E3%83%BC%E3%83%89&wpDestFile=/apache_derby/java_build_path.jpg)
>
> そして、Derbyインストールフォルダーのlibフォルダーで必要な jar ファイルを選択し、*適用して閉じる*をクリックします。
>
> カテゴリ: [構文ハイライトエラーがあるページ](https://www.finddevguides.com/index.php?title=%E3%82%AB%E3%83%86%E3%82%B4%E3%83%AA:%E6%A7%8B%E6%96%87%E3%83%8F%E3%82%A4%E3%83%A9%E3%82%A4%E3%83%88%E3%82%A8%E3%83%A9%E3%83%BC%E3%81%8C%E3%81%82%E3%82%8B%E3%83%9A%E3%83%BC%E3%82%B8&action=edit&redlink=1) | [壊れたファイルへのリンクがあるページ](https://www.finddevguides.com/index.php?title=%E3%82%AB%E3%83%86%E3%82%B4%E3%83%AA:%E5%A3%8A%E3%82%8C%E3%81%9F%E3%83%95%E3%82%A1%E3%82%A4%E3%83%AB%E3%81%B8%E3%81%AE%E3%83%AA%E3%83%B3%E3%82%AF%E3%81%8C%E3%81%82%E3%82%8B%E3%83%9A%E3%83%BC%E3%82%B8&action=edit&redlink=1)
Apache Derby Tutorial

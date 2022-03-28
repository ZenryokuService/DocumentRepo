# Javaの実践学習
今までに、色々と学習してきましたが、効率と理解度を考慮に入れるとズバリ下のような学習方法が一番だと思いました。
1. コードを書く
2. コードを動かす
3. コードを書き換えて動かしてみる
4. コードを理解する

この順序でいろんな書き方、プログラムの組み方を理解していくのが最もわかり易く、実践で使えると思いました。

この手順を使用してJavaの基本をやり直したいと思います。

## 初めてのJava
以前書いた記事はこちらです。
* [Java Hello World はじめのプログラム 〜 Step1-1〜](http://zenryokuservice.com/wp/2018/05/02/java-basic/)
* [Java はじめて 1 〜メインメソッド〜](http://zenryokuservice.com/wp/2019/09/04/java-%e3%81%af%e3%81%98%e3%82%81%e3%81%a6-1-%e3%80%9c%e3%83%a1%e3%82%a4%e3%83%b3%e3%83%a1%e3%82%bd%e3%83%83%e3%83%89%e3%80%9c/)
* [Java Introduction〜初めてのJava〜](http://zenryokuservice.com/wp/2018/10/14/java-introduction%e3%80%9c%e5%88%9d%e3%82%81%e3%81%a6%e3%81%aejava%e3%80%9c/)
* [プログラム 習得 順序1 概要](http://zenryokuservice.com/wp/2018/12/02/%e3%83%97%e3%83%ad%e3%82%b0%e3%83%a9%e3%83%a0-%e7%bf%92%e5%be%97-%e9%a0%86%e5%ba%8f/)
* [プログラム 習得 順序2 hello world(Java)](http://zenryokuservice.com/wp/2018/12/03/%e3%83%97%e3%83%ad%e3%82%b0%e3%83%a9%e3%83%a0-%e7%bf%92%e5%be%97-%e9%a0%86%e5%ba%8f2/)

### Lv1.ハローワールド
初めtのプログラムとして有名なものですが、これはJava言語に限ったことではありません。C言語、Python, C#, java script etc ...でも同じことです。
プログラムを起動して、「Hello World」と表示するだけのプログラムです。

このプログラムは、大きなアプリケーションに新たに取り組む、もしくはフレームワークを使用するなどの時に「プログラムが動くよね？」という確認のために使用することが多いです。

そして、自分はJava屋なので、Java言語で実装を行います。

下のコードは、「Hello クラス」を作成し、そこにメインメソッドを作成しました。

＜Code.01＞
```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
```

Eclipse(開発ツール(IDE))での実行した時の動画は以下になります。

<iframe width="560" height="315" src="https://www.youtube.com/embed/-irWNXoZHY0" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

シンプルに、コンソール(標準出力)への文字列出力になります。

ここでのポイントは、**プログラムが動くことを確認する**というところです。

### Lv2.適当な文字の出力
上のコードを書き換えて、出力内容を変更します。

＜Code.02＞
```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("I an Takunoji. It's verry hard.");
	}
}
```

言っていることは、意味がわかりませんが、とりあえずは、出力内容が変わります。

コードの実行確認は、読者の皆さんが行ってください。
※コピペしないほうが、理解も早いです。


すぐに気がつく人は気がつくのですが、気がつかない人はなかなか気がつきません。
自分がそうです。苦労しました、今でも、汚いコードとかにある、このような「小さなミス」を見つけるのに一苦労します。

#### コードは綺麗に書きましょう
一言で言うと自分があとで苦労します。。。

### 余談：綺麗なコードとは
単純に、以下の部分がポイントです。
1. インデントが揃っている
2. 余計な変数宣言がない
3. 同じ名前の変数を別の用途に使いまわさない
4. 処理が整理されていて、どの処理がどこにあるのかわかるようになっている

大まかに上のようなコードです。詳細に関しては、今後理解して行けば良いと思います。

### Lv3.計算をしてみる
単純な足し算と引き算をコンソールに出力します。

＜Code.04＞
```java
public class HelloWorld {
	public static void main(String[] args) {
		// 足し算
		System.out.println("1 + 1 = " + (1 + 1));
		// ひき算
		System.out.println("1 - 1 = " + (1 - 1));
	}
}
```

上のコードは、文字列「1 + 1 = 」に「1 + 1」の計算結果を文字列として連結して、出力しています。
次の行では、同様に、文字列「1 - 1 = 」に「1 - 1」の計算結果を文字列として連結して、出力しています。

では、次のコードを見て見ましょう

＜Code.05＞
```java
public class HelloWorld {
	public static void main(String[] args) {
		// かけ算
		System.out.println("2 * 2 = " + 2 * 2);
		// わり算
		System.out.println("2 / 2 = " + 2 / 2);
	}
}
```

このコードは、掛け算と割り算を行なっています。しかし、＜Code.04＞と比べてみるとかっこが足りません。
具体的に```"1 + 1 = " + (1 + 1)```と```"2 * 2 = " + 2 * 2```の部分です。

この部分は暗黙的なルールがあり、中学生くらいだと思いますが、「足し算と掛け算」があったら「掛け算」の方を先に計算すると言うルールがあったと思います。

プログラムでも同じなんです。

つまるところは以下のような理由で、上のような違いがあります。

＜足し算と引き算の場合＞
```java
public static void main(String[] args) {
	// 足し算
	System.out.println("1 + 1 = " + (1 + 1));
	// ひき算
	System.out.println("1 - 1 = " + (1 - 1));
}
```
足し算と引き算の場合は、（）かっこが必要です。それは「文字を連結する」と言う処理と、「計算をする」と言う処理にしようする演算子(「+」のこと)が同じなため```"1 + 1 = " + 1 + 1```のように書くと文字連結か、計算するかJavaコンパイラが判別できないためエラーになります。

＜掛け算と割り算の場合＞
```java
public static void main(String[] args) {
	// かけ算
	System.out.println("2 * 2 = " + 2 * 2);
	// わり算
	System.out.println("2 / 2 = " + 2 / 2);
}
```
見た目にも、「+」と「*」で演算子が違うので「文字列の連結」と「計算」の区別がつきます。なのでかっこがなくてもビルドエラーになりません。

ついでにもう１つサンプルコード
＜Code.06＞
```java
public class HelloWorld {
	public static void main(String[] args) {
		// かけ算と割り算
		System.out.println("2 * 2 = " + 2 * 2 / 2);
	}
}
```

この場合はどうのような処理結果が出るでしょうか？それは実行して見てからのお楽しみ。

## 変数を使う
プログラミングを行なっていると「変数」と言う言葉が出てきます。
プログラミングは、中学校くらいに習った(習う)数学と似たところがあります。

| 演算子 | 意味 | サンプルコード |
| -------- | ----- | ------------------ |
| + | 足し算、文字列の連結 | 1 + 1, "文字" + "1" |
| - | 引き算 | 1 - 1 |
| * | かけ算 | 1 * 1 |
| / | わり算 | 1 / 1 |
| % | 剰余算 | 1 % 1 |

##### 剰余算について
＜Code.07＞
```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("3 % 2 = " + 3 % 2);
	}
}
```

上のように割った後の余りを算出します。「3 / 2 = 1 あまり1」と言うふうになります。なので「3 % 2」の計算結果は「1」になります。

実際に使用するときは「変数Xが偶数か奇数か？」と調べるときに、下のようなkたちで使用します。

＜Code.08＞
```java
public class HelloWorld {
	public static void main(String[] args) {
		int X = 32;
		boolean isKisu =  X % 2 == 1;
	}
}
```

このときに変数Xを２で割った時の余りが１になる数は「奇数」です。逆に「0」になるものは偶数です。

このような「法則のようなもの？」を見つけてそれをプログラムに落とし込むと言うところもプログラミングの面白いところです。

### 変数を学ぶ

プリミティブ型の変数としては以下のようなものがあります。

[プリミティブ型]と呼ばれるデータ型の種類

| データ型   |      読み    |   用途 |
| ------------ | ------------ | ------- |
|byte          |   バイト     |  8ビットの整数(-127から127) を示すが実際はファイル入出力時にこのデータ型で扱うことが多い |
|int            |    イント     |  整数として使用する(四則計算など)、整数の計算で使用する事が多い |
| long         |    ロング    |   intよりも大きい数値を使用する時に使用する、日付計算などで使用する事が多い。 |
| double     |    ダブル   |    小数点をつける数値として使用する |
| float      |       フロート |  あまり使わない |
| char      |      キャラ     |    一文字を示す、またintでも扱うことができる 'a'(シングルクォーテーション使用) |
| boolean |      ブーリアン | 真(true)か偽(false)を示す、intではtrue=1, false=0 |

これは全てではないですが、大まかに変数の一覧になっています。

そして、よく使用するのが、以下の4つです。

1. int型： 整数用の変数
2. double型: 少数用の変数
3. boolean型: 真偽値
4. String型：文字列として使用する

今までにも使用しているコードですが、改めて眺めて見ましょう

＜Code.09＞
```java
public class HelloWorld {
	public static void main(String[] args) {
		// 変数の宣言
		int seisu;
		// 変数の初期化
		double shosu = 0.0;
		// 変数の初期化
		String moji = "文字列";
	}
}
```

変数の宣言は値を代入しません。```int seisu;```、そして、初期化は値を代入します```int double shosu = 0.0;```


今回は、ここまでです。次は、変数を使用して、簡単なプログラムを作成します。

## H2DBを使用する
[こちらのサイト](https://sukkiri.jp/technologies/databases/h2/h2-database_install.html)を参考にします。

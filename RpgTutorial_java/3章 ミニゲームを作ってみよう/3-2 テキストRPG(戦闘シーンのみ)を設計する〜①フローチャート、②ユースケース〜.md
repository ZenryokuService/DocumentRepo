# 3-2 テキストRPG(戦闘シーンのみ)を設計する〜①フローチャート、②ユースケース〜

本パートでは、 3-1で行ったことを土台にしてフローチャートを作ります。そのためにまずはユースケース図を作成します。

やることを整理すると以下のようになります。最後に技術的なことを学習します。
1. ユースケース図の作成
2. フローチャートの作成
3. インターフェースの扱い(ポリモーフィズムの実装)

「じゃんけんゲーム」では処理の量が少なかったので作成しませんでしたが、今回は**ユースケース図**を作成します。

フローチャートの作成は前章で行いましたが「ユースケース」に関して軽く触れておきます。

## 1. ユースケース図の作成
### ユースケース図
ユースケース図はUMLの中の１つです。※詳細に関しては、2-3を参照ください

このユースケースは、フローチャートよりも、もっと人間寄りのもので、以下のような図です。

※フローチャートはUMLに入っていませんのでご注意ください。

**==ユースケース図概要==**

今回の実装する部分は「戦闘シーンのみ」なので青色のついている部分のみです。

プレーヤーとモンスターに色はついていませんが、実装範囲です。下の図では、実装範囲外のものも記載しているので青くありません。

**==ユースケース・サンプル==**
![ユースケース図](./img/TextRpgのユースケース_イメージ図.png)

このユースケース図は、先のことも考えてあるのでちょっと範囲が大き過ぎるので改めて自分の作成するアプリです。

つまりは「テキストRPG(戦闘シーンのみ)]のユースケース図は自分自身の手で描いてみてください。

使用する道具はアプリでも、紙と鉛筆でも構いません。

余談ですが、UMLアプリの紹介をしておきます。
* [StarUML](http://staruml.io/)
* ~~[astah](https://astah.change-vision.com/ja/download.html)~~
 ※astahはフリーのUMLツールではなくなってしまいました。。。

まずは、「3-1 テキストRPG(戦闘シーンのみ)を作ってみよう」で作成した**登場人物**のリストを作成します。

あくまでも、実装するときの資料として作成するので、自分にわかればそれで良いです。

実際、開発現場でも「現場内ルール」を作って「こう書きましょう」というルールがあることがほとんどです。

間違っても、修正すれば良いので遠慮なく間違ってください。ちなみに「間違い」というのは実装してみたら図と違ってしまった。という状況のことです。

### テキスト RPGの実行イメージと必要なもの(予想)

**==作成するものを具体的にイメージする==**

皆さんは「テキストRPGの実行イメージ」としてどのようなものを描くでしょうか？

自分の描いたものは、下のリンク先にあるようなものです。(なのでそのように作成しました。)

[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/716dfk-eN7A/0.jpg)](https://www.youtube.com/watch?v=716dfk-eN7A)

筆者が最終的に作成したイメージ(処理の実行結果)は、このようなものですが、ここで頭に描きたい「イメージ」は以下のようなものです。

1章で行った**処理フロー(箇条書き)**です。筆者の場合は以下のようなものを作成しました。
1. ゲームを起動する
2. ゲームの準備処理
3. 初期表示
4. 「XXXXがあらわれた!」を表示する
5. バトルステータス(プレーヤの名前やHP, MP, LV)の表示
6. モンスターが話をする場合、モンスターのメッセージを表示する
7. モンスターが話をしない場合、何もしない
8. 入力受付を行う
9. 入力判定(チェック)を行う
10. 入力チェックエラーの場合は、もう一度入力を促す
11. 「bye」と入力された場合は、ゲームを終了する
12. それ以外の場合は、ゲームデータの更新を行う
13. 表示の更新
14. モンスターを倒していないならもう一度8から処理を行う
15. モンスターを倒していたらゲームを終了する

これも、フローチャートにして見ると良いと思います。

## 2. フローチャートの作成
筆者の描いたフローチャートは以下のようなものです。

![Flow1](./img/TextRpgフローチャート2.png)

アプリを使用して書くもよし、ノートとペンで書くもよし、どちらにしろ処理の流れが自分にわかればOK

フローチャートを書くための材料としては上の**処理フロー(箇条書き)**があります。

そして、書き方に関してもすでに学習済みなので問題ありません、もしわからないことがあれば調べればOK。

参考になるサイトがたくさんあるので、あえて紹介しません。わからなくなったら、「1章：オブジェクト指向プログラミングとそうでないプログラミング/1-1 じゃんけんゲームの設計をする〜フローチャートの作成とJavaの基本〜」をもう一度読み返してみてください。

今までに、行っていることなのであえて解説などは致しませんが、今回は処理の量が多少増えたのでフローチャートを書き終えたら

次は登場人物を考えて見ると良いと思います。その内容に関しては次の章にて行います。

その前に、実装時に使用する技術について触れておきます。

## 3. インターフェースの扱い(ポリモーフィズムの実装)
インターフェースに関して、学習します。

すでに使用しているインターフェースがあります。**List** と**Map**インターフェースです。

サンプルとして、筆者が作成したインターフェースの使い方を見てみます。コマンドIFと呼んでいます。※筆者が考えたものです。

これらの実装は以下のように、抽象メソッドの定義がしてあるだけです。処理の内容がありません。

「抽象メソッド」は下のように、「abstract」がついたメソッドのことです。

＜抽象メソッドの書き方＞
```java
public abstract void XXX();
```
* public   -> アクセス修飾子
* abstract -> 抽象メソッドであることを示す
* void     -> 返却値
* XXX      -> メソッド名

**==抽象メソッドの解説==**

例として、抽象メソッドは、下のようにも書けます。
> // アクセス修飾子 abstract 返却値 メソッド名(引数)
public abstract String methodName();

ルールとしては、通常のメソッドと同じですが、「abstract」がつき、処理の中身を書きません。

そして、インターフェースに実装する下のようなメソッドが抽象メソッドになります。

＜インターフェースクラスの書き方＞
```java
public interface InterFaceTest {
    public abstract void XXX();
    public void method(String str);
}
```
**==インターフェースクラスの解説==**

インターフェースクラスは、定数と抽象メソッドを持つことができます。なので下のような書き方もできます。

そして、インターフェースクラスの中で定義されたメソッドは全て抽象メソッドとして定義されるので、「abstract」がなくても抽象メソッドとJVMに判断されます。

1. 抽象メソッドXXXを定義しています。返却値はなし、引数もなし
2. 抽象メソッドmethodを定義しています。返却値はなし、引数は文字列型です


＜インターフェースクラスの書き方２＞
```java
public interface InterFaceTest {
    public final String TEST = "定数";
    public abstract String XXX();
    public String method(int num);
}
```
**==インターフェースクラスの解説２==**
1. 抽象メソッドXXXを定義しています。返却値は文字列型、引数はなし
2. 抽象メソッドmethodを定義しています。返却値は文字列型、引数は整数型です

これらの抽象メソッドには処理の中身を定義しません。具体的に下のようなコードはビルドエラーになります。

＜エラーになるインターフェースクラスの書き方＞
```java
public abstract int XXXX() {
  System.out.println("ビルドエラーになります");
}
```

実際に使用するときは下のようにクラスへ実装(implements)して使用します。

```java
public class FirstJankenMainTest implements InterFaceTest { ... }
```

＜呼び出すとき＞
```java
public static void main(String[] ars) {
  // 通常の使い方
  FirstJankenMainTest test = new FirstJankenMainTest();
  // インターフェースを使った時
  InterFaceTest testIF = new FirstJankenMainTest();

  // 例：Mapの場合(インターフェース->Map, 実態クラス -> HashMap)
  Map<String, Integer> map = new HashMap<>();

  // 例：Listの場合(インターフェース->List, 実態クラス -> ArrayList)
  List<String> list = new ArrayList<>();
}
```
**==インターフェースクラスを呼び出すとき==**
1. インターフェースを実装した、FirstJankenMainTestクラスをFirstJankenMainTest型の変数に代入します
2. インターフェースを実装した、FirstJankenMainTestクラスをInterFaceTest型の変数に代入します
3. Mapインターフェースを実装したHashMapクラスをMap型の変数に代入します
4. Listインターフェースを実装したArrayListlクラスをList型の変数に代入します

結論から言うと、インターフェースを実装したクラスは、インターフェース型の偏すとしても、クラス型の変数としても使えるようになると言うことです。

これはどう言うことかと言うと、インターフェースを実装したクラスは、**全くの別物でも、同じメソッドで呼び出し動かすことができると言うこと**です。

### インターフェースの使い方
文字で色々と説明しても、わからないものだと思います。そして、それを痛感してきたので、コードで語りたいと思います。

＜A.インターフェースのサンプル＞

筆者の考えたインターフェースの実装サンプル・モデルです。

```java
/**
 * コマンドインターフェース<br/>
 * インターフェースは、処理内容を書きません。
 *
 * 2019/08/23
 */
public interface CommandIF {
	/** コマンドを実行する */
	public void execute();
}

```
**==コマンドインsターフェースの解説==**
* コマンドを実行するexecute()と言う、抽象メソッドを定義しています。

＜B.インターフェースの実装クラスサンプル１＞

このインターフェースクラスをimplements(実装)したクラスを作成します。

```java
public class HelloCommand implements CommandIF {

	/* (non-Javadoc)
	 * @see jp.zenryoku.sample.lv3.refactor.CommandIF#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}

    /** ラムダ式を使ってみたサンプルコード */
	public void test() {
		List<String> list = new ArrayList<>();
		list.add("一郎");
		list.add("二郎");
	    list.add("三郎");
		list.forEach(System.out::println); // この行がラムダ式
	}
}
```
**==HelloCommandクラスの解説==**
1. CommandIFを実装したクラスです
2. execute()メソッドをオーバーライドしています
3. test()メソッドを実装しています、Listインターフェースを使用してみたサンプルです

execute()は、単純に「Hello World!」を表示する処理を実装しています。

CommandIFに定義している「execute()」メソッドをオーバーライドします。これをやらないとビルドエラーが出ます。

そして、もう１つCommandIFを実装したクラスを作成します。

＜C.インターフェースの実装クラスサンプル2＞

```java
public class ReadyCommand implements CommandIF {

	/* (non-Javadoc)
	 * @see jp.zenryoku.sample.lv3.refactor.CommandIF#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Ready?");
	}

	@Override
	public boolean equals(Object cls) {
		return true;
	}
}
```
**==ReadyCommandクラスの解説==**
1. CommandIFのメソッドexecute()をオーバーライドしています
2. 同様に、Objectクラスのメソッドequals()をオーバーライドしています

これも単純に「Ready?」と表示する処理を実装しています。

ちなみに「equals()」はObjectクラスのメソッドをオーバーライドしています。

新規で作成するクラスも含めて、全てのクラスは「Objectクラス」を継承している形で実装することになります(JavaAPIなども同様に実装されています)。

「Object」クラスは[全てのクラスのスーパークラス](https://docs.oracle.com/javase/jp/8/docs/api/java/lang/Object.html)であり、「暗黙的に継承している」ということです。

なので「equals()」とか「toString()」などのメソッドは常にオーバーライドすることになります。

そして、これらを実行するメインメソッド

＜D.インターフェースの使った処理サンプル＞

```java
public class Lv3_1_RefactorLv2_Main {
	/** コマンドリスト */
	private static  Map<String, CommandIF> cmdMap;
	public static void main(String[] args) {
		// コマンドの用意
		cmdMap = new HashMap<String, CommandIF>();
		cmdMap.put("hello", new HelloCommand());
		cmdMap.put("ready", new ReadyCommand());
		// 標準入力
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("入力してください: ");
			String inStr = input.nextLine();
			CommandIF cmd = cmdMap.get(inStr);
			if (cmd != null) {
				cmd.execute();
			}
			if ("bye".equals(inStr)) {
				System.out.println("Good Byw");
				break;
			}
		}
	}
}
```
**==Lv3_1_RefactorLv2_Mainの処理解説==**
1. メインメソッドの処理を実行するときに、CommandIFを実装したクラスをMapに登録します。
2. 無限ループ内で、入力→コマンド取得→コマンド実行の処理を行います。

これで、実行結果は下の動画のようになります。

[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/vxmAYNXkPQs/0.jpg)](https://www.youtube.com/watch?v=vxmAYNXkPQs)

作成した、CommandIFというインターフェースにimplementsしたクラス以下のクラスを標準入力の文字列で判断して、以下のクラスに実装した「execute()」メソッドを実行します。
1. HelloCommand
2. ReadyCommand

そして、実行した結果は、helloと入力した時には「Hello World!」と表示、「ready」と入力した「Ready?」と表示します。

実装したソースは[Githubにあります](https://github.com/ZenryokuService/PracticeJava1/blob/master/PracticeJava1/src/jp/zenryoku/sample/lv3/Lv3_1_RefactorLv2_Main.java)。


本パートは以上になります。

フローチャートを書くときに、使用する技術についても考えることになれてきたのではないでしょうか？

次のパートでは、クラス図の作成に入ります。実装するクラスの輪郭を描くようなイメージです。

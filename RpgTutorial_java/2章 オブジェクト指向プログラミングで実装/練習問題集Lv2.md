# 練習問題集Lv.2(TrainingLv2)
Javaコードの練習をします。ちょっとしたヒントもあるので頑張って解いてみてください。

Javaの文法を覚えたけど、以下のような思いがあるときに使ってください。
* 本文の記載内容がわからない
* まだしっくりこない
* 基本をもっと理解したい
* JUnitを理解したい


### 注意書き
* この問題はすべてJUnitを使用して実装します。
    * 各問題は「lvXXTraing()」というメソッドで実装します
    * 別のやり方で「LvXXTraing」というクラスを作り、メインメソッドに実装してもよいです
    ```
    public class LvXXTraing {
      public static void main(String[] args) {
        // 問題の回答
      }
    }
    ```
* 各パッケージの関連は以下のように定義します。
* テストケースの作成も練習します。

> jp.zenryoku.practice.train2: 練習問題集の問題の回答クラス
> jp.zenryoku.practice.train2.cls: 練習問題集のテスト対象クラス

## この練習問題を行うときの前提
＜やり方サンプル＞
1. JUnitで実装する場合には以下のように作成します。
 - jp.zenryoku.practice.train.Lv1Traingクラスを作成
 - Lv1TraingにlvXXXTraing()メソッドを作成
2. Lv1Traingにメインメソッドを作成する
 - jp.zenryoku.practice.train.Lv1Traingクラスを作成
 - Lv1Traingにメインメソッドを作成する
 - Lv2Traingクラスを作成し、問題２を解く。。。

問題の中には「クラスを作成」という言葉を使います、この時には

jp.zenryoku.practice.train.clsにクラスを作成してください。

### 前もって作成するクラス
下のようなクラスを作成してください。
1. Parent
```java
package jp.zenryoku.practice.train2.cls.familly;

public class Parent {
	/** 家計 */
  public static int kakei = 1000;
	/** 苗字 */
	protected String lastName;
	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;
	/** 趣味・特技 */
	public String favorit;

	/** コンストラクタ */
	public Parent() {
		lastName = "tanaka";
		name = "takao";
		age = 50;
		favorit = "ケツで箸を割る";
	}

	/** 自己紹介 */
	public void say() {
    System.out.println(lastName + "と申します。");
		System.out.println("親です。名前は" + name + "です。年齢は" + age + "です。");
		System.out.println("特技は、「" + favorit + "」です。");
	}

	/** おかしな部分 */
	protected void funny() {
		System.out.println("喜びを真逆の言葉で表現する。");
	}

	/** 買い物 */
	public void buy(int money) {
		kakei -= money;
    System.out.println("残金：" + kakei);
	}
}
```
2. ChildAni
```java
package jp.zenryoku.practice.train2.cls.familly;

public class ChildAni extends Parent {
	/** 年齢 */
	private int age;
	/** 名前 */
	private String name;

	public ChildAni() {
		name = "taro";
		age = 12;
	}

	@Override
	public void say() {
    System.out.println(lastName + "です。");
		System.out.println("親です。名前は" + name + "です。年齢は" + age + "です。");
		System.out.println("特技は、「" + favorit + "」です。");
	}
}
```
3. ChildOtoto
```java
package jp.zenryoku.practice.train2.cls.familly;

public class ChildOtoto extends Parent {
	/** 年齢 */
	private int age;
	/** 名前 */
	private String name;

	public ChildOtoto() {
		name = "jiro";
		age = 10;
		favorit = "鼻を膨らます";
	}

	@Override
	public void say() {
    System.out.println(lastName + "といいます。");
		System.out.println("親です。名前は" + name + "です。年齢は" + age + "です。");
		System.out.println("特技は、「" + favorit + "」です。");
	}

  @Override
	public void funny() {
		super.funny();
	}  
}
```



## 問題
### 問題一覧
**基本レベル2の問題**

**確認ポイント**

クラスを継承した時に、フィールド変数の参照の仕方が「private」「protected」「public」で変わります。

継承した時に、クラス内のフィールド変数、親クラスのフィールド変数それぞれに参照することができるものが変わります。

これをコントロールするために、下のアクセス修飾子を使用して、アクセス可能な範囲を限定します。

* private: クラス内のみ参照可能
* protected: 継承関係のあるクラス、同じパッケージ内
* public: どのクラスからでも参照可能

## 基本レベル２
以下の核問題は、クラスの継承関係を作成した時に、フィールド変数へのアクセスがどのように行われるか？を確かめるための問題です。

下のようにクラス関係を作成して、**プログラムを実行しその挙動を確認**して見ましょう。

### Lv.1：ChildAniクラスのメソッドを動かす
**==問題==**
ChildAniクラスにParentクラスを継承してください(「前もって作成するクラス」で実装済み)。そして、ChildAniクラスからParentクラスのメソッド「say(), funny(), kakei()」を起動してください。



### Lv.2：ChildOtotoクラスのメソッドを動かす
**==問題==**
ChildOtotoクラスにParentクラスを継承してください(「前もって作成するクラス」で実装済み)。そして、ChildOtotoクラスからParentクラスのメソッド「say(), funny(), kakei()」を起動してください。

### Lv.3：クラスを拡張する
**==問題==**

ChildAniクラスをコピーしてChildLv3クラス作成し、以下のコードで次の出力を行うように**コンストラクタを実装**してください。

**==注意==**
* ChildLv3クラスにあるメソッド「say()」を修正しないようにしてください。
* ChildLv3クラスにあるコンストラクタを修正してください。

＜コード＞
```java
System.out.println("特技は、「" + favorit + "」です。");
```

＜出力＞
```
特技は、「ドジョウ掬い」です。
```

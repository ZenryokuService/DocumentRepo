# 1章：ようこそJavaの世界へ
## Javaによる開発の流れ
### 開発の流れ
①ソースコードの作成。
```
public class FirstCls {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

②コンパイル
javaファイルをclassファイルに変換することです。下のコマンドを使用します。
```
javac FirstCls.java
```

③実行
作成したクラスファイルを実行します。下のコマンドを使用します。
```
java FirstCls
```

## Javaプログラムの基本構造
### プログラムの骨格
「クラスの中にメソッドがある」
```
/** クラスの説明 */
public class クラス名 {
  /** メソッドの説明 */
  public static void main(String[] args) {
    // 何かしらの処理
  }
}
```

中かっこ「{」「}」で囲っている部分がそれぞれクラスの範囲、メソッドの範囲を決めている

上のさんぷるこーどでは「クラス名」クラスの中に「メインメソッド」がある

ちなみに、インデント(スペースやタブで位置をずらすこと)を入れないと、とても見にくい

何が見にくいというと、クラスの範囲と、メソッドの範囲を区別しずらいのです。

```
/** クラスの説明 */
public class クラス名 {
/** メソッドの説明 */
public static void main(String[] args) {
// 何かしらの処理
}
}
```
### mainメソッドの中身

* 上の骨格の「何かしらの処理」の部分に処理を描く。
* 処理は上から下へ進み、1行の中では左から右へ進む
* セミコロン「;」で1行が終わる
* ドット「．」は参照呼出し

```
public static void main(String[] args) {
  System.out.println("Hello World");
}
```
上のコードは、Systemクラスから変数「out」を呼び出し、メソッド「println」を呼び出している

**==変数の宣言と初期化==**
```
public static void main(String[] args) {
  // 変数の宣言
  int num;
  // 変数の代入
  num = 0;
  // 変数の初期化
  int age = 12;
  // 命令実行の文＝メソッドの呼び出し
  System.out.println("対象年齢は" + num + "～" + age + "です。");
}
```
* 「変数に値を代入するとき」は「＝」を使用する。
* 「命令の文」は「メソッド呼び出し」を行う

**==計算処理==**
```
public static void main(String[] args) {
  // 足し算
  int tashizan = 1 + 1;
  // 引き算
  int hikizan = 1-1;
  // 掛け算
  int kakezan = 1 * 1;
  // 割り算
  int warizan = 1 / 1;
}
```

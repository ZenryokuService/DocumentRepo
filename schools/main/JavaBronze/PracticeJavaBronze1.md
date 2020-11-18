# 第1章：Java 言語のプログラムの流れ
## ＜練習問題１－１＞
Javaの特徴として正しい説明はどれですか。２つ選択してください。
1. Windows上で作成したプログラムを再コンパイルせずにLiux上で実行することができる
2. JavaSEの基本ライブラリは無償であるが、グラフィックやネットワーク関連は有償で提供されている
3. 分散型アプリケーションを作成することができる
4. メモリ管理はプログラマが行う

## ＜練習問題１－２＞
社内で使用するアプリケーションをjava言語で開発することになりました。GUIでの操作ができるような独立型のアプリケーションを検討しています。使用すべきエディションはどれですか。
1. Java EE
2. Java SE
3. Java ME
4. Java DB
5. Java FX

## ＜練習問題１－３＞
百貨店向けにブラウザーべーするのショッピングサイト・アプリケーションを開発する必要があります。使用するべきエディションはどれですか。
1. Java SEのみ
2. Java EEのみ
3. Java SE および Java EE
4. Java SE および Java ME
5. Java ME および Java EE

## ＜練習問題１－４＞
JVMが行っていることとして正しい説明は、どれですか。１つ選択してください。
1. クラスファイルのロード
2. バイトコードの解釈
3. クラスの実行
4. アプリケーションのロギング
5. クラスファイルのアセンブル
6. ソースコードのコンパイル

## ＜練習問題１－５＞
クラスファイルの.に含まれるものは次のどれですか。２つ選択してください。
1. スクリプトコード
2. 実行コード
3. ソースコード
4. バイトコード

## ＜練習問題１－６＞
ソースファイルの作成規則として正しいものは次のうちどれですか。２選択してください。
1. ソースファイル名は、半角英数字のみ使用できる
2. 「3.java」というソースファイル名も使用できる
3. 拡張子はjavaもしくはJavaを使用する
5. ソースファイル内のインデントは、半角空白もしくはタブで行う
6. ソースファイル内のclass宣言は１つまでである

## ＜練習問題１－７＞
「Test.java」として次のファイルがあります。
```
class Test {
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
```

コンパイルの例として正しいものは何ですか。
1. javac Test
2. javac Test.java
3. javac Test.class
4. java Test
5. java Test.java
6. java Test.class

## ＜練習問題１－８＞
コンソール画面に出力するコードとしてただしいものはどれですか。
1. System.out.println(Test);
2. System.out.println('Test');
3. System.out.println(&Test);
4. System.out.println(100);
5. System.out.println("100");

## ＜練習問題１－９＞
main()メソッドの定義として正しいものは次のどれですか。１つ選択してください。
1. static void main(String[] args)
2. public void main(String args[])
3. public static void main(String[] args)
4. static main(String arg[])
5. public static void main(String args)

## ＜練習問題１－１０＞
次のコードが指定されているとします。
```
public class Foo {
  public staic void main() {
    System.out.println("Hello");
  }
}
```
1. コンパイルエラーが発生する
2. コンパイルは成功するが、実行時エラーが発生する
3. コンパイルは成功し、実行するとHelloを出力する
4. コンパイルは成功するが、何も出力しない


## 答え
1-1: A, C
1-2: B
1-3: D
1-4: A, B, C
1-5: D
1-6: B, D
1-7: B
1-8: D, E
1-9: B

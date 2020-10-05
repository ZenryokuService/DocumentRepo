# Javaを動かしてみよう
Javaは以下のように、コードの作成～コンパイル～実行と行います。
1. Javaコードを人力で書く(**人間が読める**ファイルができる)
2. コンパイルする(**人間が読めない**ファイルができる)
3. 作成したプログラム実行

## Hello World
まずは写経から入ります。以下のコードを書いて動かしてください。

```
public class FirstCls {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

実行方法は以下の通り
1. 上のコードを映してFirstCls.javaファイルを作成する
2. javacコマンドでクラスファイルを作成する  
    ```javac FirstCls.java```
3. javaコマンドで作成したクラスファイルを事項する  
    ```java FirstCls```

# Javaを動かしてみよう
Javaは以下のように、コードの作成～コンパイル～実行と行います。
1. Javaコードを人力で書く(**人間が読める**ファイルができる)
2. コンパイルする(**人間が読めない**ファイルができる)
3. 作成したプログラム実行

## コマンドプロンプトで実行
コマンドプロンプトを立ち上げてFirstCls.javaの圧ディレクトリに移動します。
1. エクスプローラーで(フォルダを)開き、上部のパスをコピーする ※ C:￥XXX￥CCCC
2. ウィンドウズボタン＋Rで表示されたテキストボックスに「cmd」と入力してエンターキー
3. 作成したFirstCls.javaがあることを確認
4. java -versionと入力してエンターキーを押下したときにJavaのバージョン情報が表示されることを確認
5. ```javac -encoding UTF-8 FirstCls.java``` とコマンドを入力してエンターキー
6. ```java FirstCls```とコマンドを入力してエンターキー


```
エンコーディングwindows-31jにマップできません
```

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

2. 「ウィンドウズボタン＋R」を押下してコマンドプロンプトを開く
![コマンドプロンプト](./img1/cmdImg.png)

2. javacコマンドでクラスファイルを作成する  
    ```
    javac FirstCls.java
    ```

3. javaコマンドで作成したクラスファイルを事項する  
    ```
    java FirstCls
    ```

## サンプルアプリ
1. 以下のZIPファイルをダウンロード
* [transformations.zip](https://docs.oracle.com/javase/jp/8/javafx/sample-apps/transformations.zip)

2. 展開後に/xylophone/src/xylophone/Xylophone.javaをEclipseプロジェクトにコピー、実行できるようにする

3. Eclipseプロジェクト/resporces/の下に/xylophone/src/xylophone/audioをコピー

4. 実行 ※エラーが出たら以下の部分を直してみる
Xylophone.java：67行目にエラーが出たとき
```
new AudioClip(Xylophone.class.getResource("audio/Note1.wav").toString());
```
の「audio/Note1.wav」を「/audio/Note1.wav」に修正してみる

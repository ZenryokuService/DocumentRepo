# 第3章：演算子と条件文(分岐文)
## ＜練習問題３－１＞
次のコードがあります。
```
public class Test {
  pblic static void main(String[] args) {
    int a = 2;
    short b = 4;
    System.out.print("10 + 3 * 2" + " ");
    System.out.print(++a * b++);
  }
}
```
コンパイルした結果として正しいものは次のどれですか。１つ選択してください。

1. コンパイルエラー
2. 26 8
2. 26 15
2. 16 8
2. 16 12
2. 16 15

## ＜練習問題３－２＞
次のコードがあります。
```
int n1 = 22, n2 = 67, n3 = 0, n4 = 47, n5 = 17, n6 = 50;
boolean b = true;
```
実行結果がtrueとなるコードはどれですか。

1. (n2 > n6) | b0
2. (b) && (n1 <= n4)
3. (n2 < n6) && (n4 >= n1)
4. (n3 < n5) || (n2 M= n1)
5. (n1 < n3) && (n5 != n4)
6. !(n1 < n3)  && (n5 != n4)

## ＜練習問題３－３＞
次の変数宣言があります。

char x = 5;

1. if (x == 5) {}
2. if (x = 5) {}
3. if (x == '') {}
4. if (x == 'x') {}

## ＜練習問題３－４＞
次のコードがあります。
```
class Test {
  public void main(String[] args) {
    int x = 5;
    int y = 10;
    String str = (z > y ? "hello" : "bye");
    System.out.println(str);
  }
}
```
コンパイル、実行した結果として正しいものは次のどれですか。１つ選択してください。

1. コンパイルエラー
2. 実行時エラー
3. hello
4. bye0
5. 何も表示されない

## ＜練習問題３－５＞
次のコードがあります。
```
class Test {
  public void main(String[] args) {
    boolean b = false;
    int i = 0;
    if (i++ > 5 && !b)
      i++;
    if (i > 0)
      b = true;

    System.out.println("b=" + b + " i=" + i);
  }
}
```
コンパイル、実行した結果として正しいものは次のどれですか。１つ選択してください。

1. コンパイルエラー
2. 実行時エラー
3. b = true i=2
4. b=false i=2
5. b=false i=0
6. b=true i=1

## ＜練習問題３－６＞
次のコードがあります。
```
class Test {
  public void main(String[] args) {
    boolean b = true;
    if (b = false) {
      System.out.println(b);
      System.out.println(b);
    }
  }
}
```
コンパイル、実行した結果として正しいものは次のどれですか。１つ選択してください。

1. コンパイルエラー
2. 実行時エラー
3. true
4. false
5. true
   true
6. false
   false

## ＜練習問題３－７＞
次のコードがあります。
```
class Test {
  public void main(String[] args) {
    String s = "100";
    s = s + 200;
    System.out.println(s);
  }
}
```
コンパイル、実行した結果として正しいものは次のどれですか。１つ選択してください。

1. 200
2. 100
3. 300
4. 1002000
5. コンパイルエラー
6. 実行時エラー

## ＜練習問題３－８＞

## ＜練習問題３－１０＞

## ＜練習問題３－１１＞

## ＜練習問題３－１２＞

## ＜練習問題３－１３＞

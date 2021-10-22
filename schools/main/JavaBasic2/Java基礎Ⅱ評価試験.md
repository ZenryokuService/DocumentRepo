# Java基礎Ⅱ 評価試験
■テスト実施方法
* 制限時間 70分(15:40~16:50) ※終了10分前にアナウンスします。
* ルール 変数名などの指定されている名称が異なる場合は減点とする。
* テストに対する回答は、Eclipseを使用して作成するソースファイルとする。
* Javaプロジェクト「java_kiso_test」に提出するファイルを作成してください。

最終的に実行した際に出力された文字列をテキストファイル「実行結果.txt」を作成し、コピペすること

* 提出ファイル
> ExamMain.java  
> ExamLogic.java  
> 実行結果.txt

## ■問題
1. 指定のプロジェクト内にパッケージ「java_kiso2.mains」と「java_kiso2.mains.logic」を作成してください。

2. 2で作成したパッケージ内にクラス「java_kiso2.mains.logic.ExamLogic」と「java_kiso2.mains.ExamMain」を作成してください。
  ただし、ExamMainクラスはmainメソッドを実装すること

3. ExamLogicクラス内に以下の処理を行うメソッド「printData」を作成してください。
 * 戻り値 なし
 * メソッド名 printData
 * 引数リスト String型 data
 * 【処理内容】
  仮引数dataの要素分繰り返して、標準出力に出力する。

4. ExamLogicクラス内に以下の処理を行うメソッド「printData」を作成してください。
 * 戻り値 なし
 * メソッド名 printData
 * 引数リスト ArrayList＜String>型 data
 * 【処理内容】
  仮引数listの要素分繰り返して、標準出力にに出力する、ただし改行しない。

5. ExamMainクラスのメインメソッドを以下のように作成し、実行してください。実行結果は「実行結果.txt」にコピペしてください。
 1. String型の配列**bango**を「"1", "2", "3", "4"」で初期化する。
 2. ArrayList<String>型のリストlistのインスタンスを作成する。
 3. listに「おおさ」「まのみ」「みはろ」「ばのみみ」を追加する。
 4. ExamLogic型の変数logicにExamLogicクラスをインスタンス化し代入する。
 5. ExamLogicのインスタンス・メソッドprintDataの引数にbangoを引数に渡す。
 6. ExamLogicのインスタンス・メソッドprintDataの引数にlistを引数に渡す。
 7. 現在の日時を次のフォーマットで表示「yyyy/MM/dd hh:mm:ss」

6. ExamLogicクラス内に以下の処理を行うメソッド「oneThrowTowTrueThreeFalse」を作成してください。
* 戻り値 boolean
* メソッド名 oneThrowTowTrueThreeFalse
* 引数リスト String型配列 data, ArrayList<String> list
* 【処理内容】
 1. dataの要素数分繰り返すfor文を作成する。
 2. もし、配列の値が"1"の場合、次の繰り返し処理を行う。
 3. もし、配列の値が"2"の場合、listの2番目の値を標準出力に出力。
 4. もし、配列の値が"3"の場合、listの3番目の値を標準出力に出力。
 5. もし、配列の値が"4"の場合、例外のメッセージに「想定外のエラーが起きました」を表示する例外を投げる
 6. trueを返却する

7.  ExamMainクラスのメインメソッドに、次の処理を追加してください。
 1. ExamLogicクラスのメソッド「oneThrowTowTrueThreeFalse」を呼び出す。
 2. 「oneThrowTowTrueThreeFalse」の処理で例外が投げられたときは、標準出力に「想定外のエラーが起きました」と出力
   ※ただし、「想定外のエラーが起きました」のみを表示する事(ArrayIndexOutOfBoundsExceptionなどのメッセージは表示させない)
 3. String型の変数regrexTestを「a1b2c3d」で初期化して、StringクラスのメソッドreplaceAllを使用して数字のみを削除 

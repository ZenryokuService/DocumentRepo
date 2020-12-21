## [PDOクラス関連]()

### [PDOStatement](https://www.php.net/manual/ja/pdostatement.fetch.php)
#### PDOStatement::fetch
PDOStatement::fetch — 結果セットから次の行を取得する


#### Uncaught Error: Call to a member function fetch() on bool in
このエラーは、データが取得できていない、もしくは実行したSQLにエラーがあるときに出るようなので。。。

1. 実行しているSQLが正しいか確認する→phpMyAdminなどでSQLを実行してみる。環境依存でSQL文を微妙に変更する必要がある場合がある
2. 実行したSQLでデータが取得できているか確認する。

#### PHP Invalid argument supplied for foreach() .. error
変数の中身が、オブジェクトだったり、配列だったりすることで出るメッセージ。
原因は「配列の形式ではない変数でforeach文を実行しようとしているから」

＜対応方法＞
変更前
```
foreach ($arr as $value) {
　　// hogehoge.
}
```
変更後: (array)を追加
```
foreach ((array)$arr as $value) {
　　// hogehoge.
}
```

## phpMyAdmin関連


#### Access denied; you need (at least one of) the SUPER privilege(s) for this operation
実行するユーザーとファイルに記述しているユーザー名が違うためにおこる。

1. 起動するユーザーを記述しているユーザー名に変更する
2. ファイルの タイ商業を削除する
＜修正内容＞
* ```/*!50013 DEFINER=```  と書いてある部分のユーザー名を修正する
具体的に。```/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */``` と記述している部分を
変更して````ユーザー名`@`ホスト名(localhostなど)``` のように修正する

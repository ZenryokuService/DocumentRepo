# MySQLの使い方
## 起動する
**mysql -u**：ユーザー指定でMｙSQLを起動する
例
```
mysql -u root
```
→ユーザー「root」でMySQLにアクセス、起動

## SQLファイルの実行
```
source XXX.sql
```

## CSVファイルをインポートする
＜実行するSQL＞
> LOAD DATA LOCAL INFILE "ファイル名"  
INTO TABLE テーブル名   
FIELDS TERMINATED BY '区切り文字'  
OPTIONALLY ENCLOSED BY '囲み文字';  

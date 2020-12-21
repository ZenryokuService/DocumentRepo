# HEROKUへデプロイする手順
[参照サイト](https://devcenter.heroku.com/)からページを進める形で作業を行う。

1. [HEROKUのアカウントを作成](https://signup.heroku.com/signup/dc)する
2. 各OS用のheroku CLIをダウンロード、インストール(Windowsで作業しているときはWindows)
```
heloku login # ログインするためのアカウントを作成しておく
```
ログイン後、Gitの操作と同じになるので、以下の手順を行う。
1. コミットするアプリのディレクトリを作成。
2. ルートディレクトリには、index.phpを配置する
3. ```git init``` コマンドでイニシャライズ
4. ```heroku git:remote -a``` コマンドでリモートリポジトリの作成
5. ```git add .``` もしくは```git add --all``` コマンドでローカルリポジトリにファイル追加
6. ```git commit -am "コメント"``` でコミット
7. ```git push heroku master``` でプッシュ、公開する

 

## Agileの考え方
* [リーンの考え方](https://programming-study.com/trouble/eliminate-waste-lean-software-development/)

# Laravel
[Laravel公式](https://readouble.com/laravel/8.x/ja/installation.html)
[参考ブログ](https://qiita.com/maruyama42/items/43d7029d7e00e587bf0b)

## インストール
1. [Composerのインストール](https://getcomposer.org/download/)

2. Laravelインストーラ
 > composer global require laravel/installer

3. プロジェクト作成
 > composer create-project --prefer-dist laravel/laravel blog

4. サーバー起動
 > php artisan serve


## そのほかのコマンド
バージョン確認
```
php artisan --version
```

## 設定
### アプリケーションキー
ComposerかLaravelインストーラを使ってインストールしていれば、php artisan key:generateコマンドが、あらかじめ設定しています。


通常、この文字列は３２文字にすべきです。キーは.env環境ファイルに設定されます。

もし、```.env.example```ファイルをまだ```.env```へコピーしていなければ、今すぐ行ってください。

アプリケーションキーが設定されていなければ、ユーザーセッションや他の暗号化済みデーターは安全でありません！

### Webサーバー
**Laravelはpublic/.htaccessファイルを用意しています。**

＜サンプル＞

```
Options +FollowSymLinks -Indexes
RewriteEngine On

RewriteCond %{HTTP:Authorization} .
RewriteRule .* - [E=HTTP_AUTHORIZATION:%{HTTP:Authorization}]

RewriteCond %{REQUEST_FILENAME} !-d
RewriteCond %{REQUEST_FILENAME} !-f
RewriteRule ^ index.php [L]
```

## ディレクトリ構成
### プロジェクトディレクトリ
#### appディレクトリ
appディレクトリは、アプリケーションのコアコードを配置します。このフォルダの詳細は、この後に説明します。しかし、アプリケーションの**ほとんど全部のクラス**は、このディレクトリの中に設定されることを覚えておいてください。
* [PSR-4オートローディング規約](https://www.php-fig.org/psr/psr-4/)
* **artisanコマンド**の確認方法： ```php artisan list make```
* 初期生成されていないディレクトリがある([ドキュメント](https://readouble.com/laravel/8.x/ja/structure.html))
#### bootstrapディレクトリ
bootstrapフォルダは、フレームワークの初期処理を行うapp.phpファイルを含んでいます。その中のcacheディレクトリは、初期処理のパフォーマンスを最適化するため、フレームワークが生成するルートやサービスのキャッシュファイルが保存されるフォルダです。

#### configディレクトリ
configディレクトリは名前が示す通り、アプリケーションの全設定ファイルが設置されています。全ファイルに目を通し、設定可能なオプションに慣れ親しんでおくのは良い考えでしょう。

#### databaseディレクトリ
databaseフォルダはデータベースのマイグレーションとモデルファクトリ、初期値設定（シーディング）を配置します。ご希望であれば、このディレクトリをSQLiteデータベースの設置場所としても利用できます。

#### publicディレクトリ
publicディレクトリには、アプリケーションへの全リクエストの入り口となり、**オートローディングを設定するindex.phpファイル**があります。また、このディレクトリにはアセット（画像、JavaScript、CSSなど）を配置します。

#### resourcesディレクトリ
resourcesディレクトリはビューやアセットの元ファイル（LESS、SASS、JavaScript）で構成されています。また、すべての言語ファイルも配置します。

#### routesディレクトリ
ディレクトリはアプリケーションの全ルート定義により構成されています。デフォルトでは、web.php、api.php、console.php、channels.phpファイルが含まれています。

* **web.phpファイル**  
RouteServiceProviderのwebミドルウェアグループに属するルートで構成します。このミドルウェアは、セッションステート、CSRF保護、クッキーの暗号化機能を提供しています。もしアプリケーションがステートレスではなく、RESTフルなAPIを提供しないのであれば、すべてのルートはweb.phpファイルの中で定義されることになるでしょう。

* **api.phpファイル**  
RouteServiceProviderのapiミドルウェアグループに属するルートで構成します。このミドルウェアはアクセス回数制限を提供しています。このファイル中で定義されるルートは、ステートレスであることを意図しています。つまり、これらのルートを通るアプリケーションに対するリクエストは、セッションステートにアクセスする必要がないように、トークンを使って認証されることを意図しています。

* **console.phpファイル**  
クロージャベースの全コンソールコマンドを定義する場所です。それぞれのコマンドのIOメソッドと連携するシンプルなアプローチを提供するコマンドインスタンスと、各クロージャは結合します。厳密に言えば、このファイルでHTTPルートは定義していないのですが、コンソールベースのエントリポイントを定義しているという点で、ルート定義なのです。

* **channels.phpファイル**  
アプリケーションでサポートする、全ブロードキャストチャンネルを登録する場所です。

#### storageディレクトリ
storageディレクトリにはコンパイルされたBladeテンプレート、ファイルベースのセッション、ファイルキャッシュなど、フレームワークにより生成されるファイルが保存されます。このフォルダはapp、framework、logsディレクトリに分かれています。appディレクトリはアプリケーションにより生成されるファイルを保存するために利用します。frameworkディレクトリはフレームワークが生成するファイルやキャッシュに利用されます。最後のlogsディレクトリはアプリケーションのログファイルが保存されます。

#### storage/app/publicディレクトリ
プロファイルのアバターなどのようなユーザーにより生成され、外部からアクセスされるファイルが保存されます。public/storageがこのディレクトリを指すように、シンボリックリンクを張る必要があります。リンクは、php artisan storage:linkコマンドを使い生成できます。

#### testsディレクトリ
testsディレクトリには皆さんの自動テストを配置します。サンプルのPHPUnitテストが最初に含まれています。各テストクラスはサフィックスとしてTestを付ける必要があります。テストはphpunitか、php vendor/bin/phpunitコマンドにより実行できます。

#### vendorディレクトリ
vendorディレクトリには、Composerによる依存パッケージが配置されます。


## ファイルの配置をまとめると
* View(表示するPHP): /resources/views
* パス設定(route): /route/web.php
* コントローラー配置先: /app/Http

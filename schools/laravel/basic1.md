
# 環境構築
Larabelのインストールとセットアップを行います。

## インストール
1. [PHPUnitのダウンロード](https://phar.phpunit.de/phpunit.phar)を行う
2. ダウンロードした.pharファイルをXAMPPのPHP実行パス（C:\xampp\php\）直下へコピー
3. phpunit.batというテキストファイルを作る
- * テキストエディタを開き、``` @php "%~dp0phpunit.phar" %* ``` を記述
- * コマンドプロンプトを開き ``` phpunit --version ``` と入力
![コマンド確認](./img/phpunit確認.png)

## PHPUnitの実行
PHPUnitのバージョン確認が出来たら、phpunit.xmlファイルのあるディレクトリで
次のようなコマンドを実行する ``` phpunit テストPHPのあるディレクトリまでのパス\テストファイル.php ```

## 基本その１
## デフォルトルート定義ファイル
Laravelの全ルートは、routesディレクトリ下に設置されている、ルートファイルで定義されます。

これらのファイルはフレームワークにより、自動的に読み込まれます。

routes/web.phpファイルで、Webインターフェイスのルートを定義します。

定義されたルートはwebミドルウェアグループにアサインされ、セッション状態やCSRF保護などの機能が提供されます。

routes/api.php中のルートはステートレスで、apiミドルウェアグループにアサインされます。

> ほとんどのアプリケーションでは、routes/web.phpファイルからルート定義を始めます。routes/web.php中で定義されたルートは、ブラウザで定義したルートのURLを入力することでアクセスします。たとえば、次のルートはブラウザからhttp://your-app.test/userでアクセスします。

## artisanコマンド
基本的にappフォルダー直下をルートとして実行する

#### バージョン確認
php artisan --version

#### ウェブサーバー起動
php artisan serve

#### コントローラー作成
php artisan make:controller クラス名

#### モデル作成(Modelディレクトリの下に作成する場合)
php artisan make:model Model/モデル名

```
use App\Http\Controllers\UserController;
// パターン１
Route::get('/user', [UserController::class, 'index']);

// パターン２
Route::get('/hello', 'HelloController@hello');

```

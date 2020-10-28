# 基本その１
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

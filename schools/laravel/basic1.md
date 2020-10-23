# 基本その１
## デフォルトルート定義ファイル
Laravelの全ルートは、routesディレクトリ下に設置されている、ルートファイルで定義されます。

これらのファイルはフレームワークにより、自動的に読み込まれます。

routes/web.phpファイルで、Webインターフェイスのルートを定義します。

定義されたルートはwebミドルウェアグループにアサインされ、セッション状態やCSRF保護などの機能が提供されます。

routes/api.php中のルートはステートレスで、apiミドルウェアグループにアサインされます。

> ほとんどのアプリケーションでは、routes/web.phpファイルからルート定義を始めます。routes/web.php中で定義されたルートは、ブラウザで定義したルートのURLを入力することでアクセスします。たとえば、次のルートはブラウザからhttp://your-app.test/userでアクセスします。

```
use App\Http\Controllers\UserController;

Route::get('/user', [UserController::class, 'index']);
```

# Tomcat in Eclipse with Servlet
Tomcatを使用して、HttpServletを使用した少しだけ低レベルなサーブレットを実装してみます。

### 具体的に・・・
下のようなイメージのアプリケーションを作成します。

・自分のPC上でアプリケーション・サーバーを動かす
・いつものブラウザで、アプリケーション・サーバーにアクセス
・指定したサーブレットクラスを動かす。
・新しいURLの指定し方やり方



## 環境構築(Eclipseのプロジェクト)
1. プロジェクトを新規で作成する
![新規プロジェクト作成](./img/newProjectForWeb.png)

![新規プロジェクト作成1](./img/newProjectForWeb2.png)

![新規プロジェクト作成2](./img/newProjectForWeb3.png)

2. 作成したプロジェクトにフォルダーを追加します。
「classesフォルダ」を作成すし以下のようにビルドパスに追加する
![新規プロジェクト作成3](./img/newProjectForWeb4.png)

![新規プロジェクト作成4](./img/newProjectForWeb5.png)

3. Serveltクラスを作成する

4. サーバーを追加する(Tomcat8.XXXX)
![新規プロジェクト作成5](./img/newProjectForWeb6.png)

![新規プロジェクト作成6](./img/newProjectForWeb7.png)

5. 作成したプロジェクトをサーバーに追加する
![新規プロジェクト作成7](./img/newProjectForWeb8.png)

6. サーバーを起動する。

7. 作成したサーブレットが動くことを確認。
![新規プロジェクト作成9](./img/newProjectForWeb9.png)

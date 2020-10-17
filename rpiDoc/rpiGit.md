# ラズベリーパイ(RPi)
小型のシングルボードコンピューターで、子供向けのプログラミング学習ように作成されたもの。

しかし、現実は大人も使用していろいろなものを作成している。
<iframe width="560" height="315" src="https://www.youtube.com/embed/aFBMbuT48OU" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

## インストール

# RPi + Git
ラズパイでGitを使用する

## やりたいこと
1. ラズパイが起動したら、Gitから最新のソースをPULL
  * [Git接続](../gitUsage/gitUsage.md)を行い、PULLできるようにしておく

2. PULLしたソースをビルド、起動JARを出力
  Mavenを使用して、POMファイルを使用してからJARファイルを出力する
  > mvn compile

3. 出力したJARファイルを起動


Wifiの設定:Wifi Setting

# spring-boot3-try

Spring-Bootで効率的なアプリケーション開発

## やりたいこと

* Spring-Bootを使った効率的な開発を行い、最低限必要な手順でアプリケーションを起動する
* JAVAだけがインストールされたマシンで、アプリケーションを起動する
* 起動時に自動でテーブルをcreateし、データをinsertしてから、アプリケーションが起動する
* ORマッパーはMyBatisを使う
* setter,getterは実装せず、lombokで生成する
* データ登録画面では、二重サブミット対策としてPRGパターンを使う
* アプリケーション開発は、Spring Initializrからデモアプリケーションをダウンロードして始める
* Mavenを使ったライブラリ管理（自動でjarをダウンロードして、クラスパスを通してくれる）
* spring-boot-devtoolsで、アプリ起動中にソースコードを修正して保存するだけで、自動的にビルドと再起動が行われ、アプリケーションに即時反映される

> [!TIP]
> さいきょうの二重サブミット対策  
> https://qiita.com/syobochim/items/120109315f671918f28d  
> 
> 【Java】Lombokで冗長コードを削減しよう  
> https://www.casleyconsulting.co.jp/blog/engineer/107/ 

> [!NOTE]
> ## SpringBootバージョンアップ2系⇒3系
> 
> Spring Boot 3の新機能を使ってみよう！ 2からアップグレードする手順、Observability機能、ネイティブイメージ化  
> https://eh-career.com/engineerhub/entry/2023/06/29/093000  
> 
> Spring Boot 2.7.x から 3.0.x へのアップデート  
> https://zenn.dev/red_frasco/articles/637280c126d959  
> 
> Spring Boot 3.0へのバージョンアップで発生した問題点と対応内容  
> https://techblog.zozo.com/entry/springboot-version-up-to-3  
> 
> Spring Boot 3.0 (Spring Framework6.0) へのアップデートで対応したこと  
> https://qiita.com/kazokmr/items/ae0b70cfbc06ec344c44  
> 
> Spring Boot 3.0へのアップデートのハマり所  
> https://speakerdeck.com/line_developers/findings-in-migrating-our-application-to-spring-boot-3-dot-0  
> 
> SpringBoot 2.7 to 3.0 アップデートまとめ  
> https://hirabay.net/?p=61  

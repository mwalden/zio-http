addSbtPlugin("ch.epfl.scala"       % "sbt-scalafix"              % "0.14.2")
addSbtPlugin("org.scalameta"       % "sbt-scalafmt"              % "2.5.4")
addSbtPlugin("pl.project13.scala"  % "sbt-jmh"                   % "0.4.7")
addSbtPlugin("com.timushev.sbt"    % "sbt-updates"               % "0.6.4")
addSbtPlugin("io.spray"            % "sbt-revolver"              % "0.10.0")
addSbtPlugin("com.github.sbt"      % "sbt-github-actions"        % "0.24.0")
addSbtPlugin("com.github.sbt"      % "sbt-ci-release"            % "1.9.2")
addSbtPlugin("dev.zio"             % "zio-sbt-website"           % "0.4.0-alpha.31")
addSbtPlugin("de.heikoseeberger"   % "sbt-header"                % "5.10.0")
addSbtPlugin("org.scoverage"       % "sbt-scoverage"             % "2.3.1")
addSbtPlugin("io.get-coursier"     % "sbt-shading"               % "2.1.5")
addSbtPlugin("com.github.cb372"    % "sbt-explicit-dependencies" % "0.3.1")
addSbtPlugin("org.scala-js"        % "sbt-scalajs"               % "1.18.2")
addSbtPlugin("org.portable-scala"  % "sbt-scalajs-crossproject"  % "1.3.2")
addSbtPlugin("com.thesamet"        % "sbt-protoc"                % "1.0.7")
addSbtPlugin("com.thesamet"        % "sbt-protoc-gen-project"    % "0.1.8")
addSbtPlugin("com.typesafe"        % "sbt-mima-plugin"           % "1.1.4")
addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings"          % "1.1.2")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.17"

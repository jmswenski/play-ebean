resolvers ++= DefaultOptions.resolvers(snapshot = true)
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % sys.props("project.version"))

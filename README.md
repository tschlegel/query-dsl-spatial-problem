# Query SQL Code Generation broken with QueryDsl 5.0.0

This minimal example repository shows that the generation of the Q classes with the apt-maven plugin is broken in version 5.0.0.

This code works when Spring Boot is downgraded to 2.5.7 that uses querydsl 4.4.0.


## How to execute the code

Checkout the code and run:

```
mvn generate-sources
```
 
## Error Message 

The error message is: `java.util.concurrent.ExecutionException: java.lang.RuntimeException: java.lang.IllegalArgumentException: com.querydsl.sql.Configuration is not registered` 

Full maven output with stacktrace:

```
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.example:query-dsl-spatial >--------------------
[INFO] Building query-dsl-spatial 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.2.0:clean (default-clean) @ query-dsl-spatial ---
[INFO] Deleting C:\Users\schlegti\IdeaProjects\demo\query-dsl-spatial\target
[INFO] 
[INFO] --- apt-maven-plugin:1.1.3:process (default) @ query-dsl-spatial ---
[ERROR] execute error
java.util.concurrent.ExecutionException: java.lang.RuntimeException: java.lang.IllegalArgumentException: com.querydsl.sql.Configuration is not registered
    at java.util.concurrent.FutureTask.report (FutureTask.java:122)
    at java.util.concurrent.FutureTask.get (FutureTask.java:191)
    at com.mysema.maven.apt.AbstractProcessorMojo.execute (AbstractProcessorMojo.java:346)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:957)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:289)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:193)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:566)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
    at org.codehaus.classworlds.Launcher.main (Launcher.java:47)
Caused by: java.lang.RuntimeException: java.lang.IllegalArgumentException: com.querydsl.sql.Configuration is not registered
    at com.sun.tools.javac.api.JavacTaskImpl.handleExceptions (JavacTaskImpl.java:163)
    at com.sun.tools.javac.api.JavacTaskImpl.doCall (JavacTaskImpl.java:100)
    at com.sun.tools.javac.api.JavacTaskImpl.call (JavacTaskImpl.java:94)
    at com.sun.tools.javac.api.JavacTaskImpl.call (JavacTaskImpl.java:72)
    at java.util.concurrent.FutureTask.run (FutureTask.java:264)
    at java.util.concurrent.ThreadPoolExecutor.runWorker (ThreadPoolExecutor.java:1128)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run (ThreadPoolExecutor.java:628)
    at java.lang.Thread.run (Thread.java:829)
Caused by: java.lang.IllegalArgumentException: com.querydsl.sql.Configuration is not registered
    at com.querydsl.codegen.AbstractModule.get (AbstractModule.java:99)
    at com.querydsl.sql.spatial.SpatialSupport.addSupport (SpatialSupport.java:58)
    at com.querydsl.codegen.AbstractModule.loadExtensions (AbstractModule.java:83)
    at com.querydsl.apt.DefaultConfiguration.<init> (DefaultConfiguration.java:283)
    at com.querydsl.apt.DefaultConfiguration.<init> (DefaultConfiguration.java:114)
    at com.querydsl.apt.jpa.JPAConfiguration.<init> (JPAConfiguration.java:83)
    at com.querydsl.apt.jpa.JPAAnnotationProcessor.createConfiguration (JPAAnnotationProcessor.java:42)
    at com.querydsl.apt.AbstractQuerydslProcessor.process (AbstractQuerydslProcessor.java:82)
    at com.sun.tools.javac.processing.JavacProcessingEnvironment.callProcessor (JavacProcessingEnvironment.java:985)
    at com.sun.tools.javac.processing.JavacProcessingEnvironment.discoverAndRunProcs (JavacProcessingEnvironment.java:901)
    at com.sun.tools.javac.processing.JavacProcessingEnvironment$Round.run (JavacProcessingEnvironment.java:1227)
    at com.sun.tools.javac.processing.JavacProcessingEnvironment.doProcessing (JavacProcessingEnvironment.java:1340)
    at com.sun.tools.javac.main.JavaCompiler.processAnnotations (JavaCompiler.java:1258)
    at com.sun.tools.javac.main.JavaCompiler.compile (JavaCompiler.java:936)
    at com.sun.tools.javac.api.JavacTaskImpl.lambda$doCall$0 (JavacTaskImpl.java:104)
    at com.sun.tools.javac.api.JavacTaskImpl.handleExceptions (JavacTaskImpl.java:147)
    at com.sun.tools.javac.api.JavacTaskImpl.doCall (JavacTaskImpl.java:100)
    at com.sun.tools.javac.api.JavacTaskImpl.call (JavacTaskImpl.java:94)
    at com.sun.tools.javac.api.JavacTaskImpl.call (JavacTaskImpl.java:72)
    at java.util.concurrent.FutureTask.run (FutureTask.java:264)
    at java.util.concurrent.ThreadPoolExecutor.runWorker (ThreadPoolExecutor.java:1128)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run (ThreadPoolExecutor.java:628)
    at java.lang.Thread.run (Thread.java:829)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.780 s
[INFO] Finished at: 2022-06-17T18:08:44+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal com.mysema.maven:apt-maven-plugin:1.1.3:process (default) on project query-dsl-spatial: java.lang.RuntimeException: java.lang.IllegalArgumentException: com.querydsl.sql.Configuration is not registered -> [Help 1]
[ERROR] 
``´

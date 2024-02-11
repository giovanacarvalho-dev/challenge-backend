2024-02-11T14:44:20.083-03:00  INFO 3014 --- [restartedMain] c.g.c.ChallengeBackendApplication        : Starting ChallengeBackendApplication using Java 21.0.2 with PID 3014 (/Users/giovanacarvalho/IdeaProjects/challenge-backend/target/classes started by giovanacarvalho in /Users/giovanacarvalho/IdeaProjects/challenge-backend)
2024-02-11T14:44:20.084-03:00  INFO 3014 --- [restartedMain] c.g.c.ChallengeBackendApplication        : No active profile set, falling back to 1 default profile: "default"
2024-02-11T14:44:20.241-03:00  INFO 3014 --- [restartedMain] o.s.cloud.context.scope.GenericScope     : BeanFactory id=5c9e99b2-292f-3fd6-adce-492f8fcd45cd
2024-02-11T14:44:20.317-03:00  INFO 3014 --- [restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2024-02-11T14:44:20.318-03:00  INFO 3014 --- [restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-02-11T14:44:20.318-03:00  INFO 3014 --- [restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.18]
2024-02-11T14:44:20.325-03:00  INFO 3014 --- [restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-02-11T14:44:20.325-03:00  INFO 3014 --- [restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 240 ms
2024-02-11T14:44:20.396-03:00  INFO 3014 --- [restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-02-11T14:44:20.585-03:00  INFO 3014 --- [restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 16 endpoint(s) beneath base path '/actuator'
2024-02-11T14:44:20.605-03:00  INFO 3014 --- [restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2024-02-11T14:44:20.612-03:00  INFO 3014 --- [restartedMain] c.g.c.ChallengeBackendApplication        : Started ChallengeBackendApplication in 0.559 seconds (process running for 310.909)
2024-02-11T14:44:20.614-03:00  INFO 3014 --- [restartedMain] .ConditionEvaluationDeltaLoggingListener : Condition evaluation delta:


==========================
CONDITION EVALUATION DELTA
==========================


Positive matches:
-----------------

   LogFileWebEndpointAutoConfiguration#logFileWebEndpoint matched:
      - Log File found logging.file.name app (LogFileWebEndpointAutoConfiguration.LogFileCondition)
      - @ConditionalOnMissingBean (types: org.springframework.boot.actuate.logging.LogFileWebEndpoint; SearchStrategy: all) did not find any beans (OnBeanCondition)


Negative matches:
-----------------

    None


Exclusions:
-----------

    None


Unconditional classes:
----------------------

    None




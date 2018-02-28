[![Build Status](https://travis-ci.org/KNIGHTMASTER/spring-zipkin-example.svg)](https://travis-ci.org/KNIGHTMASTER/spring-zipkin-example/)

# spring-zipkin-example
Example SpringBoot Application Integrated With Zipkin and Sleuth for Distributed Tracing

Zipkin Works as machine to collect logs from distributed service. and trace every single of it.
To enable Zipkin Server use `@ZipkinServer` your services.

Sleuth Works as client for Zipkin client
To enable Zipkin client use Bean `AlwaysSample` on your services.

### Zipkin Client
Zipkin Client running on port 8080. Hit at least once to feed log

### Zipkin Server
URL [http://localhost:9411/zipkin/](http://localhost:9411/zipkin/) will show Zipkin UI

### UI
<img src='https://github.com/KNIGHTMASTER/Resources/blob/master/ZIPKIN/zipkin-1.png'/>

### Trace
<img src='https://github.com/KNIGHTMASTER/Resources/blob/master/ZIPKIN/zipkin-2.png'/>
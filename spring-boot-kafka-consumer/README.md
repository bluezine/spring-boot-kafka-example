# spring-boot-kafka-consumer

## Step1 (Optional). Modify Configuration
If you need to change the settings
1. Open `src/main/resources/application.properties` 
2. Modify `spring.kafka.consumer.bootstrap-servers`

## Step2. Run
1. `./mvnw spring-boot:run`
2. Will wait for `producer` response
<img src="https://github.com/bluezine/spring-boot-kafka-example/raw/main/media/consumer_run.gif" />


## Step3. Run Producer
1. `spring-boot-kafka-producer`
2. `./mvnw test`
   <img src="https://github.com/bluezine/spring-boot-kafka-example/raw/main/media/consumer_response.gif" />
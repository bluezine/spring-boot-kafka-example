# spring-boot-kafka-example

## Step1. Download Apache kafka
1. Connect to `https://kafka.apache.org/downloads`
2. Download `Source Download` (In this example `kafka-2.8.0-src.tgz`)

## Step2. Compile kafka
1. Decompress source file
2. Change directory `cd ${Decompress sourcefile location}/kafka-2.8.0-src`
3. JAVA environment variable setting `export JAVA_HOME=...`
4. Run command `./gradlew jar -PscalaVersion=2.13.5`

## Step3. Run kafka server
1. Change directory `cd ${Decompress sourcefile location}/kafka-2.8.0-src/bin`
2. Run zookeeper server `./zookeeper-server-start.sh -daemon ../config/zookeeper.properties` (This action is necessary to execute kafka)
3. Run kafka server `./kafka-server-start.sh -daemon ../config/server.properties`

## Step4. Create topic
1. `./kafka-topics.sh --create spring --bootstrap-server localhost:9092` (If the Kafka configuration is the default, port is 9092)

## Step5. Run kafka consumer
1. Refers to `spring-boot-kafka-consumer`, which is a subproject of this project

## Step6. Run kafka producer
1. Refers to `spring-boot-kafka-producer`, which is a subproject of this project

## Result
1. Consumer run
   <img src="https://github.com/bluezine/spring-boot-kafka-example/raw/main/media/consumer_run.gif" />

2. Producer run
   <img src="https://github.com/bluezine/spring-boot-kafka-example/raw/main/media/producer.gif" />

3. Consumer response
   <img src="https://github.com/bluezine/spring-boot-kafka-example/raw/main/media/consumer_response.gif" />

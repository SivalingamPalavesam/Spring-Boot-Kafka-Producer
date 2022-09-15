# Spring-Boot-Kafka-Producer

Steps for the demo:
1. Create Spring Boot App with HelloController REST api
2.  KafkaConfig - Spring bean configuration
3.  Start Zookeeper, Kafka, Consumer client to test the app

1. Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

2. Start Kafka:
bin/kafka-server-start.sh config/server.properties

3. Create topic:bin/kafka-topics.sh --create --topic SampleTopic --bootstrap-server localhost:9092

4. Start consumer:
  bin/kafka-console-consumer.sh --topic SampleTopic --from-beginning --bootstrap-server localhost:9092


Reference:
https://kafka.apache.org/quickstart

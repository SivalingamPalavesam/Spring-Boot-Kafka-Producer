# Spring-Boot-Kafka-Producer

Steps for the demo:
1. Create Spring Boot App with HelloController REST api
2.  KafkaConfig - Spring bean configuration
3.  Start Zookeeper, Kafka, Consumer client to test the app

* Start the ZooKeeper service
1. Start Zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start the Kafka broker service
.\bin\windows\kafka-server-start.bat .\config\server.properties

STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
.\bin\windows\kafka-topics.bat --create --topic topic_demo --bootstrap-server localhost:9092

STEP 4: WRITE SOME EVENTS INTO THE TOPIC
.\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092

STEP 5:  READ THE EVENTS
.\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092
hello world
topic demo

Reference:
https://kafka.apache.org/quickstart

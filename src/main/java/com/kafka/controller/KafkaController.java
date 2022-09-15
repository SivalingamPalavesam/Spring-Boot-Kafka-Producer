package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/{message}")
public class KafkaController
{
	@Autowired
	private KafkaTemplate<String , String> kafkaTemplate;
	
	@GetMapping
	public String publish(@PathVariable("message") String PublishMessage)
	{
		kafkaTemplate.send("SampleTopic", PublishMessage);
		return "Message Published  :"+PublishMessage;
	}
}

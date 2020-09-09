package com.eden.transactionserver;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TransactionServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionServerApplication.class, args);
	}

	@Bean
	void topic() {
		TopicExchange topicExchange = new TopicExchange("trx-events");
	}
}





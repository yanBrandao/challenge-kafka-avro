package br.com.tapajos.challenge.kafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChallengeKafkaAvroApplication

fun main(args: Array<String>) {
	runApplication<ChallengeKafkaAvroApplication>(*args)
}

package com.graphql.webflux

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

private val logger: Logger = LoggerFactory.getLogger(Application::class.java)

fun main(args: Array<String>) {
	logger.info("graphql-webflux - STARTING THE APPLICATION")
	runApplication<Application>(*args)
	logger.info("graphql-webflux - APPLICATION STARTED")
}

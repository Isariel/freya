package de.d3adspace.freya

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * The central application featuring the eureka server used for service discovery.
 */
@SpringBootApplication
@EnableEurekaServer
class FreyaApplication

/**
 * The JVM entry method. Will run the SpringBootApplication.
 */
fun main(args: Array<String>) {

    runApplication<FreyaApplication>(*args)
}

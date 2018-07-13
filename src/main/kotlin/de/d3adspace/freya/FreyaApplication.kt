package de.d3adspace.freya

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class FreyaApplication

fun main(args: Array<String>) {
    runApplication<FreyaApplication>(*args)
}

package com.gmail.wizari.gamesbuilder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GamesBuilderApplication

fun main(args: Array<String>) {
	runApplication<GamesBuilderApplication>(*args)
	println("Hello, world!")
}

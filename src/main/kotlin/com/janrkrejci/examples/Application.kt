package com.janrkrejci.examples

import io.micronaut.runtime.Micronaut

object Application {

	@JvmStatic
	fun main(args: Array<String>) {
		Micronaut.build()
				.packages("com.janrkrejci.examples")
				.mainClass(Application.javaClass)
				.start()
	}
}


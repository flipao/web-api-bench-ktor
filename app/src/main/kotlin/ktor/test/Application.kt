package ktor.test

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
  println("Application module")
  routing {
    get ("/") {
      call.respondText("Hello, world!")
    }
  }
}

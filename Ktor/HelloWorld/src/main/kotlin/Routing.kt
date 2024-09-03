import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello, world!")
        }

        get("/about") {
            call.respondText("About Us")
        }
        get("/user") {
            val user = User(name = "John Doe", age = 30)
            call.respond(user)
        }
    }
}

@Serializable
data class User(val name: String, val age: Int)

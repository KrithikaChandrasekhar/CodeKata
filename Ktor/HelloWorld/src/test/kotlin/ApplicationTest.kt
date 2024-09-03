import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.testing.*
import kotlinx.serialization.Serializable
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    private fun Application.setupTestApplication() {
        install(Authentication) {
            basic(name = "John Doe") {
                realm = "Ktor Server"
                validate { credentials ->
                    if (credentials.name == "John Doe" && credentials.password == "password") {
                        UserIdPrincipal(credentials.name)
                    } else {
                        null
                    }
                }
            }
        }
        configureRouting()
    }

    private fun encodeCredentials(username: String, password: String): String {
        val credentials = "$username:$password"
        return java.util.Base64.getEncoder().encodeToString(credentials.toByteArray())
    }

    @Test
    fun testRoot() = testApplication {
        application {
            setupTestApplication()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Hello, world!", bodyAsText())
        }
    }

    @Test
    fun testAbout() = testApplication {
        application {
            setupTestApplication()
        }
        client.get("/about").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("About Us", bodyAsText())
        }
    }

    @Test
    fun testUser() = testApplication {
        application {
            install(ContentNegotiation) {
                json()
            }
            setupTestApplication()
        }
        client.get("/user").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("""{"name":"John Doe","age":30}""", bodyAsText())
        }
    }

    @Test
    fun testSecureWithAuth() = testApplication {
        application {
            setupTestApplication()
        }
        client.get("/secure") {
            header(HttpHeaders.Authorization, "Basic " + encodeCredentials("John Doe", "password"))
        }.apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("You are authenticated!", bodyAsText())
        }
    }
}

@Serializable
data class User(val name: String, val age: Int)

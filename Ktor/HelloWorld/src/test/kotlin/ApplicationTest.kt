import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        application {
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
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Hello, world!", bodyAsText())
        }
    }

    @Test
    fun testAbout() = testApplication {
        application {
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
        client.get("/about").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("About Us", bodyAsText())
        }
    }
}
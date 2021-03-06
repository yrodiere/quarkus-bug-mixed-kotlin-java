package io.quarkus.bugs

import io.quarkus.bugs.java.JavaComponent
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class KotlinService {

    @field: Inject
    lateinit var javaComponent: JavaComponent

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = javaComponent.hello()
}
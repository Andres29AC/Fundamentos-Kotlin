package com.coderLion.routes

import com.coderLion.Models.Usuario
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


private val usuarios = mutableListOf(
    Usuario(1, "Lionel", "Messi", "lionel45@hotmail.com"),
    Usuario(2, "Cristiano", "Ronaldo", "Ronaldo78@hotmail.com")
)
fun Route.userRouting(){
    route("/usuario"){
        get{
            if(usuarios.isNotEmpty()){
                call.respond(usuarios)
            }else{
                call.respondText("No hay usuarios registrados",status = HttpStatusCode.OK)
                //como los usuarios no estan autenticados ponemos pondremos Ok
                //porque no es un error de la aplicacion sino que no hay usuarios
                //registrados
            }
        }
        get("{id}"){
            val id = call.parameters["id"]?: return@get call.respondText(
                "No se encontro el id",
                status = HttpStatusCode.NotFound
            )
            val usuario = usuarios.find { it.id == id.toInt() } ?: return@get call.respondText(
                "Usuario con $id no encontrado",
                status = HttpStatusCode.NotFound
            )
            call.respond(usuario)
        }
        post{
            val usuario = call.receive<Usuario>()
            usuarios.add(usuario)
            call.respondText("Usuario guardado correctamente", status = HttpStatusCode.Created)
        }
        delete("{id}"){
            val id = call.parameters["id"]?: return@delete call.respondText(
                "No se encontro el id",
                status = HttpStatusCode.BadRequest
            )
            if(usuarios.removeIf { it.id == id.toInt() }){
                call.respondText("Usuario eliminado correctamente", status = HttpStatusCode.Accepted)
            }else{
                call.respondText("No se encontro el usuario", status = HttpStatusCode.NotFound)
            }
        }
    }

}
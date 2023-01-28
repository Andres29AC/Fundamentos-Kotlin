package com.coderLion.Models

import kotlinx.serialization.Serializable

@Serializable
data class Usuario(val id: Int, val nombre: String, val apellido: String, val email: String){


}
//Serializable es una interfaz que nos permite convertir
// objetos en JSON y viceversa
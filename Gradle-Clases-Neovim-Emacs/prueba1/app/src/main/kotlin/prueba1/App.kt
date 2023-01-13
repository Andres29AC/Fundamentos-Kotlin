
package prueba1


fun main () {
		//Variables mutables
		var x = 5
		println("x = $x")
		x = 7
		println("x = $x")
		//Variables inmutables
		val y = 5
		println("y = $y") //el simbolo $ sirve para concatenar
		//val sirve para declarar variables inmutables
		//Variables de tipo especificado
		var nombre: String = "Andre"
		var edad: Int = 24
		var sueldo: Double = 1000.23
		println("Nombre: $nombre, Edad: $edad, Sueldo: $sueldo")
		//Variable sin asignar un valor inicial
		var mensaje: String
		mensaje = "Feliz Año Nuevo 2023"
		println(mensaje)
		//Variables inmutables con listas:
		val paresList = listOf(2, 4, 6, 8)
		println("paresList: $paresList")
		//Imprimiendo el tipo 
		println("Tipo de paresList:" + paresList::class)
		//Imprimiendo el primer elemento
		println("paresList[0]: ${paresList[0]}")
		//Imprimiendo el ultimo elemento
		println("paresList[3]: ${paresList[3]}")
		//Imprimiendo el tamaño de la lista
		println("paresList.size: ${paresList.size}")
		//Tipos de datos numericos:
		val myByte: Byte = 8
		val myShort: Short = 16
		val myInt: Int = 32
		val myLong: Long = 64
		val myFloat: Float = 32.0F
		val myDouble: Double = 64.0
		println("myByte: $myByte")
		println("myShort: $myShort")
		println("myInt: $myInt")
		println("myLong: $myLong")
		println("myFloat: $myFloat")
		println("myDouble: $myDouble")
		println(myByte.toLong())
		println(myByte.toLong()::class)
		//Tipos de datos booleanos:
		val myBoolean: Boolean = true
		println("myBoolean: $myBoolean")
		//Metodos con String:
		val mensaInicio:String = "biembenidos"
		println(mensaInicio)
		println(mensaInicio.uppercase())
		println(mensaInicio.lowercase())
		println(mensaInicio.length)
		//TODO Utilizando comillas triples y interpolacion
		println("==================")
		val mensaje2:String = """
		   Primera,
			 clase con Kotlin
			 tipo de datos
		""".trimIndent()
		println(mensaje2)
		println("==================")
		val mensaje3:String = """
		   Primera,
			 clase con Kotlin
			 tipo de datos
		""".replaceIndent("- ")
		println(mensaje3)
		println("==================")
		val mensaje4:String = """
		   ||Primera,
			 ||clase con Kotlin
			 ||tipo de datos
		""".trimMargin("||")
		println(mensaje4)
		println("==================")
		val numero1 = 14.76
		val numero2 = 35.76
		var resultado:Double 
		resultado = numero1 + numero2
		println("Suma: $resultado")
		resultado = numero1 - numero2
		println("Resta: $resultado")
		resultado = numero1 * numero2
		println("Multiplicacion: $resultado")
		resultado = numero1 / numero2
		println("Division: $resultado")
		resultado = numero1 % numero2
		println("Modulo: $resultado")
		println("==================")
		//Concatenacion de Strings
		//Pokemon favorito
		val nombrePokemon = "Darkrai"
		val tipoPokemon = "Siniestro"
		val nivelPokemon = "100"
		val naturaleza = "Activa"
		val posicion = "Legendario"
		val impresion = nombrePokemon + " " + tipoPokemon + " " + nivelPokemon + " " + naturaleza + " " + posicion  
		println(impresion)
		println("Datos: $nombrePokemon $tipoPokemon $nivelPokemon $naturaleza $posicion")
		println("==================")
		//Ejemplo de Postfix y prefix
		var var1 = 10
		var var2 = 0
		println("var1 valor es $var1")
		println("var2 valor es $var2")
		var2 = var1++
		println("var1 valor es $var1")
		println("var2 valor es $var2")
		println("==================")
		//operadores de comparacion y asignacion
		val edadNovia = 22 
		if(edadNovia>=22){
			println("Gosuu")
		}else{
			println("No Gosuu")
		}
		println("==================")
		//Ejemplo de operadores logicos
		val edad2 = 18
		val sexo = "M"
		if(edad2>=18 && sexo=="M"){
			println("Eres mayor de edad y ya es legal")
		}else{
			println("Eres menor de edad y no es legal")
		}
		println("==================")
		//Ejemplos de conversion de tipo de datos
		//Conversion de String a Int
		val numeroAfortunado = "100"
		val converNumero= numeroAfortunado.toInt()
		println(converNumero)
		//Conversion de Int a String
		val numeroAfortunado2 = 600
		val converNumero2= numeroAfortunado2.toString()
		println(converNumero2)
		println(converNumero2::class)
		//Conversion de String a Double
		val numeroAfortunado3 = "100.5"
		val converNumero3= numeroAfortunado3.toDouble()
		println(converNumero3)
		//Conversion de Double a boolean
		val numeroAfortunado4 = 100.5
		val converNumero4 = numeroAfortunado4 == 100.5
		println(converNumero4)
		println(converNumero4::class)
		println("==================")
		//Ejemplo de operadores de rango
		//Rango de 1 a 10
		val rango1 = 1..10
		println(rango1)
		println("==================")
}







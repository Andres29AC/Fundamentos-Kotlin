
package clase2

fun main() {
		var precio = 25
		if(precio == 25) {
				println("El precio es $precio")
		} else {
				println("El precio no es $precio")
		}
		println("============================")
		var miEdad = 23
		var edadNovia = 22
		if(miEdad > edadNovia) {
				println("Mi edad es mayor que la de mi novia")
		} else if(miEdad == edadNovia) {
				println("Mi edad es igual que la de mi novia")
		} else {
				println("Mi edad es menor que la de mi novia")
		}
		println("============================")
		var nombre1 = "Andre"
		var nombre2 = "Andres"
		println(nombre1 == nombre2)
		println(nombre1.equals(nombre2))
		println("============================")
		var nombreUsuario1 = Persona("Andres")
		var nombreUsuario2 = Persona("Lion")
		println(nombreUsuario1 == nombreUsuario2)
		println(nombreUsuario1 != nombreUsuario2)
		println("============================")
		//TODO Utilizando When
		//When es como un switch
		val usuario = Usuario("Tokita", "Ohma","Niko")
		when(usuario.primerNombre) {
				"Tokita" -> println("Es el primer nombre es Tokita")
				"Ohma" -> println("Es el segundo nombre es Ohma")
				"Niko" -> println("Es el apellido")
				else -> println("No es Tokita Ohma Niko")
		}
		when{
				usuario.primerNombre == "Tokita" && usuario.segundoNombre == "Ohma" && usuario.apellido == "Niko" ->{
						println("Es Tokita Ohma Niko")
				}
				else -> println("No es Tokita Ohma Niko")
		}
		println("============================")
		//Uso de Enumeraciones
		val asignarTipo=TiposPokemon.siniestro
		val msg = when(asignarTipo){
				TiposPokemon.fuego -> "Es de tipo fuego"
				TiposPokemon.agua -> "Es de tipo agua"
				TiposPokemon.planta -> "Es de tipo planta"
				TiposPokemon.electrico -> "Es de tipo electrico"
				TiposPokemon.siniestro -> "Es de tipo siniestro"
				TiposPokemon.dragon -> "Es de tipo dragon"
				TiposPokemon.hielo -> "Es de tipo hielo"
				TiposPokemon.lucha -> "Es de tipo lucha"
				TiposPokemon.normal -> "Es de tipo normal"
				TiposPokemon.veneno -> "Es de tipo veneno"
				TiposPokemon.volador -> "Es de tipo volador"
				TiposPokemon.psiquico -> "Es de tipo psiquico"
				TiposPokemon.roca -> "Es de tipo roca"
				TiposPokemon.tierra -> "Es de tipo tierra"
				TiposPokemon.bicho -> "Es de tipo bicho"
				TiposPokemon.acero -> "Es de tipo acero"
				TiposPokemon.fantasma -> "Es de tipo fantasma"
				TiposPokemon.hada -> "Es de tipo hada"
				else -> "No es ningun tipo"
		}
		println(msg::class)
		println(msg)
		println("============================")
		//Uso de For
		val artesMarciales = listOf("Karate", "Taekwondo", "Judo", "Aikido", "Kung Fu", "Jiu Jitsu")
		for (arte in artesMarciales){	
				println(arte)
		}
		println("----------------------------")
		val lenguajesFuncionales = listOf("Kotlin", "Scala", "Haskell", "Erlang", "Clojure", "F#")
		for(lenguaje in lenguajesFuncionales){
		    println(lenguaje)
		}
		println("----------------------------")
		//TODO Utilizando until
		//until sirve para que el ultimo numero no se incluya
		val inicio = 1
		val fin = 10
		for(i in inicio until fin){
		    println(i)
		}
		println("----------------------------")
		//TODO Utilizando for con rangos
		val filas = 5
		for(i in 1..filas){
		    for(j in 1..i){
		        print("*")
		    }
		    println()
		}
		println("----------------------------")
		//TODO Utilizando for con rangos y step y downTo
		//step sirve para que el for se salte de 2 en 2
		//downTo sirve para que el for vaya de mayor a menor
		val inicio2 = 10
		val fin2 = 1
		for(i in inicio2 downTo fin2 step 2){
		    println(i)
		}
		println("----------------------------")
		//TODO Utilizando do while
		var vida = 100
		do{
		    println("Te quedan $vida puntos de vida")
		    vida -= 10
		}while(vida > 0)
		println("----------------------------")
		//TODO Utilizando forEach
		val armas = listOf("Espada", "Hacha", "Lanza", "Arco", "Ballesta")
		armas.forEach{arma -> println(arma)}
		//explicacion: armas.forEach{arma -> println(arma)}
		//armas.forEach es un metodo de la lista armas
		//arma es el parametro que recibe el metodo forEach
		//println(arma) es la accion que se realiza con el parametro
		println("For Each indexado")
		armas.forEachIndexed{indice, arma -> println("$indice - $arma")}
		println("----------------------------")
		//Utilizando operador ternario
		val nombreAlias = "Lion"
		val nombreReal = if(nombreAlias == "Lion") "Es verdad" else "No es verdad"
		println(nombreReal)
		println("----------------------------")
		//Uiilizando is
		//is es un operador que nos permite saber si un objeto es de un tipo determinado
		val nivelPeligrosidad:Any = 5
		if(nivelPeligrosidad is String){
				println("Eso es...")
				println(nivelPeligrosidad.javaClass.name)
		}else{
				println("Eso no es...")
				println(nivelPeligrosidad.javaClass.name)
		}
		println("============================")
}

class Persona(var nombre:String)

class Usuario(var primerNombre:String, var segundoNombre:String, var apellido:String)

enum class TiposPokemon{
		fuego, agua, planta,electrico,siniestro,psiquico,volador,dragon,hielo,roca,normal,veneno,acero,tierra,lucha,bicho,fantasma,hada
}












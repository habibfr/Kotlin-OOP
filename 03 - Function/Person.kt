class People{
  var firstName: String = ""
  var middleName: String? = null
  var lastName: String = ""

  fun sayHello(name: String){
    println("hello $name")
  }

  fun sayHello(fName: String, lName: String){
    println("hello $fName $lName")
  }

  fun run(){
    println("$firstName run")
  }

  fun getFullName(): String{
    return "$firstName $middleName $lastName"
  }
}

fun main(){
  val people1 = People();
  people1.firstName = "habib"
  people1.middleName = "fatkhul"
  people1.lastName = "rohman"
  people1.sayHello("budi")
  people1.sayHello("ceri", "cans")
  people1.run()
  println(people1.getFullName())
}
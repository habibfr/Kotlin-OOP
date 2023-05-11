// open to change this class become parents
open class Emoployee(var name: String){
  fun sayHello(name: String){
    println("hello $name, my name is ${this.name}")
  }
}

open class Manager(name: String) : Emoployee(name){
  fun sayManager(){
    println("hello saya manager ${this.name}")
  }
}

class VicePresident(name: String) : Manager(name){
  fun sayVP(){
    println("Vice President disini")
  }
}

fun main(){
  val manager1 = Manager("Habib");

  val emp1 = Emoployee("Budi")

  val vp1 = VicePresident("Api")

  manager1.sayManager()
  manager1.sayHello("Api")

  emp1.sayHello("Api")

  vp1.sayHello("Habib")
  vp1.sayManager()
  vp1.sayVP()
}

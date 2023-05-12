// interface
interface Intercation {
  val name: String
  fun sayHello(name: String)

  // fun with body
  fun sayHay(name: String){
    println("hay $name")
  }
}

// interface extend interface
interface Go : Intercation{
  fun go(){
    println("go")
  }
}

interface MoveA{
  fun move(){
    println("move A")
  }
}

interface MoveB{
  fun move(){
    println("move B")
  }
}

// implement interface
class Human(override val name: String) : Go, MoveA, MoveB{
  // should override 
  override fun sayHello(name: String){
    println("hello $name")
  }

  override fun move(){
    println("human move")
    // call fun interface with super
    super<MoveA>.move()
    super<MoveB>.move()
  }
}


fun main(){
  val name = Human("Habib")
  name.sayHello("Api")
  name.sayHay("Budi")
  name.go()
  name.move()
}

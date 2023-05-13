// data class
data class Product(val name: String, val price: Int, val category: String)

// sealed class
sealed class Operation(val name: String)
class Plus : Operation("Plus")
class Minus : Operation("Minus")

fun operation(n1: Int, n2: Int, operation: Operation) : Int{
  return when (operation){
    is Plus -> n1 + n2
    is Minus -> n1 - n2
  } 
}

// inner class 
class Boss(val name: String){
  inner class Employee(val name: String){
    fun sayHai(name: String){
      println("Hi $name, im ${this.name} and my boss is ${this@Boss.name}")
    }
  }
}

// anonymouse class
interface Action{
  fun action() : Unit
}

fun fireAction(action: Action){
  action.action()
}

// enum class
enum class Gender(val decs: String){
  MALE("male"), FEMALE("female");

  fun showDesc(){
    println("desc")
  }
}


fun main(){
  val mie = Product("Mie", 20, "Goblok")
  println(mie)
  
  // copy of data class
  val mie2 = mie.copy(price = 1000)
  println(mie2)

  // sealed class with when
  val hasil1 = operation(10, 1, Plus())
  val hasil2 = operation(10, 3, Minus())
  println(hasil1)
  println(hasil2) 

  // inner class
  val emp = Boss("Habib").Employee("Budi")
  emp.sayHai("Api")

  // anonymouse class
  fireAction(object: Action{
    override fun action(){
      println("Hello")
    }
  })

  // enum class
  val man = Gender.MALE
  val women = Gender.FEMALE
  val allGender: Array<Gender> = Gender.values()
  
  println(Gender.valueOf("MALE"))
  val womenFromString = Gender.valueOf("FEMALE")
  println(man)
  println(women)
  println(allGender.toList())
  man.showDesc()
  women.showDesc()
}

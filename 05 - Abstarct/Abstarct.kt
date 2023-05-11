// abstract class
abstract class Location(val name: String)

class City(name: String) : Location(name)

class Country(name: String) : Location(name)

// abstract properties dan function
abstract class Animal{
  abstract val name: String
  abstract fun run()
}

class Cat : Animal(){
  override val name: String = "Cat"
  override fun run(){
    println("${this.name} sedang berlari")
  }
}

fun main() {
  // abstract class
  // val city = City("city")

  // abstract properties & function
  val cat = Cat()
  cat.run()

}
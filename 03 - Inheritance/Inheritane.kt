// open to change this class become parents
open class Emoployee(var name: String){
  open fun sayHello(name: String){
    println("hello $name, my name is ${this.name}")
  }
}

open class Manager(name: String) : Emoployee(name){
  // fun sayManager(){
  //   println("hello saya manager ${this.name}")
  // }

  // final cant override by child
  final override fun sayHello(name: String){
    println("hello $name, my name is Manager ${this.name}")
  }
}

class VicePresident(name: String) : Emoployee(name){
  // fun sayVP(){
  //   println("Vice President disini")
  // }

  override fun sayHello(name: String){
    println("hello $name, my name is Vice President ${this.name}")
  }
}

class SuperManager(name: String) : Manager(name){
  // cant ovveride fun parents cause its fun is final
  // override fun sayHello(name: String){
  //   println("hello $name, my name is Vice President ${this.name}")
  // }
}

open class Shape{
  open var corner: Int  = -1

  open fun printName(){
    println("this is shape")
  }
}

class Rectangle : Shape(){
  override var corner: Int = 4

  // super keyword : to get value of parent
  val parentCorner: Int = super.corner
}

class Triangle : Shape(){
  override var corner: Int = 3

  override fun printName(){
    println("this is triangle")
    super.printName()
  }
}

fun main(){
  // inheritance
  // val manager1 = Manager("Habib");

  // val emp1 = Emoployee("Budi")

  // val vp1 = VicePresident("Api")

  // manager1.sayManager()
  // manager1.sayHello("Api")

  // emp1.sayHello("Api")

  // vp1.sayHello("Habib")
  // vp1.sayManager()
  // vp1.sayVP()

  // function overriding
  // val manager = Manager("Habib")
  // val emp = Emoployee("Budi")
  // val vp = VicePresident("Api")
  
  // manager.sayHello("Budi")
  // emp.sayHello("Api")
  // vp.sayHello("Habib")
  
  // properties overriding
  val shape = Shape()
  val rec = Rectangle()
  val tri = Triangle()

  // println(shape.corner)
  // println(rec.corner)
  // println(tri.corner)

  // super keyword
  println(rec.parentCorner)
  tri.printName()
}

class Student(val name: String){
  fun sayHello(name: String){
    // keyword this
    println("hello $name, my name is ${this.name}")
  }
}

fun main(){
  val student1 = Student("Habib")
  student1.sayHello("Budi")
}
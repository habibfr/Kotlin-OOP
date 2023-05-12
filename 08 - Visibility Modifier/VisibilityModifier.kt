// visibility modifier
// public, private, protected, interal
class Teacher(private val name: String, public val matkul: String){
  fun teach(){
    println("teach")
  }
}

class Mahasiswa(val name: String, private val age: Int)

// extension function
fun Mahasiswa.sayHello(name: String){
  println("Hello $name, my name is ${this.name}")

}

// extension properties
val Mahasiswa.upperCase : String
  get() = this.name.uppercase()

fun main(){
  val teach = Teacher("Habib", "IPA")
  // error - can't access private
  // teach.name
  // can access public matkul
  teach.matkul

  val mhs = Mahasiswa("Habib", 20)
  mhs.sayHello("Api")
  println(mhs.upperCase)

}
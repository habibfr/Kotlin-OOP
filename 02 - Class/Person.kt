// class with constructor
class Person(fname: String, mName: String, lName: String){
  var firstName: String = fname;
  var middleName: String? = mName
  var lastName: String = lName

}

// class with default value
class Car(brandName: String, year: Int = 2020){
  var brand: String = brandName
  var year: Int = year
}



fun main() {
  val person1 = Person("habib", "fatkhul", "rohman")
  println(person1.firstName)

  val car1 = Car("Avanza")
  println(car1.year)

  val car2 = Car("Mercedez", 2019)
  println(car2.brand + " " + car2.year)
}
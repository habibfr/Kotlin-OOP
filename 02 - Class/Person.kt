// class with constructor
class Person(fname: String, mName: String, lName: String){
  var firstName: String = fname;
  var middleName: String? = mName
  var lastName: String = lName

}

// class with default value
class Car(brandName: String, year: Int, name: String){
  
  // initialize blocker : block kode yang di run di class saat cons dibuat
  init{
    println("Car $brandName dibuat")
  }

  // secondary constructor
  constructor(brandName: String, name: String) : this(brandName, 2020, name){
    println("secondaru constructor 1")
  }

  // secondary constructor
  constructor(brandName: String) : this(brandName, ""){
    println("secondary constructor 2")
  }
  
  var brand: String = brandName
  var year: Int = year
  var name: String = name
}

class Address{
  var street: String = ""
  var city: String = ""
  var country: String = ""
  
  constructor(st: String, ct: String){
    street = st
    city = ct
  }

  constructor(st: String, ct: String, co: String) : this(st, ct){
    country = co
  }
}

// properties constructor
class User(var username: String, var password: String){

}


fun main() {
  // val person1 = Person("habib", "fatkhul", "rohman")
  // println(person1.firstName)

  // val car1 = Car("Avanza", "what")
  // println(car1.year)

  // val car2 = Car("Mercedez")
  // println(car2.brand + " " + car2.year)

  // val address = Address("malamb", "citys")
  // println(address.street)
  // println(address.city)
  // println(address.country)
  
  // val address2 = Address("tes", "ya", "yo")
  // println(address2.street)
  // println(address2.city)
  // println(address2.country)

  val user1 = User("Habib", "rahasia")
  val user2 = User("Budi", "rahasia123")
  
  println(user1.username)
  println(user1.password)
  println(user2.username)
  println(user2.password)
}
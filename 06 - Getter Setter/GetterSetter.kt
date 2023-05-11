class Note(title: String){
  var title: String = title

  get(){
    println("call get")
    return field
  }

  set(value){
    if(value.isNotBlank()){
      println("call set")
      field = value
    }
  }
}


fun main(){
  val note = Note("Nino")
  println(note.title)
  
  note.title = "Miku"
  println(note.title)
}
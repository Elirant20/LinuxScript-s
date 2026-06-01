fun main() {
  val hallo = listOf("Hello","Hallo","Hi")
  val answer = "Hey"
  for (right in hallo){
     if (right != answer){
       println("Youre not normal")
     }
     else {
       println("Youre normal")
     }
  }
}

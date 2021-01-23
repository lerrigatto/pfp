object E1Main extends App {
  val f1 = E1.comp(-10,10,_*2,_+1,_*3)
  val f2 = E1.comp2(-10,10,_*2,_+1,_*3)
  val f3 = E1.comp3(-10,10,_*2,_+1,_*3)
  
  println(f1(-100)+ " " + f2(-100)+ " " + f3(-100))
  println(f1(0)+ " " + f2(0)+ " " + f3(0))
  println(f1(100)+ " " + f2(100)+ " " + f3(100))
}

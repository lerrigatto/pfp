sealed abstract class Tree {
  def numNodi :Int = this match {
    case E() => 0
    case T(sx:Tree, _, dx:Tree) => 1 + sx.numNodi + dx.numNodi
  }

}
case class T(sx:Tree, root:Int, dx:Tree) extends Tree
case class E() extends Tree

object TreeMain extends App {

  val t = T( T(E(),10,E()), 20, E() ) // crea un albero con due foglie
  println(t.numNodi)
}

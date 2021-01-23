class Point(val x:Double, val y:Double) {
  val dist = Math.sqrt(x*x + y*y)
  def +(o:Point):Point = {
    new Point(x+o.x, y+o.y)
  }
  override def toString = "" + x + " | " + y
}

object Point {
  val PI = 3.14 // static final in java
  def apply(x:Double, y:Double) = new Point(x,y)
}

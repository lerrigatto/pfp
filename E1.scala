// dati a,b,f1,f2,f3: a,b ascisse su un piano cartesiano e f1,f2,f3 funzioni
// costruire la funzione composta lambda tc:
// lambda = f1 se <a, =f2 se a<=_<=b, =f3 se > b

object E1 { 
  def comp(a:Int, b:Int,
          f1:Int=>Int,
          f2:Int=>Int,
          f3:Int=>Int) = {

          def _comp(x:Int):Int = 
            if (x<a) f1(x) else
            if (x>b) f3(x) else f2(x)
          _comp _
  }

  def comp2(a:Int, b:Int,
          f1:Int=>Int,
          f2:Int=>Int,
          f3:Int=>Int) = {

          (x:Int) =>
            if (x<a) f1(x) else
            if (x>b) f3(x) else f2(x)
  }

  def comp3(a:Int, b:Int,
          f1:Int=>Int,
          f2:Int=>Int,
          f3:Int=>Int) = {

          (x:Int) =>
            x match {
              case x if ( x < a ) => f1(x)
              case x if ( x > b ) => f3(x)
              case _ => f2(x)
            }
  }
}

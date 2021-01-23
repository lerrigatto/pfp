def scalarProd(s:Seq[Double], t:Seq[Double]):Double = {
  (s zip t).foldLeft(0.0)((acc, pair) => acc + pair._1*pair._2)
}

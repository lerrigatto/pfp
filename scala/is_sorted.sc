def isSorted(l:List[Int]):Boolean = {
  l.sliding(2,1).forall(x => x(0) <= x(1))
}

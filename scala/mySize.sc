def mySize1(l:List[Int]):Int = {
  if (l == Nil) 0
  else 1+ mySize1(l.tail)
}

def mySize2[T](l:List[T]):Int = {
  if (l == Nil) 0
  else 1+ mySize2(l.tail)
}

def mySize3[T](l:List[T]):Int = l match{
  case Nil => 0
  case h::t => 1+mySize3(t)
}

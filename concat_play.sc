def raddoppia(l:List[Int]):List[Int] = { 
  if ( l == Nil ) Nil
  else 2*l.head :: raddoppia(l.tail)
  }
// you could also do l.map(_*2)


def merge(a:List[Int], b:List[Int]):List[Int] = {
  if ( a == Nil ) b
  else if ( b == Nil ) a
  else if (a.head < b.head) a.head :: merge(a.tail, b)
  else b.head :: merge(a,b.tail)
}

def mergeSort(l:List[Int]):List[Int] = {
  if (l.length < 2) l
  else {
    val (a,b) = l.splitAt(l.length/2)
    val sx = mergeSort(a)
    val dx = mergeSort(b)
    merge(sx,dx)
  }
}

def merge2(a:List[Int], b:List[Int]):List[Int] = (a,b) match {
  case (Nil,Nil) => Nil
  case (l, Nil) => l
  case (Nil, l) => l
  case (ha::ta, hb::tb) if (ha<hb) => ha :: merge2(ta,b)
  case (ha::ta, hb::tb)            => hb :: merge2(a,tb)
}

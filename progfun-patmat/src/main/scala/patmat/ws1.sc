package patmat

import Huffman._

object ws1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  println(times("maulwurfrohrdraenmaschine".toList))
                                                  //> List((m,2), (a,3), (u,2), (l,1), (w,1), (r,4), (f,1), (o,1), (h,2), (d,1), (
                                                  //| e,2), (n,2), (s,1), (c,1), (i,1))
                                                  
                                                 
  createCodeTree("maulwurfrohrdraenmaschine".toList)
                                                  //> res0: patmat.Huffman.CodeTree = Fork(Fork(Fork(Fork(Leaf(f,1),Leaf(o,1),List
                                                  //| (f, o),2),Fork(Leaf(d,1),Leaf(s,1),List(d, s),2),List(f, o, d, s),4),Fork(Fo
                                                  //| rk(Leaf(c,1),Leaf(i,1),List(c, i),2),Leaf(a,3),List(a, c, i),5),List(f, o, d
                                                  //| , s, a, c, i),9),Fork(Fork(Leaf(r,4),Fork(Leaf(m,2),Leaf(u,2),List(m, u),4),
                                                  //| List(r, m, u),8),Fork(Fork(Leaf(h,2),Leaf(e,2),List(h, e),4),Fork(Leaf(n,2),
                                                  //| Fork(Leaf(l,1),Leaf(w,1),List(l, w),2),List(n, l, w),4),List(h, e, n, l, w),
                                                  //| 8),List(r, m, u, h, e, n, l, w),16),List(f, o, d, s, a, c, i, r, m, u, h, e,
                                                  //|  n, l, w),25)
}
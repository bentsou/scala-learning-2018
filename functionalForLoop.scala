val xs = List(1,2,3,4)
val result = for (item <- xs) yield item + 1

println(result)

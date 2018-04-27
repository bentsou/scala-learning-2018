val xs = List(1, 2, 3, 4)
var result = List[Int]()

for (item <- xs) {
  result = result :+ (item + 1)
}

println(result)

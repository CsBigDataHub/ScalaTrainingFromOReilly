def add(x:Int, y:Int) = {
  x + y
}

def badAdd(x:Int, y:Int) {
  x + y
}

def addUnit(x:Int, y:Int):Unit = x + y

println(add(4,5))
println(badAdd(4,5))
println(addUnit(5,6))

def nonsense(a:Unit):Int = 40
println(nonsense(():Unit))
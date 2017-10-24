val `my greatedt gift in dollors` = 500 // we can have spaces when defining val or var when the are sorrounded Ticks(``)

//Valid OPCHAR
//OPCHAR is a unicode charater from \u0020-\u007F
// for more reading go to https://unicode.org/charts/PDF/U0000.pdf
//unicode symbol MATH
//https://www.fileformat.info/info/unicode/category/Sm/list.htm
//unicode symbol Other
//https://www.fileformat.info/info/unicode/category/So/list.htm

val isThisMySalaryPerYear_? = 5000
val thisShouldBeMyRaise_! = isThisMySalaryPerYear_? + 50000

// if you want to use keywords or a reserved word to define a variable you can use back ticks
val `import` = 10
println(`import`)

//**************

val `void` = 100
val `false` = true
val `return` = 90
println("******************")

if (`false`) println(`void`) else println(`void`)


//Older Java Style
val str = String.format("This is a %s", "Test")
println(str)

//Scala's style
val str2 = "This is a %s".format("Test")
println(str2)

println("Because you're %3$s, %2$s, %1$s times a lady".format("Three", "Twice", "Once"))

import java.time._
println("We will be eating lunch on %1$tB the %1$te in the year %1$tY.".format(LocalDate.now))
printf("We will be eating lunch on %1$tB the %1$te in the year %1$tY.", LocalDate.now)
println
println(LocalDate.now)
//please go through the below link to see the above formatting
//https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
import java.time.LocalDate
import java.time.format.DateTimeFormatter

import scala.util.Try

def getLocalDate(date: String): java.time.LocalDate = {
  val pattern1 = DateTimeFormatter.ofPattern("dd MMM, yyyy")
  val pattern2 = DateTimeFormatter.ofPattern("dd MMM yyyy")
  val pattern3 = DateTimeFormatter.ofPattern("yyyy-MMM-dd")
  val pattern4 = DateTimeFormatter.ofPattern("dd/MM/yyyy")
  val pattern6 = DateTimeFormatter.ofPattern("MM/dd/yyyy")
  val pattern5 = DateTimeFormatter.ISO_LOCAL_DATE

  val result = Try {
    LocalDate.parse(date, pattern1)
  } recover {
    case _ => LocalDate.parse(date, pattern2)
  } recover {
    case _ => LocalDate.parse(date, pattern3)
  } recover {
    case _ => LocalDate.parse(date, pattern4)
  } recover {
    case _ => LocalDate.parse(date, pattern5)
  }recover {
    case _ => LocalDate.parse(date, pattern6)
  }

  result.get
}
var d1 = "12/18/2010"
println(getLocalDate(d1))

//##########################

val dtFormat = new java.text.SimpleDateFormat("dd/MM/yyyy'T'HH:mm:ss")
println(dtFormat.format(new java.util.Date()))

println(dtFormat.parse("24/10/2018T19:20:21"))

println("we will be eating lunch on %1tB")

import java.time._
println("We will be eating lunch on %1$tB the %1$te in the year %1$tY.".format(LocalDate.now))
printf("We will be eating lunch on %1$tB the %1$te in the year %1$tY.", LocalDate.now)
println
println(LocalDate.now)
//please go through the below link to see the above formatting
//https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html

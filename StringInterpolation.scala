val a = 99
println(s"${a + 3} luftballons floating in the summer sky")

val ticketCost = 50
val bandName = "Psychedelic Furs"
println(f"The $bandName%s tickets are probably $$$ticketCost%1.2f")
// to explaion the above statement '$' is for parameter passing, and the reason for $$$ticketCost is since are using '$' to pass parameter and we want to get the money in $5000 format we need to use '$$' and %1.2  represents 1 digit and 2 decimal points

val percentIncrease = 20
val musicGenre = "New Wave"
println(f"The $bandName%s tickets are probably $$$ticketCost%1.2f%nThat's a $percentIncrease%% bump because everyone likes $musicGenre")

// similar to '$$' we need '%%'
println(f"""The $bandName%s tickets are probably $$$ticketCost%1.2f
            |That's a $percentIncrease%% bump because everyone likes $musicGenre""".stripMargin('|'))
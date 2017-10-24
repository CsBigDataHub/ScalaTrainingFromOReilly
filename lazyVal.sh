#!bin/sh
	exec scala "$0" "$@"
!#

// there is not such thing as lazy var only lazy val
lazy val a={println("evaluated");5}

println(a) // when you first call this val this will evaluate println statement and then assign 5 to val 'a'

println("****************")

println(a) // the secound time this will just give you 
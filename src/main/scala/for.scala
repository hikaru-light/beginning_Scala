object Delta {
	def pythagorean(): Unit = {
		for(a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000 if a*a == b*b + c*c) {
			println(a+"^2 = "+b+"^2 + "+c+"^2")
		}
	}
}


object Lst {
	def gen(): Unit = {
		for(x <- 1 to 1000) {
			val ls = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList match {
				case List(a, b, c, d, _) => List(a, b, c, d, a).mkString
			}
			
			println(ls)
		}
	}
}


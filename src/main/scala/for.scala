object Person {
	val age: Int = 5
	val isSchoolStarted: Boolean = false

	def main() = {
		if(0<age && age<7 && !isSchoolStarted) {
			println("baby")
		} else {
			println("not baby")
		}
	}
}


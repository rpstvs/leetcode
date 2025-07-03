package reverseinteger

func reverse(x int) int {
	y := x
	isNegative := false

	if x < 0 {
		y = -1 * y
		isNegative = true
	}

	reversed := 0
	for y > 0 {
		reversed = reversed*10 + y%10
		y /= 10
	}

	if reversed > 2147483648 || reversed < -2147483648 {
		return 0
	}

	if isNegative {
		return -1 * reversed
	}
	return reversed
}

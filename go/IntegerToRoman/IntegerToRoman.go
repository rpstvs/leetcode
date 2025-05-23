func intToRoman(num int) string {
	val := []int{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}
	sym := []string{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}
	roman := ""
	for i := 0; i < len(val); i++ {
		for num >= val[i] {
			num -= val[i]
			roman += sym[i]
		}
	}
	return roman
}
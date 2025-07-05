package romantointeger

func romanToInt(s string) int {
	romanTranslation := map[byte]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,
	}

	var year int
	for i := 0; i < len(s); i++ {

		if i+1 < len(s) && romanTranslation[s[i]] < romanTranslation[s[i+1]] {
			year -= romanTranslation[s[i]]

		} else {
			year += romanTranslation[s[i]]
		}

	}

	return year
}

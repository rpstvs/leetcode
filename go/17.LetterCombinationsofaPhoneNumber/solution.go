package main

func letterCombinations(digits string) []string {
	m := make(map[byte][]string)
	var sol []string

	m['2'] = []string{"a", "b", "c"}
	m['3'] = []string{"d", "e", "f"}
	m['4'] = []string{"g", "h", "i"}
	m['5'] = []string{"j", "k", "l"}
	m['6'] = []string{"m", "n", "o"}
	m['7'] = []string{"p", "q", "r", "s"}
	m['8'] = []string{"t", "u", "v"}
	m['9'] = []string{"w", "x", "y", "z"}
	i := 0
	for j, _ := range digits {
		i = j+1;
		if val, ok := m[digits[i]]; !ok {
			continue
		}
		if val2, ok := m[digits[j]]; !ok {
			continue
		}
		
	}

}

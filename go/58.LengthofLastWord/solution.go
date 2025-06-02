package main

func lengthOfLastWord(s string) int {

	endIndex := len(s) - 1

	for endIndex >= 0 && s[endIndex] == ' ' {
		endIndex--
	}
	startIndex := endIndex
	for startIndex >= 0 && s[startIndex] != ' ' {
		startIndex--
	}

	return endIndex - startIndex
}

func maxArea(height []int) int {
	rPointer := len(height) - 1
	lPointer := 0
	maxArea := 0
	for lPointer < rPointer {
		tmpMax := 0
		lengthArea := rPointer - lPointer
		if height[rPointer] > height[lPointer] {
			tmpMax = height[lPointer] * lengthArea
			lPointer++
		} else {
			tmpMax = height[rPointer] * lengthArea
			rPointer--
		}

		if tmpMax > maxArea {
			maxArea = tmpMax
		}

	}
	return maxArea
}


package majorityelement

func majorityElement(nums []int) int {
	freq := make(map[int]int)
	max := -999
	maxKey := 0

	for _, num := range nums {
		if _, exists := freq[num]; exists {
			freq[num]++
		} else {
			freq[num] = 1
		}

	}
	for k, v := range freq {
		if v > max {
			max = v
			maxKey = k
		}
	}
	return maxKey
}

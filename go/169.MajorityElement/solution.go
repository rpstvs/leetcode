package majorityelement

func majorityElement(nums []int) int {
	freq := make(map[int]int)
	max := len(nums) / 2
	maxKey := 0

	for _, num := range nums {
		if _, exists := freq[num]; !exists {

			freq[num] = 1
		} else {
			freq[num]++
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

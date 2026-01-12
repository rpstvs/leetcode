package containsduplicate

func containsDuplicate(nums []int) bool {
	hash := make(map[int]bool)

	for _, val := range nums {
		if _, ok := hash[val]; ok {
			return true
		}
		hash[val] = true
	}

	return false
}

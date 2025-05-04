package twosum

func twoSum(nums []int, target int) []int {
	var sol []int
	cenas := map[int]int{}

	for i, num := range nums {
		nums2 := target - num
		if v, ok := cenas[nums2]; ok {
			sol = append(sol, i, v)
		} else {
			cenas[num] = i
		}
	}
	return sol
}

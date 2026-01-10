package findclosestnumbertozero

func findClosestNumber(nums []int) int {
	i := 0
	j := 1
	res := 0
	if len(nums) == 0 {
		return 0
	}
	for j < len(nums) {
		tmp1 := abs(nums[i])
		tmp2 := abs(nums[j])

		if tmp1 > tmp2 {
			i = j
		}

		if tmp1 == tmp2 {
			if nums[i] < nums[j] {
				i = j
			}
		}

		res = nums[i]
		j++
	}
	return res
}

func abs(n int) int {
	if n < 0 {
		return -n
	}
	return n
}

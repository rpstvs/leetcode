package mediantwosortedarrays

func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
	i := 0
	j := 0
	final := []int{}
	for i < len(nums1) && j < len(nums2) {
		if nums1[i] < nums2[j] {
			final = append(final, nums1[i])
			i++
		} else {
			final = append(final, nums2[j])
			j++
		}
	}
	for i < len(nums1) {
		final = append(final, nums1[i])
		i++
	}
	for j < len(nums2) {
		final = append(final, nums2[j])
		j++
	}

	mid := len(final) / 2

	if len(final)%2 == 0 {
		return ((float64(final[mid-1]) + float64(final[mid])) / 2.0)
	}

	return float64(final[mid])
}

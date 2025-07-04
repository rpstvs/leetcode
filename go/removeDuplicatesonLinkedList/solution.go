package removeduplicatesonlinkedlist

func deleteDuplicates(head *ListNode) *ListNode {
	if head == nil {
		return head
	}

	h := head
	curr := head
	prev := head

	ocurrence := map[int]bool{}
	for curr != nil {
		if _, ok := ocurrence[curr.Val]; ok {
			prev.Next = curr.Next
			curr = curr.Next
			continue
		} else {
			ocurrence[curr.Val] = true
		}
		prev = curr
		curr = curr.Next
	}
	return h
}

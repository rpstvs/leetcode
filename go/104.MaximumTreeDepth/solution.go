package maximumtreedepth

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func maxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}

	left := maxDepth(root.Left)

	right := maxDepth(root.Right)

	if right < left {
		return 1 + left
	}
	return 1 + right

}

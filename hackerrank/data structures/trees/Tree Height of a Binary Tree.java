	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1 + (left>right?left:right);
    }
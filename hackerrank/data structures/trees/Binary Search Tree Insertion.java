 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        if (root == null) {
            Node newNode = new Node(data);
            newNode.left = null;
            newNode.right = null;
            root = newNode;
            return root;
        }
        if (data <= root.data) {
            if (root.left != null) {
                insert(root.left, data);
            } else {
                Node newNode = new Node(data);
                newNode.left = null;
                newNode.right = null;
                root.left = newNode;
            }
        }
        if (data > root.data) {
            if (root.right != null) {
                insert(root.right, data);
            } else {
                Node newNode = new Node(data);
                newNode.left = null;
                newNode.right = null;
                root.right = newNode;
            }
        }
        return root;
    }
	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    // public static void treeLvl(Node root, int level, HashMap<Integer, ArrayList<Integer>> map) {
    //     if (root == null) return;
    //     if (map.get(level) == null) {
    //         map.put(level, new ArrayList<Integer>());
    //     }
    //     map.get(level).add(root.data);
    //     treeLvl(root.left, level+1, map);
    //     treeLvl(root.right, level+1, map);
    // }
	// public static void levelOrder(Node root) {
    //   HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
    // treeLvl(root, 0, map);
    // for (ArrayList<Integer> i : map.values()) {
    //     for (int j=0; j<i.size(); j++) {
    //         System.out.print(i.get(j)+ " ");
    //     }
    // }
      
    // }

    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<Node>();

        q.add(root);
        while (q.peek() != null) {
            Node removedElement = q.remove();
            System.out.print(removedElement.data + " ");
            if (removedElement.left != null) q.add(removedElement.left);
            if (removedElement.right != null) q.add(removedElement.right);
        }
    }
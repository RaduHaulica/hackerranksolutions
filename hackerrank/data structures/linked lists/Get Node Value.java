    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode pointer = head;
        int n = 0;
        while (pointer != null) {
            pointer = pointer.next;
            n = n + 1;
        }
        n = n - positionFromTail -1;
        pointer = head;
        for (int i=0;i<n;i++) {
            pointer = pointer.next;
        }
        return pointer.data;
    }
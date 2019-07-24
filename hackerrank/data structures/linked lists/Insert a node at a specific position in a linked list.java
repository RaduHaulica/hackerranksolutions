    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode returnable = head;
        for (int i=0; i<position-1; i++) {
            head = head.next;
        }
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = head.next;
        head.next = newNode;
        return returnable;
    }
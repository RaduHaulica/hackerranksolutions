    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode returnable = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = null;
        if (head != null) {
            while (head.next != null) {
                head = head.next;
            }
            head.next = newNode;
        } else {
            returnable = newNode;
        }
        return returnable;
    }
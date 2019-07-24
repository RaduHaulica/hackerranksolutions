    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if (head == null) return head;
        DoublyLinkedListNode current = head, temp;
        while (current.next != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }
        current.next = current.prev;
        current.prev = null;
        return current;
    }
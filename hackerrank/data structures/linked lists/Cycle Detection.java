    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null) return false;
        SinglyLinkedListNode pointer, pointer2;
        pointer = head;
        pointer2 = head;
        while (pointer2 != null && pointer2.next != null) {
            pointer = pointer.next;
            pointer2 = pointer2.next.next;
            if (pointer == pointer2) return true;
        }
        return false;
    }
    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        // recursive
        if (head == null) return head;
        if (head.next == null) return head;
        SinglyLinkedListNode newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

        // if (head == null) {return null;}
        // if (head.next == null) {return head;}
        // SinglyLinkedListNode i = head, j = head.next, k = null;
        // head.next = null;
        // do {
        //     k = j.next;
        //     j.next = i;
        //     i = j;
        //     j = k;
        // } while (j.next != null);
        // j.next = i;
        // return j;
    }
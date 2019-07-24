

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        SinglyLinkedListNode aux;
        if (head1.data>head2.data) {
            aux = head1;
            head1 = head2;
            head2 = aux;
        }
        SinglyLinkedListNode newList = new SinglyLinkedListNode(head1.data);
        head1 = head1.next;
        SinglyLinkedListNode currentPointer = newList;
        while (head1 != null || head2 != null) {
            if (head1 == null) {
                currentPointer.next = head2;
                return newList;
            }
            if (head2 == null) {
                currentPointer.next = head1;
                return newList;
            }
            if (head1.data <= head2.data) {
                currentPointer.next = head1;
                currentPointer = currentPointer.next;
                head1 = head1.next;
            } else {
                currentPointer.next = head2;
                currentPointer = currentPointer.next;
                head2 = head2.next;
            }
        }
        return newList;
    }


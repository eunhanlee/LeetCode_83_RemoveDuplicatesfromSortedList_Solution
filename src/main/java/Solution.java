
public class Solution {
    /**
     * A method to delete duplicate nodes in a sorted linked list.
     *
     * @param head The head node of the given linked list.
     * @return The head node of the linked list with duplicates removed.
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void testNoDuplicates() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);

        ListNode result = solution.deleteDuplicates(head);

        assertIterableEquals(getNodeValues(expected), getNodeValues(result));
    }

    @Test
    public void testDuplicatesAtStart() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);

        ListNode result = solution.deleteDuplicates(head);

        assertIterableEquals(getNodeValues(expected), getNodeValues(result));
    }

    @Test
    public void testDuplicatesInMiddle() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);

        ListNode result = solution.deleteDuplicates(head);

        assertIterableEquals(getNodeValues(expected), getNodeValues(result));
    }

    @Test
    public void testDuplicatesAtEnd() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);

        ListNode result = solution.deleteDuplicates(head);

        assertIterableEquals(getNodeValues(expected), getNodeValues(result));
    }

    @Test
    public void testAllDuplicates() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);

        ListNode expected = new ListNode(1);

        ListNode result = solution.deleteDuplicates(head);

        assertIterableEquals(getNodeValues(expected), getNodeValues(result));
    }



    private List<Integer> getNodeValues(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        return values;
    }
}

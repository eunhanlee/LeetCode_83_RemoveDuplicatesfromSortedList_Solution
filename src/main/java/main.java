public class main {
    public static void main(String[] args){
        Solution tt= new Solution();

        ListNode temp = new ListNode(1);
        temp.next=new ListNode(1);
        temp.next.next=new ListNode(2);
        temp.next.next.next=new ListNode(3);
        temp.next.next.next.next=new ListNode(3);


        ListNode head=tt.deleteDuplicates(temp);

        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }


    }
}

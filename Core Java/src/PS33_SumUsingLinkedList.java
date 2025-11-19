class PS33_SumUsingLinkedList {

    public static void main(String[] args){


        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(4,l3);
        ListNode l1 = new ListNode(2,l2);


        ListNode l6 = new ListNode(4);
        ListNode l5 = new ListNode(6,l6);
        ListNode l4 = new ListNode(5,l5);

        ListNode node = addTwoNumbers(l1,l4);
        System.out.println(node.val);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuffer buffer = new StringBuffer();
        while(l1  != null){
            buffer.append(l1.val);
            l1 = l1.next;
        }



        StringBuffer buffer2 = new StringBuffer();
        while(l2  != null){
           buffer2.append(l2.val);
            l2 = l2.next;
        }

        int totalSum = Integer.parseInt(buffer.toString()) + Integer.parseInt(buffer2.toString());


        String s = String.valueOf(totalSum);
        StringBuffer s2 = new StringBuffer(s);
        s2.reverse();

        ListNode node3 = new ListNode(Integer.valueOf(s2.substring(2)));
        ListNode node2 = new ListNode(Integer.valueOf(s2.substring(1,2)),node3);
        ListNode node1 = new ListNode(Integer.valueOf(s2.substring(0,1)),node2);

        return node1;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
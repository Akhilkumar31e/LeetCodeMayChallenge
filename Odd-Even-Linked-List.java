/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode de=new ListNode(-1);
        ListNode od=new ListNode(-1);
        ListNode o=od;
        ListNode e=de;
        int i=1;
        //Separating even and odd indices into two links and then merging
        while(head!=null){
            if(i%2==0){
                de.next=head;
                de=de.next;
            }
            else{
                od.next=head;
                od=od.next;
            }
            head=head.next;
            i++;
        }
        de.next=null;
        od.next=e.next;
        return o.next;
    }
}
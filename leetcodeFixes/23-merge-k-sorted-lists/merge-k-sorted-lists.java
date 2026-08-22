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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode l : lists){
            if(l != null) pq.add(l);
        }

        ListNode node  = new ListNode(); // so we don't loose first node.
        ListNode tail  = node;  // tail keep track of last node in current list.
        while(!pq.isEmpty()){
            ListNode top = pq.poll();

            tail.next = top;
            tail = top;

            if(top.next != null){
                pq.add(top.next);
            }
        }
        return node.next;
    }
}
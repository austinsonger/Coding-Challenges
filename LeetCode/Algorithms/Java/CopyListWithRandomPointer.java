/*
 * A linked list is given such that each node contains an additional 
 * random pointer which could point to any node in the list or null.
 *
 * Return a deep copy of the list.
 */
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class CopyListWithRandomPointer {

    // O(n) time, O(1) space
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur = head;
        while (cur != null) {
            RandomListNode next = cur.next;
            cur.next = new RandomListNode(cur.label);
            cur.next.next = next;
            cur = next;
        }
        cur = head;
        while (cur != null) {
            if (cur.random != null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        cur = head;
        RandomListNode copy = head == null ? null : head.next;
        while (cur != null) {
            RandomListNode next = cur.next;
            cur.next = next == null ? null : next.next;
            cur = next;
        }
        return copy;
    }

/*******************************************************************/

    // O(n) time, O(n) space
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = 
            new HashMap<RandomListNode, RandomListNode>();
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode cur = head;
        RandomListNode cur1 = dummy;
        while (cur != null) {
            RandomListNode node = new RandomListNode(cur.label);
            map.put(cur, node);
            cur = cur.next;
            cur1.next = node;
            cur1 = cur1.next;
        }
        cur = head;
        cur1 = dummy.next;
        while (cur != null) {
            cur1.random = map.get(cur.random);
            cur = cur.next;
            cur1 = cur1.next;
        }
        return dummy.next;
    }

}

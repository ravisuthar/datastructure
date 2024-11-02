package neetcode.io;

/**
 * 206. Reverse Linked List
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,2]
 * Output: [2,1]
 * Example 3:
 * <p>
 * Input: head = []
 * Output: []
 */
//https://leetcode.com/problems/reverse-linked-list/
public class LeetCode0206_Easy_ReverseLinkedList {


    //1 2
    //2 1
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        while(null!=current){
            ListNode temp = current.next; // this is important.
            current.next=previous;
            previous=current;
            current=temp;
        }
        return previous;
    }

    public void add(){
        ListNode node = new ListNode(1);
        node.next=new ListNode(2);

        ListNode temp =reverseList(node);
        System.out.println(temp);
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

    public static void main(String[] args) {
        new LeetCode0206_Easy_ReverseLinkedList().add();
    }

}

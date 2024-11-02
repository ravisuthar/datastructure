package neetcode.io;

//https://leetcode.com/problems/merge-two-sorted-lists/description/

import dinesh.varyani.linkedlist.SinglyLinkedList;

/**
 * 21. Merge Two Sorted Lists
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 *Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */
public class LeetCode0021_Easy_MergeTwoSortedLists extends SinglyLinkedList {

    private static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        ListNode newList = new ListNode(0);
        ListNode currentPointer = newList;
        ListNode firstCurrentNode = list1;
        ListNode secondCurrentNode = list2;

        while(null!=firstCurrentNode && null!=secondCurrentNode){

            int a = firstCurrentNode.val;
            int b = secondCurrentNode.val;

            if(a==b){
                currentPointer.next=firstCurrentNode;
                currentPointer=currentPointer.next;
                firstCurrentNode=firstCurrentNode.next;

                currentPointer.next=secondCurrentNode;
                currentPointer=currentPointer.next;
                secondCurrentNode=secondCurrentNode.next;
            }else if(a<b){
                currentPointer.next=firstCurrentNode;
                currentPointer=currentPointer.next;
                firstCurrentNode=firstCurrentNode.next;
            }else{
                currentPointer.next=secondCurrentNode;
                currentPointer=currentPointer.next;
                secondCurrentNode=secondCurrentNode.next;
            }

        }

        while(null!=firstCurrentNode){
            currentPointer.next=firstCurrentNode;
            currentPointer=currentPointer.next;
            firstCurrentNode=firstCurrentNode.next;
        }

        while(null!=secondCurrentNode){
            currentPointer.next=secondCurrentNode;
            currentPointer=currentPointer.next;
            secondCurrentNode=secondCurrentNode.next;
        }





        return newList.next;

    }
}

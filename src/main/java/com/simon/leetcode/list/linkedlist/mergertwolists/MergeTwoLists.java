package com.simon.leetcode.list.linkedlist.mergertwolists;

/**
 * 将两个有序list元素轮流合并为一个新list
 *
 * @author zhaoyiwu
 * @create 2017-12-28 12:46
 *
 * 思路：
 * 先做非空判断，非空之后while循环，将list按大小
 **/
public class MergeTwoLists {

    /**
     *
     *  Input: 1->2->4, 1->3->4
     *  Output: 1->1->2->3->4->4
     */
    public  ListNode mergeTwoLists(ListNode l1,ListNode l2){

        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }//while
        if (l1 != null) {
            node.next = l1;
        }
        if (l2 != null) {
            node.next = l2;
        }
        return dummy.next;
    }


    public static void main(String[] args) {

        MergeTwoLists list=new MergeTwoLists();

        ListNode node1=new  ListNode(1);

        ListNode node2=new  ListNode(2);

        ListNode node3=new  ListNode(5);

        node2.next=node3;
        node1.next=node2;

        ListNode node4=new  ListNode(1);

        ListNode node5=new  ListNode(3);

        ListNode node6=new  ListNode(4);

        node5.next=node6;
        node4.next=node5;


        ListNode result=list.mergeTwoLists(node1,node4);

        System.out.println(result.val);
    }

}

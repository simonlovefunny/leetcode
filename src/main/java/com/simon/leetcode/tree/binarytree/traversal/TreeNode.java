package com.simon.leetcode.tree.binarytree.traversal;

/**
 * Definition for a binary tree node
 *
 * @author zhaoyiwu
 * @create 2018-03-02 11:14
 **/
public class TreeNode {

     int val;

     TreeNode left;

     TreeNode right;

     TreeNode(int x) { val = x; }

     public int getVal() {
          return val;
     }

     public void setVal(int val) {
          this.val = val;
     }

     public TreeNode getLeft() {
          return left;
     }

     public void setLeft(TreeNode left) {
          this.left = left;
     }

     public TreeNode getRight() {
          return right;
     }

     public void setRight(TreeNode right) {
          this.right = right;
     }
}

package com.simon.leetcode.tree.binarytree.traversal;

import java.util.*;

/**
 * 二分树算法
 *
 * @author zhaoyiwu
 * @create 2018-03-02 11:11
 **/
public class BinaryTreeSolution {


    //1.Given binary tree [1,null,2,3],return [1,2,3]
    // 前序遍历：根节点->左子树->右子树
    //      1
    //      \
    //       2
    //        \
    //         3

    public List<Integer> preorderTraversal(TreeNode root){

        //思路：从根节点开始递归，直到最下级叶子结点.使用栈结构先进后出的特点，先存左子树，后存右子树

        List<Integer> list= new ArrayList<Integer>();

        Stack<TreeNode> stack=new Stack();

        if(null != root){
            stack.push(root);
        }

        while(!stack.isEmpty()){

            TreeNode temp=stack.pop();

            list.add(temp.getVal());
            //先存左子树，再存右子树
            if(null != temp.getRight()){
                TreeNode right=temp.getLeft();
                stack.push(right);
            }

            if( null != temp.getLeft()){
                TreeNode left=temp.getLeft();
                stack.push(left);
            }
        }
        return list;
    }


//    2.Given a binary tree, return the inorder traversal of its nodes' values.
//     中序遍历 递归 左子树->根节点->右子树
//     如：
//             a
//           /   \
//         b      c
//       /  \
//      d    f
//     /      \
//    e        g
//   返回 [e,d,b,g,f,a,c]

//    public List<Integer> inorderTraversal(TreeNode root){
//
//        List<Integer> list= new ArrayList<Integer>();
//
//
//        Stack<TreeNode> stack=new Stack();
//
//        if(null == root){
//            return list;
//        }
//
//        while(!stack.isEmpty() || null != root){
//
//            if(root != null){
//                stack.push(root);
//                root=root.left;
//            }else{//左子树遍历完后再遍历右子树
//                root=stack.pop();
//                //将root节点放入list
//                list.add(root.val);
//                root=root.right;
//            }
//        }
//
//        return list;
//
//    }

    //递归实现
    public void inorderHelper(TreeNode root,ArrayList<Integer> res){

        if(null == root){
            return;
        }
        //遍历完左子树后->根节点->遍历右子树
        inorderHelper(root.left,res);
        res.add(root.val);
        inorderHelper(root.right,res);

    }

    public List<Integer> inorderTraversal(TreeNode root){

        ArrayList<Integer> list=new ArrayList<Integer>();

        if(null == root){
            return list;
        }

        inorderHelper(root,list);
        return list;
    }

    //3.Given a binary tree, return the postorder traversal of its nodes' values.
    //     后序遍历 递归 左子树->右子树->根节点
//     如：
//             a
//           /   \
//         b      c
//       /  \
//      d    f
//     /      \
//    e        g
//   返回 [e,d,g,f,b,a,c]

    /**
     * 递归实现
     */
    public static void postorderHelper(TreeNode root, ArrayList<Integer> re){
        if(root==null){
            return;
        }
        postorderHelper(root.left,re);
        postorderHelper(root.right,re);
        re.add(root.val);
    }
    public static ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        if(root==null){
            return re;
        }
        postorderHelper(root,re);
        return re;
    }

    //3.Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
    //     层级遍历
//     如：
//             a
//           /   \
//         b      c
//       /  \
//      d    f
//     /      \
//    e        g
//   返回 [a,b,c,d,f,e,g]

    //TODO
    public void levelorderHelper(TreeNode root, ArrayList<Integer> res){


    }

    public static ArrayList<Integer> levelorderTraversal(TreeNode root){

    }




    public static void main(String[] args) {

        TreeNode root=new TreeNode(5) ;
        TreeNode left=new TreeNode(3) ;
        TreeNode right=new TreeNode(2) ;
        TreeNode left1=new TreeNode(7) ;
        TreeNode left2=new TreeNode(8) ;
        TreeNode right1=new TreeNode(6) ;
        left1.setLeft(left2);
        left.setLeft(left1);
        left.setRight(right1);

        root.setLeft(left);
        root.setRight(right);

        ArrayList<Integer> res=new ArrayList<Integer>();

        res=postorderTraversal(root);

        System.out.println(123);

    }
}

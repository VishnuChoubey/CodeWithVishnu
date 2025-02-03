import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
    public TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
   } 
public class contest {
    public static void findlevel(TreeNode root,int key,int level,int[] store){
        if(root==null)return;
        if(root.val==key)store[0]=level;
        findlevel(root.left,key,level+1,store);
        findlevel(root.right,key,level+1,store);
        
    }
  
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        TreeNode root=new TreeNode(12);
        root.left=new TreeNode(8);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(11);
        root.left.right=new TreeNode(6);
       
        root.right.left=new TreeNode(5);
        root.right.left.right=new TreeNode(4);
        root.right.left.right.left=new TreeNode(3);
        root.right.left.right.left.right=new TreeNode(2);
        int key=3;
        int store[]=new int[1];
        findlevel(root,key,0,store);
        System.out.println(store[0]);

   }
}

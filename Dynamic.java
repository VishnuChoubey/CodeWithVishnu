// public class Dynamic {
//     public static int grid(int m,int n){
//         if(m==1&&n==1)return 1;
//         if(m<1||n<1)return 0;
//         int a=grid(m-1,n);
//         int b=grid(m,n-1);
//         return a+b;
//     }
//     public static void main(String[] args[]){
//         int m=5;
//         int n=5;
//         System.out.println(grid(m,n));
//     }
// }

// public class Dynamic{
//     public static void main(String args[]){
//         String str1="abcde";
//         String str2="acdes";
//         int[][] dp=new int[str1.length()+1][str2.length()+1];
//         for(int i=0;i<=str1.length();i++){
//             for(int j=0;j<=str2.length();j++){
//                 if(i==0||j==0)dp[i][j]=0;
//                 else if(str1.charAt(i-1)==str2.charAt(j-1)){
//                     dp[i][j]=1+dp[i-1][j-1];
//                 }
//                 else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
//             }
//         }
//         System.out.println(dp[str1.length()][str2.length()]);
//     }
// }

// public class Dynamic {
//     public static void main(String args[]) {
//         Object array[] = new Object[5];
//         int a = 5;
//         array[0] = 2;
//         array[1] = "hello";
//         array[2] = a;
//         for (int i = 0; i < array.length; i++) {
//             System.out.println(array[i]);
//         }
//     }
// }

// public class Dynamic{
//     public static void main(String args[]){
//         int array[]={2,4,6,8,12};
//         int first=0;
//         int key=3;
//         int last=array.length-1;
//         int ans=array.length;
//         while(first<=last){
//            int mid=(first+last)/2;
//            if(array[mid]>key){
//              last=mid-1;
//              ans=mid;
//            }
//            else{
//             first=mid+1;
//            }
//         }
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// public class Dynamic{
//     static class TreeNode{
//         int val;
//         TreeNode left,right;
//         public TreeNode(int val){
//             this.val=val;
//             this.right=this.left=null;
//         }
//         public TreeNode(int val,TreeNode left,TreeNode right){
//             this.val=val;
//             this.left=left;
//             this.right=right;
//         }
//     }
//     public static void print(TreeNode root){
//         if(root==null)return;
//         System.out.print(root.val+" ");
//         print(root.left);
//         print(root.right);
//     }
//     public static void main(String args[]){
//         Queue<TreeNode> q=new LinkedList<>();
//         int array[]={1,2,3,4,5,6,7};
//         TreeNode root=new TreeNode(array[0]);
//          q.offer(root);
//          int i=1;
//         while(!q.isEmpty()){
//             TreeNode temp=q.poll();
//             if(i<array.length){
//               temp.left=new TreeNode(array[i]);
//               q.offer(temp.left);
//             }
//             i++;
//             if(i<array.length){
//                 temp.right=new TreeNode(array[i]);
//                 q.offer(temp.right);
//             }
//             i++;
//         }
//         print(root);
//     }
// }

// import java.util.*;
// public class Dynamic{
//     public static void main(String args[]){
//         int array[]={7,8,9,1,2,3,4};
//         int low=0;
//         int high=array.length-1;
//         int ans=-1;
//         int max=Integer.MAX_VALUE;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(array[low]<=array[high]){
//                 max=Math.min(max,array[low]);
//             }
//             if(array[low]<=array[mid]){
//                 max=Math.min(max,array[low]);
//                 low=mid+1;
//             }
//             else if(array[mid]<=array[high]){
//                 max=Math.min(max,array[mid]);
//                 high=mid-1;
//             }
           
//         }
//         System.out.println(max);
//     }
// }

// import java.util.*;
// public class Dynamic{
//     public static void main(String args[]){
//      int array[]={1,2,3,4};
//      List<List<Integer>> list=new ArrayList<>();
//      for(int i=0;i<array.length;i++){
//         List<Integer> l=new ArrayList<>();
//         for(int j=i;j<array.length;j++){
//            l.add(array[j]);
//            list.add(new ArrayList<>(l));
//         }   
//      }
//      System.out.println(list);
//     }
// }

// import java.util.*;
// public class Dynamic{
//    public static void main(String args[]){
//       int n=13;
//       int count=0;
//       for(int i=0;i<5;i++){
//          int a=(n>>i)&1;
//         if(a==1)count++;
//       }
//       System.out.println(count);
//    }
// }

// import java.util.*;
// public class Dynamic{
//     public static void main(String args[]){
//         int array[]={2,4,6,7,7,9};
//         int low=0;
//         int key=7 ;
//         int high=array.length-1;
//         int ans=array.length;
//         while(low<=high){
//             int mid=(low+high)/2;
//             // if(array[mid]==key){
//             //  ans=mid;
//             //  break;
//             // }
//             if(array[mid]>key){
//              high=mid-1;
//              ans=mid;
//             }
//             else{
//                 low=mid+1;
                
//             }
//         }
//        System.out.println(array[ans]);
//     }
// }

// import java.util.*;
// public class Dynamic{
//     public static void main(String args[]){
//         int array[]={2,3,4,5,6};
//         int i=2;
//         int start=i;
//         do{
//             System.out.println(array[i]);
//             i=(i+1)%array.length;
//         }
//         while(i!=start);
//     }
// }

// import java.util.*;
// public class Dynamic{
//     public static void main(String args[]){
//         Stack<Integer> stk=new Stack<>();
//         stk.push(2);

//         stk.push(3);
//         stk.push(4);
//         stk.push(5);
//         for(int i=0;i<stk.size();i++){
//             System.out.println(stk.elementAt(i));
//         }
//     }
// }

// import java.util.*;
// public class Dynamic{
//     class Comparing implements Comparator<Integer>{
//         public int compare(Integer i1,Integer i2){
//             return i2.compareTo(i1);
//         }
//     }
//     public static void main(String args[]){
//         List<Integer> list=new ArrayList<>(){{
//             add(12);
//             add(13);
//             add(14);
//         }};
        
//         Dynamic dyna=new Dynamic();
//         Collections.sort(list,(a,b)->a.compareTo(b));
//         System.out.println(list);
//     }
// }

// import java.util.*;
// public class Dynamic{
//     public static void main(String args[]){
//         TreeSet<Integer> set=new TreeSet<>(){{
//             add(12);add(13);add(9);add(21);
//         }};
//        while(!set.isEmpty()){
//             int a=set.first();
//             System.out.println(a);
//             set.remove(a);
//         }
//     }
// }

// import java.util.*;
// public class Dynamic{
//     public static void printing(int ind,int[] array,List<Integer> ds,List<List<Integer>> list){
//         if(ind>=array.length)
//         list.add(new ArrayList<>(ds));
        
//         for(int i=ind;i<array.length;i++){
//             ds.add(array[i]);
//             printing(i+1,array,ds,list);
//             ds.remove(ds.size()-1);
//         }
//     }
//     public static void main(String args[]){
//       int array[]={0,1,2,3};
//       List<List<Integer>> list=new ArrayList<>();
//       printing(0,array,new ArrayList<>(),list);
//       System.out.println(list);
//     }
// }

import java.util.*;
public class Dynamic{
    public static void combination(int ind,List<String> list,String array[],StringBuilder sb){
        if(sb.length()==array.length){
            list.add(sb.toString());
            return;
        }
        String str=array[ind];
        for(int i=0;i<array.length;i++){
            sb.append(str.charAt(i));
            combination(ind+1,list,array,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String args[]){
        String[] array={"abc","def"};
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        combination(0,list,array,sb);
        System.out.println(list);
    }
}
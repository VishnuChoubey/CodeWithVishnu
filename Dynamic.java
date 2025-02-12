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

public class Dynamic{
    public static void main(String args[]){
        int array[]={2,4,6,8,12};
        int first=0;
        int key=3;
        int last=array.length-1;
        int ans=array.length;
        while(first<=last){
           int mid=(first+last)/2;
           if(array[mid]>key){
             last=mid-1;
             ans=mid;
           }
           else{
            first=mid+1;
           }
        }
        System.out.println(ans);
    }
}
import java.util.*;
public class chessGame {
    public static int dir(int m,int n,int i,int j){
        if(i==m&&j==n)return 1;
        if(i<0||j<0||i>=8||j>=8)return 10002;
        int a=1+dir(m,n,i-1,j-1); 
        int b=1+dir(m,n,i,j-1);
        int c=1+dir(m,n,i-1,j);
        int g=1+dir(m,n,i-2,j-1);
        int h=1+dir(m,n,i-1,j-2);
        int s=1+dir(m,n,i-1,j-1);
        int t=1+dir(m,n,i+1,j-2);
        int r=1+dir(m,n,i-2,j+1);
        int sum=Math.min(a,Math.min(b,Math.min(c,Math.min(g,Math.min(h,Math.min(s,Math.min(t,r)))))));
        return sum;

    }
    public static void main(String args[]){
        int arr[]=new int[1];
        arr[0]=Integer.MAX_VALUE-1;
        //dir(4,4,dp,arr);
        int srci=6;
        int srcj=6;
        int desti=7;
        int destj=7;
        System.out.println(dir(srci,srcj,desti,destj)-1);
    }
}

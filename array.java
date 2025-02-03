import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int temp=n+2;
        int sum=temp*(temp+1)/2;
        int count=1;
        int set=-1;
        int vis=0;
        for(int i=0;i<n;i++){
          if(array[i]!=count){
             set=count;
          }
          count++;
        }
        int r=0;
        for(int i=0;i<n;i++){
             r+=array[i];
        }
        System.out.println(set+" "+(sum-(r+set)));


    }
}

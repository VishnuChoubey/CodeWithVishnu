public class Dynamic {
    public static int grid(int m,int n){
        if(m==1&&n==1)return 1;
        if(m<1||n<1)return 0;
        int a=grid(m-1,n);
        int b=grid(m,n-1);
        return a+b;
    }
    public static void main(String[] args[]){
        int m=5;
        int n=5;
        System.out.println(grid(m,n));
    }
}

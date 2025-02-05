import java.util.*;

public class datastructure {
  public static boolean sum(int ind,int val,int array[]){
    if(ind==0){
      if(val==array[ind])return true;
      return false;
    }
    
    boolean nottake=sum(ind-1,val,array);
    boolean take=false;
    if(val>=array[ind]){
      take=sum(ind-1,val-array[ind],array);
    }
    return take||nottake;
  }
  public static void main(String args[]){
  int array[]={5,8,3,6,9,2};
  int val=7;
  System.out.println(sum(array.length-1,val,array));


  }
}

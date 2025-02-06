import java.util.*;

// public class datastructure {
//   public static boolean sum(int ind,int val,int array[]){
//     if(ind==0){
//       if(val==array[ind])return true;
//       return false;
//     }
    
//     boolean nottake=sum(ind-1,val,array);
//     boolean take=false;
//     if(val>=array[ind]){
//       take=sum(ind-1,val-array[ind],array);
//     }
//     return take||nottake;
//   }
//   public static void main(String args[]){
//   int array[]={5,8,3,6,9,2};
//   int val=7;
//   System.out.println(sum(array.length-1,val,array));


//   }
// }

// public class datastructure{
//   public static void main(String args[]){
//     List<Integer> list=new ArrayList<>();
//     int array[]={1,2,3,3,3,4,4,4,5,6,6};
//     int n= array.length;
//     int left=0;
//     list.add(array[0]);
//     for(int right=1;right<n;right++){
//          if(list.get(list.size()-1)!=array[right]){
         
//           list.add(array[right]);
//          }
//     }
//     for(int i:list){
//       System.out.println(i+" ");
//   }
//   }}


  public class datastructure{
    public static void main(String args[]){
      List<Integer> list=new ArrayList<>();
      int array[]={1,2,3,3,3,4,4,4,5,6,6};
      int n= array.length;
      int idx=0;
      for(int i=0;i<n;i++){
        boolean flag=false;
        for(int j=0;j<idx;j++){
             if(array[i]==array[j]){
              flag=true;
              break;
             }
        }
        if(!flag){
          array[idx++]=array[i];
        }
      }
      for(int i:array){
        System.out.println(i+" ");
      }
      
    }}
  

import java.util.Scanner;

public class tictactoe {
     static char[][] matrix={{' ',' ',' '},
    {' ',' ',' '},
    {' ',' ',' '}};
    static char currplayer='X';
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      while(true){
       display();
       System.out.println("Enter your choice");
      int row=sc.nextInt()-1;
      int col=sc.nextInt()-1;
      if(row<=0&&row>3||col>3&&col<=0){
        System.out.println("Invalid Input");
        break;
      }
      if(matrix[row][col]==' '){
        matrix[row][col]=currplayer;
        if(validity()){
            System.out.println("Congratulation You have won");
            display();
            break;
        }
        else{
            currplayer=(currplayer=='X')?'O':'X';
        }
      }
      else{
        System.out.println("Space is not empty");
        break;
      }
      


      }
    }
    public static void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(matrix[i][j]+" | ");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }
    public static boolean validity(){
        for(int i=0;i<3;i++){
            if((matrix[i][0]==currplayer&&matrix[i][1]==currplayer&&matrix[i][2]==currplayer)||(matrix[0][i]==currplayer&&matrix[1][i]==currplayer&&matrix[2][i]==currplayer)){
                return true;
            }
        }
        if((matrix[0][0]==currplayer&&matrix[1][1]==currplayer&&matrix[2][2]==currplayer)||(matrix[0][2]==currplayer&&matrix[1][1]==currplayer&&matrix[2][0]==currplayer)){
            return true;
        }
        return false;
    }
    
}

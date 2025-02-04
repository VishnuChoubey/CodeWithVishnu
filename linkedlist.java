import java.util.*;
class Node{
    char val;
    Node next;
    public Node(char val,Node next){
        this.val=val;
        this.next=next;
    }
    public Node(char val){
        this.val=val;
        this.next=null;
    }
    public Node(){}

}
public class linkedlist {
   
    
        public static Node func(Node head) {
            Node dummy = new Node('*');
            dummy.next = head;
            Node tail = head;
            Node prev = dummy;
            Node temp1 = dummy;
            String str = "aeiou";
            while(str.indexOf(tail.val) != -1&&tail!=null){
                    prev=tail;
                     temp1=prev;
                    tail=tail.next;
            }
           
           
            while (tail != null) {
                if (str.indexOf(tail.val) != -1) { // More efficient vowel check
                    prev.next = tail.next; // Remove from current position
                    Node s = tail;
                    tail = prev.next;
                    
                  
                    s.next = temp1.next;
                    temp1.next = s;
                    temp1 = temp1.next; 
                    
                } else {
                    prev = tail;
                    tail = tail.next;
                }
            }
            return dummy.next;
        }
    
    
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.val+"->");
            head=head.next;

        }
        System.out.println("null");
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Node head=new Node('s');
    head.next=new Node('a');
    head.next.next=new Node('u');
    head.next.next.next=new Node('k');
    head.next.next.next.next=new Node('c');
    head.next.next.next.next.next=new Node('i');
    head.next.next.next.next.next.next=new Node('o');
    head.next.next.next.next.next.next.next=new Node('h');
    head.next.next.next.next.next.next.next.next=new Node('i');
    Node head1=func(head);
    print(head1);

    }
}

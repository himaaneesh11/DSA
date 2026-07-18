package LinkedList;

public class ExerciseonDLL {
    DoubleNode head;
    DoubleNode tail;
    public void count(){
        int count=0;
        DoubleNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        /*
        * if tail is given then
        * temp=tail
        * while(tail!=null){
        * count++;
        * temp=temp.prevnode;
        * }*/
    }
    public Boolean Search(int value){
        DoubleNode temp=head;
        if(temp==null){
            System.out.println("The list is empty");
            return false;
        }
        while(temp!=null){
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
        /*
        * if(head==null){
        * return false}
        * while(head!=tail && head.prev!=tail){
        * if(head.data==value || tail.data==value){
        * return true;
        * }
        * head=head.next;
        * tail=tail.prev;
        * if(head==tail && head.data ==value){
        * return true;
        * }
        * return false;
        * }
        * */
    }

    public void reverseDLL(){
        DoubleNode temp=head;
        DoubleNode current=null;
        while(temp!=null){
            current=temp.prevnode;
            temp.prevnode=temp.next;
            temp.next=current;
            temp=temp.prevnode;
        }
        head=current.prevnode;

    }
    public Boolean DLLPalindrome(){
        if(head==null){
            System.out.println("The list is empty");
        }
        while(head!=null && head.prevnode!=tail){
            if(head.data!=tail.data){
                return  false;
            }
            head=head.next;
            tail=tail.prevnode;
        }
        return true;
    }
    public static void main(String[] args){

    }
}

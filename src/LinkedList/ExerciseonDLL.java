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
    public static void main(String[] args) {

    }
}

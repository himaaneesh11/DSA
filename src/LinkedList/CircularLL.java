package LinkedList;

public class CircularLL {
    Node head,tail;
    public void Insertaatabeggining(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        Node temp=head;
        newnode.next=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        head=newnode;
        /*
        * if both head and tail are present
        * \tail.next=newnode;
        * newnode.nett=head;
        * head=newnode;*/
    }
    public static void main(String[] args) {

    }
}

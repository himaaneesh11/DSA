package LinkedList;

public class DoublyCircularLL {
    DoubleNode head;
    DoubleNode tail;
    int size=0;
    public void Insertatbeggining(int data){
        DoubleNode newnode=new DoubleNode(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            head.next=newnode;
            head.prevnode=newnode;
            size++;
            return;
        }
        newnode.prevnode=tail;
        newnode.next=head;
        head.prevnode=newnode;
        tail.next=newnode;
        head=newnode;
        size++;
    }
    public void Traversal(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        DoubleNode temp=head;
     do{
         System.out.print(temp.data+"->");
         temp=temp.next;
     }while(temp!=head);
        System.out.print("END");
    }
    public static void main(String[] args) {
        DoublyCircularLL obj=new DoublyCircularLL();
        obj.Insertatbeggining(1);
        obj.Insertatbeggining(2);
        obj.Traversal();
    }
}

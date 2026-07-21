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
    public void Insertionatend(int data){
        DoubleNode newnode=new DoubleNode(data);
        if(head==null){
            Insertatbeggining(data);
        }
        newnode.next=head;
        tail.next=newnode;
        newnode.prevnode=tail;
        head.prevnode=newnode;
        tail=newnode;
        size++;
    }
    public void Insertionatposition(int data,int position){
        DoubleNode newnode=new DoubleNode(data);
        if(position<1 || position>size+1){
            System.out.println("Invalid position");
            return;
        }
        if(head==null || position==1){
            if(head==null) {
                System.out.println("List is empty");
            }
            Insertatbeggining(data);
            return;
        }
        if(position == size + 1){
            Insertionatend(data);
            return;
        }
        int curpos=1;
        DoubleNode temp=head;
        while(curpos<position){
            temp=temp.next;
            curpos++;
        }
        temp.prevnode.next=newnode;
        newnode.prevnode=temp.prevnode;
        newnode.next=temp;
        temp.prevnode=newnode;
        size++;
    }
    public static void main(String[] args) {
        DoublyCircularLL obj=new DoublyCircularLL();
        obj.Insertatbeggining(1);
        obj.Insertatbeggining(2);
        obj.Insertionatend(0);
        obj.Insertionatend(-1);
        obj.Insertionatposition(3,1);
        obj.Insertionatposition(99,6);
        obj.Traversal();
    }
}

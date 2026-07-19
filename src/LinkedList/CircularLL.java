package LinkedList;

public class CircularLL {
    Node head,tail;
    int size;
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
        size++;
        /*
        * if both head and tail are present
        * \tail.next=newnode;
        * newnode.nett=head;
        * head=newnode;*/
    }
    public void Insertionatend(int data){
        Node newnode=new Node(data);
        if (head==null){
            Insertaatabeggining(data);
            return;
        }
        tail.next=newnode;
        newnode.next=head;
        head=newnode;
        size++;
    }
    public void Insertaftervalue(int value,int data){
        Node newnode=new Node(data);
        if (head==null){
            Insertaatabeggining(data);
            return;
        }
        if(head.data==value){
            newnode.next=head.next;
            head.next=newnode;
            size++;
        }
        Node temp=head;
        do{
            if(temp.data==value){
                break;
            }
            temp=temp.next;

        }while(temp!=head);
        if(temp==head){
            System.out.println("No such value exist");
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }
    public void Insertbeforeposition(int value,int position){
        Node newnode=new Node(value);
        if(position<1 || position>size+1){
            System.out.println("Invalid position");
            return;
        }
        if (head==null || position==1){
            Insertaatabeggining(value);
            return;
        }

        int currpos=1;
        Node temp=head;
        while(currpos<position-1){
            temp=temp.next;
            currpos++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }
    public static void main(String[] args) {

    }
}

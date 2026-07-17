package LinkedList;

public class DoublyLinkedList {
    DoubleNode head=null,tail=null;
    int size;
    public void InsertionatBeggining(int data){
        DoubleNode newnode = new DoubleNode(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head.prevnode=newnode;
            head=newnode;
        }
        size++;
    }
    public void InsertatPosition(int data,int position){
        DoubleNode newnode = new DoubleNode(data);
        int currpos=1;
        if(position<0 || position>size+1){
            System.out.println("Position out of range");
        }

        if(position==1){
            InsertionatBeggining(data);
            return;
        }
        if(head==null){
            System.out.println("The List is Empty,So adding element at beggining");
            InsertionatBeggining(data);
            return;
        }
        DoubleNode temp=head;
        while(temp!=null) {
            if(currpos==position) {
                newnode.next = temp.next;
                temp.next.prevnode = newnode;
                temp.next = newnode;
                newnode.prevnode = temp;
                size++;
            }
            temp=temp.next;
            currpos++;
        }
    }
    public void InsertafterValue(int data,int value){
        DoubleNode newnode = new DoubleNode(data);
        if(head==null){
            System.out.println("There exist no such value !");
        }
        DoubleNode temp=head;
        while((temp!=null)&&(temp.data!=value)){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("There exist no such value !");
            return;
        }
        newnode.next=temp.next;
        newnode.prevnode=temp;
        if(temp.next!=null){
            temp.next.prevnode=newnode;
        }
        temp.next=newnode;
        size++;
    }
    public void traverse(){
        DoubleNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"");
            System.out.print("->");
            temp=temp.next;
        }
        System.out.print("END");
    }
    public void InsertatEnd(int data){
        DoubleNode temp=head;
        DoubleNode newnode = new DoubleNode(data);
        /*
        if tail is present
        tail.next=newNode;
        newNode.prvNode=tail;
        tail=newNode;*/
        if(head==null){
            InsertionatBeggining(data);
            return;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prevnode=temp;
        }
        size++;
    }

    public static void main(String[] args) {
        DoublyLinkedList obj=new DoublyLinkedList();
        obj.InsertionatBeggining(1);
        obj.InsertionatBeggining(2);
        obj.InsertionatBeggining(3);
        obj.InsertatEnd(0);
        obj.InsertatEnd(-1);
        obj.InsertionatBeggining(4);
        obj.InsertatPosition(99,3);
        obj.traverse();
        System.out.println("\nThe size of the list is "+obj.size);

    }
}

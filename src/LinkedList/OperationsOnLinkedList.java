package LinkedList;
public class OperationsOnLinkedList {
     Node head;
     Node tail;
     int size;
     public void insertatbeggining(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        if(tail==null){
            tail=newnode;
        }
        size++;
    }
    public void Deletefrombegginig(){
         if(head==null){
             System.out.println("The list is empty");
         }
        System.out.println("Deleted data is : "+head.data);
         head=head.next;
         size--;
         if(head==null){
             tail=null;
         }
    }
    public void Deletevalue(int value){
         if(head==null){
            System.out.println("The list is empty");
         }
         if(head.data==value){
             Deletefrombegginig();
             return ;
         }
         Node temp,prev;
         prev=null;
         temp=head;
         while((temp!=null)&&(temp.data!=value)){
             prev=temp;
             temp=temp.next;
         }
         if(temp!=null){
             prev.next=temp.next;
             size--;
         }
         else {
             System.out.println("No such node exist in list");
         }

    }
    public void Deletefromend(){
         if(head==null){
             System.out.println("The list is empty");
             return ;
         }
         if(head.next==null){
             tail=null;
             head=null;
             size--;
         }
         Node temp=head;
         while(temp.next.next!=null){
             temp=temp.next;
         }
         temp.next=temp.next.next;
         size--;


    }
    public void Deletefromposition(int pos){
         if(head==null){
             System.out.println("The list is empty");
         }
         if(pos==1){
             Deletefrombegginig();
             return;
         }
         if(pos<=0 || pos >size){
             System.out.println("Position is not valid");
         }
         int currpos=1;
         Node temp=head;
         while(currpos<pos-1){
             temp=temp.next;
             currpos++;
         }
         temp.next=temp.next.next;
         size--;
    }
    public void reverseLL(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null){
            System.out.println("Only one element in the list");
            return;
        }
        Node temp,prevNode=null,nextNode;
        temp=head;
        while(temp!=null){
            nextNode=temp.next;
            temp.next=prevNode;
            prevNode=temp;
            temp=temp.next;

        }
        head=prevNode;


    }

    public void insertatposition(int data,int position){
         Node newnode = new Node(data);

         if(head==null){
             if(position==1){
                 insertatbeggining(data);
                 return;
             }
         }
         if(position<=0 || position>size+1){
             System.out.println("Position out of bounds\nPosition not valid");
         }
         int currentposition=1;
         Node temp = head;
         while(currentposition<position-1){
             temp=temp.next;
             currentposition++;
         }
         newnode.next = temp.next;
         temp.next = newnode;

    }
    public void insertatend(int data) {
         Node newnode = new Node(data);
         tail=newnode;
        if(head==null){
            insertatbeggining(data);
            return;
        }
//        tail.next=newnode;
//        tail=newnode;
//        size++;
        Node temp;
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        size++;


    }
    public void insertatgivenvalue(int data,int value){
        Node newnode = new Node(data);
        Node temp=head;
        if(head==null){
            insertatbeggining(data);
            return;
        }
        while((temp.data!=value) && (temp!=null)){
            temp=temp.next;
        }
        if(temp!=null){
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
        }
        else{
            System.out.println("Value not found");
        }
    }
    public void traversal(){
        if (head == null){
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("End");

    }
    public static void main(String[] args) {
         OperationsOnLinkedList obj = new OperationsOnLinkedList();
         obj.insertatbeggining(10);
         obj.insertatbeggining(11);
         obj.insertatbeggining(12);
         obj.insertatbeggining(13);
         obj.insertatbeggining(14);
         obj.insertatend(9);
         obj.insertatposition(8,7);
         obj.insertatgivenvalue(77,12);
         obj.Deletefrombegginig();
         obj.Deletefromend();
         obj.traversal();
    }
}

































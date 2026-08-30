//insert at last position..
public class linkedList2{
    public static void main(String[] args){
        linkedList2 list =new linkedList2();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(1);
        list.insert(100,3);
        list.display();
    }
    private Node head;
    private Node tail;
    private int size;
    public linkedList2(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
        }
        else{
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
        }
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
        }
        else{
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node node=new Node(val,temp.next);
            temp.next=node;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int val;
        private Node next;
        private  Node(int val){
            this.val=val;
        }
         private  Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
}
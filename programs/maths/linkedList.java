class LinkedList{
	class Node{
		String data;
		Node next;
		public Node(String data){
			this.data=data;
			this.next=null;
			}
}
        Node head;
		public void addFirst(String data){
				Node newNode=new Node(data);
				if(head==null){
					head=newNode;
					}
				else{
					newNode.next=head;
					head=newNode;
					}
		}
		public void addLast(String data){
			Node newNode=new Node(data);
			if(head==null){
				head=newNode;
				return;
				}
				Node currNode=head;
				while(currNode.next!=null){
					currNode=currNode.next;
					}
					currNode.next=newNode;
				}
        public void deleteFirst(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            head=head.next;
        }
        public void deleteLast(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node secondLast=head;
            Node lastNode=head.next;
            while(lastNode.next!=null){
                secondLast=secondLast.next;
                lastNode=lastNode.next;
            }
            secondLast.next=null;
        }
		void display(){
			if(head==null){
				System.out.println("List is empty");
				return;
			}
			Node currNode=head;
			while(currNode!=null){
				System.out.print(currNode.data+"-->");
				currNode=currNode.next;
				}
                			System.out.println("null");
			}

	public static void main(String[] args){
			LinkedList list=new LinkedList();
			list.addFirst("Is");
			list.addLast("a");
			list.addFirst("List");
            list.display();
    }
}
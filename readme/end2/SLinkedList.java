class Node{
    Node next;
    int data;

    public Node(int data){
        this.data= data;
        this.next = null;
    }
}

public class SLinkedList {
    Node head;

    public SLinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(isEmpty()){
            System.out.println("list is empty!..");
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.print(currNode.data);
    }
    /*
    public void makeEmpty(){
        if(isEmpty()){
            System.out.println("list is already empty!..");
            return;
        }
        head = null;
    } */


    public void makeEmpty(){
        if(isEmpty()){
            System.out.println("list is already empty!..");
            return;
        }
        head = null;
    }

    /*    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        Node tempNode = head;
        head = newNode;
        head.next = tempNode;
    }
 */

    public void insertFirst(int data){
        Node newNode  = new Node(data);

        if(isEmpty()){
            head = newNode;
            return;
        }
        else{
            Node tempNode = head;
            head = newNode;
            head.next = tempNode;
        }
    }


    /*   public Node deleteLast(){
        if(isEmpty()){
            System.out.println("List is already empty!..");
            return null;
        }
        else if(head.next== null){
            Node tempNode = head;
            head = null;
            return tempNode;
        }
        Node currNode = head;
        Node prevNode = null;
        while(currNode.next != null){
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
        return currNode;
    } */

    public Node deleteLast(){
        if(isEmpty()){
            System.out.println("list is already empty");
            return null;
        }
        else if(head.next == null){
            Node tempNode = head;
            head = null;
            return tempNode;
        }

        Node currNode = head;
        Node prevNode = null;

        while(currNode.next != null){
            prevNode = currNode;
            currNode = currNode.next;
        }

        prevNode.next = null;
        return currNode;
    }

      public Node deleteFirst(){
        if(isEmpty()){
            System.out.println("list is already empty!..");
            return null;
        }
        Node temNode = head;
        head = head.next;
        return temNode;
    }

    public void reverse(){
        // SLinkedList listA = this;
        SLinkedList listB = new SLinkedList();
        while(!this.isEmpty()){
            listB.insertLast(this.deleteLast().data);
        }
        while(!listB.isEmpty()){
            this.insertFirst(listB.deleteLast().data);
        }
        
    }

}

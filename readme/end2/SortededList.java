// class Node{
//     Node next;
//     int data;

//     public Node(int data){
//         this.next = null;
//         this.data = data;
//     }
// }

public class SortededList{
    Node head;

    public SortededList(){
        head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        else if(head.data>data){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            if(currNode.data<=data && currNode.next.data>=data){
                // Node tempNode = currNode;
                // currNode.next = newNode;
                // newNode.next = tempNode;
                newNode.next = currNode.next;
                currNode.next = newNode;
                return;
            }
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty!..");
            return;
        }
        Node currNode = head;
        System.out.print(currNode.data + " ");
        while(currNode.next != null){
            System.out.print(currNode.next.data + " ");
            currNode = currNode.next;            
        }
    }

    public Node deleteLast(){
        if(isEmpty()){
            System.out.println("list is empty!..");
            return null;
        }
        Node currNode = head;
        Node prevNode = null;
        while(currNode.next!=null){
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
        return currNode;
    }

    public Node deleteFirst(){
        if(isEmpty()){
            System.out.println("list is empty!..");
            return null;
        }
        // if(head.next== null){
        //     Node temp = head;
        //     head = null;
        //     return temp;
        // }
        Node temp = head;
        head = head.next;
        return temp;
    }

    public void merge(SLinkedList list2){
        while(!list2.isEmpty()){
            this.insert(list2.deleteFirst().data);
        }
    }
    public static void main (String args[]){
        SortededList sList = new SortededList();
        sList.insert(5);
        sList.insert(3);
        sList.insert(4);
        sList.insert(7);
        sList.insert(12);
        sList.insert(2);
        sList.insert(3);

        sList.printList();
        System.out.println();
        System.out.println(sList.deleteLast().data);
        System.out.println(sList.deleteLast().data);
        System.out.println(sList.deleteLast().data);
        System.out.println(sList.deleteLast().data);
        // System.out.println(sList.deleteFirst().data);
        // System.out.println(sList.deleteFirst().data);
        System.out.println();
        sList.printList();

        SortededList sList2 = new SortededList();
        sList2.insert(6);
        sList2.insert(4);
        sList2.insert(5);
        sList2.insert(9);
        sList2.insert(22);
        sList2.insert(8);
        sList2.insert(7);

        SLinkedList list1 = new SLinkedList();
        System.out.println("list is Empty? " + list1.isEmpty());
        list1.insertLast(4);
        list1.insertLast(16);
        list1.insertLast(22);
        list1.insertLast(8);
        list1.insertFirst(6);

        list1.printList();
        System.out.println();
        sList.printList();
        System.out.println();
        sList.merge(list1);
        sList.printList();

    }
}
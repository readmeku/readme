public class testSLinkedList {
    public static void main(String args[]){
        SLinkedList list1 = new SLinkedList();
        System.out.println("list is Empty? " + list1.isEmpty());
        list1.insertLast(5);
        list1.insertLast(6);
        list1.insertLast(7);
        list1.insertLast(8);
        list1.insertFirst(4);

        list1.printList();
        System.out.println();
        // list1.makeEmpty();
        // list1.insertLast(5);
        // list1.insertLast(6);
        // list1.insertLast(7);
        // list1.insertLast(8);
        // list1.insertFirst(4);
        // list1.printList();
        // System.out.println();


        // System.out.println(list1.deleteLast().data);
        // System.out.println(list1.deleteFirst().data);
        // list1.printList();

        System.out.println();
        list1.reverse();
        list1.printList();
        
    }
}

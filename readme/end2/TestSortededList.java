public class TestSortededList {
    public static void main(String args[]){
        SortededList sList = new SortededList();
        sList.insert(5);
        sList.insert(3);
        sList.insert(4);
        sList.insert(7);
        sList.insert(12);
        sList.insert(2);
        sList.insert(3);

        sList.printList();

        //create linked list 
        SLinkedList list1 = new SLinkedList();
        list1.insertLast(4);
        list1.insertLast(16);
        list1.insertLast(22);
        list1.insertLast(8);
        list1.insertFirst(6);
        System.out.println();
        list1.printList();

        System.out.println("\nmerge 2 list and sort : ");
        sList.merge(list1);

        sList.printList();

    }
}

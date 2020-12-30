public class MainLinkedList{
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.insertLast(l1, 1);
        l1.insertLast(l1, 2);
        l1.insertLast(l1, 3);
        l1.insertLast(l1, 4);
        l1.printInfo(l1);
        System.out.println("");
        l1.insertFirst(l1, 5);
        l1.printInfo(l1);
        System.out.println("");
        l1.insertAfter(l1, 6, 2);
        l1.printInfo(l1);
        System.out.println("");
        l1.deleteFirst(l1);
        l1.printInfo(l1);
        System.out.println("");
        l1.deleteLast(l1);
        l1.printInfo(l1);
        System.out.println("");
        l1.deleteAfter(l1, 1);
        l1.printInfo(l1);
        
        
    }
}
package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(2);

        linkedList.printList();
        System.out.println("Removed one node");
        System.out.println(linkedList.deleteLast().value);
        linkedList.printList();
        System.out.println("Revoved 2 nodes");
        System.out.println(linkedList.deleteLast().value);
        linkedList.printList();
    }
}

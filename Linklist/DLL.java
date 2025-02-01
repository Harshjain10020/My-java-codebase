public class DLL {

    Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.next = node;
        }

    }
    public void Display(){
        Node node = head;
        while (node!= null) {
            System.out.print(node.value+ "->");
            node = node.next;
        }
        System.out.println();
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}

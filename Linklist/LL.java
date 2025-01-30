
public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }


    public void insertFirstnode(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }

        size+= 1;
    }

    public void insertEndnode(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        if(tail == null){
            insertFirstnode(value);
            return;
        }

        size+= 1;
    }


    public void insertAtk(int value, int k ){
        if(k ==0){
            insertFirstnode(value);
        }
        if(k == size){
            insertEndnode(value);
        }

        Node temp = head;
        for(int i = 1; i < k; i++){
            temp = temp.next;
        }
        Node node = new Node( value, temp.next);
        temp.next = node;
        size++;
    }
    public void Display(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.value+ "->");
            temp = temp .next;

        }
        System.out.println("END");

    }

    public int delfirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node (int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}
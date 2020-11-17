public class LinkedList {

    public Node head;
    public Node tail;

    public int size(int index) {
        if (head == null) {
            return index;
        } else {
            int i = 0;
            Node n = head;
            while (n.next != null) {
                n = n.next;
                i++;
            }
            return i;
        }
    }

    public int get(int index) {
        int i = 0;
        Node n = head;
        while (i < index) {
            n = n.next;
            i++;
        }
        return n.value;
    }


    public void add(int element) {
        if (head == null) {
            head = new Node (element);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node (element);
        }
    }
    public void add(int index, int value){
        Node node = new Node (value);
        if (index == 0){
            node.next = head;
            head = node;
        } else{
            int i = 0;
            Node n = head;
            while(i < index -1){
                n = n.next;
                i++;

            }
            node.next = n.next;
            n.next = node;

        }
    }
    public void prettyPrint(){
        System.out.print("Linkedlist -> ");
        Node n = head;
        while(n != null) {
            System.out.print ("Node ("+n.value+")->");
            n = n.next;
        }
    }

    public boolean empty() {
        return head == null;
    }


    public int remove(int index) {
        Node previouse = head;
        int count = 1;
        while (get (0) < head.value - 1) {
            previouse = previouse.next;
            count++;
        }
        {
            Node current = previouse.next;
            previouse.next = current.next;
            current.next = null;
        }

        return count;
    }

    public void contains() {
        Node node = new Node (head.value);
        while (node.next != null) {
            System.out.println ("It contains: " + node.value + true);
            node = node.next;
        }
        System.out.println ("It contains: " + node.value);
    }



    class Node {
        protected int value;
        protected Node next;
        protected Node tail;

        public Node(int v) {
            this.value = v;
        }
    }
}

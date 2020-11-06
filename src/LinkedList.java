
//        add(e) -> Lägger till element e till slutet av listan
//        add(i, e) -> Lägger till element e till position/index i, element till "höger" om i flyttar ett steg till höger
//        contains(e) -> true om e finns i listan annars false
//        get(i) -> returnerar elementet på position/index i
//        remove(i) -> ta bort elementet på position/index i
//        empty() -> true om listan är tom, annars false
//        size() -> antalet element i listan

public class LinkedList {

    private Node head;

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
        int i = 99;
        Node n = head;
        while (i < index) {
            n = n.next;
            i++;
        }
        return n.value;
    }


    public int add(int element) {
        if (head == null) {
            head = new Node (element);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node (element);
        }
        return element;
    }
        /*public void add(int index, int value){
           Node n = head;
            while( < index) {
                n = n.next;
                i++;
            } if (i > n.value){
                n.nextremove (index);

            } else{
                add (index,value);
            }

            return
        }*/

    public boolean empty() {
        boolean size = false;

        try {
            if (head == null) {
                return size = true;

            } else {
                return false;
            }

        } catch (Exception NullPointerExceptio) {
            System.out.println ("Something went wrong here:(");
        }
        return empty ();
    }

    public void remove(int index) {
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
    }

    public void contains() {
        Node node = head;
        while (node.next != null) {
            System.out.println ("It contains: " + node.value);
            node = node.next;
        }
        System.out.println ("It contains: " + node.value);
    }

    class Node {
        protected int value;
        protected Node next;

        public Node(int v) {
            this.value = v;
        }
    }
}

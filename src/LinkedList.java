
public class LinkedList {

        private Node head;

        public int size(int i){
            if (head == null){
                return 0;
            }
            else {
                i = 0;
                Node n = head;
                while (n.next !=null){
                    n = n.next;
                    i++;
                } return i;
            }

        }

        public void add(int e ){
            if (head == null){
                head = new Node (e);
            }
            else {
                Node n = head;
                while (n.next != null){
                    n = n.next;
                }
                n.next = new Node(e);
            }
        }
        public void add(int index, int value){
            get (index);
            add (value);


        }
        public int contains(int e ){

            return e;
        }
        public int get(int index ){
            int i = 0;
            Node n = head;
            while (i < index){
                n = n.next;
                i++;
            }
            return n.value;
        }

        public void remove(int i ){

        }
        public void empty(){

        }

        static class Node{
            protected int value;
            protected Node next;

            public Node(int e){
                this.value = e;
            }
        }
    }

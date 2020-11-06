import org.w3c.dom.Node;

public class LinkedList {

    Nod head=null;
    Nod tail=null;
    int size = 0;



    public void Add_last (int element){
        if (Nod == null){
            Nod e = new Nod();
            e.value=element;
            head=e;
            tail=e;
            size++;

        } else {
            Nod e= new Nod() ;
            e.value= element ;

            tail.next = e ;
            tail= e ;
            size++ ;



        }
        public void Add2 (int element ,int index ){
            Nod e =new Nod();
            e.value = element ;
            e.next=e;
            head= e ;
            size++ ;

        }
        public int get(int index){
            int i = 0;
            Nod n = head;
            while (i < index){
                n = n.next;
                i++;
            }
            return n.value;
        }

        public void remove ( Nod i )
        Nod i = head ;
        while (h.)
    }
    public int size(){
        if (head == null){
            return 0;
        }
        else{
            int i = 0;
            Nod n = head;
            while(n.next != null){
                n = n.next;
                i++;
            }
            return i;
        }
    }

}
import org.w3c.dom.Node;

public class LinkedList {

    Nod head=null;
    Nod tail=null;
    int size = 0;


    //Här Skapat  Objekt från klass Nod som har value OCH NEXT.void utan reture för att jag vill bara att adda element
// Ta hansyn till att det här är det första element så innehåller det (head och tail).
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
            //Om jag vill tillägga en element sist så måste det lika med tail .Eftersom tail alltid finns på sist.
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
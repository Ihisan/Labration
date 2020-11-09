//        add(e) -> Lägger till element e till slutet av listan
//        add(i, e) -> Lägger till element e till position/index i, element till "höger" om i flyttar ett steg till höger
//        contains(e) -> true om e finns i listan annars false
//        get(i) -> returnerar elementet på position/index i
//        remove(i) -> ta bort elementet på position/index i
//        empty() -> true om listan är tom, annars false
//        size() -> antalet element i listan
public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList ();
        list.add (1);
        list.add (2);
        list.add (3);
        list.add(4);
        System.out.println ("Size: " +list.size (0));
        list.prettyPrint ();

       //=========Funktioner med push(),pop(),peek()======
        list.push (10);
        list.push (15);
        list.push (22);
        list.prettyPrint2 ();
        System.out.print ("The first element in Linkedlist is: "+ list.peek ()+" ->");
        System.out.println ("Pop() of the first element is: " + list.pop ());



    }
}
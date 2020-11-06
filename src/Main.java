import java.util.Iterator;


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
        // java.util.LinkedList testLista = new java.util.LinkedList();
        list.add (1);
        list.add (2);
        list.add (3);
        System.out.println("The list size is : " + list.size(0)); // -> 3
        list.add (0,99);
        System.out.println("The list size is : " + list.size (0)); //-> 4
        System.out.println(list.get(0)); //-> 99
        System.out.println(list.get(3)); //-> 3
        list.remove (3);// list.remove
        System.out.println("The list size is : " + list.size (0)); //-> 3
        System.out.println ("Is empty?: "  + list.empty ());//list.empty() -> false

        //=========Funktioner

    }
}
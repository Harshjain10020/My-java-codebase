import java.util.*;
import java.util.stream.Gatherer.Integrator;
public class Main2{
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertFirstnode(9);
        // list.insertFirstnode(7);
        // list.insertFirstnode(3);
        // list.insertFirstnode(3);
        // list.insertFirstnode(3);
        // list.insertEndnode(99);
        // list.insertAtk(300, 3);
        // System.out.println(list.delEnd());
        // System.out.println(list.delfirst());
        // System.out.println(list.del_index(3));
        // list.Display();

        DLL list = new DLL();
        list.InsertFirst(9);
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(3);
        list.InsertFirst(7);
        list.InsertFirst(4);
        list.InsertFirst(92);
        list.InsertFirst(91);
        list.InsertLast(100);
        list.InsertAfter(100, 45);
       
        // list.insertFirstnode(7);
        // list.insertFirstnode(3);
        // list.insertFirstnode(3);
        // list.insertFirstnode(3);
        // list.insertEndnode(99);
        // list.insertAtk(300, 3);
        // System.out.println(list.delEnd());
        // System.out.println(list.delfirst());
        // System.out.println(list.del_index(3));
        list.Display();
        
    }
}

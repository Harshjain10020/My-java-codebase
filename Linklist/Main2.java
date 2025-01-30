import java.util.*;
import java.util.stream.Gatherer.Integrator;
public class Main2{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirstnode(9);
        list.insertFirstnode(7);
        list.insertFirstnode(3);
        list.insertFirstnode(3);
        list.insertFirstnode(3);
        list.insertEndnode(99);
        list.insertAtk(300, 3);
        System.out.println(list.delEnd());
        System.out.println(list.delfirst());
        list.Display();
        
    }
}

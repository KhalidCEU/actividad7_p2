import java.util.Stack;

public class DemoPilas
{
    public static void test() {
        Stack<Integer> pila = new Stack<>();

        pila.push(1);
        pila.push(2);

        System.out.println("Pila: " + pila);
        System.out.println("Peek de la pila: " + pila.peek());

        pila.pop();

        System.out.println("Pila tras pop: " + pila);
    }
}
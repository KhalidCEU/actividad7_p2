import java.util.ArrayDeque;

public class DemoColas {
    public static void test() {
        ArrayDeque<Integer> cola = new ArrayDeque<>();

        cola.add(1);
        cola.add(2);

        System.out.println("Cola: " + cola);
        System.out.println("Peek de la cola: " + cola.peek());
        System.out.println(cola.poll());
        System.out.println("Cola tras poll: " + cola);
    }
}

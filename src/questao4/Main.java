import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 4");
        List<Integer> lista = new ArrayList<>();
        lista.add(9);
        lista.add(8);
        lista.add(3);
        lista.add(5);
        lista.add(2);
        lista.add(1);
        Nodo no = new Nodo();
        no.deletarNo(lista, 4, 0);
        System.out.println(lista);
        System.out.println("------------------------------------");
    }
}

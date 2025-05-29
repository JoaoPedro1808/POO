package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista1 {

    public static void main(String[] args) {
        // Declarção de uma lista de Strings
        List<String> Lista = new ArrayList<String>();
        Lista.add("Chocolate");
        Lista.add("Pão");
        Lista.add("Banana");
        Lista.add("Maçã");
        Lista.add("Maçã"); // Não é uma duplicata porque há dois objetos String com conteúdo igual.
        String itemDaLista = "Café";
        Lista.add(itemDaLista);
        Lista.add(itemDaLista); // isto é uma duplicata

        // Interação com o for each
        System.out.println("Lista de compras: ");
        for (String items : Lista) {
            System.out.println(items);
        }

        System.out.println("------------------------------------");

        // Interação usando for tradicional
        for (int i = 0; i < Lista.size(); i++) {
            System.out.println(Lista.get(i));
        }

        System.out.println("------------------------------------");

        // Interação usando for each com expressão Lambda
        Lista.forEach(item -> System.out.println(item));

        System.out.println("------------------------------------");

        // Interação usando o iterator
        Iterator<String> iterator = Lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

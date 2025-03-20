public class Progrma2 {
        public static void main(String[] args) {

            String nome1 = "Maria";
            String nome2 = nome1;
            nome1 = "José";
            int a = 5 * 4 / 6 + 7;
            double b = 5 * 4.0 / 6 + 7;

            System.out.println(a);
            System.out.println(b);

            if(nome1.equals(nome2)) {
                System.out.println("Hola Maria");
            }
            else {
                System.out.println("Seja bem-vindo");
            }
        }
    }
}

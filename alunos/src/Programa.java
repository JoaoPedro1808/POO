public class Programa {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.matricula = "123";
        aluno1.nome = "Vanessa";
        aluno1.curso = "ADS";

        System.out.println("Nome: " + aluno1.nome + "," +  "Matricula: " + aluno1.matricula + "Curso: " + ","+ aluno1.curso);

        Aluno aluno2 = new Aluno();
        aluno2.matricula = "456";
        aluno2.nome = "Pedro";
        aluno2.curso = "CDIA";

        System.out.println("Nome: " + aluno2.nome + "," +  "Matricula: " + aluno2.matricula + "Curso: " + ","+ aluno2.curso);

    }
}

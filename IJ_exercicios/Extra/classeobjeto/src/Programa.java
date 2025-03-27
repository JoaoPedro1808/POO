public class Programa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("01", "João", "CDIA");
        Aluno aluno2 = new Aluno("02", "Vanessa", "ADC");
        // aluno1.mudarnome("Ronaldo");
        // aluno2.trocaDeCurso("ES");

        System.out.println("Nome: " + aluno1.nome + ", Matricula: " + aluno1.matri + ", Curso: " + aluno1.curso);

        System.out.println("Nome: " + aluno2.nome +  ", Matricula: " + aluno2.matri + ", Curso: " + aluno2.curso);
    }
}

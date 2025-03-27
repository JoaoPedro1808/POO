public class Aluno {
        String matri, nome, curso;

        public Aluno(String id, String name, String course) {
            this.matri = id;
            this.nome = name;
            this.curso = course;
        }
        void trocaDeCurso(String novocurso){
            this.curso = novocurso;
        }

        void mudarnome(String novonome){
            this.nome = novonome;
        }
    }

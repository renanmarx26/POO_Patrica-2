public class Principal2 {
    public static void main(String[] args) {

        Aluno2 a1 = new Aluno2();
        Aluno2 a2 = new Aluno2();
        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();

        a1.nome = "Renan";
        a1.matricula = 2013;
        a1.disciplinaMatriculada = d1;

        a2.nome = "Marx";
        a2.matricula = 2021;
        a2.disciplinaMatriculada = d2;

        d1.nome = "POO";
        d1.cargaHoraria = 120;

        d2.nome = "Java";
        d2.cargaHoraria = 90;

        System.out.println("\nNome: " +a1.nome+"\nMatricula: "+a1.matricula+"\nNome Disciplina: "+a1.disciplinaMatriculada.nome+"\nCarga Horário: "+a1.disciplinaMatriculada.cargaHoraria);
        System.out.println("\nNome: " +a2.nome+"\nMatricula: "+a2.matricula+"\nNome Disciplina: "+a2.disciplinaMatriculada.nome+"\nCarga Horário: "+a2.disciplinaMatriculada.cargaHoraria);



    }
}
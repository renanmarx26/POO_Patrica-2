public class Principal {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Renan", 100, 6, 5, 8, 9, 7);
        Aluno a2 = new Aluno("Marx", 200, 5, 6, 7, 1, 0);

        System.out.println("\nNome: " +a1.nome+"\nMatricula: "+a1.matricula+"\nNota Mat: "+a1.nota_mat+"\nNota Port: "+a1.nota_por+"\nNota Fis: "+a1.nota_fis+"\nNota Geo: "+a1.nota_geo+"\nNota Quim: "+a1.nota_quim);
        a1.nota_mat = 6;
        a1.nota_por = 5;
        a1.nota_fis = 8;
        a1.nota_geo = 9;
        a1.nota_quim = 7;
        a1.calcularMedia((a1.media_nota = a1.nota_mat + a1.nota_por + a1.nota_fis + a1.nota_geo + a1.nota_geo + a1.nota_quim)/5);
        a1.situacao_Aluno(a1.media_nota);


        System.out.println("\nNome: " +a2.nome+"\nMatricula: "+a2.matricula+"\nNota Mat: "+a2.nota_mat+"\nNota Port: "+a2.nota_por+"\nNota Fis: "+a2.nota_fis+"\nNota Geo: "+a2.nota_geo+"\nNota Quim: "+a2.nota_quim);
        a2.nota_mat = 5;
        a2.nota_por = 6;
        a2.nota_fis = 7;
        a2.nota_geo = 1;
        a2.nota_quim = 0;
        a2.calcularMedia(a2.media_nota = ((a2.nota_mat + a2.nota_por + a2.nota_fis + a2.nota_geo + a2.nota_quim) / 5));
        a2.situacao_Aluno(a2.media_nota);

    }
}

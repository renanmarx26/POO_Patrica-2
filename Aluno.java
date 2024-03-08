public class Aluno {

    String nome;
    int matricula;
    double nota_mat;
    double nota_por;
    double nota_fis;
    double nota_geo;
    double nota_quim;
    double media_nota;

    public Aluno(String nome, int matricula, double nota_mat, double nota_por, double nota_fis, double nota_geo, double nota_quim) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota_mat = nota_mat;
        this.nota_por = nota_por;
        this.nota_fis = nota_fis;
        this.nota_geo = nota_geo;
        this.nota_quim = nota_quim;
    }

    void calcularMedia(double media) {
        media_nota = ((nota_mat + nota_por + nota_fis + nota_geo + nota_quim) / 5);
    }

    void situacao_Aluno(double nota_final) {
        if (media_nota >= 6) {
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
            }

    }
}



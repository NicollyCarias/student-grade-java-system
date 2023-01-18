public class registroNota {
    private String matriculaAluno;
    private String nomeAluno;
    private double nota1;
    private double nota2;
    private double nota3;
    private int quantidade_presencas;

    public registroNota() {
    }

    public String getMatricula() {
        return matriculaAluno;
    }

    public void setMatricula(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getNome() {
        return nomeAluno;
    }

    public void setNome(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public int getQuantidade_presencas() {
        return quantidade_presencas;
    }

    public void setQuantidade_presencas(int quantidade_presencas) {
        this.quantidade_presencas = quantidade_presencas;
    }
    
    public void Media(){
        double media = (getNota1() + getNota2() + getNota3()) / 3;
        System.out.println("média de notas do aluno: "+media);
    }
    
    public void percentualPresenca(){
        double media = (double)(getQuantidade_presencas()*100)/60;
        System.out.println("Percentual de presença do aluno: "+media);
    }
    
}

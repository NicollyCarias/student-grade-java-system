import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerValor = new Scanner(System.in);
        Scanner scannerTexto = new Scanner(System.in);
        Scanner EntradaReal = new Scanner(System.in);
        Scanner EntradaInteiro = new Scanner(System.in);
        int op = 0;
        registroNota registro = new registroNota();
        do{
           menu();
           op = scannerValor.nextInt();
           switch(op){
               case 1:
                   System.out.println("Cadastro de Informações do aluno");
                   
                   System.out.println("Qual a matrícula do aluno: ");
                   registro.setMatricula(scannerTexto.next());
                   
                   System.out.println("Qual o Nome do aluno: ");
                   registro.setNome(scannerTexto.next());
                   
                   System.out.println("Qual o Valor da Nota 1: ");
                   registro.setNota1(EntradaReal.nextDouble());
                   
                   System.out.println("Qual o Valor da Nota 2: ");
                   registro.setNota2(EntradaReal.nextDouble());
                   
                   System.out.println("Qual o Valor da Nota 3: ");
                   registro.setNota3(EntradaReal.nextDouble());
                   
                   System.out.println("Qual foi o numero de presenças: ");
                   registro.setQuantidade_presencas(EntradaInteiro.nextInt());
                   
               break;
               case 2:
                   System.out.println("\nInformações1\n");
                   System.out.println("Nome do Aluno: "+registro.getNome());
                   registro.Media();
                   registro.percentualPresenca();
               
               break;
               case 0:
               
               break;
           }
           
        }while(op != 0);

    }
    
    public static void menu(){
        System.out.println("1-Cadastrar Aluno\n2-Exibir Informações\n0-Sair");
    }
    
}

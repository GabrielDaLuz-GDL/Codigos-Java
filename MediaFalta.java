import java.util.Scanner;
public class MediaFalta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        double media = 0;
        double horario = 0;
        double nota1, nota2, nota3, nota4 = 0;
        int falta = 0;


        System.out.println("Digite a sua Carga Horária:  ");
        horario = sc.nextDouble();
        System.out.println("Digite as suas 4 notas Bimestrais: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();
        System.out.println("Digite o número de faltas: ");
        falta = sc.nextInt();

        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Sua media é: " + media);
        System.out.println("Falta %: "+ (falta/horario)*100);
        if (falta > horario *  0.25 || media < 4.5) {
            System.out.println("Reprovado");
        }
        else if (media < 6.0) {
            System.out.println("Recuperação");
        }
        else if (media > 6.0) {
            System.out.println("Aprovado");
        }
    }
}

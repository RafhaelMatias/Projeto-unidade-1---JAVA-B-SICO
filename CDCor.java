import java.util.Scanner;

public class ted1 {

    public static void main(String[] args) {


        String cor = "";


        Scanner resultado = new Scanner(System.in);

        System.out.println("Escolha entre essas cores");
        System.out.println("verde");
        System.out.println("azul");
        System.out.println("amarelo");
        System.out.println("Vernelho");



        System.out.println("escolha a cor");
        cor = resultado.nextLine();


        if ( cor.equalsIgnoreCase("verde")){
            System.out.println("O preço do CD " + cor + " é 10$");
        };
        if ( cor.equalsIgnoreCase("azul")){
            System.out.println("O preço do CD " + cor + " é 20$");
        };
        if ( cor.equalsIgnoreCase("amarelo")){
            System.out.println("O preço do CD " + cor + " é 30$");
        };
        if ( cor.equalsIgnoreCase("vermelha")){
            System.out.println("O preço do CD " + cor + " é 40$");
        };

        resultado.close();




    }
}

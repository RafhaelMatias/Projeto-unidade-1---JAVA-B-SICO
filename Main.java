import java.util.Scanner;

public class Main {
    public static void main(String[] argss){
        Scanner A = new Scanner(System.in);
        int X;
            for(int i = 1; i <= 10; i++){
            System.out.println("Entre com um número: ");
            X = A.nextInt();

            
            if(X % 2 == 0){
                System.out.println("O " + X + " é número PAR!");
            } else {
                System.out.println("O " + X + " é número ÍMPAR!");
            }

        }
        }
        }
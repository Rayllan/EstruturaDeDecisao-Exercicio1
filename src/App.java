import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double numero1, numero2;

        System.out.println("Digite um números :");
        numero1 = keyboard.nextDouble();

        System.out.println("Digite outro números : \n");
        numero2 = keyboard.nextDouble();

        if (numero1 > numero2){
             System.out.println("o números  " + numero1 + " é o maior números  \n");
        } else if(numero2 > numero1) {
             System.out.println("o números " + numero2 + " é o maior números \n");
        } else {
             System.out.println("Os dois números são iguais! \n");
        }
     keyboard.close();
    }
}

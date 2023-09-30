import contador.Contador;
import contador.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Contador contador = new Contador();

        Scanner terminal = new Scanner(System.in);
        System.out.println("Insert the first number: ");
        int firstParam = terminal.nextInt();
        System.out.println("Insert the second number: ");
        int sndParam = terminal.nextInt();

        try {
            contador.toCount(firstParam, sndParam);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("The second param must be bigger than the first");
        }



    }
}
import java.util.Scanner;

public class Main {



    public static void main(String[]args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la frase que quieres analizar");
        String frase = scanner.nextLine();
        String[]frases = frase.split("\\.");
        System.out.println("El numero de oraciones es"+frases.length);


    }



}


import java.util.Scanner;

public class Main {



    public static void main(String[]args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la frase que quieres analizar");
        String frase = scanner.nextLine();
        String[]frases = frase.split("\\.");
        frase.replaceAll(" ","").replaceAll(",","").replaceAll(",","");
        System.out.println("El resultado es"+frasePalabras);
        System.out.println("El numero de oraciones es" +frases.length);
        System.out.println("El numero de letras es"+frasePalabras.length);


    }



}


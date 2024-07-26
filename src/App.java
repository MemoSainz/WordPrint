import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("");
        System.out.println("Hello! Tell me a word and I'll repeat to you... \n also, if you want to quit this, just say 'exit' and everything will end :)");
        System.out.println("");
        
            System.out.print("Insert a word: ");
            Scanner teclado = new Scanner(System.in);
            String palabra = teclado.next();


            while (!palabra.equalsIgnoreCase("exit")) {
                System.out.println("La palabra es: " + palabra);

                System.out.print("Insert a word: ");
                palabra = teclado.next();
            }

            
    }
}

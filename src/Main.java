public class Main {
    // método
    public static void main(String[] args) {
        // variables -> cajas contennedoras de datos, almacenan un valor en memoria
        // primitivos - sencillos, eficientos, no tienen métodos asociados
        // números -> int / double
        // true/false , sí/no -> boolean

        // NO primitivo -> texto -> String

        // números enteros
        // camelCase
        int age = 25;

        // números decimales
        double temperature = 13.5;

        // carácteres
        char grade = 'A';

        // verdadero/falso - sí/no --> true/false
        boolean isRaining = false;

        // Texto
/*        String name = "John";
        String greeting = "Holi!";

        System.out.println(name);
        System.out.println(greeting);

        // concatenar
        System.out.println(greeting + " " + name + ", how are you?");*/

        String text = "Hello, world!";

        int length = text.length();
        System.out.println(length);

        String upperCase = text.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = text.toLowerCase();
        System.out.println(lowerCase);

        char firsChar = text.charAt(5);
        System.out.println(firsChar);

        String firstWord = text.substring(0, 5);
        System.out.println(firstWord);

        String spacedText = "    some sample text      ";
        String trimmedText = spacedText.trim();
        System.out.println(trimmedText);

        boolean startsWithHello = text.startsWith("Hello");
        System.out.println(startsWithHello);
        System.out.println(text.endsWith("!"));
        System.out.println(text.contains("*"));

        String newText = text.replace("o", "e");
        System.out.println(newText);

        int number1 = 10;
        int number2 = 3;

        System.out.println("Suma " + (number1 + number2));
        System.out.println("Resta " + (number1 - number2));
        System.out.println("Multiplicación " + (number1 * number2));
        System.out.println("Resto " + (number1 % number2));
        System.out.println("División " + (number1 / number2));

        // condicionales - conditionals


        System.out.println("-------------------");


        int age2 = 200;

        // if-else

        // >=
        // <=
        // >
        // <
        // ==
        // || -> OR - O
        // && -> AND - Y

        // si-o
/*        if ((age2 <= 0) || (age2 >= 200)) {
            System.out.println("Eres un listo, chao pescao");
        } else if (age2 > 18) {
            System.out.println("Puedes entrar, bienvenido!");
        } else if (age2 == 18) {
            System.out.println("Felicidades, pero eres muy peque aún, espera un año...");
        } else {
            System.out.println("No puedes entrar, bye!");
        }

        if (age2 >= 18) {
            System.out.println("Y puedes ir a la cárcel majo");
        }*/


//        if ( condición ) {
//            // código que se ejecuta
//        } else if ( condición 2) {
//            // código que se ejecuta
//        } else {
//            // código que se ejecuta
//        }
    }
}
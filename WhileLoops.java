import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        int number = 0;
        while (number != 7) {
            number = getRandomNumber(10);
            System.out.println("El número aleatorio es el " + number);
        }

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        int number2 = 0;
        while (number2 <= 70) {
            number2 = getRandomNumber(100);
            System.out.println("El número aleatorio es el " + number2);
        }

        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber

        Scanner scanner = new Scanner(System.in);
        int randomNumber = getRandomNumber(100);
        int userNumber = 0;

        System.out.println("Adivina un número entre 1 y 100");

        do {
            System.out.println("Escribe aquí el número: ");
            userNumber = scanner.nextInt();

            if (userNumber < randomNumber) {
                System.out.println("El número ingresado es menor que el número que buscamos");
            } else if (userNumber > randomNumber) {
                System.out.println("El número ingresado es mayor que el número que buscamos");
            } else {
                System.out.println("¡Correcto, has adivinado el número!");
            }
        } while (randomNumber != userNumber);

        scanner.close();
    }

        /**
         * Function name: getRandomNumber
         *
         * @param number (int)
         * @return (int)
         *
         * Inside the function:
         * 1. choose a random integer between 1 and the number given
         */
    public static int getRandomNumber ( int number){
        return (int) (Math.random() * number) + 1;
    }
}

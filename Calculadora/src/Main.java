import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int option, roption;
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido!");
        do {
            System.out.println("¿Qué desea realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz");
            System.out.println("0. Salir");
            option = sc.nextInt();
            if (option == 1){
                System.out.println("Ha seleccionado suma.");
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                System.out.println("La suma de: "+num1+" + "+num2+" = "+(num1+num2));
            }
            if (option == 2){
                System.out.println("Ha seleccionado resta.");
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                System.out.println("La resta de: "+num1+" - "+num2+" = "+(num1-num2));
            }
            if (option == 3){
                System.out.println("Ha seleccionado multiplicación.");
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                System.out.println("La multiplicación de: "+num1+" * "+num2+" = "+(num1*num2));
            }
            if (option == 4){
                num2 = 0;
                System.out.println("Ha seleccionado división.");
                System.out.print("Ingrese el dividendo: ");
                num1 = sc.nextDouble();
                do {
                    System.out.print("Ingrese el divisor: ");
                    num2 = sc.nextDouble();
                    if (num2 != 0) {
                        System.out.println("La división de: " + num1 + " / " + num2 + " = " + (num1 / num2));
                        System.out.println("El resto de la división es: "+(num1 % num2));
                        break;
                    }
                    System.out.println("No puede dividir por 0, ingrese otro número");
                }
                while (num2 == 0);
            }
            if (option == 5){
                System.out.println("Ha seleccionado potencia.");
                System.out.print("Ingrese la base: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el exponente: ");
                num2 = sc.nextDouble();
                System.out.println("La potencia de: "+num1+" ^ "+num2+" = "+Math.pow(num1, num2));
            }
            if (option == 6){
                System.out.println("Ha seleccionado raíz.");
                System.out.println("Desea conocer: ");
                do {
                    System.out.println("1. Raíz cuadrada");
                    System.out.println("2. Raíz Cúbica");
                    roption = sc.nextInt();
                    if (roption != 1 || roption != 2){System.out.println("Ingrese una opción válida");}
                }
                while (roption != 1 || roption != 2);
                System.out.print("Ingrese el radicando: ");
                num1 = sc.nextDouble();
                if (roption == 1){System.out.println("La raíz cuadrada de "+num1+" = "+Math.sqrt(num1));}
                if (roption == 2){System.out.println("La raíz cúbica de "+num1+" = "+Math.pow(num1, 0.333));}
            }
            if (option == 0){System.out.println("Hasta luego!");}
        }
        while (option != 0);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros [] = new float[5];

        System.out.println("guardando los datos ene el arreglo");
        for (int i = 0;i<5;i++){
            System.out.print((i+1)+".digite un numero: ");
            numeros [i] = entrada.nextFloat();
        }

        System.out.println("/nimprimir los elementos del areglo");
        for (float i:numeros)
            System.out.print(i);
    }
}
import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] enteros = new int[7];
        int numeroMayor = 0;
        int i;
        for (i = 0; i< enteros.length; i++){
            System.out.println("Introduzca un numero");
            enteros[i] = scanner.nextInt();
        }
        for (i = 0; i< enteros.length; i++){
            numeroMayor = Math.max(numeroMayor, enteros[i]);
        }
        System.out.println(numeroMayor);
    }
}

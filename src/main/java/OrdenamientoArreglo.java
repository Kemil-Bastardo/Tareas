import java.util.Scanner;
/*
Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
*/
public class OrdenamientoArreglo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        int[] enteros = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            enteros[i] = scanner.nextInt();
        }

        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(enteros[9 - i]);
            System.out.println(enteros[i]);
        }
    }
}

import java.util.Scanner;
/*
Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos, el promedio de los negativos y contar el número de ceros.
*/
public class SistemaEstadisticoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] enteros = new int[7];
        int i;
        int sumaPositivo = 0,
            sumaNegativo = 0,
            contadorPositivo = 0,
            contadorNegativo = 0,
            contadorCero = 0;
        for(i=0;i< enteros.length;i++){
            System.out.println("Introduzca un numero");
            enteros[i] = scanner.nextInt();
        }
        for(i=0;i< enteros.length;i++){
            if(enteros[i]>0){
                sumaPositivo += enteros[i];
                contadorPositivo++;
            } else if (enteros[i]<0) {
                sumaNegativo += Math.abs(enteros[i]);
                contadorNegativo++;
            }else {
                contadorCero++;
            }
        }

        System.out.println("Promedio de los positivos: "+sumaPositivo/contadorPositivo +
                "\nPromedio de los negativos: -"+sumaNegativo/contadorNegativo+
                "\nCeros introducidos: "+contadorCero);
    }
}

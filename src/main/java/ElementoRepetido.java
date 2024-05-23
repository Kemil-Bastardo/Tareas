import java.util.Scanner;

public class ElementoRepetido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] enteros = new int[10];
        int i,
            numeroMasRepetido=0,
            numeroOcurrencia=0,
            numeroOcurrenciaMas=0;

        for (i=0; i< enteros.length; i++){
            System.out.println("Introduzca un numero");
            enteros[i] = scanner.nextInt();
        }
        for (i = 0; i < enteros.length; i++) {
            for(int entero:enteros){
                if(entero==enteros[i]){
                    numeroOcurrencia++;
                }
            }
            if(numeroOcurrencia>numeroOcurrenciaMas){
                numeroMasRepetido = enteros[i];
                numeroOcurrenciaMas = numeroOcurrencia;
            }
            numeroOcurrencia = 0;
        }

        System.out.println("El numero mas repetido es: "+numeroMasRepetido+
                "\nEl numero de ocurrencia es de: "+numeroOcurrenciaMas);
    }
}

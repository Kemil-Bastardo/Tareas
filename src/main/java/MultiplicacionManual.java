import java.util.Scanner;

public class MultiplicacionManual {
    /*
        Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
        Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el multiplicando");
        int multiplicando = scanner.nextInt();
        System.out.println("Introduzca el multiplicador");
        int multiplicador = scanner.nextInt();
        int producto= 0;

        if((multiplicando<0 && multiplicador>0) || (multiplicando>0 && multiplicador<0)){
            if(multiplicando<0){
                for (int i = 0;i<multiplicando-(multiplicando+multiplicando);i++){
                    producto -= multiplicador;
                }
            }
            if (multiplicador < 0) {
                for (int i = 0;i<multiplicando;i++){
                    producto -= multiplicador;
                }
                producto = producto - (producto+producto);
            }
        } else if (multiplicando<0 && multiplicador<0) {
            for (int i = 0;i<multiplicando-(multiplicando+multiplicando);i++){
                producto -= multiplicador;
            }
        } else {
            for (int i = 0;i<multiplicando;i++){
                producto += multiplicador;
            }
        }

        System.out.println(producto);
    }
}

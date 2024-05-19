import java.util.Scanner;

public class PromedioNotas {
    /*
        Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
        Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, además mostrar el promedio total.
        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[20];
        for (int i=0; i<notas.length; i++){
            System.out.println("Favor digite las nota");
            notas[i] = scanner.nextDouble();
            if(notas[i]==0){
                System.out.println("Error finalizando el programa");
                break;
            }
        }
        double promedioSuperior = 0;
        int cantidadEstudianteSuperior = 0;
        double promedioinferior = 0;
        int cantidadEstudianteInferior = 0;
        double promedioTotal = 0;
        int cantidadEstudianteNota1 = 0;
        for (double nota : notas){
            if(nota > 5){
                promedioSuperior += nota;
                cantidadEstudianteSuperior++;
            } else if (nota <4) {
                promedioinferior += nota;
                cantidadEstudianteInferior++;
                if(nota==1){
                    cantidadEstudianteNota1++;
                }
            }
            promedioTotal += nota;
        }
        System.out.println(promedioSuperior/cantidadEstudianteSuperior);
        System.out.println(promedioinferior/cantidadEstudianteInferior);
        System.out.println(cantidadEstudianteNota1);
        System.out.println(promedioTotal/ notas.length);
    }
}

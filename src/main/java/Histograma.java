import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] enteros = new int[12];
        StringBuilder histograma1 = new StringBuilder();
        StringBuilder histograma2 = new StringBuilder();
        StringBuilder histograma3 = new StringBuilder();
        StringBuilder histograma4 = new StringBuilder();
        StringBuilder histograma5 = new StringBuilder();
        StringBuilder histograma6 = new StringBuilder();
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Introduzca su numero");
            enteros[i] = scanner.nextInt();
        }
        for (int entero : enteros){
            switch (entero){
                case 1:
                    histograma1.append("*");
                    break;
                case 2:
                    histograma2.append("*");
                    break;
                case 3:
                    histograma3.append("*");
                    break;
                case 4:
                    histograma4.append("*");
                    break;
                case 5:
                    histograma5.append("*");
                    break;
                case 6:
                    histograma6.append("*");
                    break;
            }
        }
        System.out.println("1: "+histograma1+"\n" +
                "2: "+histograma2+"\n" +
                "3: "+histograma3+"\n" +
                "4: "+histograma4+"\n" +
                "5: "+histograma5+"\n" +
                "6: "+histograma6);
    }
}

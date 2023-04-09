import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MAX = 10;
        int[] Vet = new int[MAX];
        int App;

        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci i numeri:");
        for (int i=0; i<MAX; i++) {
            Vet[i] = in.nextInt();
        }

        for (int i=0; i<MAX; i=i+2) {
            App = Vet[i];
            Vet[i] = Vet[i+1];
            Vet[i+1] = App;
        }

        System.out.println("Il vettore ora è:");
        for (int i=0; i<MAX; i++) {
            System.out.println(Vet[i]);
        }

    }
}
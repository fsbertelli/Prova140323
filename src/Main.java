import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];
        int value;
        boolean verify = false;

        System.out.print("Array carregado: ");
        for (int i = 0; i < array.length; i++) {
            int rand = random.nextInt(1000);
            array[i] = rand;
            System.out.printf("%d ", array[i]);
        }
        System.out.print("\nDigite um valor para verificar: ");
        value = input.nextInt();
        for (int j : array) {
            if (j == value) {
                System.out.printf("O numero %d esta contido no array \n", value);
                verify = true;
            }
        }
        if (!verify) {
            System.out.printf("O numero %d nao esta contido no array\n", value);
        }
    }
}
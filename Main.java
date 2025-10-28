import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        int number = in.nextInt();
        int [] mas = new int[number*2 + 1];

        int index = 0;
        for (int i = number; i >= -number ; i--) {
            mas[index++] = Math.abs(i);


        }


        for (int i = 0; i<mas.length; i++) {
            System.out.print(mas[i] + " ");
        }




        in.close();

    }
}
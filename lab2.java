import java.util.Scanner;

public class lab2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n - Введите целое неотрицательное число меньше 15: ");
        int n;
        int res = 1;

        while (true) {
            if (in.hasNextInt()) {
                n = in.nextInt();
                if ((n > 0) && (n < 15)) {
                    break;
                }
                else {
                    System.out.println("Ошибка! Введите n - неотрицательное число меньше 15.");
                }
            }
            else {
                System.out.println("Ошибка! Введите n - неотрицательное число меньше 15.");
                in.next();
            }
        }
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println("Ответ: " + res);
        in.close();
    }
}
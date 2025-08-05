import java.util.Scanner;
public class SumOfConsecutiveOdds {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter value of N"
        );
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(
                    "Enter value of x"
            );
            int x = sc.nextInt();
            System.out.println(
                    "Enter value of y"
            );
            int y = sc.nextInt();
            int sum = 0;
            int count = 0;
            if (x % 2 != 0) {
                for (int j = x; j > 0; j = j + 2, count++) {
                    if (count == y) {
                        break;
                }
                    sum = sum + j;
            }

            }
            else{
                    for (int k = (x + 1); k > 0; k = k + 2) {
                        count++;
                        sum = sum + k;
                        if (count == y) {
                            break;
                        }
                    }
                }
            System.out.println(
                    sum
            );
            }
        }
    }
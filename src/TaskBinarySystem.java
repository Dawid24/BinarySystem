import java.util.Scanner;

public class TaskBinarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = scanner.nextInt();
        Solution s = new Solution();
        int result = s.solution(a);
        System.out.println("Maximal sequence of consecutive zeros is " + result);
        //TaskBinarySystem2.reverse(text);

    }
}

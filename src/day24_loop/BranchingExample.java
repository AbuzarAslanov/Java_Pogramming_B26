package day24_loop;

public class BranchingExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            break;
        }

        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
    }
}
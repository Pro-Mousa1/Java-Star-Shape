public class Main {
    public static void main(String[] args) {
        int a=5;
        for (int row = 1; row <=a; row++) {
            for (int col =row; col<=a; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
            for (int col =1; col <=row-1; col++) {
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}
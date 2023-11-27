public class Main {
    public static void main(String[] args) {
        int maxRowNumb = 10;
        int maxColumnNumb = 10;

        for (int row = 1; row <= maxRowNumb; row++) {
            for (int column = 1; column < maxColumnNumb; column++) {
                System.out.print(String.format("%5d",row * column));
            }
            System.out.println();
        }
    }
}
import javafx.scene.control.CheckBox;

public class ArraysEx {

    private static int checkerboard[][] = new int[8][8];

    public ArraysEx() {
        initializeArray();
    }
    

    public static void initializeArray() {
        for (int i = 0; i < checkerboard.length; i++) {
            for (int j = 0; j < checkerboard.length; j++) {
                checkerboard[i][j] = 0;
            }
        }
    }

    public static void setupGame() {
        for (int i = 0; i < checkerboard.length; i++) {
            for (int j = 0; j < checkerboard.length; j++) {
                if(i < 3 && (i + j) % 2 == 1) {
                    checkerboard[i][j] = 1;
                }
                else if (i > 4 && (i + j) % 2 == 1){
                    checkerboard[i][j] = 2;
                }
            }
        }
    }

    public static void printBoard(int[][] arr) {
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
            }

    public static void TestArray() {
        setupGame();
        printBoard(checkerboard);
    }
}

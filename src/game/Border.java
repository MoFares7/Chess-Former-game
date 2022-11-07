package game;


public class Border {

    public String blank = "";

    public String print() {

        blank += "\n";
        blank += "\t" + "R";
        blank += "\n";

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 16; col++) {
                if (row == 0 && col == 12) {
                    blank += "\t";
                }
                if (row == 1 && col == 4) {
                    blank += "\t";
                }
                if (row == 2 && col == 8) {
                    blank += "\t";
                }
                blank += "_";
            }
            blank += "\n";
            blank += "\n";

        }
        blank += "\t" + "\t" + " " + "K";

        return blank;

    }


    static int ROW = 4;
    static int COL = 16;

    // Function that prints all
// unique rows in a given matrix.
   public void findUniqueRows(char plan[][])
    {
        // Traverse through the matrix
        for(int i = 0; i < ROW; i++)
        {

            // Check if there is similar column
            // is already printed, i.e if i and
            // jth column match.
            for(int j = 0; j < i; j++) {

                for (int k = 0; k < COL; k++)
                    if (plan[i][k] != plan[j][k]);

            }
                // Print the row
                for(int j = 0; j < COL; j++)
                    System.out.print(plan[i][j] + " ");

                System.out.println();
                System.out.println();
            }
        }
    }


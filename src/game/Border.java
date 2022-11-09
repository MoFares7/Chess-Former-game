package game;


import constrant.Helper;

public class Border {

  static Helper position = new Helper();
    Color color = new Color();
    // Function that prints all
    // unique rows in a given matrix.
   public void printBorder(char[][] plan)
    {
        // Traverse through the matrix
        for(int i = 0; i < position.getNumVertical + 1; i++)
        {
            for(int j = 0; j < i; j++) {

                for (int k = 0; k < position.getNumHorizontal; k++)
                    if (plan[i][k] != plan[j][k]);

            }
                // Print the row
                for(int j = 0; j < position.getNumHorizontal; j++)
                    System.out.print(color.ORANGE + plan[i][j] + "  ");

                System.out.println();
                System.out.println();
            }
        }
    }


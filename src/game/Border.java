package game;


import constrant.Helper;

public class Border {

  static Helper position = new Helper();
    // Function that prints all
// unique rows in a given matrix.
   public void printBorder(char[][] plan)
    {
        // Traverse through the matrix
        for(int i = 0; i < position.getNumVertical + 1; i++)
        {

            // Check if there is similar column
            // is already printed, i.e if i and
            // jth column match.
            for(int j = 0; j < i; j++) {

                for (int k = 0; k < position.getNumHoraizonal; k++)
                    if (plan[i][k] != plan[j][k]);

            }
                // Print the row
                for(int j = 0; j < position.getNumHoraizonal; j++)
                    System.out.print(plan[i][j] + " ");

                System.out.println();
                System.out.println();
            }
        }
    }


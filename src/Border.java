
public class Border {

    @Override
    public String toString() {

        String blank ="";

        System.out.println("s");

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 16; col++){
                if(row == 0 && col == 12){
                    blank += "\t";
                }
                if(row == 1 && col == 4){
                    blank += "\t";
                }
                if(row == 2 && col == 8){
                    blank += "\t";
                }

                blank += "_";


            }
            blank += "\n";
            blank += "\n";

        }

        return blank;

    }

}

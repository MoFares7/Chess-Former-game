package game.view;

public class Positions {
        int x;
        int y;

        Positions(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isValid() {
            return y > -1 && y < 10 && x < 16 && x > -1;
        }

    }


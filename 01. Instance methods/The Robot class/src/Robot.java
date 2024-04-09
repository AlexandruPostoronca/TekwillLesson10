
public class Robot {
    int x, y;

    public void moveRight(int steps) {
        x += steps;
    }

    public void moveUp(int steps) {
        y += steps;
    }

    public void moveLeft(int steps) {
        x -= steps;
        if (x < 0) {
            x = 0;
        }
    }

    public void moveDown(int steps) {
        y -= steps;
        if (y < 0) {
            y = 0;
        }
    }
}


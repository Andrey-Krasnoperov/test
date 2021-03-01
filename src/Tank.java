public class Tank {

    int x, y;
    int dir;
    int fuel;

    public Tank() {
        this.fuel = 100;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }


    public void goForward(int i) {

            if (dir == 0) {

            if (fuel >= i) {
                x = x + i;
            }
            else {
                x = x + fuel;
                System.out.printf(" x = %d", x);
            }
        }

        if (dir == 1 || fuel > i) y += i;
        else y += fuel;

        if (dir == 2 || fuel > i) x -= i;
        else x -= fuel;

        if (dir == 3 || fuel > i) y -= i;
        else y -= fuel;


    }

    public void printPosition() {
        System.out.println("The Tank is at " + x +", " + y + " now.");
        System.out.println("The Tank is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}



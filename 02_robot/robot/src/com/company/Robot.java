package com.company;

public class Robot  {

    private int x = 0;
    private int y = 0;


    public void mover(int x, int y) throws NumberFormatException
    {


        if (x < 11 && x > -11 && y < 11 && y > -11) {
            if ((x == this.x + 1 || x == this.x - 1) && this.y == y)
                this.x = x;
            else if (this.x == x && (y == this.y + 1 || y == this.y - 1))
                this.y = y;
            //else System.out.println("Lo que haces es ilegal!!!!!!!!");
        }
        System.out.println("Posicion x: " + this.x);
        System.out.println("Posicion y: " + this.y);


    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

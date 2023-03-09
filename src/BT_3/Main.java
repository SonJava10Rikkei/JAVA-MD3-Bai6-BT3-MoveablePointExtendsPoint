package BT_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(1,1,4,5);
        movablePoint.setSpeed(6,8);
        System.out.println("Lớp con: "+Arrays.toString(movablePoint.getSpeed()));
        System.out.println("Lớp cha: "+Arrays.toString(movablePoint.getXY()));
        System.out.println("--------------------------------------");
        System.out.println(movablePoint.move());
    }
}
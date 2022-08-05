// Java Program to Find the Volume and Surface Area of
// Cuboids

import java.io.*;

class main25 {
    public static void main(String[] args) {
        // specify L,B and H
        double L = 20, B = 15, H = 10;

        // calculate SurfaceArea
        double SurfaceArea = 2 * (L * B + B * H + H * L);

        // calculate Volume
        double Volume = L * B * H;

        System.out.println(
                "The Surface area of cuboid is : "
                        + SurfaceArea);

        System.out.println("The Volume of the cuboid is : "
                + Volume);
    }
}
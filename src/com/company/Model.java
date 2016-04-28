package com.company;

/**
 * Created by potaychuk on 28.04.2016.
 */
public class Model {
    /**
     * This method returns value of side of square
     * @param area it's area of square
     * @return side of square
     */
    public double sideOfSquare(int area){

        if (area <0){
            throw new IllegalArgumentException();
        }

        return Math.sqrt(area);
    }

    /**
     * This method returns min (int)side of square
     * in witch our square can be put
     * @param area it's area of square
     * @return min side of square
     */
    public int minSide(int area){

        if (area < 0){
         throw new IllegalArgumentException();
        }

        if ( ((int)(Math.sqrt(area))*(int)(Math.sqrt(area)))==area ) {
            return (int) (Math.sqrt(area));
        }

        return (int)(Math.sqrt(area)+1);
    }
}

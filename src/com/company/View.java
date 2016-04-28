package com.company;

/**
 * Created by potaychuk on 28.04.2016.
 */
public class View {

    final String SIDE_OF_SQUARE_IS =  "Side of square is: ";
    final String MIN_SIDE =  "Side of minimal square in witch we can put our square is: ";

    public View() {}

    void print(String string, int number){
        System.out.println(string + number);
    }

    void print(String string, double number){
        System.out.println(string + number);
    }
}

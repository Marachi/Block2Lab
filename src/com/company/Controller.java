package com.company;

/**
 * Created by potaychuk on 28.04.2016.
 * @author
 */
public class Controller {
    private  Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model=model;
        this.view=view;
    }

    void processUser(){
        view.print(view.SIDE_OF_SQUARE_IS, model.sideOfSquare(Integer.MAX_VALUE));
        view.print(view.MIN_SIDE, model.minSide(Integer.MAX_VALUE));
    }
}

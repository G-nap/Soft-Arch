package com.solid.lsp;

public class Square extends Rectangle {

    private int side;

    Square() {
    }
    
    Square(int side) {
        this.setSide(side);
    }
    
    public int getSize() {
        return side;
    }

   
    // @Override
    // public void setWidth(int width) {
    //     this.setSide(width);
    // }

    // @Override
    // public void setHeight(int height) {
    //     this.setSide(height);
    // }

    public void setSide(int side) {
        if (side <= 0) {
            this.side = 1;
            return;
        }
        this.side = side;      
    }
   
    @Override
    public int getArea() {
        return side * side;
    }
}

//Parses an item name to create an item of a certain type

package com.baseline.salestax;

public class Parser {

    private String input;

    public Parser(String input) {
        this.input = input;
    }

    public boolean isValid() {
        if((input.split(" ")[0]).matches("[0-9]+")) {
            return true;
        }

        return false;
    }

    public boolean isBook() {
        if(input.contains("book")) {
            return true;
        }
        return false;
    }

    public boolean isFood() {
        if(input.contains("chocolate") || input.contains("chocolates")) {
            return true;
        }
        return false;
    }

    public boolean isMedicine() {
        if(input.contains("pills")){
            return true;
        }
        return false;
    }
}

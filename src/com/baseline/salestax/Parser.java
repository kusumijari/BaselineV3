//Parses an item name to create an item of a certain type

package com.baseline.salestax;

public class Parser {

    private String input;

    public Parser(String input) {
        this.input = input;
    }

    public boolean isNotFoodOrBookOrMedicine() {
        if(!(isBook() || isFood() || isMedicine() )){
            return true;
        }
        return false;
    }


    public boolean isImported() {
        if(input.contains("imported")) {
            return true;
        }
        return false;
    }

    private boolean isBook() {
        if(input.contains("book")) {
            return true;
        }
        return false;
    }

    private boolean isFood() {
        if(input.contains("chocolate") || input.contains("chocolates")) {
            return true;
        }
        return false;
    }

    private boolean isMedicine() {
        if(input.contains("pills")){
            return true;
        }
        return false;
    }

    public int extractQuantity() {
        return Integer.parseInt(input.split(" ")[0]);
    }

    public String extractItemaName() {
        return input.substring(input.indexOf(" ") + 1, input.indexOf(" at "));
    }

    public double extractPrice() {
        return Double.parseDouble(input.substring(input.indexOf(" at ") + 4));
    }

}

//Calculates sales tax for an item that is imported and is not food or book or medicine

package com.baseline.salestax;

public class ItemNotImportedAndNotFoodOrBookOrMedicine implements Item {
    @Override
    public double calculateSalesTax() {
        return 0;
    }
}

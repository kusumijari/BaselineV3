//Calculates sales tax for an item that is not imported and is food or book or medicine

package com.baseline.salestax;

public class ItemNotImportedAndIsFoodOrBookOrMedicine implements Item{
    @Override
    public double calculateSalesTax() {
        return 0;
    }
}

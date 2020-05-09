package com.Java.Game2.Discount.SizeDiscount;
// Класс - скидки локального магазина.

public class SizeDiscountLocalShop extends SizeDiscountCentralShop  {
    //В случае, если по товару локальная скидка 0, то берется скидка цетрального магазина.
    private int Product1_Discount = 10;
    private int Product2_Discount = 20;
    private int Product3_Discount = 0;

    public int product1_CalcActualDiscount() {
        int product1_ActualDiscount = (this.Product1_Discount != 0 ? this.Product1_Discount : super.Product1_Discount);
        return product1_ActualDiscount;
    }

    public int product2_CalcActualDiscount() {
        int product2_ActualDiscount = (this.Product2_Discount != 0 ? this.Product2_Discount : super.Product2_Discount);
        return product2_ActualDiscount;
    }

    public int product3_CalcActualDiscount() {
        int product3_ActualDiscount = (this.Product3_Discount != 0 ? this.Product3_Discount : super.Product3_Discount);
        return product3_ActualDiscount;
    }
}
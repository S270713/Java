package com.Java.Game2.DiscountDay_enum;
//CombinedOperations.

public class CombinedOperations {
    public void calcDiscountDay() {
        System.out.println("Рассчитанная по методике дополнительная скидка в этот день недели составляет: ");
        int a = 3;
        int b = 2;
        int res = a + b++;//                  5;3;3.
        int res2 = res + ++b;//             9;5;3;4.
        int res3 = res2 -= res;//         4;4;5;3;4.
        int resDiscount = res3 /= 2;//  2;2;4;5;3;4.
        System.out.println(resDiscount + "%");
    }
}
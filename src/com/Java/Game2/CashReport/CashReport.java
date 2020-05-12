package com.Java.Game2.CashReport;

import java.io.Serializable;

public class CashReport implements Serializable {
    public String resultCash = "Результат дневной кассы для передачи отчетности в ГО = 925000 рублей.";
    transient public String innerInfo = "Внутренняя информация для кассиров.";

    @Override
    public String toString() {
        return  "resultCash : " + resultCash +
                "\ninnerInfo : " + innerInfo;
    }
}
package com.Java.Game2.ConfirmBank_Generics;
//generics(обобщения)

public class StartConfirmBank {
    public void startConfirmBank() {

        CardInfoGenericClasses<String, Integer> card = new CardInfoGenericClasses<>();
        card.setCode("Card Visa");
        System.out.print(card.getCode());
        card.setCode2(123456781);
        System.out.println(card.getCode2() + 1);

        //String
        CardInfoGenericClasses<String, String> nameClient = new CardInfoGenericClasses<>();
        nameClient.setCode("\nIvanov");
        nameClient.setCode2("Petr\n");
        System.out.println(nameClient.getCode());
        System.out.println(nameClient.getCode2());

        //Boolean
        CardInfoGenericClasses<Boolean, Boolean> confirmFirst = new CardInfoGenericClasses<>();
        confirmFirst.setCode(true);
        confirmFirst.setCode2(true);
        System.out.println("Подтверждение средств на счете: " + confirmFirst.getCode());
        System.out.println("Наличие овердрафта: " + confirmFirst.getCode2());

        //Ограниченные типы
        System.out.println();
        TotalFundGenericLimit<Integer> moneyInt = new TotalFundGenericLimit<>();
        TotalFundGenericLimit<Double> moneyDouble = new TotalFundGenericLimit<>();
        //Не откомпилируется, т.к. String не является наследником Number.
        //ClassNumbers<String> obString = new ClassNumbers<String>();
        moneyInt.money = 2000;
        moneyDouble.money = 500.5;
        System.out.print("Сумма дебетовых средств и овердрафта: ");
        System.out.println(moneyInt.money + moneyDouble.money);

        //Обобщенные мметоды.
        System.out.println();
        ConfirmGenericMethods genMethods = new ConfirmGenericMethods();
        int balance = 0;
        String confirm = "Операция прошла успешно.";
        genMethods.<String>print(confirm);
        System.out.print("Баланс: ");
        genMethods.<Integer>print(balance);
    }
}
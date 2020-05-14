package com.Java.Game2.MailPresent_TryWithResources;
//Try-With-Resources

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class StartMailPresent {
    public void startMailPresent() throws Exception {
        sleep(1000); // Задержка в 1 сек, чтобы в предыдущем блоке отработали потоки.

        try (   MailPresentNewClient client1 = new MailPresentNewClient("Иван");
                MailPresentNewClient client2 = new MailPresentNewClient("Юлия");) {
            System.out.println("Просим всех поаплодировать!");
        }

        System.out.println("Мы дарим вам карту клиента и высылаем ее по почте.");
        String bonusCard = "Карта покупателя со скидкой в 30%.";
        FileOutputStream fos = null;//Вариант до Java 1.7
        try {
            fos = new FileOutputStream("D:/CardTest.txt");
            fos.write(bonusCard.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fos.close();
        }

        System.out.println("На этот же адрес направляем информационный листок со скидками.");
        String discountOffered = "Информационный листок с новыми скиидками.";
        try(FileOutputStream fos2 = new FileOutputStream("D:/OfferedTest.txt")) {//Вариант с Java 1.7
            fos2.write(discountOffered.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Направляем копию информационного листка по второму укзанному вами адресу.");
        try(FileInputStream fis3 = new FileInputStream("D:/OfferedTest.txt");//Копирование имеющегося файла.
            FileOutputStream fos3 = new FileOutputStream("D:/OfferedTestCopy.txt");
            ByteArrayOutputStream baos3 = new ByteArrayOutputStream()) {
            int buffer;
            while((buffer = fis3.read()) != -1) {
                baos3.write(buffer);
            }
            baos3.writeTo(fos3);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
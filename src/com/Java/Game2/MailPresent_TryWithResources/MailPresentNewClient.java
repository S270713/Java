package com.Java.Game2.MailPresent_TryWithResources;

public class MailPresentNewClient implements AutoCloseable {
    private String name;
    MailPresentNewClient(String name) {
        this.name = name;
        System.out.println("\nПоздравляем нового клиента! " + name);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Аплодисменты клиенту! " + name);
    }
}
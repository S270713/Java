public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if (age > 20) {
            System.out.println("Взрослый человек.");
        }

        boolean isMale = false;
        if (isMale) {
            System.out.println("Мужчина.");
        }
        if (!isMale) {
            System.out.println("Женщина.");
        }

        double height = 1.6;
        if (height < 1.8) {
            System.out.println("Человек низкого роста.");
        } else {
            System.out.println("Человек высокого роста.");
        }

        String name = "Peter";
        char firstNameLetter = name.charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Это Михаил.");
        } else if (firstNameLetter == 'I') {
            System.out.println("Это Иван.");
        } else {
            System.out.println("Это не Михаил и не Иван.");
        }  
    }
}
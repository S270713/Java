public class WolfTest {
    public static void main(String[] args) {
        Wolf firstStrong = new Wolf();
        name = "Strong";
        color = "Black";
        isMale = true;
        weight = 25;
        age = 5;
        
        System.out.println("Кличка  " + name);
        System.out.println("Цвет  " + color);
        
        if (isMale) {
            System.out.println("Пол мужской");
        } else {
            System.out.println("Пол женский");
        }
        
        System.out.println("Вес  " + weight);
        System.out.println("Возраст  " + age);
        
        System.out.println();
        
        firstStrong.sit();
        firstStrong.go();
        firstStrong.run();
        firstStrong.howl();
        firstStrong.hunt();
    }
}
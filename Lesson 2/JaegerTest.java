public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Bracer Phoenix");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight((float) 70.7);
        jaeger1.setWeight((float)2.1);
        jaeger1.setSpeed(3);
        jaeger1.setStrength(8);
        jaeger1.setArmor(9);

        System.out.println("jaeger1");
        System.out.println(jaeger1.getModelName());
        System.out.println(jaeger1.getMark());
        System.out.println(jaeger1.getOrigin());
        System.out.println(jaeger1.getHeight());
        System.out.println(jaeger1.getWeight());
        System.out.println(jaeger1.getSpeed());
        System.out.println(jaeger1.getStrength());
        System.out.println(jaeger1.getArmor());

        //Действия:
        System.out.println();
        System.out.println("jaeger1");
        jaeger1.drift();
        jaeger1.move();
        jaeger1.useVortexCannon();
        System.out.println();
        System.out.println("jaeger1 в бою потерял ряд орудий");
        System.out.println("Было орудий:");
        System.out.println(jaeger1.getArmor());
        jaeger1.setArmor(2);
        System.out.println("Стало орудий");
        System.out.println(jaeger1.getArmor());

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Horizon Brave");
        jaeger2.setMark("Mark-1");
        jaeger2.setOrigin("China");
        jaeger2.setHeight((float) 72);
        jaeger2.setWeight((float)7.8);
        jaeger2.setSpeed(8);
        jaeger2.setStrength(4);
        jaeger2.setArmor(6);

        System.out.println();
        System.out.println("jaeger2");
        System.out.println(jaeger2.getModelName());
        System.out.println(jaeger2.getMark());
        System.out.println(jaeger2.getOrigin());
        System.out.println(jaeger2.getHeight());
        System.out.println(jaeger2.getWeight());
        System.out.println(jaeger2.getSpeed());
        System.out.println(jaeger2.getStrength());
        System.out.println(jaeger2.getArmor());

        //Действия:
        System.out.println();
        System.out.println("jaeger2");
        jaeger2.useVortexCannon();
    }
}
public class JaegerTest2 {
    public static void main(String[] args) {
        Jaeger2 jaeger11 = new Jaeger2("Bracer Phoenix", "Mark-5", "USA", 70.7f, 2.1f, 3, 8, 9);
        System.out.println(jaeger11.getModelName());
        System.out.println(jaeger11.getMark());
        System.out.println(jaeger11.getOrigin());
        System.out.println(jaeger11.getHeight());
        System.out.println(jaeger11.getWeight());
        System.out.println(jaeger11.getSpeed());
        System.out.println(jaeger11.getStrength());
        System.out.println(jaeger11.getArmor());
        //Действия:
        System.out.println();
        System.out.println("jaeger11");
        jaeger11.move();
        jaeger11.useVortexCannon();
        //Доукомплектация оружия:
        jaeger11.setArmor(20);
        System.out.println("jaeger11 нарастил вооружение до уровня - " + jaeger11.getArmor());

        System.out.println();
        Jaeger2 jaeger22 = new Jaeger2("Horizon Brave", "Mark-1", "China", 72f, 7.8f, 8, 4, 6 );
        System.out.println(jaeger22.getModelName());
        System.out.println(jaeger22.getMark());
        System.out.println(jaeger22.getOrigin());
        System.out.println(jaeger22.getHeight());
        System.out.println(jaeger22.getWeight());
        System.out.println(jaeger22.getSpeed());
        System.out.println(jaeger22.getStrength());
        System.out.println(jaeger22.getArmor());
        //Действия:
        System.out.println();
        System.out.println("jaeger22");
        jaeger22.drift();
        //Падение скорости:
        System.out.println("Авария");
        jaeger22.setSpeed(1);
        System.out.println("Скорость jaeger22 упала до:  " + jaeger22.getSpeed());
    }
}
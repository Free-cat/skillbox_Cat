
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        System.out.println("Вес кошки " + cat.getWeight());
        cat.feed(1000 + (double) (Math.random() * 3000));
        System.out.println("Покормили кошку случайным числом еды");
        System.out.println("Кошка съела: " + cat.getEatAmount());
        System.out.println("Вес кошки " + cat.getWeight());
        cat.crap();
        System.out.println("Вес кошки " + cat.getWeight());
    }
}
import java.util.Arrays;

public class Loader
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 8; i++){
            Cat cat = new Cat();
            System.out.println("===========================================");
            System.out.println("Вес кошки " + i + ": " + cat.getWeight());
            cat.feed(1000 + (double) (Math.random() * 3000));
            System.out.println("Покормили кошку случайным числом еды");
            System.out.println("Вес кошки " + i + ": " + cat.getWeight());
            if (i % 2 == 0){
                System.out.println("Кошка четная попробуем ее взорвать");
                var firstLoop = true;
                while(!cat.getStatus().equals("Exploded")){
                    if (firstLoop){
                        System.out.println("Вес кошки " + i + ": " + cat.getWeight());
                        firstLoop = false;
                    }
                    var eat =  1000 + (double) (Math.random() * 3000);
                    cat.feed(eat);
                    System.out.println("Дали кошке " + eat + "г. еды, кошка " + (cat.getStatus().equals("Exploded") ? "Взорвалась" : "Жива"));
                }
            }else{
                System.out.println("Кошка не четная попробуем ее замяучить до смерти");
                int meowCount = 0;
                while(!cat.getStatus().equals("Dead")){
                    cat.meow();
                    meowCount++;
                }
                System.out.println("\nКошка мяучила " + meowCount + " раз и она умерла");
            }
        }
        System.out.println("\nПри испытаниях ни одна реальная кошка не постарадла, это всего-лишь фантазия автора");

        // ===========================================================================
        System.out.println("\n===========================================");
        Cat cat = new Cat();
        System.out.println("Вес кошки " + cat.getWeight());
        cat.feed(1000 + (double) (Math.random() * 3000));
        System.out.println("Покормили кошку случайным числом еды");
        System.out.println("Кошка съела: " + cat.getEatAmount());
        System.out.println("Вес кошки " + cat.getWeight());
        cat.crap();
        System.out.println("Вес кошки " + cat.getWeight());

        // ===========================================================================
        System.out.println("\n===========================================");
        System.out.println("Всего живых кошек: " + Cat.getCatsCount());
        System.out.println("Создадим кошку и проверим их количество");
        Cat catTestCount = new Cat();
        System.out.println("Всего живых кошек: " + Cat.getCatsCount());

        // ===========================================================================
        System.out.println("\n===========================================");
        System.out.println("Минимальный вес кошки: " + Cat.MIN_WEIGHT + " Максимальный вес кошки: " + Cat.MAX_WEIGHT);
        System.out.println("Цвета кошек: " + Arrays.toString(CatColor.values()));

        // ===========================================================================
        System.out.println("\n===========================================");
        System.out.println("Всего живых кошек: " + Cat.getCatsCount());
        System.out.println("Создадим кошку со смертельным весом и проверим их количество");
        Cat catTestMaxWeigthCount = new Cat(Cat.MAX_WEIGHT + 100);
        System.out.println("Всего живых кошек: " + Cat.getCatsCount());

        // ===========================================================================
        System.out.println("\n===========================================");
        System.out.println("Создадим кошку с весом 5 кг.");
        Cat catWeightConstructorTest = new Cat(5000.0);
        System.out.println("Вес кошки " + catWeightConstructorTest.getWeight());

        // ===========================================================================
        System.out.println("\n===========================================");
        Cat catTestColorGetterSetter = new Cat();
        System.out.println("Укажем кошке цвет черный");
        catTestColorGetterSetter.setColor(CatColor.BLACK);
        System.out.println("Теперь цвет кошки: " + catTestColorGetterSetter.getColor());

        // ===========================================================================
        System.out.println("\n===========================================");
        System.out.println("Всего живых кошек: " + Cat.getCatsCount());
        Cat catTestCloneable = new Cat();
        System.out.println("Всего живых кошек: " + Cat.getCatsCount());
        System.out.println("Вес оригинальной кошки " + catTestCloneable.getWeight());
        Cat catTestClone = catTestCloneable.cloneCat();
        System.out.println("Вес копии кошки " + catTestClone.getWeight());
        System.out.println("Покормим оригинальную кошку");
        catTestCloneable.feed(1000 + (double) (Math.random() * 3000));
        System.out.println("Вес оригинальной кошки " + catTestCloneable.getWeight());
        System.out.println("Вес копии кошки " + catTestClone.getWeight());
        System.out.println("Покормим копию кошки");
        catTestClone.feed(1000 + (double) (Math.random() * 3000));
        System.out.println("Вес оригинальной кошки " + catTestCloneable.getWeight());
        System.out.println("Вес копии кошки " + catTestClone.getWeight());
    }
}
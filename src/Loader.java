
public class Loader
{
    public static void main(String[] args)
    {
//        Cat cat = new Cat();
//        System.out.println(cat.getWeight());
//        cat.feed((double) 1000);
//        System.out.println(cat.getWeight());
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
        System.out.println("\n\nПри испытаниях ни одна реальная кошка не постарадла, это всего-лишь фантазия автора");
    }
}
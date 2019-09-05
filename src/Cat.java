
public class Cat
{
    public static int catsCount;
    private double originWeight;
    private double weight;

    private double eatAmount;

    private double minWeight;
    private double maxWeight;

    public static int getCatsCount() {
        return catsCount;
    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        eatAmount = 0;
        catsCount = catsCount + 1;
    }

    public void crap(){
        if (catIsDead()){
            System.out.println("Мертвая кошка не может ходить в туалет :'( ");
            return;
        }
        weight = weight - 10;
        System.out.println("Кошка сходила в туалет");
        catsCountCheckDead();
    }

    public void meow()
    {
        if (catIsDead()){
            System.out.println("Мертвые кошки не мяукают :'( ");
            return;
        }
        weight = weight - 1;
        System.out.print("Meow ");
        catsCountCheckDead();
    }

    public void feed(Double amount)
    {
        if (catIsDead()){
            System.out.println("Мертвая кошка не может кушать :'(");
            return;
        }
        eatAmount += amount;
        weight = weight + amount;
        catsCountCheckDead();
    }

    public void drink(Double amount)
    {
        if (catIsDead()){
            System.out.println("Мертвая кошка не может пить :'(");
            return;
        }
        weight = weight + amount;
        catsCountCheckDead();
    }

    public double getEatAmount() {
        return eatAmount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    private void catsCountCheckDead(){
        if (catIsDead()){
            catsCount = catsCount - 1;
        }
    }

    private boolean catIsDead(){
        return (weight < minWeight || weight > maxWeight);
    }
}

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
        weight = weight - 10;
        System.out.println("Кошка сходила в туалет");
        checkCatStatus();
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.print("Meow ");
        checkCatStatus();
    }

    public void feed(Double amount)
    {
        eatAmount += amount;
        weight = weight + amount;
        checkCatStatus();
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        checkCatStatus();
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

    private void checkCatStatus(){
        if (getStatus().equals("Dead") || getStatus().equals("Exploded")){
            catsCount = catsCount - 1;
        }
    }
}
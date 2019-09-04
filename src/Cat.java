
public class Cat
{
    private double originWeight;
    private double weight;

    private double eatAmount;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        eatAmount = 0;
    }

    public void crap(){
        weight = weight - 10;
        System.out.println("Кошка сходила в туалет");
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.print("Meow ");
    }

    public void feed(Double amount)
    {
        eatAmount += amount;
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
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
}

public class Cat
{
    public static final double MAX_WEIGHT = 9000.0;
    public static final double MIN_WEIGHT = 1000.0;

    public static int catsCount;
    private double originWeight;
    private double weight;

    private CatColor color;

    private double eatAmount;

    public static int getCatsCount() {
        return catsCount;
    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        eatAmount = 0;
        catsCount = catsCount + 1;
    }

    public Cat(double weight){
        this();
        this.weight = weight;
        originWeight = weight;
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

    public CatColor getColor() {
        return color;
    }

    public void setColor(CatColor color) {
        this.color = color;
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
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
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
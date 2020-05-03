
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
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight){
        this.weight = weight;
        if (!catIsDead()){
            originWeight = weight;
            eatAmount = 0;
            catsCount = catsCount + 1;
        }
    }

    public Cat(Cat cloneable){
        this.weight = cloneable.getWeight();
        this.originWeight = cloneable.getOriginWeight();
        this.color = cloneable.getColor();
        this.eatAmount = cloneable.getEatAmount();
    }

    public Cat cloneCat(){
        return new Cat(this);
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

    public double getOriginWeight() {
        return originWeight;
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

    private void catsCountCheckDead(){
        if (catIsDead()){
            catsCount = catsCount - 1;
        }
    }

    private boolean catIsDead(){
        return (weight < MIN_WEIGHT || weight > MAX_WEIGHT);
    }
}
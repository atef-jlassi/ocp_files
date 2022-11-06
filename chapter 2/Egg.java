public class Egg {
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.print(egg.number);
    }

    private int number = 3;
    {number = 4;}
}
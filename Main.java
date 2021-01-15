public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = (int) service.calculate(price:10_000);
        System.out.println(miles);
    }
}
public class BonusMilesService {
    public long calculate(int miles){
        int price = 10_000;
        int mile = 20;
        int bonus = price/mile;
        return bonus;
    }
}

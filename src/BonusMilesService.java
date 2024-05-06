public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int milesPer20Rubles = 1; // Количество миль за каждые 20 рублей
        return ticketPrice / 20 * milesPer20Rubles;
    }
}

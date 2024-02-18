public class Train implements ModeOfTransport {
    public double calculateCost(double distance) {
        return distance / 20;
    }

    public double calculateProfit(double money, double distance) {
        return money - calculateCost(distance);
    }
}

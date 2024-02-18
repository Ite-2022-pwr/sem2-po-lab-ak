public class Airplane implements ModeOfTransport {
    public double calculateCost(double distance) {
        return (distance * distance) / 100;
    }

    public double calculateProfit(double money, double distance) {
        return (double)money - calculateCost(distance);
    }
}

public class CarsAssemble {

    public static final int BASE_CARS_PER_HOUR = 221;

    // Return success rate of input speed
    public static double successRate(int speed) {
        switch (speed) {
            case 5: case 6: case 7: case 8:
                return 0.9;
            case 9:
                return 0.8;
            case 10:
                return 0.77;
            default:
                return 1.0;
        }
    }
    
    // Calculate production rate from speed, base cars and success rate of given speed
    public double productionRatePerHour(int speed) {
        return speed * BASE_CARS_PER_HOUR * successRate(speed);
    }

    // Return cars per minute
    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}

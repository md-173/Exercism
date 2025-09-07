public class CarsAssemble {

    public static final int BASE_CARS_PER_HOUR = 221;
    
    public double productionRatePerHour(int speed) {
        if (speed == 0) {
            return 0;
        }
        else if (speed >= 5 && speed <= 8) {
            return speed * BASE_CARS_PER_HOUR * 0.9;
        }
        else if (speed == 9) {
            return speed * BASE_CARS_PER_HOUR * 0.8;
        }
        else if (speed == 10) {
            return speed * BASE_CARS_PER_HOUR * 0.77;
        }
        else {
            return speed * BASE_CARS_PER_HOUR;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}

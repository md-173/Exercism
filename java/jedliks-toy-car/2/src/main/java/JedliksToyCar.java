public class JedliksToyCar {
    private int meters;
    private int battery;

    public JedliksToyCar() {
        meters = 0;
        battery = 100;
    }
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", meters);
    }

    public String batteryDisplay() {
        if (battery <= 0) {
            return "Battery empty";
        }
        else {
            return String.format("Battery at %d%%", battery);
        }
    }

    public void drive() {
        if (battery > 0) {
            meters += 20;
            battery -= 1;
        }
    }
}

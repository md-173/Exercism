public class Lasagna {
    public static final int EXPECTED_MINUTES = 40;
    public static final int LASAGNE_LAYERS_PREP_TIME = 2;
    
    // Expected Minutes in Oven = 40
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES;
    }
    
    // Remaining time in Oven = expected time - time so far
    public int remainingMinutesInOven(int actualMinutes) {
        return EXPECTED_MINUTES - actualMinutes;
    }
    
    // Preparation time = number of lasagne layers * 2
    public int preparationTimeInMinutes(int numLayers) {
        return numLayers * LASAGNE_LAYERS_PREP_TIME;
    }
    
    // Total Cooking time = preparation time + minutes already in oven
    public int totalTimeInMinutes(int numLayers, int minutesAlreadyInOven) {
        return preparationTimeInMinutes(numLayers) + minutesAlreadyInOven;
    }
}

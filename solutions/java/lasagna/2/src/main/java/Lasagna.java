public class Lasagna {
    // Expected Minutes in Oven = 40
    public int expectedMinutesInOven() {
        return 40;
    }
    // Remaining time in Oven = expected time - time so far
    public int remainingMinutesInOven(int actualMinutes) {
        int remainingMinutes = expectedMinutesInOven() - actualMinutes;
        return remainingMinutes;
    }
    // Preparation time = number of lasagne layers * 2
    public int preparationTimeInMinutes(int numLayers) {
        int prepTime = numLayers * 2;
        return prepTime;
    }
    // Total Cooking time = preparation time + minutes already in oven
    public int totalTimeInMinutes(int numLayers, int minutesAlreadyInOven) {
        int totalTime = preparationTimeInMinutes(numLayers) + minutesAlreadyInOven;
        return totalTime;
    }
}

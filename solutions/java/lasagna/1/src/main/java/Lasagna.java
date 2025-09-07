public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes) {
        int remainingMinutes = expectedMinutesInOven() - actualMinutes;
        return remainingMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numLayers) {
        int prepTime = numLayers * 2;
        return prepTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numLayers, int minutesAlreadyInOven) {
        int totalTime = preparationTimeInMinutes(numLayers) + minutesAlreadyInOven;
        return totalTime;
    }
}

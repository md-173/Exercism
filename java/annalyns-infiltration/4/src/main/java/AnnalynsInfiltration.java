class AnnalynsInfiltration {
    // Return true if Knight is sleeping, false otherwise
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    // Return true if anyone is awake, false otherwise
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
   
    // Return true if Prisoner awake and Archer sleeping, else false
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    // Return true if dogPresent and archer asleep, or prisoner awake and knight/archer sleeping, else false
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return !archerIsAwake && (petDogIsPresent || prisonerIsAwake && !knightIsAwake); 
    }
}

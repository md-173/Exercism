
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int lastIndex;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.lastIndex = birdsPerDay.length - 1;
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[lastIndex];
    }

    public void incrementTodaysCount() {
        birdsPerDay[lastIndex]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int dayCount : birdsPerDay) {
            if (dayCount == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int dayCount : birdsPerDay) {
            if (dayCount >= 5) {
                busyDays++;
            }
        }
        return busyDays++;
    }
}

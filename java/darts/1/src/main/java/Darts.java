class Darts {
    int score(double xOfDart, double yOfDart) {
        double d = Math.sqrt(Math.pow(xOfDart,2) + Math.pow(yOfDart,2));
        int out = (d > 10) ? 0 : (d <= 10 && d > 5) ? 1 : (d <= 5 && d > 1) ? 5 : 10;
        return out;
    }
}

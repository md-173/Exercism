class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int orig = numberToCheck;
        int length = String.valueOf(numberToCheck).length();
        int calc = 0;
        
        while (numberToCheck > 0) {
            int curDigit = numberToCheck % 10;
            calc += Math.pow(curDigit, length);
            numberToCheck /= 10;
        }

        return orig == calc;
    }
}

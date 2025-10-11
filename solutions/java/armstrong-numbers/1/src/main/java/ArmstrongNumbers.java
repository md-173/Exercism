class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String s = String.valueOf(numberToCheck);
        int length = (numberToCheck == 0) ? 0 : s.length(); 
        char[] cArr = s.toCharArray();
        int calc = 0;
        
        for(int i = 0; i < length; i++) {
            calc += (int) Math.pow(((int)cArr[i] - 48 ), length);
        }

        boolean out = (numberToCheck == calc) ? true : false;
        return out;
    }
}

class Leap {

    boolean isLeapYear(int year) {
        boolean bool;
        bool = (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0) ? true : false ;
        return bool;
    }

}

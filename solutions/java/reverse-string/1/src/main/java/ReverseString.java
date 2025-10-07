class ReverseString {

    String reverse(String inputString) {
        char[] charArray = inputString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        return sb.toString();   
    }
}

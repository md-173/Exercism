class SqueakyClean {
    static String clean(String identifier) {
        identifier = replaceSpace(identifier);
        identifier = replaceLeet(identifier);
        StringBuilder sb = new StringBuilder(identifier);
        sb = kebabToCamel(sb);
        sb = removeSpecial(sb);
        return sb.toString();
    }

    private static String replaceSpace(String identifier) {
        return identifier.replace(' ', '_');      
    }

    private static String replaceLeet(String identifier) {
        identifier =  identifier.replace('4', 'a')
                                .replace('3', 'e')
                                .replace('0', 'o')
                                .replace('1', 'l')
                                .replace('7', 't');
        
        return identifier;
    }
    
    private static StringBuilder kebabToCamel(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '-') {
                if (i != sb.length() - 1) {
                    sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i+1)));
                    sb.deleteCharAt(i);
                    i--;
                }
            }
        }
        return sb;
    }

    private static StringBuilder removeSpecial(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isLetter(sb.charAt(i)) && sb.charAt(i) != '_') {
                sb.deleteCharAt(i);   
                i--;
            }
        }
        return sb;
    }
    
}

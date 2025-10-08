public class Twofer {
    public String twofer(String name) {
        String output = (name == null) ? "you" : name;
        return "One for " + output + ", one for me.";
    }
}

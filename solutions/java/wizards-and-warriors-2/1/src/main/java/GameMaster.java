public class GameMaster {

    // returns a description of a Character
    public String describe(Character inCharacter) {
        return "You're a level " + inCharacter.getLevel() + " " + inCharacter.getCharacterClass() + " with " + inCharacter.getHitPoints() + " hit points.";
    }
    // returns a description of a Destination
    public String describe(Destination inDest) {
        return "You've arrived at " + inDest.getName() + ", which has " + inDest.getInhabitants() + " inhabitants.";
    }
    // returns a description of a TravelMethod
    public String describe(TravelMethod tm) {
        String output;
        if (tm == tm.WALKING) {
            output = "by walking.";   
        }
        else {
            output = "on horseback.";
        }
        return "You're traveling to your destination " + output;
    }
    
    // returns a description of a Character, Destination and TravelMethod
    public String describe(Character c, Destination d, TravelMethod tm) {
        return describe(c) + " " + describe(tm) + " " + describe(d);
    }
    
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character c, Destination d) {
        return describe(c) + " " + describe(TravelMethod.WALKING) + " " + describe(d);
    }
    
}

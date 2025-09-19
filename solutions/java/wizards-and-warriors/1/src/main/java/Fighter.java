class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {  

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int dmg = fighter.isVulnerable() ? 10 : 6;
        return dmg;
    }
    
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean prepared = false;
    
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        prepared = true;
    }

    @Override
    boolean isVulnerable() {
        boolean vuln = prepared ? false : true;
        return vuln;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int dmg = prepared ? 12 : 3;
        return dmg;
    }
}

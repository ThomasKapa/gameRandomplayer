package model;

public class Player {

    private String name;
    private int ability;

    public Player(String name, int ability) {
        this.name = name;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public int compareAbility (Player p2){
        if (this.getAbility() < p2.getAbility()) {
            return -1;
        } else if (this.getAbility() == p2.getAbility()) {
            return 0;
        } else {
            return 1;
        }

    }
}

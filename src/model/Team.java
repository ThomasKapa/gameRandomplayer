package model;

public class Team{

    private String name;

    //γραμμή παρακάτω , σημαίνει πάρε χώρο για να θυμάσαι 2 players
    private Player[] players = new Player[2];

    private Player teamLeader;




    public Player getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Player teamLeader) {
        this.teamLeader = teamLeader;
    }

    public Team(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //σου επιστρέφει τους πέκτες που έχεις στην μνήμη
    public Player[] getPlayers() {
        return players;
    }

    //αυτα τα κουτακια που έχω δεσμεύσει στη μνήμη άλλαξε τα με αυτά που σου δίνω
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Player chooseRandomPlayer () {
        int position = (int) (Math.random() * players.length);
        Player player = players[position];
        return player;
    }

}


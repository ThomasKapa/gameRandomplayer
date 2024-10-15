import model.Player;
import model.Team;

import java.util.Scanner;

public class MainApp {

    private static void runTeamsDemo() {
        Player p1 = new Player("Dimitris", 600);
        Player p2 = new Player("Dora", 601);
        Player p3 = new Player("Thomas", 2);
        Player p4 = new Player("Aaron", 599);

        Team firstTeam = new Team("OTE Career Shift");
        Team secondTeam = new Team("Ampelokipoi Power");

        //πρώτος τρόπος να ορισουμε τιμες στους παίκτες
        // (καλύτερο για όταν θέλω να πειράξω μεμονωμένα κάποιους απο τους players)
        firstTeam.getPlayers()[0] = p1;
        firstTeam.getPlayers()[1] = p4;
        //δεύτερος τρόπος να ορίσουμε τιμές στους παίκτες
        //(καλύτερο για όταν θέλω να πειράξω μαζικά τους players)
        firstTeam.setTeamLeader(p4);
        Player[] players2 = new Player[2];
        players2[0] = p2;
        players2[1] = p3;

        //το ίδιο με το παραπάνω αλλά πιο γρήγορο.
//        Player[] players3 = new Player[]{p2,p3,new Player("Thomas2",players2[1].getAbility() + 4};
        secondTeam.setPlayers(players2);
        secondTeam.setTeamLeader(secondTeam.getPlayers()[0]);


//        System.out.println(firstTeam.getPlayers()[1].getAbility());


        playGame(firstTeam, secondTeam);


    }


    private static void playGame(Team firstTeam, Team secondTeam) {
        Player p1 = firstTeam.chooseRandomPlayer();
        Player p2 = secondTeam.chooseRandomPlayer();
        int result = p1.compareAbility(p2);
        Team winningTeam = null;
        if (result < 0) {
            winningTeam = secondTeam;
        } else if (result > 0) {
            winningTeam = firstTeam;
        }
        if (winningTeam == null) {
            System.out.println("the game was a draw");
        } else {
            System.out.println("The winning team is " + winningTeam.getName());
        }
    }

//        private static int compareAbility (Player p1, Player p2){
//            if (p1.getAbility() < p2.getAbility()) {
//                return -1;
//            } else if (p1.getAbility() == p2.getAbility()) {
//                return 0;
//            } else {
//                return 1;
//            }
//
//        }

//        private static Player chooseRandomPlayer (Team team){
//            int position = (int) (Math.random() * (team.getPlayers().length));
//            Player player = team.getPlayers()[position];
//            return player;


//        (int)(Math.random()* (hi - low + 1)+low)
//        δημιουργεί ενα τυχαίο αριθμό μεταξύ των δύο σημείων high και low




        public static void main (String[]args){


            runTeamsDemo();

            //        runScannerDemo();


        }

        private static void runScannerDemo () {
            //array//
            int[] numbers = new int[2]; //φτιαξε χώρο για μεταβλητες που θα δείχουν σε αντικείμενα
            // που θα τα φτιάξεις εσυ αργότερα

            String[] names = new String[2];

            System.out.println(numbers[0]);
            System.out.println(names[0]);


            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Give number " + (i + 1) + ":");
                numbers[i] = scanner.nextInt();

            }

            Player player = new Player("Thomas", 100);
            //αν σβήσω τους setters στην class player τότε μπορώ να ορίσω μεταβλητές στα αντικείμενα
            // που δημιουργώ αλλά μόνο την πρώτη φορά που βάζω την παραπάνω γραμμή κωδικα.
        }

    }


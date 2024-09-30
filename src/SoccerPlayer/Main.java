////f. Create main function and in the main function create 5-6 players. Then Test all of them.
////g. Create github repo for this project from your github and publish your codes in your github, then send the link to me.

package SoccerPlayer;

public class Main {
    public static void main(String[] args) {


        SoccerPlayer player = new SoccerPlayer("Edina", 50, "Brightstar", 3);
        SoccerPlayer player1 = new SoccerPlayer("Prince", 24, "Uganda Crane", 2);
        SoccerPlayer player2 = new SoccerPlayer("Hanna", 30, "Man U", 0);
        SoccerPlayer player3 = new SoccerPlayer("Wafi", 25, "Arsenal", 5);
        SoccerPlayer player4 = new SoccerPlayer("Melissa", 20, "Man City", 1);

        if (player.equals(player1)) { //override equals function
            System.out.println("they are equal");
            System.out.println(player);// override toString function
            System.out.println(player1);
        } else {
            System.out.println("They are not equal");
            System.out.println(player);
            System.out.println(player1);

        }
        if (player2.equals(player3)) { //override equals function
            System.out.println("they are equal");
            System.out.println(player2);// override toString function
            System.out.println(player3);
        } else {
            System.out.println("They are not equal");
            System.out.println(player2);
            System.out.println(player3);
        }
        if (player4.equals(player1)) { //override equals function
            System.out.println("they are equal");
            System.out.println(player4);// override toString function
            System.out.println(player1);
        } else {
            System.out.println("They are not equal");
            System.out.println(player4);
            System.out.println(player1);

        }
}
}
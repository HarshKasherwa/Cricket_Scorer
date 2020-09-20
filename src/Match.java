import java.util.Scanner;

class Match {

    private static Team Team_A, Team_B;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of players");
        int var_a = sc.nextInt();
        System.out.println("Enter name of Team A");
        String var_b  = sc.next();
         Team_A = new Team(var_b, var_a);
        System.out.println("Enter name of Team B");
        var_b = sc.next();
        Team_B = new Team(var_b, var_a);

        System.out.println("Enter players name of team A");
        Team_A.add_player_details();

        System.out.println("Enter players name of team A");
        Team_B.add_player_details();

        int overs = 0, bowls = 0;
        int max_overs = 2;
    }
}

import java.util.Scanner;

class Team {

    String team_name;
    int number_of_players;
    int score;
    int wickets_fallen;
    Player[] player_array;

    public Team(String team_name, int number_of_players) {
        this.team_name = team_name;
        this.number_of_players = number_of_players;
        score = 0;
        wickets_fallen = 0;
        player_array = new Player[this.number_of_players];
    }

    public String getTeam_name() {
        return team_name;
    }

    public int getNumber_of_players() {
        return number_of_players;
    }

    public int getScore() {
        return score;
    }

    public int getWickets_fallen() {
        return wickets_fallen;
    }

    void add_player_details()   {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < player_array.length; i++)   {
            String name = sc.next();
            player_array[i].setPlayer_name(name);
        }
    }
}

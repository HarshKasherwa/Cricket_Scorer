class Player {

    String player_name;
    int runs, balls_played;
    int fours, six, ones, twos, threes;
    double SR;
    int runs_given, balls_bowled, wickets;
    double economy;

    void set_default_values()  {
        runs = 0;
        balls_bowled = 0;
        balls_played = 0;
        fours = 0;
        six = 0;
        ones = 0;
        twos = 0;
        threes = 0;
        SR = 0.0;
        runs_given = 0;
        wickets = 0;
        economy = 0.0;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
        set_default_values();
    }
}

public class Scoreboard {
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }
    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }

    public void recordPlay(int score)
    {
        if (score==0&&teamOne.equals(activeTeam)){
            activeTeam=teamTwo;
        } else if (score==0&&teamTwo.equals(activeTeam)) {
            activeTeam = teamOne;
        }
        if(activeTeam.equals(teamOne)){
            teamOneScore+=score;
        }
        if(activeTeam.equals(teamTwo)){
            teamTwoScore+=score;
        }
    }
}

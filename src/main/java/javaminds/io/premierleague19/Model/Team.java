package javaminds.io.premierleague19.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String teamName;
    private long matchesPlayed;
    private long wins;

    @Transient
    private List<Match> matches;

    

    public List<Match> getMatches() {
        return matches;
    }
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public long getMatchesPlayed() {
        return matchesPlayed;
    }
    public void setMatchesPlayed(Long matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
    public long getWins() {
        return wins;
    }
    public void setWins(Long wins) {
        this.wins = wins;
    }
    public Team(String teamName, long matchesPlayed) {
        this.teamName = teamName;
        this.matchesPlayed = matchesPlayed;
    }
   
    @Override
    public String toString() {
        return "Team [teamName=" + teamName + ", MatchesPlayed=" + matchesPlayed + ", totalWins=" + wins + "]";
    }
    
    public Team() {
        
    }
    
 
    

}

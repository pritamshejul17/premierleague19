package javaminds.io.premierleague19.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import javaminds.io.premierleague19.Data.PrimaryKey;

@Entity
@IdClass(PrimaryKey.class)
public class Match {

    @Id
    private LocalDate date;
    @Id
    private String homeTeam;
    @Id
    private String awayTeam;
    private Integer homeTeamGoals;
    private Integer awayteamGoals;
    private String matchWinner;
    private String refreee;

    

    public Match() {
    }

    

    public Match(LocalDate date, String homeTeam, String awayTeam, Integer homeTeamGoals, Integer awayteamGoals,
            String matchWinner, String refreee) {
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamGoals = homeTeamGoals;
        this.awayteamGoals = awayteamGoals;
        this.matchWinner = matchWinner;
        this.refreee = refreee;
    }



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(Integer homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public Integer getAwayteamGoals() {
        return awayteamGoals;
    }

    public void setAwayteamGoals(Integer awayteamGoals) {
        this.awayteamGoals = awayteamGoals;
    }

    public String getMatchWinner() {
        return matchWinner;
    }

    public void setMatchWinner(String matchWinner) {
        this.matchWinner = matchWinner;
    }

    public String getRefreee() {
        return refreee;
    }

    public void setRefreee(String refreee) {
        this.refreee = refreee;
    }

}

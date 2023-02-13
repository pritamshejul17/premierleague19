package javaminds.io.premierleague19.Data;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import javaminds.io.premierleague19.Model.Match;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

    private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

    @Override
    public Match process(final MatchInput item) throws Exception {

        Match match = new Match();
        match.setDate(LocalDate.parse(item.getDate()));
        match.setHomeTeam(item.getHomeTeam());
        match.setAwayTeam(item.getAwayTeam());
        match.setHomeTeamGoals(item.getHomeTeamGoals());
        match.setAwayteamGoals(item.getAwayteamGoals());

        if (item.getMatchWinner().equals("H"))
            match.setMatchWinner(item.getHomeTeam());
        else if (item.getMatchWinner().equals("A"))
            match.setMatchWinner(item.getAwayTeam());
        else
            match.setMatchWinner("Match Drawn");

        match.setRefreee(item.getRefreee());

        return match;
    }

}

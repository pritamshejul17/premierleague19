package javaminds.io.premierleague19.Repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import javaminds.io.premierleague19.Model.Match;

public interface MatchRepository  extends CrudRepository<Match,Long>{
    
    List<Match> getByHomeTeamOrAwayTeamOrderByDateDesc(String homeTeam,String awayTeam,Pageable pageable);

    default List<Match> findLatestMatchesbyTeam(String teamName, int count) {
        return getByHomeTeamOrAwayTeamOrderByDateDesc(teamName, teamName, PageRequest.of(0, count));
    }
}

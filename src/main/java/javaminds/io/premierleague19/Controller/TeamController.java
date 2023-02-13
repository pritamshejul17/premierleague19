package javaminds.io.premierleague19.Controller;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javaminds.io.premierleague19.Model.Team;
import javaminds.io.premierleague19.Repository.MatchRepository;
import javaminds.io.premierleague19.Repository.TeamRepository;

@RestController
@CrossOrigin
public class TeamController {


    private TeamRepository teamRepository;
    private MatchRepository matchRepository;

    

    public TeamController(TeamRepository teamRepository,MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository=matchRepository;
    }

    @GetMapping("/team")
    public List<Team> getAllTeam(){
        List<Team> teams = this.teamRepository.findAll(Sort.by(Sort.Direction.DESC, "wins"));
        return teams;
    }



    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName)
    {
        Team team= this.teamRepository.findByteamName(teamName);
        team.setMatches(this.matchRepository.findLatestMatchesbyTeam(teamName, 4));

        return team;
    }
    
}

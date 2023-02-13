package javaminds.io.premierleague19.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import javaminds.io.premierleague19.Model.Team;

public interface TeamRepository extends JpaRepository<Team,Long> {

    Team findByteamNameStartingWith(String s);

    Team findByteamName(String teamName);
}

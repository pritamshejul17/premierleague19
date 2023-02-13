package javaminds.io.premierleague19.Data;

import java.io.Serializable;
import java.time.LocalDate;

public class PrimaryKey implements Serializable {

    private LocalDate date;
    private String homeTeam;
    private String awayTeam;

    

    public PrimaryKey() {
    }

    public PrimaryKey(LocalDate date, String homeTeam, String awayTeam) {
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((awayTeam == null) ? 0 : awayTeam.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PrimaryKey other = (PrimaryKey) obj;
        if (awayTeam == null) {
            if (other.awayTeam != null)
                return false;
        } else if (!awayTeam.equals(other.awayTeam))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (homeTeam == null) {
            if (other.homeTeam != null)
                return false;
        } else if (!homeTeam.equals(other.homeTeam))
            return false;
        return true;
    }
    
}

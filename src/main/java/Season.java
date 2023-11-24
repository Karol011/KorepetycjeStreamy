

import lombok.Data;

import java.util.List;
@Data
public class Season {
    public String seasonName;
    public int seasonNumber;
    public List<Episode> episodes;
    public Season(String seasonName, int seasonNumber,
                  List<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }
}
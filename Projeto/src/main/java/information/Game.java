package information;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Game {

    private String name;
    private String music;
    private String difficulty;
    private double MetaScore;
    private int Year;

}

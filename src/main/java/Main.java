

import java.util.Arrays;
import java.util.List;

public class Main {




    public static void main(String[] args) {
        Video video = new Video("GOT1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("GOT2", "got2.com", VideoType.EPISODE);
        Video video2 = new Video("GOT3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("GOT4", "got4.com", VideoType.PREVIEW);
        Video video4 = new Video("GOT5", "got5.com", VideoType.CLIP);
        Video video5 = new Video("GOT6", "got6.com", VideoType.EPISODE);

        Episode episode = new Episode("got1", 1, Arrays.asList(video, video1));
        Episode episodel = new Episode("got2", 2, Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1, Arrays.asList(video4, video5));

        Season season = new Season("GOTS1", 1, Arrays.asList(episode, episodel));
        Season season1 = new Season("GOTS1", 2, Arrays.asList(episode2));

        List<Season> seasons = Arrays.asList(season, season1);
        List<Video> videos = Arrays.asList(video,video1,video2,video3,video4,video5);

    }
/*
Wykorzystując mechanizmy programowania funkcyjnego na podstawie zadanej
struktury wyświetl:
listę wszystkich epizodów
listę wszystkich nazw sezonów
listę wszystkich numerów sezonów
listę wszystkich nazw epizodów
listę wszystkich numerów epizodów
listę wszystkich nazw video
listę wszystkich adresów url dla każdego video
tylko epizody z parzystych sezonów
tylko video z parzystych sezonów
tylko video z parzystych epizodów i sezonów
tylko video typu Clip z parzystych epizodów i nieparzystych sezonów
tylko video typu Preview z nieparzystych epizodów i parzystych sezonów
 */

}

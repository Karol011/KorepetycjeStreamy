
import lombok.Data;

@Data
public class Video {
    public String title;
    public String url;
    public VideoType videoType;
    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }
}

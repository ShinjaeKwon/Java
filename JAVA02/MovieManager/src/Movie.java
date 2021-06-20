import java.io.Serializable;

public class Movie implements Serializable { //Movie 객체들의 직렬화 지원
    private String title, genre, release;
    private double rating;

    public Movie(String title, String genre, String release, double rating) {
        this.title = title;
        this.genre = genre;
        this.release = release;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", release='" + release + '\'' +
                ", rating=" + rating +
                '}';
    }
}

package sample;

/**
 * Created 19.04.2015.
 * Класс, описывающий объект Комикс.
 */
public class Comics implements Comparable<Comics> {
    private String name; /* Название комикса */
    private String author; /* Автор комикса */
    private int year; /* Год издания */
    private String publishingHouse; /* Издательство */
    private String genre; /* Жанр */
    private String language; /* Язык */
    private String url; /* Путь до комикса */
    private String url_img; /* Путь до обложки */

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Comics(String url_img, String name, String author, int year, String publishingHouse, String genre, String language, String url) {
        this.url_img = url_img;
        this.name = name;
        this.author = author;
        this.year = year;
        this.publishingHouse = publishingHouse;
        this.genre = genre;
        this.language = language;
        this.url = url;
    }

    @Override
    public int compareTo(Comics o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comics comics = (Comics) o;

        if (year != comics.year) return false;
        if (author != null ? !author.equals(comics.author) : comics.author != null) return false;
        if (genre != null ? !genre.equals(comics.genre) : comics.genre != null) return false;
        if (language != null ? !language.equals(comics.language) : comics.language != null) return false;
        if (!name.equals(comics.name)) return false;
        if (publishingHouse != null ? !publishingHouse.equals(comics.publishingHouse) : comics.publishingHouse != null)
            return false;
        if (!url.equals(comics.url)) return false;
        if (url_img != null ? !url_img.equals(comics.url_img) : comics.url_img != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + url.hashCode();
        result = 31 * result + (url_img != null ? url_img.hashCode() : 0);
        return result;
    }

    @Override
    protected Comics clone() throws CloneNotSupportedException {
        return new Comics(this.url_img,this.name,this.author,this.year,this.publishingHouse,this.genre,this.language,
                this.url).clone();
    }
}

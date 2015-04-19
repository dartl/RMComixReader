package sample;

/**
 * Created 19.04.2015.
 * Класс, описывающий объект Комикс.
 */
public class Comics {
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
}

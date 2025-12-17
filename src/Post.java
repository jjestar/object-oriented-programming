public class Post {
    private String text;
    private int likes;
    private String author;
    public Post(String text, int likes, String author) {
        this.text = text;
        this.likes = likes;
        this.author = author;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public String getText() {
        return text;
    }
    public String getAuthor() {
        return author;
    }
}
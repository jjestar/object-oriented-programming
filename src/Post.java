import java.util.Objects;
public abstract class Post implements Comparable<Post> {
    protected int likes;
    protected String author;
    public Post(int likes, String author) {
        this.likes = likes;
        this.author = author;
    }
    public int getLikes() { return likes; }
    public void setLikes(int likes) { this.likes = likes; }
    public String getAuthor() { return author; }
    public abstract void display();
    @Override
    public int compareTo(Post other) {
        return Integer.compare(this.likes, other.likes);
    }
    @Override
    public String toString() {
        return "Post by @" + author + ", Likes: " + likes;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return likes == post.likes && Objects.equals(author, post.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(likes, author);
    }
}
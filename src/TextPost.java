public class TextPost extends Post {
    private String text;
    public TextPost(String text, int likes, String author) {
        super(likes, author);
        this.text = text;
    }
    public String getText() { return text; }
    @Override
    public void display() {
        System.out.println("@" + author + " wrote: " + text + " [Likes: " + likes + "]");
    }
    @Override
    public String toString() {
        return super.toString() + ", Content: " + text;
    }
}
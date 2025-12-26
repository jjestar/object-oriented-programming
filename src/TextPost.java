public class TextPost extends Post {
    private String text;

    public TextPost(String text, int likes, String author) {
        super(likes, author); // Вызываем конструктор родителя Post
        this.text = text;
    }

    public String getText() { return text; }

    // Реализация абстрактного метода (Polymorphism)
    @Override
    public void display() {
        System.out.println("@" + author + " wrote: " + text + " [Likes: " + likes + "]");
    }

    @Override
    public String toString() {
        return super.toString() + ", Content: " + text;
    }
}
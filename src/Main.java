public class Main {
    public static void main(String[] args) {
        System.out.println("Social Network");
        SocialNetwork myApp = new SocialNetwork("Diasgram", 100);
        System.out.println("Welcome to " + myApp.getName());
        Profile myProfile = new Profile("AnimeHero666", "roblox player", 10);
        Profile friendProfile = new Profile("pro_coder", "Senior Developer", 5000);
        System.out.println("Profiles created: ");
        myProfile.printProfileInfo();
        friendProfile.printProfileInfo();
        System.out.println();
        Post post1 = new Post("The world isn't wrong. It just is.", 5, myProfile.getUsername());
        Post post2 = new Post("Салам se-2513", 150, friendProfile.getUsername());
        System.out.println("Feed: ");
        System.out.println("@" + post1.getAuthor() + " wrote: " + post1.getText());
        System.out.println("Likes: " + post1.getLikes());
        System.out.println(" ");
        System.out.println("@" + post2.getAuthor() + " wrote: " + post2.getText());
        System.out.println("Likes: " + post2.getLikes());
        System.out.println("Comparing posts: ");
        if (post1.getLikes() > post2.getLikes()) {
            System.out.println("My post is more popular");
        } else if (post1.getLikes() < post2.getLikes()) {
            System.out.println("My friend's post is more popular");
        } else {
            System.out.println("Both posts have the same number of likes");
        }
    }
}
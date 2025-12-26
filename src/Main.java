public class Main {
    public static void main(String[] args) {
        System.out.println("Assignment 2 Check");
        SocialNetwork myApp = new SocialNetwork("Diasgram");
        System.out.println("Welcome to " + myApp.getName());
        Profile myProfile = new Profile("gang", "roblox player", 10);
        Profile friendProfile = new Profile("abylai", "Senior Developer", 5000);
        System.out.println("Profiles created:");
        myProfile.printProfileInfo();
        friendProfile.printProfileInfo();
        System.out.println();
        TextPost post1 = new TextPost("The world isn't wrong. It just is.", 5, myProfile.getUsername());
        TextPost post2 = new TextPost("Салам se-2513", 150, friendProfile.getUsername());
        TextPost post3 = new TextPost("Another boring day", 2, myProfile.getUsername());
        myApp.addPost(post1);
        myApp.addPost(post2);
        myApp.addPost(post3);
        myApp.showFeed();
        System.out.println();
        myApp.sortPosts();
        System.out.println();
        myApp.searchByAuthor("gang");
        System.out.println();
        System.out.println("Check if post1 equals post3: " + post1.equals(post3));
    }
}
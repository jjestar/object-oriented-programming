public class Profile {
    private String username;
    private String bio;
    private int followers;
    public Profile(String username, String bio, int followers) {
        this.username = username;
        this.bio = bio;
        this.followers = followers;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public int getFollowers() {
        return followers;
    }
    public void setFollowers(int followers) {
        this.followers = followers;
    }
    public void printProfileInfo() {
        System.out.println("User: " + username + " | Followers: " + followers);
    }
}
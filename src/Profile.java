import java.util.Objects;

public class Profile {
    private String username;
    private String bio;
    private int followers;
    public Profile(String username, String bio, int followers) {
        this.username = username;
        this.bio = bio;
        this.followers = followers;
    }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }
    public int getFollowers() { return followers; }
    public void setFollowers(int followers) { this.followers = followers; }
    public void printProfileInfo() {
        System.out.println("User: " + username + " | Followers: " + followers);
    }
    @Override
    public String toString() {
        return "Profile{username='" + username + "', followers=" + followers + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return followers == profile.followers && Objects.equals(username, profile.username);
    }
    @Override
    public int hashCode() {
        return Objects.hash(username, followers);
    }
}
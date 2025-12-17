public class SocialNetwork {
    private String name;
    private int numberOfUsers;
    public SocialNetwork(String name, int numberOfUsers) {
        this.name = name;
        this.numberOfUsers = numberOfUsers;
    }
    public String getName() {
        return name;
    }
    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }
}
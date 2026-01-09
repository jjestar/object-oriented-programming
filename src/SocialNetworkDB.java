import java.sql.*;

public class SocialNetworkDB {
    private final String url = "jdbc:postgresql://localhost:5432/social_net";
    private final String user = "postgres";
    private final String password = "postgres";
    private Connection conn;

    public void connect() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addProfile(Profile p) {
        String sql = "INSERT INTO profiles (username, bio, followers) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getUsername());
            stmt.setString(2, p.getBio());
            stmt.setInt(3, p.getFollowers());
            stmt.executeUpdate();
            System.out.println("Profile added: " + p.getUsername());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getAllProfiles() {
        System.out.println("Fetching all profiles from DB");
        String sql = "SELECT * FROM profiles";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String u = rs.getString("username");
                String b = rs.getString("bio");
                int f = rs.getInt("followers");
                System.out.println("User: " + u + " | Bio: " + b + " | Followers: " + f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateBio(String username, String newBio) {
        String sql = "UPDATE profiles SET bio = ? WHERE username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newBio);
            stmt.setString(2, username);
            stmt.executeUpdate();
            System.out.println("Updated bio for " + username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteProfile(String username) {
        String sql = "DELETE FROM profiles WHERE username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.executeUpdate();
            System.out.println("Deleted profile: " + username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
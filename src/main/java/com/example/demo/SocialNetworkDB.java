package com.example.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SocialNetworkDB {
    private final String url = "jdbc:postgresql://localhost:5432/social_net";
    private final String user = "postgres";
    private final String password = "postgres";
    private Connection conn;

    public void connect() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Profile> getAllProfilesList() {
        List<Profile> list = new ArrayList<>();
        String sql = "SELECT * FROM profiles";
        try {
            connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new Profile(
                        rs.getString("username"),
                        rs.getString("bio"),
                        rs.getInt("followers")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void getAllProfiles() {
        System.out.println("Fetching all profiles from DB");
        String sql = "SELECT * FROM profiles";
        try {
            connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
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

    public void addProfile(Profile p) {
        String sql = "INSERT INTO profiles (username, bio, followers) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getUsername());
            stmt.setString(2, p.getBio());
            stmt.setInt(3, p.getFollowers());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void updateBio(String username, String newBio) {
        String sql = "UPDATE profiles SET bio = ? WHERE username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newBio);
            stmt.setString(2, username);
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void deleteProfile(String username) {
        String sql = "DELETE FROM profiles WHERE username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
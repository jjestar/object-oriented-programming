package com.example.demo;
public class Main {
    public static void main(String[] args) {
        System.out.println("Assignment 3 Check");
        SocialNetworkDB db = new SocialNetworkDB();
        db.connect();

        Profile p1 = new Profile("gang", "roblox player", 10);
        Profile p2 = new Profile("abylai", "Senior Developer", 5000);

        System.out.println("Adding Profiles");
        db.addProfile(p1);
        db.addProfile(p2);

        System.out.println("Reading Profiles");
        db.getAllProfiles();

        System.out.println("Updating Data");
        db.updateBio("gang", "Minecraft pro player");
        db.getAllProfiles();

        System.out.println("Deleting Data");
        db.deleteProfile("abylai");
        db.getAllProfiles();
    }
}
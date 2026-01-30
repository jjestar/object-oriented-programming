package com.example.demo;
import java.util.ArrayList;
import java.util.Collections;

public class SocialNetwork {
    private String name;
    private ArrayList<Post> allPosts;
    public SocialNetwork(String name) {
        this.name = name;
        this.allPosts = new ArrayList<>();
    }
    public String getName() { return name; }
    public void addPost(Post p) {
        allPosts.add(p);
    }
    public void searchByAuthor(String authorName) {
        System.out.println("Searching for posts by " + authorName);
        boolean found = false;
        for (Post p : allPosts) {
            if (p.getAuthor().equals(authorName)) {
                p.display();
                found = true;
            }
        }
        if (!found) System.out.println("No posts found");
    }
    public void sortPosts() {
        System.out.println("Sorting feed by Likes");
        Collections.sort(allPosts);
        for (Post p : allPosts) {
            p.display();
        }
    }
    public void showFeed() {
        System.out.println("Feed");
        for(Post p : allPosts) {
            p.display();
        }
    }
}
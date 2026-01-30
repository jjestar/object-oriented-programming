package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProfileController {
    private SocialNetworkDB db = new SocialNetworkDB();

    @GetMapping("/api/profiles")
    public List<Profile> getProfiles() {
        db.connect();
        return db.getAllProfilesList();
    }
}
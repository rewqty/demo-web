package com.example.demoweb.service;
import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;
import java.util.*;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Текстовый пост номер один"));
        posts.add(new Post("Текстовый пост номер два"));
        posts.add(new Post("Текстовый пост номер три"));

        return posts;
    }
}

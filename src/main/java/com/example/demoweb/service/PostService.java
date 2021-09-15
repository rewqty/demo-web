package com.example.demoweb.service;
import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.util.Date;
import java.util.*;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<>();
    {
        posts.add(new Post("Текстовый пост номер один", new Date()));
        posts.add(new Post("Текстовый пост номер два", new Date()));
        posts.add(new Post("Текстовый пост номер три", new Date()));
    }

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}

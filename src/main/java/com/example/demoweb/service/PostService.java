package com.example.demoweb.service;
import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.util.Date;
import java.util.*;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Текстовый пост номер один", new Date()));
        posts.add(new Post("Текстовый пост номер два", new Date()));
        posts.add(new Post("Текстовый пост номер три", new Date()));

        return posts;
    }
}

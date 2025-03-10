package com.example.pidev.service;

import com.example.pidev.entity.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlog {

    List<Blog> getAllBlogs();
    Optional<Blog> getBlogById(Integer id);
    Blog saveBlog(Blog blog);
    Blog updateBlog(Blog blog);
    void deleteBlog(Integer id);
    List<Blog> getBlogsByUserId(Integer userId);
}

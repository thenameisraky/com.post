package com.post.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post.entities.Post;

public interface PostRepository extends JpaRepository<Post,Long>
{

}

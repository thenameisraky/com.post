package com.post.services;

import java.util.List;

import com.post.entities.Post;

public interface PostService {

	public void createPost(Post post);
	List<Post>fetchAllPosts();
}

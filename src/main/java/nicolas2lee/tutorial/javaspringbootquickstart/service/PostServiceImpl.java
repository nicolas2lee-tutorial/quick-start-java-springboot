package nicolas2lee.tutorial.javaspringbootquickstart.service;

import java.util.List;
import java.util.stream.Collectors;
import nicolas2lee.tutorial.javaspringbootquickstart.domain.Post;
import nicolas2lee.tutorial.javaspringbootquickstart.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
  private final PostRepository postRepository;

  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> getAllPosts() {
    return postRepository.findAll().stream().map(Post::fromEntity).collect(Collectors.toList());
  }
}

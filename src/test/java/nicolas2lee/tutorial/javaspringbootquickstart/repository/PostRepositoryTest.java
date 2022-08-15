package nicolas2lee.tutorial.javaspringbootquickstart.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class PostRepositoryTest {
  @Autowired private PostRepository postRepository;

  @Test
  void should_return_2_posts() {
    var entities = postRepository.findAll();
    assertThat(entities).hasSize(2);
    assertThat(entities.get(1).getContent()).isEqualTo("my second post");
  }
}

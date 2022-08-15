package nicolas2lee.tutorial.javaspringbootquickstart.controller;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;
import nicolas2lee.tutorial.javaspringbootquickstart.domain.Post;
import nicolas2lee.tutorial.javaspringbootquickstart.service.PostService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

/** json path expression https://rungutan.com/blog/extract-value-json-path-expression/ */
@SpringBootTest
@AutoConfigureMockMvc
class PostControllerTest {
  @MockBean private PostService postService;

  @Autowired private MockMvc mockMvc;

  @Test
  void should_return_welcome_message() throws Exception {
    this.mockMvc
        .perform(get("/posts/welcome"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("welcome")));
  }

  @Test
  void should_return_list_of_posts() throws Exception {
    given(postService.getAllPosts()).willReturn(mockedPosts());
    this.mockMvc
        .perform(get("/posts/"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$").value(Matchers.hasSize(2)))
        .andExpect(jsonPath("$..postId").value(contains(1, 2)));
  }

  private List<Post> mockedPosts() {
    return List.of(new Post(1L, null, "1", "2022-08-15"), new Post(2L, null, "2", "2022-08-15"));
  }
}

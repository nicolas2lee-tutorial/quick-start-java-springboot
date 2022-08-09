package nicolas2lee.tutorial.javaspringbootquickstart.repository;

import nicolas2lee.tutorial.javaspringbootquickstart.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}

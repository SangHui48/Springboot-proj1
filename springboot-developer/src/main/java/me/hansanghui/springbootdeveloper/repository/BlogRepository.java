package me.hansanghui.springbootdeveloper.repository;

import me.hansanghui.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

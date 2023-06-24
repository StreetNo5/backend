package com.StreetNo5.StreetNo5.repository;

import com.StreetNo5.StreetNo5.domain.UserPost;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends JpaRepository<UserPost,Long> {

}

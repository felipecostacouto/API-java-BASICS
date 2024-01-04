package com.felipe.app.rest.Repo;

import com.felipe.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

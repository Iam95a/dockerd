package com.chen.docckerd.repository;

import com.chen.docckerd.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author  chenjinwei
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findById(Integer id);

    @Override
    Page<User> findAll(Pageable pageable);

}

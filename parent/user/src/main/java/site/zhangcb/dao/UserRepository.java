package site.zhangcb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.zhangcb.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

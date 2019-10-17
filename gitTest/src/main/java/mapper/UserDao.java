package mapper;

import domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
}

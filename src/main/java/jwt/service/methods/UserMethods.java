package jwt.service.methods;

import jwt.model.User;

import java.util.List;

public interface UserMethods {
    List<User> findAll();
    User save(User user);
    User findById(Long id);
    void deleteById(Long id);
    void update(Long id, User user);
}

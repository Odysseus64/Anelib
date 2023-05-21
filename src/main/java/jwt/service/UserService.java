package jwt.service;

import jwt.model.User;
import jwt.repository.UserRepository;
import jwt.service.methods.UserMethods;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Log4j2
public class UserService implements UserMethods {
    private final UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User save(User user) {
        log.info("User saved: {}",user);
        return repository.save(user);
    }

    @Override
    public User findById(Long id) {
        log.info("ID: {}", id);
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        log.info("User deleted! {}", id);
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, User user) {
        User add = repository.findById(id).orElse(null);
        assert add != null;
        add.setUser_name(user.getUser_name());
        add.setEmail(user.getEmail());
        add.setPassword(user.getPassword());
        add.setDescription(user.getDescription());
        repository.save(add);
        log.info("User updated {}", add);
    }
}
//Добавляем Уровни доступа Будет Admin, User, Gues. А я пойду подробнее изучать JWT, WEB, API, и много чего другого
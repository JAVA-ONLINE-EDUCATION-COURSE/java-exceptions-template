package com.epam.izh.rd.online.service;

import com.epam.izh.rd.online.entity.User;
import com.epam.izh.rd.online.exception.NotCorrectPasswordException;
import com.epam.izh.rd.online.exception.UserNotFoundException;
import com.epam.izh.rd.online.repository.IUserRepository;

public class AuthenticationService implements IAuthenticationService {

    private IUserRepository userRepository;

    public AuthenticationService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(User user) throws UserNotFoundException, NotCorrectPasswordException {
        User foundUser = userRepository.findByLogin(user.getLogin());

        if(foundUser == null)
            throw new UserNotFoundException("Пользователь с таким логином не найден");
        if(!user.getPassword().equals(foundUser.getPassword()))
            throw new NotCorrectPasswordException("Пароль введен неверно!");

        // Устанавливаем найденного пользователя, который прошел все проверки, как вошедшего в систему.
        CurrentUserManager.setCurrentLoggedInUser(foundUser);

        return foundUser;
    }

    /**
     * Данный метод очищает данные о текущем (активном) пользователе.
     */
    @Override
    public void logout() {
        CurrentUserManager.setCurrentLoggedInUser(null);
    }
}

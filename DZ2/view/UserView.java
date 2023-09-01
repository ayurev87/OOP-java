package view;

import java.util.List;

import data.User;

public abstract class UserView {//это абстрактный класс с методом showTheBest, внутри которого вызывается абстрактный метод findTheBest

    public void showTheBest(List<User> userList){
        User user = findTheBest(userList);
        System.out.println(user);
    }

    protected abstract User findTheBest(List<User> userList);//абстрактный метод, чтобы его могли наследовать потомки
}

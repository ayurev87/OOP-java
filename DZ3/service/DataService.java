package service;//взаимодействие объектов с БД , файолвыми системами

import data.User;

public interface DataService {
    
    void write(User user);

    User read(User user);

}

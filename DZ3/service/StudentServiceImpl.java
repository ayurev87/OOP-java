package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentServiceImpl implements DataService{//отдельный service, реализующий интерфейс DataService

    @Override
    public void write(User user) {
        WriterToTxt.write(user);//передаём в статичный метод переменную user
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
        
    }
    
}

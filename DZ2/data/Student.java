package data;//сохранение состояния информации

public class Student extends User{

    private int grupNumber;

    public int getGrupNumber() {
        return grupNumber;
    }

    public void setGrupNumber(int grupNumber) {
        this.grupNumber = grupNumber;
    }

    public Student(String fio, int age, int passport, int grupNumber){
        super(fio, age, passport);
        this.grupNumber = grupNumber;
    }

}

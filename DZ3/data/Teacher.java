package data;


public class Teacher extends User {

    private String kafedra;

    public String getKafedra() {
        return kafedra;
    }

    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }

    public Teacher(String fio, int age, int passport, String kafedra){
        super(fio, age, passport);
        this.kafedra = kafedra;
    }
}

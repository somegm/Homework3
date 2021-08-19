package Entities.concretes;

import Entities.Abstracts.AccountManager;

public class Gamer extends Account implements AccountManager {
    private int id;
    private String firstName;
    private String lastName;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    private String birthday;

    public Gamer(int id, String firstName, String lastName, String birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public Gamer(int id, String username, String password, String firstName, String lastName, String email, int id1, String firstName1, String lastName1, String birthday) {
        super(id, username, password, firstName, lastName, email);
        this.id = id1;
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.birthday = birthday;
    }


    @Override
    public void signUp(Account account) {

        System.out.println(getUsername()+ "adlı kullanıcı sisteme kayıt oldu");
    }

    @Override
    public void delete(Account account) {
        System.out.println(getUsername()+ "adlı kullanıcı sistemden silindi");


    }

    @Override
    public void update(Account account) {
        System.out.println(getUsername()+ "adlı kullanıcının bilgileri güncellendi");

    }



}

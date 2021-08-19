package Entities.concretes;

public class Logger {
    private String identity;
    private String firstName;
    private String lastName;
    private String birthage;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthage() {
        return birthage;
    }

    public void setBirthage(String birthage) {
        this.birthage = birthage;
    }

    public Logger(Account account){
        if(identity == null){
            System.out.println("E devlet sistemine kayıtlı değildir. Kayıt olamaz");

        }
        else{
            System.out.println("E devlet sistemine kayıtlıdır. Kayıt olabilir.");
        }
    }



}

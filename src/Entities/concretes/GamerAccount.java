package Entities.concretes;

import Entities.Abstracts.AccountManager;

public class GamerAccount extends Account implements AccountManager {
    public GamerAccount(Account account){

    }

    @Override
    public void signUp(Account account) {
        System.out.println(getUsername()+" adlı kullanıcı sisteme eklendi");

    }



    @Override
    public void delete(Account account) {
        System.out.println(getUsername()+" adlı kullanıcı sistemden silindi");
    }

    @Override
    public void update(Account account) {
        System.out.println(getUsername()+" adlı kullanıcının bilgileri güncellendi");

    }


}


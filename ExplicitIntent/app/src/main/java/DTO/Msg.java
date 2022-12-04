package DTO;

public class Msg {

    private String user;

    private String msg;



    public Msg() {


    }



    public Msg(String user, String msg) {

        this.user = user;

        this.msg = msg;

    }



    public String getUser() {

        return user;

    }



    public String getMsg() {

        return msg;

    }

}
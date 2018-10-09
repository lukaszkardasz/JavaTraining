package training.core.inOut.serialization;

import java.io.Serializable;
import java.util.Date;


//klasa user podlega serializacji
public class User implements Serializable
{
    private String login;
    private transient String password; //parametr transient pomija pole hasła przy serializacji
    private Date createAccountDate;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        createAccountDate = new Date();
    }

    public String getLogin()
    {
        return login;
    }

    public String getPassword()
    {
        return password;
    }

    public Date getCreateAccountDate()
    {
        return createAccountDate;
    }
}

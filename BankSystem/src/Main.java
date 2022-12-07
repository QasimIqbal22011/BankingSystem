import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        IdAndPasswords idandpasswords = new IdAndPasswords();
        String temp1, temp2,temp3;
        temp1="";
        temp2="";
        temp3="";

        LoginPage loginPage = new LoginPage(idandpasswords.getLoginInfo(),temp1, temp2, temp3,Color.WHITE);
    }
}
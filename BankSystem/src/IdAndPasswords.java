import java.util.HashMap;

public class IdAndPasswords {

    HashMap<String,String> LoginInfo = new HashMap<String,String>();
    IdAndPasswords()
    {
        LoginInfo.put("q","q");
        LoginInfo.put("Daniyal","21986");
        LoginInfo.put("Umer","12345");
    }

    protected HashMap getLoginInfo() {
        return LoginInfo;
    }
}

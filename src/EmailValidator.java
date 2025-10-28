import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public boolean isValidEmail(String mail){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }
    public boolean isCompanyMail(String mail){
        String format = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@company.com";
        Pattern pattern = Pattern.compile(format);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }
}


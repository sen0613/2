package passValidator.Service;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-14.
 */
public class PassValidateServiceImpl implements PassValidateService{

    @Override
    public boolean hasUsername(String username, Map<String, String> map) {
        return map.containsKey(username);

    }

    @Override
    public boolean isMember(String username, String password, Map<String, String> map) {
        String pass = map.get(username);
        if (pass == null || !pass.equals(password)) {
            return false;
        } else {
            return true;
        }
    }
}

package passValidator.Service;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-14.
 */

public interface PassValidateService {

    boolean hasUsername(String username, Map<String, String> map);

    boolean isMember(String username, String password, Map<String, String> map);

}

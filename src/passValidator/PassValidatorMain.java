package passValidator;

import passValidator.Service.PassValidateService;
import passValidator.Service.PassValidateServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by danawacomputer on 2017-04-14.
 */
public class PassValidatorMain {
    public static void main(String[] args) {
        /*
        1. prepare date
        ID와 패스워드를 보관하고 있는 데이터를 로딩
        */
        Map<String, String> userRepo = new HashMap<>();
        userRepo.put("sewon", "111111");
        userRepo.put("wonbin", "222222");
        userRepo.put("dongwon", "333333");
        userRepo.put("jehoon", "444444");
        userRepo.put("hyoshin", "555555");

        Scanner in = new Scanner(System.in);
        System.out.print("ID를 입력하세요: > ");
        String userId = in.nextLine();


        PassValidateService service = new PassValidateServiceImpl();

//        boolean isUser = service.hasUsername(userId, userRepo);

        if (!service.hasUsername(userId, userRepo)) {
            System.out.println("사용자가 아닙니다. 새로 가입하시거나 ID를 다시 확인해주세요.");
        }

        //id가 맞을때
        else {

            System.out.print("Password를 입력하세요: > ");
            String password = in.nextLine();

            if (!service.isMember(userId, password, userRepo)) {
                System.out.println("Password가 잘못되었습니다. ");

            } else {
                System.out.printf("%s님 환영합니다!", userId);
            }

        }
    }
}

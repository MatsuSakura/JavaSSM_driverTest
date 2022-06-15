package ljh.zijin.service;

import ljh.zijin.pojo.User;

public interface UserService {
    User login(String username, String password)
            throws Exception;
    Boolean checkUsernameExist(String username);
    void regist(String username, String password);
    void changePwd(User user, String newPwd);
}

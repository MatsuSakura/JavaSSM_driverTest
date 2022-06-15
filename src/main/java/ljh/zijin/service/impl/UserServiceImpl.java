package ljh.zijin.service.impl;

import ljh.zijin.dao.UserDAO;
import ljh.zijin.pojo.User;
import ljh.zijin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public Boolean checkUsernameExist(String username){
        User user=userDAO.selectUserByName(username);
        return user!=null;
    }
    @Override
    public void changePwd(User user, String newPwd) {
        user.setPassword(newPwd);
        userDAO.updateUserPwd(user);
    }
    @Override
    public void regist(String username,String password){
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        userDAO.insertUser(user);
    }

    @Override
    public User login(String username,String password) throws Exception{
        Map<String,Object> params=new HashMap<>();
        params.put("username",username);
        params.put("password",password);
        User user=userDAO.selectUserByNameAndPwd(params);
        if (user==null){
            throw new Exception("用户名密码不匹配");
        }
        return user;
    }
}

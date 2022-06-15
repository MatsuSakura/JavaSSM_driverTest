package ljh.zijin.dao;

import ljh.zijin.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDAO {
    User selectUserByNameAndPwd(Map<String,Object> param);
    List<User> selectAllUsers();
    void insertUser(User user);
    void updateUserName(Map<String,Object> map);
    void deleteUserById(Integer id);
    User selectUserByName(String username);
    void updateUserPwd(User user);
}

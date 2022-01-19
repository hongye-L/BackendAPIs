package APIsOfMyBatis.service;

import APIsOfMyBatis.dao.UserMapper;
import APIsOfMyBatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author 竑也
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getAllUsers(){
        return userMapper.getAllUser();
    }
    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }
    public User login(String username,String password){
        return userMapper.Login(username,password);
    }
    public boolean changePassword(String username,String password){
        return userMapper.changePassword(username,password);
    }
    public boolean register(String username,String password){
        return userMapper.register(username,password);
    }
    public boolean deleteUser(String id){
        return userMapper.deleteUser(id);
    }
}

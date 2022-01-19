package APIsOfMyBatis.controller;

import APIsOfMyBatis.Util.GlobalReturnCode;
import APIsOfMyBatis.Util.JsonResult;
import APIsOfMyBatis.dao.UserMapper;
import APIsOfMyBatis.entity.User;
import APIsOfMyBatis.service.UserService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.StyledEditorKit;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;

/**
 * @author 竑也
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("getuser")
    public JsonResult getUserById(@RequestBody Map<String,Integer> map ){
            User user= userService.getUserById(map.get("id"));
            //如果查找到的话，则返回对应结果
            if(user != null) {
                return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,user);
            }
            //如果没查找到则返回错误
            else {
                return new JsonResult(false,GlobalReturnCode.NOEXIST);
            }
    }
    @PostMapping("gerusers")
    public JsonResult getAllUsers(){
        List<User> users=userService.getAllUsers();
        //如果查找到的话，则返回对应结果
        if (users != null) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,users);
        }
        //如果没查找到则返回错误
        else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("login")
    public JsonResult Login(@RequestBody Map<String,String> map){
        User success=userService.login(map.get("username"),map.get("password"));
        //登陆成功
        if(success!=null) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,success);
        }
        //登录失败
        else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE,false);
        }
    }
    @PostMapping("changepassword")
    public JsonResult changePassword(@RequestBody Map<String, String> map){
        boolean success=userService.changePassword(map.get("username"),map.get("password"));
        //成功修改
        if(success) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,success);
        }
        //修改失败
        else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE,success);
        }
    }
    @PostMapping("register")
    public JsonResult register(@RequestBody Map<String, String> map){
        boolean success =userService.register(map.get("username"),map.get("password"));
        //注册成功
        if(success) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,true);
        }
        //注册失败，可能是因为已经有了对应信息
        else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE,false);
        }
    }
}
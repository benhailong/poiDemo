package cc.openkit.controller;

import java.util.HashMap;
import java.util.Map;

import cc.openkit.model.User;
import cc.openkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    //http://localhost:8080/poiDemo/rest/user/get?id=1
    @RequestMapping("/get")
    @ResponseBody
    public Map<String,Object> getUser(Integer id){
        Map<String,Object> map =new  HashMap<String,Object>();
        User user = userService.queryById(id);
        map.put("result", user);
        return map;              
    }
    
}

package cc.openkit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.openkit.dao.UserMapper;
import cc.openkit.model.User;
/**
 * 继承了BaseService通用方法，基本增删改查都不需要写了
 * 只需要写特殊方法就好
 * @author www.tpyyes.com
 *
 */
@Service
public class UserService extends BaseService<User>{
    
    @Autowired
    private UserMapper userMapper;

}

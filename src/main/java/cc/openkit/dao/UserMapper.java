package cc.openkit.dao;

import cc.openkit.model.User;
import com.github.abel533.mapper.Mapper;
/**
 * 使用了mapper通用方法，简单增删改查接口不需要写
 * 只写特殊方法
 * @author www.tpyyes.com
 *
 */
public interface UserMapper extends Mapper<User>{
    
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(User record);
//
//    int insertSelective(User record);
//
//    User selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
}
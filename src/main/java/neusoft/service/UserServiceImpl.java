package neusoft.service;

import neusoft.beans.User;
import neusoft.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-26
 * Time: 下午2:24
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements  UserService{

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
}

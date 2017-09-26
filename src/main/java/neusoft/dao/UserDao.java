package neusoft.dao;

import com.neusoft.beans.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-26
 * Time: 下午2:28
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    public List<User> getUser();
}

package neusoft.dao;

import com.neusoft.beans.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-26
 * Time: 下午2:28
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Resource
    private SqlSessionFactory sqlSession;

    @Override
    public List<User> getUser() {
        List<User> list = sqlSession.openSession().selectList("selectTest");
//        for(int i = 0 ; i<list.size();i++){
//            System.out.println("host:"+list.get(i).getHost()+"  user:"+list.get(i).getUser());
//        }
        sqlSession.openSession().close();
        return list;
    }
}

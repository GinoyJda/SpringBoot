package neusoft.test;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-26
 * Time: 上午10:01
 * To change this template use File | Settings | File Templates.
 */
public class C {
    @Resource
    private B b;
    public String print(){
        String bstr = b.print();
        return bstr+"C";
    }
}

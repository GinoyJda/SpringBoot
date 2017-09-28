package neusoft.service;

import com.alibaba.fastjson.JSON;
import neusoft.beans.EsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-27
 * Time: 下午4:34
 * To change this template use File | Settings | File Templates.
 */
@Service
@EnableElasticsearchRepositories
public class EsServiceImpl implements EsService{
    @Resource
    private EsBeanRepository esBeanRepository;

    @Override
    public String queryInfoById(String id) {
        System.out.println("id:" + id);
//        EsBean eb = (EsBean)esBeanRepository.findOne(id);
        EsBean eb = new EsBean();
        eb.gs = 250;
        eb.study=250;
        esBeanRepository.save(eb);
        String value = JSON.toJSONString(eb);
        System.out.println("value:"+value);
        return value;
    }
}

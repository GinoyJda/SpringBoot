package neusoft.beans;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-27
 * Time: 下午4:07
 * To change this template use File | Settings | File Templates.
 */
@Document(indexName="test",type="test")
public class EsBean implements Serializable {
    @Id
    public String id;

    @Field
    public int gs;

    @Field
    public int study;

}

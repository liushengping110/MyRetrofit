package wizrole.myretrofitstudy.all;

import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by liushengping on 2018/3/21.
 * 何人执笔？
 * 作用：用于 @GET 方法的查询参数（Query = Url 中 ‘?’ 后面的 key-value）
 * 如：url = http://www.println.net/?cate=android，其中，Query = cate
 */

public class QueryTest {
    public interface getData{
        /**
         * // 其使用方式同 @Field与@FieldMap，这里不作过多描述
         * @param name
         * @return
         */
        @GET("/")
        Call<String> cate(@retrofit2.http.Query("name") String name);
    }
}

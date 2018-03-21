package wizrole.myretrofitstudy.post.FormUrlEncoded;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Query;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 *
 * 在post请求中配置该参数，说明该请求将表单的形式传递参数，它不能用于get请求。
 */

public interface FormUrlEncodedService {


    @FormUrlEncoded
    Call<Person> getPerson(@Query("name") String name);

}

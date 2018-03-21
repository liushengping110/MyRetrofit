package wizrole.myretrofitstudy.upfile.Header;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import wizrole.myretrofitstudy.post.FormUrlEncoded.Person;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 *
 * :添加http header
 */

public interface HeaderService {


    @GET("user")
    Call<Person> getUser(@Header("Authorization") String authorization);

    /**
     * 等同于
     */

    @Headers("Authorization: authorization")//这里authorization就是上面方法里传进来变量的值
    @GET("widget/list")
    Call<Person> getUser();
}

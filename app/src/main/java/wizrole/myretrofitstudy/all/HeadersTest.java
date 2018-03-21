package wizrole.myretrofitstudy.all;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by liushengping on 2018/3/21.
 * 何人执笔？
 * 作用：添加固定的请求头
 * 使用方式：@Headers作用于方法
 * 使用场景：@Headers用户添加固定的请求头
 */

public class HeadersTest {

    public interface getData{
        // @Headers
        @Headers("Authorization: authorization")
        @GET("user")
        Call<Reception> getUser();
    }
}

package wizrole.myretrofitstudy.all;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by liushengping on 2018/3/21.
 * 何人执笔？
 * 作用：添加不固定的请求头
 * 使用方式：@Header作用于方法的参数
 * 使用场景：@Header用户添加不固定的请求头
 */

public class HeaderTest {

    public interface getData{
        @GET("user")
        Call<Reception> getUser(@Header("Authorization") String authorization);
    }
}

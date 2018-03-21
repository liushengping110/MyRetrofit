package wizrole.myretrofitstudy.all;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by liushengping on 2018/3/21.
 * 何人执笔？
 */

public class PathTest {
    public interface GetRequest_Interface {
        // 访问的API是：https://api.github.com/users/{user}/repos
        // 在发起请求时， {user} 会被替换为方法的第一个参数 user（被@Path注解作用）
        @GET("users/{user}/repos")
        Call<ResponseBody> getBlog(@Path("user") String user );

    }
}

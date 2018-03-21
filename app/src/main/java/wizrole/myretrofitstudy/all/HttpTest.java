package wizrole.myretrofitstudy.all;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.HTTP;
import retrofit2.http.Path;

/**
 * Created by liushengping on 2018/3/21.
 * 何人执笔？
 *
 * @HTTP
 *作用：替换@GET、@POST、@PUT、@DELETE、@HEAD注解的作用 及 更多功能拓展
 *具体使用：通过属性method、path、hasBody进行设置
 */

public class HttpTest {

    public interface GetRequest_Interface {
        /**
         * method：网络请求的方法（区分大小写）
         * path：网络请求地址路径
         * hasBody：是否有请求体
         */
        @HTTP(method = "GET", path = "blog/{id}", hasBody = false)
        Call<ResponseBody> getCall(@Path("id") int id);
        // {id} 表示是一个变量
        // method 的值 retrofit 不会做处理，所以要自行保证准确
    }

}

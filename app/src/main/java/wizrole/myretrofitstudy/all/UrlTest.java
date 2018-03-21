package wizrole.myretrofitstudy.all;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by liushengping on 2018/3/21.
 * 何人执笔？
 *
 * 作用：直接传入一个请求的 URL变量 用于URL设置
 */

public class UrlTest {

    public interface GetRequest_Interface {

        @GET
        Call<ResponseBody> testUrlAndQuery(@Url String url, @retrofit2.http.Query("showAll") boolean showAll);
        // 当有URL注解时，@GET传入的URL就可以省略
        // 当GET、POST...HTTP等方法中没有设置Url时，则必须使用 {@link Url}提供

    }

}

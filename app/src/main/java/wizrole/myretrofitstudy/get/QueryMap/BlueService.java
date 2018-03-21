package wizrole.myretrofitstudy.get.QueryMap;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 *
 * 如果Query参数比较多，那么可以通过@QueryMap方式将所有的参数集成在一个Map统一传递，
 * 还以Get包下 Query的请求方法为例
 */

public interface BlueService {

    @GET("book/search")
    Call<BookSearchResponse> getSearchBooks(@QueryMap Map<String, String> options);
}

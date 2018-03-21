package wizrole.myretrofitstudy.get.GetDemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import wizrole.myretrofitstudy.get.GetDemo.bean.MovieBean;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 *
 *1. @Query
 * Get方法请求参数都会以key=value的方式拼接在url后面，Retrofit提供了两种方式设置请求参数。
 * 第一种就是像上文提到的直接在interface中添加@Query注解，
 * 第二张方式是通过Interceptor实现，直接看如何通过Interceptor实现请求参数的添加。
 *addQueryParameter就是添加请求参数的具体代码，这种方式比较适用于所有的请求都需要添加的参数，一般现在的网络请求都会添加token作为用户标识，那么这种方式就比较适合。
 *创建完成自定义的Interceptor后，还需要在Retrofit创建client处完成添加
 *addInterceptor(new CustomInterceptor())
 */

public interface MovieService {

    @GET("top250")
    Call<MovieBean> getTopMovie(@Query("start") int start, @Query("count") int count);

}

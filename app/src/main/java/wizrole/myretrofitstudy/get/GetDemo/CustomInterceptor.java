package wizrole.myretrofitstudy.get.GetDemo;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 * 添加请求参数的另外一种方法
 *
 * Get方法请求参数都会以key=value的方式拼接在url后面，
 * Retrofit提供了两种方式设置请求参数。
 * 第一种就是直接在interface中添加@Query注解，
 * 第二种方式是通过Interceptor实现，直接看如何通过Interceptor实现请求参数的添加。
 *
 *
 * addQueryParameter就是添加请求参数的具体代码，
 * 这种方式比较适用于所有的请求都需要添加的参数，一般现在的网络请求都会添加token作为用户标识，
 * 那么这种方式就比较适合。
 *创建完成自定义的Interceptor后，还需要在Retrofit创建client处完成添加
 *addInterceptor(new CustomInterceptor())
 */

public class CustomInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl httpUrl = request.url().newBuilder()
                .addQueryParameter("token", "tokenValue")
                .build();
        request = request.newBuilder().url(httpUrl).build();
        return chain.proceed(request);
    }
}

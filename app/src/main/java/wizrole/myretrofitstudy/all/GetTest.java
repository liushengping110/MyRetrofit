package wizrole.myretrofitstudy.all;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by liushengping on 2018/3/21.
 * 何人执笔？
 *
 * @GET、@POST、@PUT、@DELETE、@HEAD
 * 以上方法分别对应 HTTP中的网络请求方式
 */

public class GetTest {

    public interface GetRequest_Interface {

        @GET("openapi.do?keyfrom=Yanzhikai&key=2032414398&type=data&doctype=json&version=1.1&q=car")
        Call<Reception> getCall();
        // @GET注解的作用:采用Get方法发送网络请求
        // getCall() = 接收网络请求数据的方法
        // 其中返回类型为Call<*>，*是接收数据的类（即上面定义的Translation类）
    }

    public void Http(){
        /***
         * <-- 主要在创建Retrofit对象中设置 -->
         Retrofit retrofit = new Retrofit.Builder()
         .baseUrl(""http://fanyi.youdao.com/"")
         .addConverterFactory(ProtoConverterFactory.create()) // 支持Prototocobuff解析
         .addConverterFactory(GsonConverterFactory.create()) // 支持Gson解析
         .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 支持RxJava
         .build();
         */
        // 第2部分：在创建Retrofit实例时通过.baseUrl()设置
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fanyi.youdao.com/") //设置网络请求的Url地址
                .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
                .build();

        // 从上面看出：一个请求的URL可以通过 替换块 和 请求方法的参数 来进行动态的URL更新。
        // 替换块是由 被{}包裹起来的字符串构成
        // 即：Retrofit支持动态改变网络请求根目录
        //网络请求的完整 Url =在创建Retrofit实例时通过.baseUrl()设置 +网络请求接口的注解设置（下面称 “path“ ）
    }

}

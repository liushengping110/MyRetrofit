package wizrole.myretrofitstudy.all;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import wizrole.myretrofitstudy.post.Body.Reviews;

/**
 * Created by liushengping on 2018/3/21.
 * 何人执笔？
 * 作用：以 Post方式 传递 自定义数据类型 给服务器
 * 特别注意：如果提交的是一个Map，那么作用相当于 @Field
 * 不过Map要经过 FormBody.Builder 类处理成为符合 Okhttp 格式的表单，如：
 */

public class BodyTest {

    public interface getData{
        @FormUrlEncoded
        @POST("book/reviews")
        Call<String> addReviews(@Body Reviews reviews);

    }
}

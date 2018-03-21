package wizrole.myretrofitstudy.post.Field;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 *
 * @FormUrlEncoded将会自动将请求参数的类型调整为application/x-www-form-urlencoded，
 * 假如content传递的参数为Good Luck，那么最后得到的请求体就是
 *content=Good+Luck
 *FormUrlEncoded不能用于Get请求
 *
 * @Field注解将每一个请求参数都存放至请求体中，还可以添加encoded参数，该参数为boolean型，
 * 具体的用法为
 *  @Field(value = "book", encoded = true) String book
 *encoded参数为true的话，key-value-pair将会被编码，即将中文和特殊字符进行编码转换
 */

public interface FidleService {

    @FormUrlEncoded
    @POST("book/reviews")
    Call<String> addReviews(@Field("book") String bookId, @Field("title") String title,
                            @Field("content") String content, @Field("rating") String rating);
}

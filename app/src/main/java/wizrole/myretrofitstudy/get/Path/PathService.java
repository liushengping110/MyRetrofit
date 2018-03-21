package wizrole.myretrofitstudy.get.Path;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 *
 * Path:url中的占位符
 * 相当于动态的改变url
 */

public interface PathService {

    @GET
    Call<BookSearchPathResponse> getSearch(@Path("id") int id);
}

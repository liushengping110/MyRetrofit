package wizrole.myretrofitstudy.get.GetDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import wizrole.myretrofitstudy.get.GetDemo.bean.MovieBean;
import wizrole.myretrofitstudy.get.GetDemo.bean.SubjectsBean;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 */

public class Http {

    public void httpTest(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(new CustomInterceptor())//适用于所有的请求添加参数
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .build();

        String baseUrl="https://api.douban.com/v2/movie/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        MovieService service = retrofit.create(MovieService.class);
        Call<MovieBean> call = service.getTopMovie(0, 10);
        call.enqueue(new Callback<MovieBean>() {
            @Override
            public void onResponse(Call<MovieBean> call, Response<MovieBean> response) {
                MovieBean body = response.body();
                List<SubjectsBean> subjectsBeanList=body.getSubjects();
            }

            @Override
            public void onFailure(Call<MovieBean> call, Throwable t) {

            }
        });
    }
}

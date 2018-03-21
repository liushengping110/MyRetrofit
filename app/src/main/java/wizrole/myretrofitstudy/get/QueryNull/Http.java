//package wizrole.myretrofitstudy.Get.QueryNull;
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//
//import java.util.concurrent.TimeUnit;
//
//import okhttp3.OkHttpClient;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
//import retrofit2.converter.gson.GsonConverterFactory;
//import wizrole.taskthree.R;
//
///**
// * Created by liushengping on 2018/3/20.
// * 何人执笔？
// *
// * Query非必填
// *如果请求参数为非必填，也就是说即使不传该参数，服务端也可以正常解析，
// *那么如何实现呢？其实也很简单，请求方法定义处还是需要完整的Query注解，
// *某次请求如果不需要传该参数的话，只需填充null即可。
// */
//
//public class Http{
//
//    public void httpTest() {
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
////                .addInterceptor(new CustomInterceptor())//适用于所有的请求添加参数
//                .connectTimeout(5, TimeUnit.SECONDS)
//                .readTimeout(5, TimeUnit.SECONDS)
//                .writeTimeout(5, TimeUnit.SECONDS)
//                .build();
//
//        String baseUrl = "https://api.douban.com/v2/movie/";
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(baseUrl)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .client(okHttpClient)
//                .build();
//
//
//        QueryNullService service = retrofit.create(QueryNullService.class);
//        Call<BookSearchNullResponse> call = service.getSearchBooks("小王子",null, 0, 3);
//
//        call.enqueue(new Callback<BookSearchNullResponse>() {
//            @Override
//            public void onResponse(Call<BookSearchNullResponse> call, Response<BookSearchNullResponse> response) {
//                BookSearchNullResponse body = response.body();
//                Log.e("----", body.toString());
//            }
//
//            @Override
//            public void onFailure(Call<BookSearchNullResponse> call, Throwable t) {
//                Log.e("----", t.toString());
//            }
//        });
//    }
//}

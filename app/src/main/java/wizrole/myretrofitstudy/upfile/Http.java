//package wizrole.myretrofitstudy.UpFile;
//
//import android.content.Context;
//import android.database.Cursor;
//import android.net.Uri;
//import android.os.Bundle;
//import android.provider.MediaStore;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//
//import java.io.File;
//
//import okhttp3.MediaType;
//import okhttp3.MultipartBody;
//import okhttp3.RequestBody;
//import okhttp3.ResponseBody;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
///**
// * Created by liushengping on 2018/3/20.
// * 何人执笔？
// *
// *
// */
//
//public class Http  {
//
//    public void upFile(){
//        Uri file1Uri = ... // 从文件选择器或者摄像头中获取
//        Uri file2Uri = ...
//        // 创建上传的service实例
//        FileUploadService service =ServiceGenerator.createService(FileUploadService.class);
//        // 创建文件的part (photo, video, ...)
//        MultipartBody.Part body1 = prepareFilePart("video", file1Uri);
//        MultipartBody.Part body2 = prepareFilePart("thumbnail", file2Uri);
//        // 添加其他的part
//        RequestBody description = createPartFromString("hello, this is description speaking");
//        // 最后执行异步请求操作
//        Call<ResponseBody> call = service.uploadMultipleFiles(description, body1, body2);
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call,
//                                   Response<ResponseBody> response) {
//                Log.v("Upload", "success");
//            }
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                Log.e("Upload error:", t.getMessage());
//            }
//        });
//
//    }
//
//
//    public static final String MULTIPART_FORM_DATA = "multipart/form-data";
//    @NonNull
//    private RequestBody createPartFromString(String descriptionString) {
//        return RequestBody.create(
//                MediaType.parse(MULTIPART_FORM_DATA), descriptionString);
//    }
//    @NonNull
//    private MultipartBody.Part prepareFilePart(String partName, Uri fileUri) {
//        File file = getFile(fileUri);
//        // 为file建立RequestBody实例
//        RequestBody requestFile =
//                RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA), file);
//        // MultipartBody.Part借助文件名完成最终的上传
//        return MultipartBody.Part.createFormData(partName, file.getName(), requestFile);
//    }
//
//    public File getFile(Uri uri){
//        String img_path;
//        String[] proj = {MediaStore.Images.Media.DATA};
//        Cursor actualimagecursor = managedQuery(uri, proj, null,
//                null, null);
//        if (actualimagecursor == null) {
//            img_path = uri.getPath();
//        } else {
//            int actual_image_column_index = actualimagecursor
//                    .getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
//            actualimagecursor.moveToFirst();
//            img_path = actualimagecursor
//                    .getString(actual_image_column_index);
//        }
//        File file = new File(img_path);
//        return file;
//    }
//}

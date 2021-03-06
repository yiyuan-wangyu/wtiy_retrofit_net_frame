package com.frame.wangyu.retrofitframe.constant;

import com.frame.wangyu.retrofitframe.WTApplicationContextUtil;
import com.frame.wangyu.retrofitframe.util.model.DownloadModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyu on 2019/4/24.
 */

public class RetrofitConfig {
    //https://nodejs.org/dist/v12.0.0/node-v12.0.0-x64.msi
    //http://192.168.1.166:8090/yy-face/images/269ea6add14befb71b0fa0c9c3fcf617.png
//    public static final String BASE_URL = "http://192.168.1.166:8090";
    public static String BASE_URL = "http://www.tuling123.com";

    public static final boolean DEBUG = true;//是否启动debug日志模式

    //下载通知栏的通道ID，不建议修改
    public static final String DOWNLOAD_CHANNEL_ID = "yiyuan_"+ WTApplicationContextUtil.mContext.getPackageName()+"_channel_download";

    //通知基数id
    public static final int NOTICE_DOWNLOAD_ID = 10288;

    public static final String DOWNLOAD_FILE_SHARE_PRE = "WTIY_DOWNLOAD";//断点下载文件share前缀

    public static final String DOWNLOAD_FILE_SHARE_SAVE = "WTIY_DOWNLOAD_LOG";//断点下载文件记录

    public static List<DownloadModel> downloadModelList = new ArrayList<>();
}

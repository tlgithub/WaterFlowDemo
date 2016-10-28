package com.example.waterflowdemo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by 教科书式的机智少年 on 2016/10/28.
 */

public  class HttpGet {
    //用于获取json数据
    public static String getJsonResoult(String path)throws Exception{
        /*URL url = new URL(path);
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        urlConnection.setConnectTimeout(5*1000);
        urlConnection.setRequestMethod("GET");
        InputStream in = urlConnection.getInputStream();*/
        try {
            URL url = new URL(path);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            if (urlConnection.getResponseCode() == 200){
                InputStream is = urlConnection.getInputStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte [] buffer = new byte[1024];
                int len = 0;
                while(-1 != (len = is.read(buffer))){
                    baos.write(buffer,0,len);
                    baos.flush();
                }
                return baos.toString("utf-8");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}

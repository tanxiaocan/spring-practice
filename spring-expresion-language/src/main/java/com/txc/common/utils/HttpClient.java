package com.txc.common.utils;

import java.io.*;
import java.net.*;

/**
 * Created by tanxiaocan on 2016/5/7.
 */
public class HttpClient {
    public static String doGet(String url){
        try{
            URL urlObj = new URL(url);
            URLConnection urlConnection = urlObj.openConnection();
            urlConnection.connect();
            InputStream in = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            StringBuffer sb = new StringBuffer();
            String lines;
            while ((lines = bufferedReader.readLine()) != null){
                System.out.println(lines);
                sb.append(lines);
            }
            return sb.toString();
        }catch (MalformedURLException mue){
            mue.printStackTrace();
            return null;
        }catch (IOException IOe){
            IOe.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) throws IOException {
        String baiduResult = doGet("http://www.baidu.com");
        doGet("http://chuangji.com");
        File file = new File("d:/baidu.html");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(baiduResult.getBytes());
        outputStream.close();
//        System.out.println(baiduResult);
    }
}

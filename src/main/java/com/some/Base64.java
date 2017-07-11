package com.some;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author mafh
 * @create 2017-07-06 16:33
 * Created With Intellij IDEA
 */
public class Base64 {
    /**
     * base64解密
     * @param str
     * @return
     */
    public static String decode(String str) throws Exception {
        Class clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
        Method mainMethod = clazz.getMethod("decode",String.class);
        mainMethod.setAccessible(true);
        Object retObj = mainMethod.invoke(null,str.replace(" ","+").replace("\\n",""));
        return new String((byte[])retObj,"UTF-8");
    }

    public static String encode(String str) throws Exception{
        byte[] bytes = str.getBytes();
        Class clazz = com.sun.org.apache.xerces.internal.impl.dv.util.Base64.class;
        Method mainMethod = clazz.getMethod("encode",byte[].class);
        mainMethod.setAccessible(true);
        Object retObj = mainMethod.invoke(null,new Object[]{bytes});
        return (String)retObj;
    }

    /**
     * 将url文件地址转换成二进制流
     */
    public static String transform(String urlStr) throws Exception{
        InputStream is = null;
        try{
            URL url = new URL(urlStr);//获取url地址对象
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
            if (httpURLConnection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                // msg.setErrcodeAndErrmsg(23333, "URL地址解析异常");
                // return msg;
            } else {//解析成功
                is = httpURLConnection.getInputStream();
                sun.misc.BASE64Encoder encode = new sun.misc.BASE64Encoder();
                byte[] data = new byte[is.available()];
                is.read(data);
                return new String(encode.encode(data));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(is != null){//关闭文件流
                is.close();
            }
        }
        return "";
    }

    public static void main(String[] args) throws Exception{
////        System.out.println(encode(str));
////        str = "MTIz";
////        System.out.println(decode(str));
//        System.out.println(str.replace(" ","+").replace("\\n",""));

        String url = "http://file.eeesys.com/attach/1499332026.png";
        String result = transform(url);
        System.out.println(result);
    }
}

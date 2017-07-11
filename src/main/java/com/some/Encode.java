package com.some;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author mafh
 * @create 2017-07-01 15:59
 * Created With Intellij IDEA
 */
public class Encode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String something = "happy every day";
        System.out.println(URLEncoder.encode(something,"UTF-8"));
    }
}

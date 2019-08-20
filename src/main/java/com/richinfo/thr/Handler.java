package com.richinfo.thr;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Handler  {
    public static void main(String[] args) {
        String str ="\uD869\uDEA5";
        String s = new String("\uD869\uDEA5");
        Integer i = 1;
        try {
            String b = new String(str.getBytes(), "gbk");
            System.out.println(b.getBytes("utf-8").length);
            byte[] a = str.getBytes("utf-8");
            System.out.println(a.length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

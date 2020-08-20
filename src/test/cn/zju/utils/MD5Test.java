package cn.zju.utils;

public class MD5Test {
    public static void main(String[] args) {
        String password = "1234";
        System.out.println(MD5Utils.md5(password));
    }
}

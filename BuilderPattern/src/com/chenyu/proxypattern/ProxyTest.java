package com.chenyu.proxypattern;

/**
 * 测试类
 *
 * @author chen yu
 * @create 2022-02-03 12:21
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.query();

    }
}

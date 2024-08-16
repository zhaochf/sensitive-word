package com.github.houbb.sensitive.word.bs;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

/**

 */
public class SensitiveWordBsIpv4Test {

    /**
     * ipv4 地址
     * @since 0.17.0
     */
    @Test
    public void defaultTest() {
        final String text = "个人网站，如果网址打不开可以访问 127.0.0.1。";
        final SensitiveWordBs sensitiveWordBs = SensitiveWordBs.newInstance().init();

        List<String> wordList = sensitiveWordBs.findAll(text);
        assertEquals("[]", wordList.toString());
    }

    /**
     * ipv4 地址
     * @since 0.17.0
     */
    @Test
    public void ipv4CheckTest() {
        final String text = "个人网站，如果网址打不开可以访问 127.0.0.1。";
        final SensitiveWordBs sensitiveWordBs = SensitiveWordBs.newInstance().enableIpv4Check(true).init();
        List<String> wordList = sensitiveWordBs.findAll(text);
        assertEquals("[127.0.0.1]", wordList.toString());
    }

}

package com.github.houbb.sensitive.word.bs;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

/**
 * <p> project: sensitive-word-SensitiveWordBsTest </p>
 * <p> create on 2020/1/7 23:43 </p>
 *
 * @author Administrator
 * @since 0.0.12
 */
public class SensitiveWordBsUrlTest {

    /**
     * 忽略中文繁简体
     * @since 0.0.12
     */
    @Test
    public void commonUrlTest() {
        final String text = "点击链接 https://www.baidu.com 查看答案";

        final SensitiveWordBs sensitiveWordBs = SensitiveWordBs.newInstance().enableUrlCheck(true).init();
        List<String> wordList = sensitiveWordBs.findAll(text);
        assertEquals("[https://www.baidu.com]", wordList.toString());

        assertEquals("点击链接 ********************* 查看答案", sensitiveWordBs.replace(text));
    }

    /**
     * 图片测试
     *
     * （1）可以检测
     * （2）默认不替换
     *
     * @since 0.0.12
     */
    @Test
    public void imageUrlTest() {
        final String text = "双击查看大图 http://www.big-image.png 查看";

        final SensitiveWordBs sensitiveWordBs = SensitiveWordBs.newInstance()
                .enableUrlCheck(true)
                .init();
        List<String> wordList = sensitiveWordBs.findAll(text);
        assertEquals("[http://www.big-image.png]", wordList.toString());

        assertEquals("双击查看大图 ************************ 查看", sensitiveWordBs.replace(text));
    }

}

package com.github.houbb.sensitive.word.bs;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

/**
 * <p> project: sensitive-word-SensitiveWordBsTest </p>
 * <p> create on 2020/1/7 23:43 </p>
 *
 * @author Administrator
 * @since 0.0.6
 */
public class SensitiveWordBsChineseTest {

    /**
     * 忽略中文繁简体
     * @since 0.0.6
     */
    @Test
    public void ignoreChineseStyleTest() {
        final String text = "我爱我的祖国和五星紅旗。";

        List<String> wordList = SensitiveWordBs.newInstance().init().findAll(text);
        assertEquals("[五星紅旗]", wordList.toString());
    }

}

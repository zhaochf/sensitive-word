package com.github.houbb.sensitive.word.bs;

import com.github.houbb.sensitive.word.support.ignore.SensitiveWordCharIgnores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

/**
 * <p> project: sensitive-word-SensitiveWordBsTest </p>
 * <p> create on 2020/1/7 23:43 </p>
 *
 * @author Administrator
 * @since 0.11.0
 */
public class SensitiveWordBsIgnoreCharTest {

    /**
     * 忽略中文繁简体
     * @since 0.0.6
     */
    @Test
    public void ignoreChineseStyleTest() {
        final String text = "傻@冒，狗+东西";

        //默认因为有特殊字符分割，无法识别
        List<String> wordList = SensitiveWordBs.newInstance().init().findAll(text);
        assertEquals("[]", wordList.toString());

        // 指定忽略的字符策略，可自行实现。
        List<String> wordList2 = SensitiveWordBs.newInstance()
                .charIgnore(SensitiveWordCharIgnores.specialChars())
                .init()
                .findAll(text);

        assertEquals("[傻@冒, 狗+东西]", wordList2.toString());
    }

}

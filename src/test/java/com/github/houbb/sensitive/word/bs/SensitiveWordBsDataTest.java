package com.github.houbb.sensitive.word.bs;

import com.github.houbb.sensitive.word.support.data.WordDatas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * <p> project: sensitive-word-SensitiveWordBsConfigTest </p>
 * <p> create on 2020/1/7 23:43 </p>
 *
 * @author Administrator
 * @since 0.7.0
 */
public class SensitiveWordBsDataTest {

    @Test
    public void wordDataConfigTest() {
        SensitiveWordBs wordBs = SensitiveWordBs.newInstance()
                .wordData(WordDatas.tree())
                .init();

        final String text = "五星红旗迎风飘扬，毛主席的画像屹立在天安门前。";
        assertTrue(wordBs.contains(text));
        assertEquals("[五星红旗, 毛主席, 天安门]", wordBs.findAll(text).toString());
    }

}

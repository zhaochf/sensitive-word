package com.github.houbb.sensitive.word.bugs.b31;

import com.github.houbb.sensitive.word.core.SensitiveWordHelper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Bug31Test {

    @Test
    public void lettersTest() {
        String text = "你是SB吧";

        assertTrue(SensitiveWordHelper.contains(text));
        assertEquals("[SB]", SensitiveWordHelper.findAll(text).toString());
    }

}

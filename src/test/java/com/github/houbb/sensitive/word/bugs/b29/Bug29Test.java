package com.github.houbb.sensitive.word.bugs.b29;

import com.github.houbb.sensitive.word.core.SensitiveWordHelper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class Bug29Test {

    @Test
    public void test() {
        String text = "生日快乐";

        assertFalse(SensitiveWordHelper.contains(text));
        assertEquals("[]", SensitiveWordHelper.findAll(text).toString());
    }

}

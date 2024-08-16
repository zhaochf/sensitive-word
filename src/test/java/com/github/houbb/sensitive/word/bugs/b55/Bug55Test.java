package com.github.houbb.sensitive.word.bugs.b55;

import com.github.houbb.sensitive.word.bs.SensitiveWordBs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Bug55Test {

   @Test
   public void test() {
        SensitiveWordBs sensitiveWordBs = SensitiveWordBs.newInstance()
                .init();
        final String text = "以个人账户或现金收取资金、现场或即时交付本金即给予部分提成、分红、利息;";
        assertEquals("[]", sensitiveWordBs.findAll(text).toString());
    }

}

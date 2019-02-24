package com.batchsight.demo;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8ResultUndefined;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Shanghai Batchsight Pharmaceutical Technologies, Inc. Copyright(c) 2016-2018</p>
 *
 * @author Zuo Yefeng
 * @version 1.0
 * <pre>Histroy:
 *       2018/7/31    Zuo Yefeng        Created
 * </pre>
 */

class J2v8Demo {

    @Test
    void testScriptBoolean() {
        V8 v8 = V8.createV8Runtime();
        Object result = v8.executeScript("2 > 1");
        assertEquals(Boolean.class.getName(), result.getClass().getName());
        assertEquals("true", String.valueOf(result));
    }

    @Test
    void testScriptNumber() {
        V8 v8 = V8.createV8Runtime();
        Object result = v8.executeScript("3.14159");
        assertEquals(Double.class.getName(), result.getClass().getName());
    }

    @Test
    void testScriptNan() {
        V8 v8 = V8.createV8Runtime();
        Object result = v8.executeScript("0.0/0.0");
        assertEquals(Double.NaN, result);
    }

    @Test
    void testExecuteScriptString() {
        try {
            V8 v8 = V8.createV8Runtime();
            Object result = v8.executeStringScript("123");
            fail("Exptected a V8ResultUndefined to be thrown");
        } catch (V8ResultUndefined ignore) {}
    }
}

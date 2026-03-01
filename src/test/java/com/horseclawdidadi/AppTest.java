package com.horseclawdidadi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * HorseClawDiDaDi 单元测试
 */
class AppTest {
    
    @Test
    void testSayHello() {
        App app = new App();
        assertEquals("Hello, World!", app.sayHello("World"));
    }
    
    @Test
    void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
        assertEquals(0, app.add(-1, 1));
    }
    
    @Test
    void testIsEven() {
        App app = new App();
        assertTrue(app.isEven(2));
        assertTrue(app.isEven(0));
        assertFalse(app.isEven(1));
        assertFalse(app.isEven(-1));
    }
}

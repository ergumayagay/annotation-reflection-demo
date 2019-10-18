package test.java;

import main.java.About;
import main.java.Book;
import main.java.MethodType;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

/**
 * @author emiliogumayagay
 * @version $Id: TestReflection.java, v 0.1 2019-10-10 15:51 emiliogumayagay Exp $$
 */
public class TestReflection {

    @Test
    public void testGetAnnotation(){
       Book b = Book.of(1, "Fifity Shades of Grey");
       assertEquals("Emil",b.getClass().getAnnotation(About.class).author());
    }

    @Test
    public void testMethodAnnotation() throws NoSuchMethodException{
        Book b = Book.of(1, "Fifity Shades of Grey");
        Method m = b.getClass().getMethod("of", long.class, String.class);
        assertEquals("staticFactory", m.getAnnotation(MethodType.class).type());
    }
}
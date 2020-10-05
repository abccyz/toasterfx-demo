package org.pomo.toasterfx.demo.test;

import org.junit.Test;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ATest {

    @Test
    public void t01() {
        ResourceBundle bundle = ResourceBundle.getBundle(
                "org.pomo.toasterfx.demo.language.message",
                Locale.ENGLISH,
                ATest.class.getClassLoader());
        System.out.println(bundle.getString("demo.title"));
    }

    @Test
    public void t02() {
        ResourceBundle bundle = ResourceBundle.getBundle("org.pomo.toasterfx.demo.language.message", Locale.KOREA);
        System.out.println(bundle.getString("demo.title"));
    }

    @Test
    public void t03(){

        ResourceBundle bundle = ResourceBundle.getBundle("org.pomo.toasterfx.demo.language.message", Locale.SIMPLIFIED_CHINESE);
        System.out.println(bundle.getString("demo.title"));
    }

    @Test
    public void t04(){

        URL resource = ATest.class.getResource("/org/pomo/toasterfx/demo/language/Message_en.properties");
        System.out.println(resource);
    }
}
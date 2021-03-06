package io.github.biezhi.webp;

import org.junit.Test;

import java.io.File;

/**
 * @author biezhi
 * @date 2017/10/2
 */
public class WebpToPngTest {

    @Test
    public void testConvert() {
        File src = new File(WebpToPngTest.class.getResource("/heng.webp").getPath());
//        System.out.println(src);
        File dest = new File("heng.png");

        WebpIO.toNormalImage(src, dest);
        WebpIO.close();
    }

    public static void main(String[] args) {
        String osName = System.getProperty("os.name"); //操作系统名称
        String osArch = System.getProperty("os.arch"); //操作系统构架
        System.out.println(osName.replace(" ", "") + "_" + osArch);
    }
}

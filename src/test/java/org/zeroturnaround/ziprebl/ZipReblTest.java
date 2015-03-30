package org.zeroturnaround.ziprebl;

import org.junit.Test;
import org.zeroturnaround.ziprebl.ZipRebl;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'shelajev' at '3/30/15 12:10 PM' with Gradle 2.2.1
 *
 * @author shelajev, @date 3/30/15 12:10 PM
 */
public class ZipReblTest {

    @Test public void testCompressOne() {
        long result = new ZipRebl().compress(new byte[] { 1 });
        assertEquals("compress should return '1'", 1, result);
    }

    @Test public void testCompressZero() {
        long result = new ZipRebl().compress(new byte[] {0});
        assertEquals("compress all zeroes should give 0", 0, result);
    }

    @Test public void testCompressRecursive() {
        long result = new ZipRebl().compress(new byte[] { 1, 1, 1, 1, 1, 1, 1, 1 });
        assertEquals("compress all zeroes should give 1", 1, result);
    }

    @Test public void testCompressFile() throws URISyntaxException {
        long result = new ZipRebl().compress(Paths.get(this.getClass().getClassLoader().getResource(this.getClass().getName().replace('.', '/') + ".class").toURI()));
        assertEquals("compress all zeroes should give 1", 1, result);
    }


}
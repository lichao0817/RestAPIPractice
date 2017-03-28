package util;

import model.Record;
import org.junit.Test;
import util.RecordUtil;

import java.io.File;
import java.util.List;

/**
 * Created by Chao on 2017/3/23.
 */
public class RecordUtilTest {
    @Test
    public void parseRecordTest1() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("comma-delimited.txt").getFile());
        List<Record> list = RecordUtil.getRecordsByBirthday(file);
        for (Record r : list) {
            System.out.println(r);
        }
    }
    @Test
    public void parseRecordTest2() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("pipe-delimited.txt").getFile());
        List<Record> list = RecordUtil.getRecordsByGender(file);
        for (Record r : list) {
            System.out.println(r);
        }
    }
    @Test
    public void parseRecordTest3() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("space-delimited.txt").getFile());
        List<Record> list = RecordUtil.getRecordsByName(file);
        for (Record r : list) {
            System.out.println(r);
        }
    }
}

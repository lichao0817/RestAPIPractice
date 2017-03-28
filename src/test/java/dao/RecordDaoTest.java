package dao;

import model.Gender;
import model.Record;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Chao on 2017/3/28.
 */
public class RecordDaoTest {
    @Test
    public void initTest() {
        RecordDao dao = new RecordDao();
        Assert.assertTrue(dao.getAllRecords().size() > 0);
    }
    @Test
    public void putRecordTest() {
        RecordDao dao = new RecordDao();
        int oldCount = dao.count();
        dao.putRecord(new Record("Obama", "Barack", Gender.Male, "Red", new Date()));
        Assert.assertTrue(dao.count() == oldCount + 1);
    }
}

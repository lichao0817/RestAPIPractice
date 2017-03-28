package dao;
import model.Record;
import util.RecordUtil;

import java.io.File;
import java.util.List;

public class RecordDao {
    private static List<Record> list;
    public RecordDao() {
        if (list == null) {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("init.txt").getFile());
            list = RecordUtil.getRecordsByBirthday(file);
        }
    }
    public int count() {
        return list.size();
    }
    public List<Record> getAllRecords() {
        return list;
    }
    public void putRecord(Record record) {
        list.add(record);
    }
}
package app;

import dao.RecordDao;
import model.Record;
import org.springframework.web.bind.annotation.*;
import util.RecordUtil;

import java.util.List;

@RestController
@RequestMapping("/records")
public class ServieController {
    private RecordDao dao = new RecordDao();
    private List<Record> records = dao.getAllRecords();

    @RequestMapping("/name")
    public List<Record> getRecordsByName(){
        RecordUtil.sortRecordsByName(records);
        return records;
    }
    @RequestMapping("/gender")
    public List<Record> getRecordsByGender() {
        RecordUtil.sortRecordsByGender(records);
        return records;
    }
    @RequestMapping("/birthdate")
    public List<Record> getRecordsByBirthdate() {
        RecordUtil.sortRecordsByBirthDay(records);
        return records;
    }
}
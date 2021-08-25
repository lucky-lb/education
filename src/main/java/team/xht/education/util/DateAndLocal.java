package team.xht.education.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateAndLocal {
    public static Date asDate(LocalDateTime time) {
        return Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDateTime asLocal(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}

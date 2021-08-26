package team.xht.education.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Miracle Luna
 * @Date 2021/8/26 23:46
 * @Version 1.0
 */
@Data
@AllArgsConstructor //生成有参数构造
@NoArgsConstructor //生成无参构造方法
public class XhtException extends RuntimeException {
    private Integer code;//状态码
    private  String msg;//信息

}

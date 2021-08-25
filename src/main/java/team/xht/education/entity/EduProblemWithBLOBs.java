package team.xht.education.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
@EqualsAndHashCode(callSuper = true)
@Data
public class EduProblemWithBLOBs extends EduProblem {
    private String description;

    private String answer;

    public EduProblemWithBLOBs(String id, Byte problemType, String subjectId, Integer sort, Byte isDeleted, LocalDateTime gmtCreate, LocalDateTime gmtModified, String description, String answer) {
        super(id, problemType, subjectId, sort, isDeleted, gmtCreate, gmtModified);
        this.description = description;
        this.answer = answer;
    }

    public EduProblemWithBLOBs() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}
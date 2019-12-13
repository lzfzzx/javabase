package test;

/**
 * Created by Lzf on 2019/12/3.
 */
public class PersonInfo {
    private Long personId;
    private String personName;
    private Integer age;
    private Integer seq;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", age=" + age +
                ", seq=" + seq +
                '}';
    }
}

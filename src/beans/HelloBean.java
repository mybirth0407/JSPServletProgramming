package beans;

/**
 * Created by Yedarm Seong on 2016-01-24.
 */
public class HelloBean implements java.io.Serializable {
    private String name;
    private String number;

    public HelloBean() {
        this.name = "이름이 없습니다.";
        this.number = "번호가 없습니다.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

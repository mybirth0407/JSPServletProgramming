 /**
 * Created by Yedarm Seong on 2016-01-12.
 */

package jsp;

import java.util.Calendar;

public class HelloBean {
    private String name = "Guest";
    Calendar cal = Calendar.getInstance();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getMonth() {
        return cal.get(Calendar.MONTH) + 1;
    }

    public int getDate() {
        return cal.get(Calendar.DATE);
    }
}

package el;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Yedarm Seong on 2016-02-06.
 */
public class ElFunction {
    public static int length(Object obj) {
        if (obj == null) {
            return 0;
        }

        if (obj instanceof String) {
            return ((String)obj).length();
        }

        if (obj instanceof Collection) {
            return ((Collection)obj).size();
        }

        if (obj instanceof Map) {
            return ((Map)obj).size();
        }

        else {
            return 0;
        }
    }
}

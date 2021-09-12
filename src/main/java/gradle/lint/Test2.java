package gradle.lint;

import org.apache.commons.lang3.StringUtils;

public interface Test2 {
    default boolean test2() {
        //return StringUtils.containsAny("abcde", 'a');
        return false;
    }
}

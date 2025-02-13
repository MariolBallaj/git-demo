package com.lhind.internship;

import org.apache.commons.lang3.StringUtils;

public final class CommonUtils {

    private CommonUtils() {
    }

    public static boolean checkString(String str) {
        return StringUtils.isEmpty(str);
    }
}

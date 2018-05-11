package com.gnerv.management.util;

import java.util.UUID;

public class UUIDUtils {

    /**
     * 去中横线 小写
     * @return uuid
     */
    public static String getUUIDToLowercaseNoLine(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    /**
     * 去中横线 大写
     * @return UUID
     */
    public static String getUUIDToUppercaseNoLine(){
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}

package com.xiaozhangge.common.util;

import java.util.UUID;

/**
 * @author zyf
 * @ClassName IdHelper
 * @Description todo
 * @Date 2019-07-27 20:39
 * @ApiDoc
 */
public class IdHelper {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}

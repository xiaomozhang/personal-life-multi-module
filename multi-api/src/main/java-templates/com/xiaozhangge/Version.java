package com.xiaozhangge;

/**
 * @author xiaozhangge
 * @ClassName Version
 * @Description todo
 * @Date 2019-05-12 20:38
 * @ApiDoc
 */
public final class Version {

    /**
     * project version
     */
    public static final String VERSION = "${project.version}";
    /**
     * artifact id
     */
    public static final String ARTIFACTID = "${artifactId}";
    /**
     * build timestamp
     */
    public static final String TIMESTAMP = "${timestamp}";
    /**
     * build description
     */
    public static final String DESCRIPTION = "${description}";
}

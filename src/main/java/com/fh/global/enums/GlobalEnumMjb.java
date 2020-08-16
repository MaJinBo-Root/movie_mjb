package com.fh.global.enums;

public enum GlobalEnumMjb {

    JEDIS_HOST("192.168.95.131"),
    JEDIS_PASSWORD("000161"),
    OSS_ACCESSKEYID("LTAI4GF8adfioi7vxtraJaxn"),
    OSS_ACCESSKEYSECRET("aCDiNKm2zEdutgDgZOABXhADYAj1fs"),
    OSS_BUCKETNAME("fh-mjb"),
    OSS_ADDRESS("oss-cn-qingdao.aliyuncs.com")
    ;

    private String commonInfermation;

    private GlobalEnumMjb(String commonInfermation){this.commonInfermation=commonInfermation;}

    public String getCommonInfermation() {
        return commonInfermation;
    }

    public void setCommonInfermation(String commonInfermation) {
        this.commonInfermation = commonInfermation;
    }

}

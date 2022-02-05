package com.company;

import com.company.devices.Phone;

public class Application  {
    String AppName;
    String AppVersion;
    Double AppPrice;

    public Application(String appName, String appVersion, Double appPrice) {
        AppName = appName;
        AppVersion = appVersion;
        AppPrice = appPrice;
    }

    public Double getAppPrice() {
        return AppPrice;
    }

    public String getAppName() {
        return AppName;
    }

    public String getAppVersion() {
        return AppVersion;
    }
}

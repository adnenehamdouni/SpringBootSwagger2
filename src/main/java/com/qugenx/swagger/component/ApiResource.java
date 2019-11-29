package com.qugenx.swagger.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ApiResource {

    @Value("${application.name}")
    private String applicationName;

    @Value("${build.version}")
    private String buildVersion;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    public String getApplicationName() {
        return applicationName;
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public String getActiveProfile() {
        return activeProfile;
    }

    @Override
    public String toString() {
        return "ApiModel{" +
                "applicationName='" + applicationName + '\'' +
                ", buildVersion='" + buildVersion + '\'' +
                ", activeProfile='" + activeProfile + '\'' +
                '}';
    }
}

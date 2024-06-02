package com.nt.beans;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("company")
@ConfigurationProperties(prefix = "org.nit")
@Data
public class CompanyDetails {
    private String name;
    private String type;
    private String location;
    private int employees;
    private float revenue;
    private String[] phoneNumbers;
    private List<String> members;
    private Map<String, String> companyDetails;

    
    @Override
    public String toString() {
        return "CompanyDetails{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", employees=" + employees +
                ", revenue=" + revenue +
                ", phoneNumbers=" + String.join(", ", phoneNumbers[0]) +
                ", members=" + members +
                ", companyDetails=" + companyDetails +
                '}';
    }
}

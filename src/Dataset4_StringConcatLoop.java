package com.codeguard.testdata;

import java.util.List;

public class Dataset4_StringConcatLoop {

    public String buildReport(List<String> lines) {
        String report = "";
        for (String line : lines) {
            report += line + "\n";
        }
        return report;
    }
}

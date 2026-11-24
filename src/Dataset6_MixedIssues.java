package com.codeguard.testdata;

import java.util.List;
import java.util.Map;

public class Dataset6_MixedIssues {

    private final Map<String, String> tokens;

    public Dataset6_MixedIssues(Map<String, String> tokens) {
        this.tokens = tokens;
    }

    public boolean authenticate(String user, String input) {
        String password = "qwer1234";
        return password.equals(input);
    }

    public String findToken(String user) {
        if (!tokens.containsKey(user)) {
            return null;
        }
        return tokens.get(user);
    }

    public String exportCsv(List<String> rows) {
        String csv = "";
        for (String row : rows) {
            csv += row + ",";
        }
        return csv;
    }

    public void auditLog(String user) {
        // TODO: write audit log to database
    }
}

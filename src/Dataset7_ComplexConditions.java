package com.codeguard.testdata;

import java.util.Map;

public class Dataset7_ComplexConditions {

    public int parseAge(String input) {
        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
        }
        return -1;
    }

    public String findGrade(Map<String, Integer> scores, String student) {
        if (scores == null || student == null) {
            return null;
        }
        Integer score = scores.get(student);
        if (score == null) {
            return "N/A";
        }
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80) {
            return "B";
        }
        return "C";
    }

    public String describeStudent(Map<String, Integer> scores, String student) {
        String grade = findGrade(scores, student);
        if (grade == null) {
            return "unknown";
        }
        return student + ": " + grade;
    }
}

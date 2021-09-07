package com.ehay.problemsolving.programmers.level1;

public class Solution72410 {
    public String solution(String new_id) {
        String recommendId = step1(new_id);
        recommendId = step2(recommendId);
        recommendId = step3(recommendId);
        recommendId = step4(recommendId);
        recommendId = step5(recommendId);
        recommendId = step6(recommendId);
        return step7(recommendId);
    }

    protected String step1(String id) {
        return id.toLowerCase();
    }

    protected String step2(String idAfterStep1) {
        return idAfterStep1.replaceAll("[^a-z0-9\\_\\-\\.]", "");
    }

    protected String step3(String idAfterStep2) {
        return idAfterStep2.replaceAll("\\.+", ".");
    }

    protected String step4(String idAfterStep3) {
        return idAfterStep3.replaceAll("^[.]|[.]$", "");
    }

    protected String step5(String idAfterStep4) {
        if (idAfterStep4.isEmpty()) {
            idAfterStep4 = "a";
        }

        return idAfterStep4;
    }

    protected String step6(String idAfterStep5) {
        if (idAfterStep5.length() >= 16) {
            idAfterStep5 = idAfterStep5.substring(0, 15).replaceAll("[.]$", "");
        }

        return idAfterStep5;
    }

    protected String step7(String idAfterStep6) {
        if (idAfterStep6.length() > 0 && idAfterStep6.length() <= 2) {
            int length = idAfterStep6.length();
            for (int i = length; i < 3; i++) {
                idAfterStep6 += idAfterStep6.charAt(length - 1);
            }
        }

        return idAfterStep6;
    }
}

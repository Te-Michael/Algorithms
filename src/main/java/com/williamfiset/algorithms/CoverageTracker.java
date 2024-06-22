package com.williamfiset.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CoverageTracker {
    private static Map<Integer, Boolean> branchCoverage = new HashMap<>();
    public static void setBranchReached(int branchID) {
        branchCoverage.put(branchID, true);
    }
    public static void setTotalBranches(int branches) {
        for(int i = 0; i < branches; i++) {
            branchCoverage.put(i, false);
        }
    }
    public static void writeCoverageToConsole() {
        System.out.println("Branch Coverage Information:");
        for (Map.Entry<Integer, Boolean> entry : branchCoverage.entrySet()) {
            System.out.println("Branch ID: " + entry.getKey() + ", Covered: " + entry.getValue());
        }
    }
}
package com.obb.labs.domain;

/*
Two customer records are being merged.
Check if two names are equal (case-sensitive). If not equal,
print which name is lexicographically forward (dictionary-later).
 */

public class CustomerNameMatcher {

    private String nameA;
    private String nameB;

    public CustomerNameMatcher(String nameA, String nameB) {
        this.nameA = nameA;
        this.nameB = nameB;
    }

    public String getNameA() { return nameA; }
    public String getNameB() { return nameB; }

    // TODO: return true if names are exactly equal
    public boolean isEqual() {
        return false; // TODO
    }

    // TODO: If not equal, return the name which is lexicographically forward (dictionary-later).
    // Use compareTo.
    public String lexicographicallyForward() {
        return null; // TODO
    }
}

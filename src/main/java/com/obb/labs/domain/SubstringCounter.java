package com.obb.labs.domain;


/*
A plagiarism scanner flags suspicious repeated patterns.
Count how many times "ow" occurs in:

"the quick brown fox swallowed down the lazy chicken"

Count should be non-overlapping using index scanning.

 */
public class SubstringCounter {

    private String text;

    public SubstringCounter(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // TODO: Count non-overlapping occurrences of needle inside text.
    // Example: "swallowed down" contains "ow" twice? Actually: "swallowed" has "ow" once.
    public int countOccurrences(String needle) {
        return 0; // TODO
    }

}

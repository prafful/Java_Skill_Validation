package com.obb.labs.strings;

import com.obb.labs.domain.SubstringCounter;

/*
A plagiarism scanner flags suspicious repeated patterns.
Count how many times "ow" occurs in:

"the quick brown fox swallowed down the lazy chicken"

Count should be non-overlapping using index scanning.

 */

public class Lab13_SubstringScanApp {

    public static void main(String[] args) {

        String sentence = "the quick brown fox swallowed down the lazy chicken";
        SubstringCounter counter = new SubstringCounter(sentence);

        // TODO
        int count = 0; // TODO

        System.out.println("Needle  : ow");
        System.out.println("Count   : " + count);
    }
}

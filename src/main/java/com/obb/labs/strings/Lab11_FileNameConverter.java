package com.obb.labs.strings;


import com.obb.labs.domain.FileNameConverter;

/*
A document management system needs to archive old documents.
Convert "example.doc" into "example.bak" by replacing the extension.
 */

public class Lab11_FileNameConverter {


    public static void main(String[] args) {

        FileNameConverter converter = new FileNameConverter("example.doc");

        // TODO: call replaceExtension("bak") and store result
        String archived = null; // TODO

        System.out.println("Original : example.doc");
        System.out.println("Archived : " + archived);
    }

}

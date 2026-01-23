package com.obb.labs.domain;

/*
A document management system needs to archive old documents.
Convert "example.doc" into "example.bak" by replacing the extension.
 */

public class FileNameConverter {

    private String originalName;

    public FileNameConverter(String originalName) {
        this.originalName = originalName;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    // TODO: Return a new filename by replacing the extension with newExt (without dot).
    // Example: "example.doc" with "bak" => "example.bak"
    public String replaceExtension(String newExt) {
        return null; // TODO
    }

}

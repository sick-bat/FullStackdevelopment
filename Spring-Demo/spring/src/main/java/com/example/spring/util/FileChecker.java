package com.example.spring.util;
import com.example.spring.util.*;

public class FileChecker {
    
    private FileUtil util;

    public FileChecker(FileUtil util) {
        this.util = util;
    }

    public void checkFileValidity() {
        System.out.println("File Size is " + util.fileSize());
    }
}

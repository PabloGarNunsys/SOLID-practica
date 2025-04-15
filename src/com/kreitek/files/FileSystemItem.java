package com.kreitek.files;

public interface FileSystemItem {
    String getName();
    void setName(String name);
    FileSystemItem getParent();
    void setParent(FileSystemItem directory);
    String getFullPath();
    int getSize();

}
// * public interface FileSystemItem {
    // String getName();
    // void setName(String name);
    // FileSystemItem getParent();
    // void setParent(FileSystemItem directory);
    // String getFullPath();
    // int getSize();
    // List<FileSystemItem> listFiles(); // Directory
    // void addFile(FileSystemItem file); // Directory
    // void removeFile(FileSystemItem file); // Directory
    // String getExtension(); // File
    // void open(); // File
    // void close(); // File
    // void setPosition(int numberOfBytesFromBeginning); // File
    // byte[] read(int numberOfBytesToRead); // File
    // void write(byte[] buffer); // File


// * }

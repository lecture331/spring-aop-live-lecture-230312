package com.example.springaoplivelecture230312.imageviewer;

public class RealImageViewer implements ImageViewer {
    private String fileName;

    public RealImageViewer(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void displayImage(String fileName) {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }
}
package com.example.springaoplivelecture230312.imageviewer;

public class ProxyImageViewer implements ImageViewer {
    private RealImageViewer realImageViewer;
    private String fileName;

    public ProxyImageViewer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage(String fileName) {
        if (realImageViewer == null) {
            realImageViewer = new RealImageViewer(fileName);
        }
        realImageViewer.displayImage(fileName);
    }
}

package com.example.springaoplivelecture230312.imageviewer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProxyImageViewerTest {
    @Test
    public void testProxyImageViewer() {
        ImageViewer imageViewer = new ProxyImageViewer("Test.jpg");

        // RealImageViewer 객체가 초기화되기 전까지 displayImage() 메서드는 호출되지 않음
        Assertions.assertDoesNotThrow(() -> imageViewer.displayImage("Test.jpg"));
        System.out.println("");

        // RealImageViewer 객체가 초기화된 이후 displayImage() 메서드가 호출됨
        Assertions.assertDoesNotThrow(() -> imageViewer.displayImage("Test.jpg"));
    }
}

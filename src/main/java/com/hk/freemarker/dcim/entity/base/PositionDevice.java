package com.hk.freemarker.dcim.entity.base;

import lombok.*;

/**
 * Created by HomKey on 2019/9/20.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class PositionDevice {
    private CollectorDevice collectorDevice;
    private Float locationX = 0f; // 左正右负
    private Float locationY = 0f; // 上正下负
    private Float locationZ = 0f; // 远正近负
    private Float towardsX = 0f;
    private Float towardsY = 0f;
    private Float towardsZ = 0f;

    public void moveLeft(Float value) {
        locationX += value;
    }

    public void moveRight(Float value) {
        locationX -= value;
    }

    public void moveTop(Float value) {
        locationY += value;
    }

    public void moveDown(Float value) {
        locationY -= value;
    }

    public void moveFar(Float value) {
        locationZ += value;
    }

    public void moveNear(Float value) {
        locationZ -= value;
    }
}

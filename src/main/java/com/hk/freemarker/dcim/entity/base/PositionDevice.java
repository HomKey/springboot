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
    private DeviceDetail deviceDetail;
    @Builder.Default
    private Float locationX = 0f; // 左正右负
    @Builder.Default
    private Float locationY = 0f; // 上正下负
    @Builder.Default
    private Float locationZ = 0f; // 远正近负
    @Builder.Default
    private Float towardsX = 0f; // -1 顺时针90度
    @Builder.Default
    private Float towardsY = 0f;
    @Builder.Default
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

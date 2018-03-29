package com.ysh.framework.common.util;

import org.apache.commons.lang3.RandomStringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 描述: 图片叠加（水印） .<br>
 *
 * @author YangShangHang
 * @date 2018/3/14
 */
public class NewImageUtils {
    /**
     * 构造图片（生成水印）
     *
     * @param file      源文件(图片)
     * @param waterFile 水印文件(图片)
     * @param x         距离右下角的X偏移量
     * @param y         距离右下角的Y偏移量
     * @param alpha     透明度, 选择值从0.0~1.0: 完全透明~完全不透明
     * @return 生成水印
     * @throws IOException io异常
     */
    public static BufferedImage watermark(File file, File waterFile, int x, int y, float alpha) throws IOException {
        // 获取底图
        BufferedImage buffImg = ImageIO.read(file);
        // 获取层图
        BufferedImage waterImg = ImageIO.read(waterFile);
        // 创建Graphics2D对象，用在底图对象上绘图
        Graphics2D g2d = buffImg.createGraphics();
        int waterImgWidth = waterImg.getWidth();// 获取层图的宽度
        int waterImgHeight = waterImg.getHeight();// 获取层图的高度
        // 在图形和图像中实现混合和透明效果
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));
        // 绘制
        g2d.drawImage(waterImg, x, y, waterImgWidth, waterImgHeight, null);
        g2d.dispose();// 释放图形上下文使用的系统资源
        return buffImg;
    }

    /**
     * 输出水印图片
     *
     * @param buffImg  图像加水印之后的BufferedImage对象
     * @param savePath 图像加水印之后的保存路径
     */
    private void generateWaterFile(BufferedImage buffImg, String savePath) {
        int temp = savePath.lastIndexOf(".") + 1;
        try {
            ImageIO.write(buffImg, savePath.substring(temp), new File(savePath));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * 图片水印测试
     *
     * @param args
     * @throws IOException IO异常
     */
    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(RandomStringUtils.randomNumeric(3));
        int y = Integer.parseInt(RandomStringUtils.randomNumeric(3));
        String sourceFilePath = "C:\\Penguins.jpg";
        String waterFilePath = "C:\\sousuo.png";
        String saveFilePath = "C:\\test_result.jpg";
        NewImageUtils newImageUtils = new NewImageUtils();
        // 构建叠加层
        BufferedImage buffImg = NewImageUtils.watermark(new File(sourceFilePath), new File(waterFilePath), x, y, 1.0f);
        // 输出水印图片
        newImageUtils.generateWaterFile(buffImg, saveFilePath);
    }
}

package com.example.imagviewutils;

import android.widget.ImageView;

public class ImageViewUtils {
    private static ImageViewUtils instance;
    private ImageView mImageView;

    public static ImageViewUtils getInstance(ImageView imageView) {
        if (instance == null) {
            instance = new ImageViewUtils(imageView);
        }
        return instance;
    }

    public ImageViewUtils(ImageView imageView) {
        this.mImageView = imageView;
    }

    /*設定圖片旋轉
    * @ param rotation 旋轉角度
    * */
    public void setRotation(float rotation) {
        // 使旋转点在图片中心
        mImageView.setPivotX(mImageView.getWidth() / 2);
        mImageView.setPivotY(mImageView.getHeight() / 2);
        // 旋转90度
        mImageView.setRotation(rotation);
    }
}

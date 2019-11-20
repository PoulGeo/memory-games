package com.example.memorygames;

import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

public class ImageSwitch {

    Drawable firstPic, secondPic;
    ImageButton firstBtn, secondBtn;
    int a, b;

    public ImageSwitch(ImageButton firstBtn, ImageButton secondBtn) {
        this.firstBtn = firstBtn;
        this.secondBtn = secondBtn;

        getFirstPic();
        getSecondPic();

        firstBtn.setImageDrawable(secondPic);
        secondBtn.setImageDrawable(firstPic);

        getA();
        getB();

        firstBtn.setTag(b);
        secondBtn.setTag(a);
    }

    public int getA() {
        a = (int) firstBtn.getTag();
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        b = (int) secondBtn.getTag();
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Drawable getFirstPic() {
        getFirstBtn();
        firstPic = firstBtn.getDrawable();
        return firstPic;
    }

    public Drawable getSecondPic() {
        getSecondBtn();
        secondPic = secondBtn.getDrawable();
        return secondPic;
    }

    public ImageButton getFirstBtn() {
        return firstBtn;
    }

    public ImageButton getSecondBtn() {
        return secondBtn;
    }
}

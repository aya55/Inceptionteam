package com.inceptionteam.Android;

public class ExampleItems {
    private int mImageRrsource;
    private String mText1;
    private String mText2;

    public ExampleItems(int imageRrsource, String text1, String text2) {
        mImageRrsource = imageRrsource;
        mText1 = text1;
        mText2 = text2;
    }
    public int getImageRrsource(){

        return mImageRrsource;
    }
    public  String getText1(){
        return mText1;
    }
    public  String getText2(){
        return mText2;
    }

}

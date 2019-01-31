package uz.scorpion.newproyekt;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {
    Context mcontext;
    public ImageAdapter(Context context){
        this.mcontext=context;
    }

    @Override
    public int getCount() {
        return suratrlarotkazish.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==((ImageView) object);
    }
    private int[] suratrlarotkazish=new int[]{
            R.mipmap.doc,R.mipmap.doctor,R.mipmap.sar, R.mipmap.sart, R.mipmap.sartar, R.mipmap.tax, R.mipmap.taxi, R.mipmap.shif,
            R.mipmap.taxii,R.mipmap.doc, R.mipmap.doctor,R.mipmap.sar,R.mipmap.sart, R.mipmap.sartar, R.mipmap.tax,R.mipmap.taxi,
            R.mipmap.shif,R.mipmap.taxii,R.mipmap.doc,
            R.mipmap.doctor, R.mipmap.sar, R.mipmap.sart, R.mipmap.sartar, R.mipmap.tax, R.mipmap.taxi, R.mipmap.shif,R.mipmap.taxii};
    @Override
    public  Object instantiateItem(ViewGroup container,int position){

        ImageView imageView =new ImageView(mcontext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(suratrlarotkazish[position]);
        ((ViewPager)container).addView(imageView,0);
        return imageView;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        ((ViewPager)container).removeView(((ImageView)object));
    }
}

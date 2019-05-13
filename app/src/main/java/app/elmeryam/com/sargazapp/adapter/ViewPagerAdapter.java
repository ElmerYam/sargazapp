package app.elmeryam.com.sargazapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import app.elmeryam.com.sargazapp.R;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.slider,R.drawable.slider1,R.drawable.slider3};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( position == 0 ){
                    Toast.makeText(context,"slide1 on clik",Toast.LENGTH_LONG).show();
                }else if(position == 1){
                    Toast.makeText(context,"slide2 on clik",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(context,"slide3 on clik",Toast.LENGTH_LONG).show();
                }
            }
        });
        ViewPager vp = (ViewPager) container;
        vp.addView(view,0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        ViewPager view = ( ViewPager) object;
        vp.removeView(view);
    }
}

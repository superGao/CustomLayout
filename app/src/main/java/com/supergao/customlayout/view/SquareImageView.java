package com.supergao.customlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;

/**
 * 需要把它写成正方形的 ImageView
 */
public class SquareImageView extends androidx.appcompat.widget.AppCompatImageView{
    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 重写 onMeasure()，调整尺寸，让 ImageView 总是正方形
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        // 先用 getMeasuredWidth() 和 getMeasuredHeight() 取到 super.onMeasure() 的计算结果

        // 然后通过计算，让宽度和高度一致

        // 再用 setMeasuredDimension(width, height) 来保存最终的宽度和高度
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            measuredWidth = measuredHeight;
        } else {
            measuredHeight = measuredWidth;
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}

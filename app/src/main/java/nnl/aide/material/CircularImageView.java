package nnl.aide.material;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircularImageView extends ImageView {
	
//	private Drawable image;
	private final String android_schemas = "http://schemas.android.com/apk/res/android";
	
	public CircularImageView(Context context) {
		super(context);
		init(null, 0);
	}


	public CircularImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(attrs, 0);
	}


	public CircularImageView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		float radius = this.getHeight()/2;
		Path path = new Path();
		RectF rect = new RectF(0, 0, this.getWidth(), this.getHeight());
		path.addRoundRect(rect, radius, radius, Path.Direction.CW);
		canvas.clipPath(path);
		super.onDraw(canvas);
	}


	private void init(AttributeSet attrs, int defStyle) {
//		int srcId = attrs.getAttributeResourceValue(android_schemas, "src", -1);
//		if(srcId!=-1){
//			this.setImageResource(srcId);
//		}
//	
//		TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.CircularImageView, 0, 0);
//		try {
//			image = a.getDrawable(R.styleable.CircularImageView_src);
//		}
//		finally {
//			a.recycle();
//		}
//		this.setImageDrawable(image);
	}

}


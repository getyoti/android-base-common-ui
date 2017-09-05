package com.yoti.mobile.android.commons.ui.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.yoti.mobile.android.commons.ui.R;

/**
 * Base class for all Yoti buttons. Use the appropriate Yoti style so that the button follows
 * Yoti UI guidelines.
 */
public class YotiButton extends AppCompatButton {

    public YotiButton(Context context) {
        this(context, null, 0);
    }

    public YotiButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public YotiButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(new ContextThemeWrapper(context, R.style.Yoti_Widget_Button), attrs, defStyleAttr);
    }
}

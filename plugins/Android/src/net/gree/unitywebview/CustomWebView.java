package net.gree.unitywebview;

import android.content.Context;
import android.webkit.WebView;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class CustomWebView extends WebView
{
    public CustomWebView(Context context)
    {
        super(context);
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo outAttrs)
    {
        return new CustomInputConnection(this, false);
    }
}

package net.gree.unitywebview;

import android.view.View;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.BaseInputConnection;

public class CustomInputConnection extends BaseInputConnection
{
    private CustomWebView mWebView;

    public CustomInputConnection(CustomWebView webView, boolean mutable)
    {
        super(webView, mutable);
        mWebView = webView;
    }

    @Override
    public boolean sendKeyEvent(KeyEvent event)
    {
        switch (event.getAction())
        {
            case KeyEvent.ACTION_DOWN:
                mWebView.onKeyDown(event.getKeyCode(), event);
                break;
            case KeyEvent.ACTION_UP:
                mWebView.onKeyUp(event.getKeyCode(), event);
                break;
        }
        return super.sendKeyEvent(event);
    }
}

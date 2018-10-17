/**
 * NativeAdChoicesView.java
 * suraj.tiwari.reactnativefbads
 *
 * Created by Suraj Tiwari on 07/08/18.
 * Copyright © 2018 Suraj Tiwari All rights reserved.
 */
package suraj.tiwari.reactnativefbads;

import com.facebook.ads.NativeAd;
import com.facebook.ads.AdChoicesView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import android.util.Log;


public class NativeAdChoicesView extends ReactViewGroup {

  private static final String TAG = "NativeAdChoicesView";

  private ReactContext mContext;
   public NativeAdChoicesView(ThemedReactContext context) {
    super(context);
    Log.v(TAG, "NativeAdChoicesView xxx");
    mContext = context;
  }

  public void setNativeAd(NativeAd nativeAd) {
    Log.v(TAG, "setNativeAd xxx");
    AdChoicesView adChoicesView = new AdChoicesView(mContext, nativeAd, true);
    adChoicesView.measure(65, 65);
    adChoicesView.layout(0, 0, 65, 65);
    adChoicesView.bringToFront();
    addView(adChoicesView);
  }
}
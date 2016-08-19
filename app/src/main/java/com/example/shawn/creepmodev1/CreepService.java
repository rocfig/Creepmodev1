package com.example.shawn.creepmodev1;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import static android.view.accessibility.AccessibilityEvent.*;

/**
 * Created by rostopira on 19.08.16.
 */
public class CreepService extends AccessibilityService {

    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Log.wtf("service info", this.getServiceInfo().toString());
        //if (accessibilityEvent.getEventType()==TYPE_VIEW_CLICKED)
            Log.wtf("creep", accessibilityEvent.toString());
        /*
        switch (accessibilityEvent.getEventType()) {
            case TYPE_VIEW_CLICKED:
                Log.w("Clicked", "");
                break;
        }
        */
    }

    @Override
    public void onInterrupt() {
        Log.wtf("Fuck", "");
    }
}

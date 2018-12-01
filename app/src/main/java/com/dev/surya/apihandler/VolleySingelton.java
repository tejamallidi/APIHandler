package com.dev.surya.apihandler;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingelton {

    private static VolleySingelton mInstance;
    private RequestQueue mRequestQueue;

    public VolleySingelton(Context context) {
        mRequestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized VolleySingelton getmInstance(Context context){
        if(mInstance == null) {
            mInstance = new VolleySingelton(context);
        }
        return mInstance;
    }

    public RequestQueue getmRequestQueue(){
        return mRequestQueue;
    }

}

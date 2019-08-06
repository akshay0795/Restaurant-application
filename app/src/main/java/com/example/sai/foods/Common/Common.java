package com.example.sai.foods.Common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

import com.example.sai.foods.Model.Request;
import com.example.sai.foods.Model.User;

/**
 * Created by sai on 10/02/2018.
 */

public class Common {
    public static User currentUser;
    public static Request currentRequest;

    public static String convertCodeToStatus(String code) {
        if (code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "Work on Your Order";
        else
            return "Ready";
    }

    public static final String DELETE = "Delete";
    public static boolean isCoonnectedToInternet(Context context)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null)
        {
            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
            if (info != null)
            {
                for (int i=0;i<info.length;i++)
                {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED)
                        return true;
                }
            }
        }
        return false;
    }
}

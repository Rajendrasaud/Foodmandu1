package com.raziv.foodmandu.permission;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.core.app.ActivityCompat;

public class LinkPermisson {

    private Context mContext;
    public LinkPermisson(Context mContext){
        this.mContext=mContext;
    }

    public boolean checkPermissionForReadExtertalStorage() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int result = mContext.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE);
            return result == PackageManager.PERMISSION_GRANTED;
        }
        else {
            try {
                requestPermissionForReadExtertalStorage();
                return  true;

            } catch (Exception e) {
                e.printStackTrace();
                return  false;
            }
        }

    }
    public void requestPermissionForReadExtertalStorage() throws Exception {
        try {
            ActivityCompat.requestPermissions((Activity) mContext, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    0);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}

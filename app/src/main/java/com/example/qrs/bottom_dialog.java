
/*package com.example.qrs;
import android.content.Intent;
import android.net.Uri;


import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.qrs.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class bottom_dialog extends BottomSheetDialogFragment {

    private TextView title, link, btn_visit;
    private ImageView close;
    private String fetchurl;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState) {
        View view = inflater.inflate(R.layout.button_dialg, container, false);

        title = view.findViewById(R.id.txt_title);
        link = view.findViewById(R.id.txt_link);
        btn_visit = view.findViewById(R.id.visit);
        close = view.findViewById(R.id.close);

        title.setText(fetchurl);

        btn_visit.setOnClickListener(v -> {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(fetchurl));
            startActivity(intent);
        });

        close.setOnClickListener(v -> dismiss());

        return view;
    }

    public void fetchurl(String url) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executorService.execute(() -> fetchurl = url);
    }

    public void fetchWifiDetails(String ssid, String password, int type) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executorService.execute(() -> fetchurl = "SSID: " + ssid + "\nPassword: " + password + "\nType: " + getEncryptionType(type));
    }

    private String getEncryptionType(int type) {
        switch (type) {
            case Barcode.Wifi.TYPE_WEP:
                return "WEP";
            case Barcode.Wifi.TYPE_WPA:
                return "WPA";
            case Barcode.Wifi.TYPE_OPEN:
                return "Open";
            default:
                return "Unknown";
        }
    }
}*/
package com.example.qrs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
//import com.google.mlkit.vision.barcode.Barcode;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

//import com.example.qrs.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.mlkit.vision.barcode.common.Barcode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*public class bottom_dialog extends BottomSheetDialogFragment {

    private TextView title, link, btn_visit;
    private ImageView close;
    private String fetchurl;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState) {
        View view = inflater.inflate(R.layout.button_dialg, container, false);

        title = view.findViewById(R.id.txt_title);
        link = view.findViewById(R.id.txt_link);
        btn_visit = view.findViewById(R.id.visit);
        close = view.findViewById(R.id.close);

        title.setText(fetchurl);

        btn_visit.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(fetchurl));
            startActivity(intent);
        });

        close.setOnClickListener(v -> dismiss());

        return view;
    }

    public void fetchurl(String url) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executorService.execute(() -> fetchurl = url);
    }

    public void fetchWifiDetails(String ssid, String password, int type) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executorService.execute(() -> fetchurl = "SSID: " + ssid + "\nPassword: " + password + "\nType: " + getEncryptionType(type));
    }

    private String getEncryptionType(int type) {
        switch (type) {
            case Barcode.WIFI_ENCRYPTION_TYPE_WEP:
                return "WEP";
            case Barcode.WIFI_ENCRYPTION_TYPE_WPA:
                return "WPA";
            case Barcode.WIFI_ENCRYPTION_TYPE_OPEN:
                return "Open";
            default:
                return "Unknown";
        }
    }
}*/
public class bottom_dialog extends BottomSheetDialogFragment {

    private static final int WEP = 1;
    private static final int WPA = 2;
    private static final int OPEN = 3;

    private TextView title, link, btn_visit;
    private ImageView close;
    private String fetchurl;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState) {
        View view = inflater.inflate(R.layout.button_dialg, container, false);

        title = view.findViewById(R.id.txt_title);
        link = view.findViewById(R.id.txt_link);
        btn_visit = view.findViewById(R.id.visit);
        close = view.findViewById(R.id.close);

        title.setText(fetchurl);

        btn_visit.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(fetchurl));
            startActivity(intent);
        });

        close.setOnClickListener(v -> dismiss());

        return view;
    }

    public void fetchurl(String url) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executorService.execute(() -> fetchurl = url);
    }

    public void fetchWifiDetails(String ssid, String password, int type) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executorService.execute(() -> fetchurl = "SSID: " + ssid + "\nPassword: " + password + "\nType: " + getEncryptionType(type));
    }

    private String getEncryptionType(int type) {
        switch (type) {
            case WEP:
                return "WEP";
            case WPA:
                return "WPA";
            case OPEN:
                return "Open";
            default:
                return "Unknown";
        }
    }
}



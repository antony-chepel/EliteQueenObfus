package com.firsttouchga.eltqblack;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.firsttouchga.R;
import com.orhanobut.hawk.Hawk;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RepElQueen extends AppCompatActivity {
    private static final String BASDKASDLSADOSADO = "3d9uFAuNvanWFsuDZqaniH";
    public static final String KSAIDJASDASDJS = "cstR1";


    String atsafdfsadhjasdjjasd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replace);
        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(() -> {
            String kasdkkasdkasdsad = Hawk.get(KSAIDJASDASDJS);
            if (kasdkkasdkasdsad != null) {
                Log.d("TestInUIHawk", kasdkkasdkasdsad);
                yasuasdiasdjasdjajds();
                executorService.shutdown();
                finish();
            } else {
                Log.d("TestInUIHawk", "Received null");
            }
        }, 0, 2, TimeUnit.SECONDS);


        askdoasdasdajsdjasdjasd();

        SharedPreferences quwqjdjjdjasjdjjad = getSharedPreferences("ActivityPREF", Context.MODE_PRIVATE);
        if (quwqjdjjdjasjdjjad.getBoolean("activity_exec", false)) {
            Intent intent = new Intent(this, FilterElQueen.class);
            startActivity(intent);
            finish();
        } else {
            SharedPreferences.Editor alsdoasksdajasdj = quwqjdjjdjasjdjjad.edit();
            alsdoasksdajasdj.putBoolean("activity_exec", true);
            alsdoasksdajasdj.apply();
        }
    }

    public void yasuasdiasdjasdjajds() {

        Intent intent = new Intent(RepElQueen.this, FilterElQueen.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }

    public void askdoasdasdajsdjasdjasd() {
        AppsFlyerConversionListener conversionListener = new AppsFlyerConversionListener() {

            @Override
            public void onConversionDataSuccess(Map<String, Object> conversionData) {


                Log.d("TESTING_ZONE", "af stat is " + conversionData.get("af_status"));
                String jasdasdiasdi = (String) conversionData.get("af_status");
                if (Objects.equals(jasdasdiasdi, "Organic")) {
                    atsafdfsadhjasdjjasd = "null";
                } else {
                    atsafdfsadhjasdjjasd = (String) conversionData.get("campaign");
                }
                Hawk.put(KSAIDJASDASDJS, atsafdfsadhjasdjjasd);
                Log.d("NAMING TEST", "campaign attributed: " + atsafdfsadhjasdjjasd);
            }


            @Override
            public void onConversionDataFail(String errorMessage) {
                atsafdfsadhjasdjjasd = "null";
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> attributionData) {
            }

            @Override
            public void onAttributionFailure(String errorMessage) {
            }

        };

        AppsFlyerLib.getInstance().init(BASDKASDLSADOSADO, conversionListener, this);
        AppsFlyerLib.getInstance().start(this);
        AppsFlyerLib.getInstance().setDebugLog(true);

    }

}

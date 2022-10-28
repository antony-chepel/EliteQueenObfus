package com.firsttouchga.eltqblack;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.AsyncTask;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;
import com.orhanobut.hawk.Hawk;

public class AppClassElQueen  extends Application {
    private static final String TSATDHJASDJASDJASJD = "fb9a4532-856d-4e48-9bb1-cc2685bcd8fa";
    public static final String LOSDJKASJDJASJAS = "funcId";
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        OneSignal.initWithContext(this);
        OneSignal.setAppId(TSATDHJASDJASDJASJD);
        Hawk.init(this).build();
        nsdakdsaodosal.execute();

    }

    @SuppressLint("StaticFieldLeak")
    AsyncTask<Void, Void, String> nsdakdsaodosal = new AsyncTask<Void, Void, String>() {
        @Override
        protected String doInBackground(Void... params) {
            AdvertisingIdClient.Info tysadyuasdjjasdj = null;
            try {
                tysadyuasdjjasdj = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext());
            } catch (Exception e) {
                e.printStackTrace();
            }
            String bsadjkasdkasdlasod = null;
            try {
                bsadjkasdkasdlasod = tysadyuasdjjasdj.getId();
                Hawk.put(LOSDJKASJDJASJAS, bsadjkasdkasdlasod);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return bsadjkasdkasdlasod;
        }

        @Override
        protected void onPostExecute(String advertId) {
        }
    };
}

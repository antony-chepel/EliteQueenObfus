package com.firsttouchga.eltqblack;

import static com.firsttouchga.eltqblack.MainActivity.KIDODOFODFO;
import static com.firsttouchga.eltqblack.RepElQueen.KSAIDJASDASDJS;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.firsttouchga.R;
import com.firsttouchga.eltqwhite.MainEliteScreen;
import com.orhanobut.hawk.Hawk;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FilterElQueen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        new saodiasdoasodoas().execute();
    }


    public class saodiasdoasodoas extends AsyncTask<Void, Void, Void> {

        String nasdjajsdsdka = Hawk.get(KSAIDJASDASDJS);
        String sodaladslasdl = Hawk.get(KIDODOFODFO);
        String tasdyuusdahjdasj;
        String bsahdajkdkasdkasdk = "http://elitequeen.xyz/go.php?to=1&";
        String tsadyjajjasdjas = "sub_id_1=";
        String sladosakdkasdk = bsahdajkdkasdkasdk + tsadyjajjasdjas + nasdjajsdsdka;
        String oasdpsadoasod = bsahdajkdkasdkasdk + tsadyjajjasdjas + sodaladslasdl;

        @Override
        protected Void doInBackground(Void... voids) {
            try {

                Document sadlasodoasdo;
                if (!nasdjajsdsdka.equals("null")){ //сменил логический ноль на стринг
                    sadlasodoasdo = Jsoup.connect(sladosakdkasdk).get();
                } else {
                    sadlasodoasdo = Jsoup.connect(oasdpsadoasod).get();
                }
                tasdyuusdahjdasj = sadlasodoasdo.text();

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            Intent saodldsksdakk = new Intent(getApplicationContext(), MainEliteScreen.class);

            Intent ysadhssdajjsda = new Intent(getApplicationContext(), RealElQueen.class);
            if (tasdyuusdahjdasj.equals("admin")) {
                startActivity(saodldsksdakk);
            } else {
                startActivity(ysadhssdajjsda);
            }
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }

    }
}

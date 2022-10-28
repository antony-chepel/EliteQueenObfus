package com.firsttouchga.eltqblack;

import static com.firsttouchga.eltqblack.AppClassElQueen.LOSDJKASJDJASJAS;
import static com.firsttouchga.eltqblack.MainActivity.KIDODOFODFO;
import static com.firsttouchga.eltqblack.RepElQueen.KSAIDJASDASDJS;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.appsflyer.AppsFlyerLib;
import com.firsttouchga.R;
import com.orhanobut.hawk.Hawk;

import java.io.File;
import java.io.IOException;

public class RealElQueen  extends AppCompatActivity {
    private ValueCallback<Uri[]> jasdosdakasdsdal;
    private String tsadusdjaasjdsd;
    WebView yshadjdsajksdaksd;
    private Uri sjdakisdaiasdo = null;
    private ValueCallback<Uri> rqwyequjjdjajsd;
    private static final String ISIADKKSDKSDA = RealElQueen.class.getSimpleName();
    private static final int LSADOSDKADSJASDJ = 1;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);
        yshadjdsajksdaksd = findViewById(R.id.realView);

        WebSettings rsadhasdjjdasjjdsa = yshadjdsajksdaksd.getSettings();

        rsadhasdjjdasjjdsa.setJavaScriptEnabled(true);


        rsadhasdjjdasjjdsa.setPluginState(WebSettings.PluginState.ON);
        rsadhasdjjdasjjdsa.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        rsadhasdjjdasjjdsa.setAppCacheEnabled(true);


        rsadhasdjjdasjjdsa.setUseWideViewPort(true);
        rsadhasdjjdasjjdsa.setUserAgentString(rsadhasdjjdasjjdsa.getUserAgentString().replace("; wv", ""));

        rsadhasdjjdasjjdsa.setLoadWithOverviewMode(true);
        rsadhasdjjdasjjdsa.setAllowFileAccess(true);
        rsadhasdjjdasjjdsa.setDomStorageEnabled(true);

        rsadhasdjjdasjjdsa.setJavaScriptCanOpenWindowsAutomatically(true);
        rsadhasdjjdasjjdsa.setSupportMultipleWindows(false);

        rsadhasdjjdasjjdsa.setDisplayZoomControls(false);
        rsadhasdjjdasjjdsa.setBuiltInZoomControls(true);
        rsadhasdjjdasjjdsa.setSupportZoom(true);


        rsadhasdjjdasjjdsa.setAllowContentAccess(true);

        CookieManager asdopdsakdaskkdas = CookieManager.getInstance();
        asdopdsakdaskkdas.setAcceptCookie(true);
        asdopdsakdaskkdas.setAcceptThirdPartyCookies(yshadjdsajksdaksd,true);


        final Activity activity = this;
        yshadjdsajksdaksd.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return false;
            }


            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);


                if(yshadjdsajksdaksd.getProgress() == 100) {
                    yshadjdsajksdaksd.setVisibility(View.VISIBLE);
                    tasdudjajdjasjdajds(url);
                }
            }

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });


        yshadjdsajksdaksd.loadUrl(gasdhdjajadsjaksdkasd());

        String tasduasdjjasdj = Manifest.permission.CAMERA;
        int hdudsiifi = ContextCompat.checkSelfPermission(this, tasduasdjjasdj);
        if (hdudsiifi != PackageManager.PERMISSION_GRANTED) {
            String[] nksadksoadodao = new String[1];
            nksadksoadodao[0] = tasduasdjjasdj;
            ActivityCompat.requestPermissions(this, nksadksoadodao, 1);
        }

        yshadjdsajksdaksd.setWebChromeClient(new WebChromeClient() {


            public boolean onShowFileChooser(
                    WebView webView, ValueCallback<Uri[]> filePathCallback,
                    WebChromeClient.FileChooserParams fileChooserParams) {
                if (jasdosdakasdsdal != null) {
                    jasdosdakasdsdal.onReceiveValue(null);
                }
                jasdosdakasdsdal = filePathCallback;

                Intent gasyduasdjasdkkasdkadsk = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (gasyduasdjasdkkasdkadsk.resolveActivity(getPackageManager()) != null) {

                    File skadasdoasod = null;
                    try {
                        skadasdoasod = aspdoasdklkasdklasdkjk();
                        gasyduasdjasdkkasdkadsk.putExtra("PhotoPath", tsadusdjaasjdsd);
                    } catch (IOException ex) {

                        Log.e(ISIADKKSDKSDA, "Unable to create Image File", ex);
                    }
                    if (skadasdoasod != null) {
                        tsadusdjaasjdsd = "file:" + skadasdoasod.getAbsolutePath();
                        gasyduasdjasdkkasdkadsk.putExtra(MediaStore.EXTRA_OUTPUT,
                                Uri.fromFile(skadasdoasod));
                    } else {
                        gasyduasdjasdkkasdkadsk = null;
                    }
                }

                Intent isuaidaskdkasdk = new Intent(Intent.ACTION_GET_CONTENT);
                isuaidaskdkasdk.addCategory(Intent.CATEGORY_OPENABLE);
                isuaidaskdkasdk.setType("image/*");

                Intent[] asldoasdkaskdska;
                if (gasyduasdjasdkkasdkadsk != null) {
                    asldoasdkaskdska = new Intent[]{gasyduasdjasdkkasdkadsk};
                } else {
                    asldoasdkaskdska = new Intent[0];
                }

                Intent ewqtdwdhjsajdas = new Intent(Intent.ACTION_CHOOSER);
                ewqtdwdhjsajdas.putExtra(Intent.EXTRA_INTENT, isuaidaskdkasdk);
                ewqtdwdhjsajdas.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser));
                ewqtdwdhjsajdas.putExtra(Intent.EXTRA_INITIAL_INTENTS, asldoasdkaskdska);

                startActivityForResult(ewqtdwdhjsajdas, LSADOSDKADSJASDJ);

                return true;
            }

            private File aspdoasdklkasdklasdkjk() throws IOException {

                File osdaidpasdaksdjasjdjasd = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "DirectoryNameHere");

                if (!osdaidpasdaksdjasjdjasd.exists()) {
                    osdaidpasdaksdjasjdjasd.mkdirs();
                }

                osdaidpasdaksdjasjdjasd = new File(osdaidpasdaksdjasjdjasd + File.separator + "IMG_" + String.valueOf(System.currentTimeMillis()) + ".jpg");
                return osdaidpasdaksdjasjdjasd;
            }

            public void ksaodaskldlasdllas(ValueCallback<Uri> uploadMsg, String acceptType) {
                rqwyequjjdjajsd = uploadMsg;

                try {
                    File rsadysaudjjkdasjk = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "DirectoryNameHere");

                    if (!rsadysaudjjkdasjk.exists()) {
                        rsadysaudjjkdasjk.mkdirs();
                    }

                    File oasdpasdkasdjasdj = new File(rsadysaudjjkdasjk + File.separator + "IMG_" + String.valueOf(System.currentTimeMillis()) + ".jpg");

                    sjdakisdaiasdo = Uri.fromFile(oasdpasdkasdjasdj); // save to the private variable

                    final Intent rasdtysadyuasdjasd = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                    rasdtysadyuasdjasd.putExtra(MediaStore.EXTRA_OUTPUT, sjdakisdaiasdo);

                    Intent saodpasdkasdk = new Intent(Intent.ACTION_GET_CONTENT);
                    saodpasdkasdk.addCategory(Intent.CATEGORY_OPENABLE);
                    saodpasdkasdk.setType("image/*");

                    Intent qtwdyjdjsajdjasdjk = Intent.createChooser(saodpasdkasdk, getString(R.string.image_chooser));
                    qtwdyjdjsajdjasdjk.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Parcelable[]{rasdtysadyuasdjasd});

                    startActivityForResult(qtwdyjdjsajdjasdjk, LSADOSDKADSJASDJ);
                } catch (Exception e) {
                    Toast.makeText(getBaseContext(), "Camera Exception:" + e, Toast.LENGTH_LONG).show();
                }

            }

        });

    }



    public String gasdhdjajadsjaksdkasd(){

        String ksdaodsaldkasdk, tsdaydaskdasjd, oasdpdasodksakd, gtsadhhjdasjdjkas, bashdjasdjasd, ksdoasodlasdldsa;

        String  skadasodosoad, rsatyydahdasjasd, qujdaskdask, ndkasdasodo;

        SharedPreferences oasdoasdo = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE);

        ndkasdasodo = "com.firsttouchga";
        skadasodosoad = Hawk.get(KSAIDJASDASDJS);
        qujdaskdask = Hawk.get(KIDODOFODFO);
        rsatyydahdasjasd = Hawk.get(LOSDJKASJDJASJAS);
        String afId = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        AppsFlyerLib.getInstance().setCollectAndroidID(true);
        String androidVersion = Build.VERSION.RELEASE;


        ksdaodsaldkasdk = "sub_id_1=";
        tsdaydaskdasjd = "deviceID=";
        oasdpdasodksakd = "ad_id=";
        gtsadhhjdasjdjkas = "sub_id_4=";
        bashdjasdjasd = "sub_id_5=";
        ksdoasodlasdldsa = "sub_id_6=";


        String first1 = "http://";
        String second2 = "elitequeen.xyz/go.php?to=2&";
        String whole = first1 + second2;

        String hasjdsajdnas;

        if (!skadasodosoad.equals("null")){
            hasjdsajdnas = whole+ksdaodsaldkasdk+skadasodosoad+"&"+tsdaydaskdasjd+afId+"&"+oasdpdasodksakd+rsatyydahdasjasd+"&"+gtsadhhjdasjdjkas+ndkasdasodo+"&"+bashdjasdjasd+androidVersion+"&"+ksdoasodlasdldsa+"naming";
        }

        else{
            hasjdsajdnas = whole+ksdaodsaldkasdk+qujdaskdask+"&"+tsdaydaskdasjd+afId+"&"+oasdpdasodksakd+rsatyydahdasjasd+"&"+gtsadhhjdasjdjkas+ndkasdasodo+"&"+bashdjasdjasd+androidVersion+"&"+ksdoasodlasdldsa+"deeporg";
        }


        Log.d("TESTAG", "Test Result " + hasjdsajdnas);


        return oasdoasdo.getString("SAVED_URL", hasjdsajdnas);
    }

    public void tasdudjajdjasjdajds(String url) {
        SharedPreferences kdasldsaodoasd = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE);
        SharedPreferences.Editor tsaadjsjasd = kdasldsaodoasd.edit();
        tsaadjsjasd.putString("SAVED_URL", url);
        tsaadjsjasd.apply();
    }



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {



        if (requestCode != LSADOSDKADSJASDJ || jasdosdakasdsdal == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }

        Uri[] ladspasdoasdkkds = null;

        if (resultCode == Activity.RESULT_OK) {
            if (data == null || data.getData() == null) {
                if (tsadusdjaasjdsd != null) {
                    ladspasdoasdkkds = new Uri[]{Uri.parse(tsadusdjaasjdsd)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    ladspasdoasdkkds = new Uri[]{Uri.parse(dataString)};
                }
            }
        }

        jasdosdakasdsdal.onReceiveValue(ladspasdoasdkkds);
        jasdosdakasdsdal = null;

    }

    @Override
    public void onBackPressed() {
        if (yshadjdsajksdaksd.canGoBack()) {
            yshadjdsajksdaksd.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

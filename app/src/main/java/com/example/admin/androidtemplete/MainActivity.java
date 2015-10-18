package com.example.admin.androidtemplete;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.apkfuns.logutils.LogUtils;
import com.github.pedrovgs.lynx.LynxActivity;
import com.github.pedrovgs.lynx.LynxConfig;

import org.androidannotations.annotations.EActivity;

import hugo.weaving.DebugLog;

@EActivity
public class MainActivity extends AppCompatActivity{

    /**
     * https://github.com/pengwei1024/LogUtils
     * LogUtils.d("12345");
     */
    private String TAG = getClass().getSimpleName().substring(0,getClass().getSimpleName().length()-1);
    private boolean LOGOUT = true;


    @DebugLog
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initLog();


        setContentView(R.layout.activity_main);
    }

    @DebugLog
    @Override
    protected void onPause() {
        super.onPause();
    }

    @DebugLog
    @Override
    protected void onResume() {
        super.onResume();
    }

    @DebugLog
    @Override
    protected void onStart() {
        super.onStart();
    }

    @DebugLog
    @Override
    protected void onStop() {
        super.onStop();
    }

    @DebugLog
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @DebugLog
    private void initLog() {
        LogUtils.configTagPrefix = TAG;
        LogUtils.configAllowLog = LOGOUT;
    }

    /*
    https://github.com/pedrovgs/Lynx
     */
    @DebugLog
    private void openLynxActivity() {
        LynxConfig lynxConfig = new LynxConfig();
        lynxConfig.setMaxNumberOfTracesToShow(4000);

        Intent lynxActivityIntent = LynxActivity.getIntent(this, lynxConfig);
        startActivity(lynxActivityIntent);
    }
}


package com.example.zwq.dianshang;

import android.app.Application;

import com.example.zwq.latt.ec.icon.FontEcModule;
import com.example.zwq.latte_core.app.Latte;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

public class ExampleApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.0/")
                .configure();

    }
}

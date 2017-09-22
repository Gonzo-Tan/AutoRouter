package com.dinglc.autorouter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Locale;

import router.AutoExtra;
import router.Router;
import router.RouterService;
import router.AutoRouter;
import router.RouterType;

@AutoRouter(value = {"a", "b", "d", "f", "r", "w", "v"},
        type = {RouterType.INT, RouterType.SHORT, RouterType.SHORT, RouterType.BOOLEAN, RouterType.BOOLEAN, RouterType.CHAR, 
                RouterType.BYTE})
public class CActivity extends AppCompatActivity {

    @AutoExtra int a;
    @AutoExtra("b") short b;
    @AutoExtra("d") short d;
    @AutoExtra("f") boolean f;
    @AutoExtra("v") byte v;
    @AutoExtra("w") char w;
    @AutoExtra("r") boolean r;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("this ia C activity");
        setContentView(textView);
        Router.init(this).create(RouterService.class);
        String format = "a =%d\nb =%d\nd =%d\nf =%s\nv =%d\nw =%c\nr =%s";
        String format1 = String.format(Locale.CHINA, format, a, b, d, f, v, w, r);
        textView.setText(format1);
    }
}

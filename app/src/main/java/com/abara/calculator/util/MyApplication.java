/*
 * Copyright (C) 2016 Abarajithan Lv
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.abara.calculator.util;

import android.app.Application;
import android.content.Context;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by abara on 9/20/2015.
 */
public class MyApplication extends Application {

    private static MyApplication myApplication;

    public static MyApplication getInstance() {
        return myApplication;
    }

    public static Context getAppContext() {
        return myApplication.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}

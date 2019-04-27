
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

import android.net.wifi.WifiManager;
import android.content.Context;
import android.net.wifi.WifiInfo;

public class T12CapstoneNativeCodeModule extends ReactContextBaseJavaModule {

	WifiManager wifi;

	public T12CapstoneNativeCodeModule(ReactApplicationContext reactContext) {
		super(reactContext);
		wifi = (WifiManager) reactContext.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
	}

	@Override
	public String getName() {
		return "T12CapstoneNativeCode";
	}

	@ReactMethod
	public void sayHey(Promise promise) {
		String result = "hey";
		promise.resolve(result);
	}

	@ReactMethod
	public void getSSID(Promise promise) {
		try {
			WifiInfo info = wifi.getConnectionInfo();
			promise.resolve(info.getSSID());
		} catch(Exception e) {
			promise.reject(e);
		}
	}

}

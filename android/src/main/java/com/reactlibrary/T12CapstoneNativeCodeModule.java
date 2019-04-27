
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class T12CapstoneNativeCodeModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public T12CapstoneNativeCodeModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "T12CapstoneNativeCode";
  }

	@ReactMethod
	public void returnSomeStuff(Promise promise) {
		String result = "Yeah";
		promise.resolve(result);
	}
}

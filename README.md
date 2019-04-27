# t12-capstone-native-code

This is the npm package that implements native code for mostly Android.

To install:
```
npm install git://github.com/tsieczko/t12-capstone-native-code.git#master --save
react-native link t12-capstone-native-code
```

To use in in react native: `import T12CapstoneNativeCode from 't12-capstone-native-code';`

Functions that currently exist:
```
sayHey(); // returns string that says 'hey'
getSSID(); // returns the ssid of android phone. app needs location permission
```

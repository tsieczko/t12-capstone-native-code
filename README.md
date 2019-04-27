
# react-native-t12-capstone-native-code

## Getting started

`$ npm install react-native-t12-capstone-native-code --save`

### Mostly automatic installation

`$ react-native link react-native-t12-capstone-native-code`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-t12-capstone-native-code` and add `RNT12CapstoneNativeCode.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNT12CapstoneNativeCode.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNT12CapstoneNativeCodePackage;` to the imports at the top of the file
  - Add `new RNT12CapstoneNativeCodePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-t12-capstone-native-code'
  	project(':react-native-t12-capstone-native-code').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-t12-capstone-native-code/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-t12-capstone-native-code')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNT12CapstoneNativeCode.sln` in `node_modules/react-native-t12-capstone-native-code/windows/RNT12CapstoneNativeCode.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using T12.Capstone.Native.Code.RNT12CapstoneNativeCode;` to the usings at the top of the file
  - Add `new RNT12CapstoneNativeCodePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNT12CapstoneNativeCode from 'react-native-t12-capstone-native-code';

// TODO: What to do with the module?
RNT12CapstoneNativeCode;
```
  
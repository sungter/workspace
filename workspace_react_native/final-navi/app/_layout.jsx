import { useFonts } from 'expo-font';
import { Stack } from 'expo-router';
import * as SplashScreen from 'expo-splash-screen';
import { useEffect } from 'react';
import { SafeAreaView, StatusBar } from 'react-native';
import 'react-native-reanimated';


// Prevent the splash screen from auto-hiding before asset loading is complete.
SplashScreen.preventAutoHideAsync();

export default function RootLayout() {
  const [loaded] = useFonts({
    SpaceMono: require('../assets/fonts/SpaceMono-Regular.ttf'),
  });

  useEffect(() => {
    if (loaded) {
      SplashScreen.hideAsync();
    }
  }, [loaded]);

  if (!loaded) {
    return null;
  }

  return (
    <>
      {/* 
        - 안드로이드 때문에 사용함 - (IOS는 기본 SafeAreaView만 적용해도 statusbar 침범 x)
        translucent : 기본값 true, 투명도 및 범위 설정
        true : 반투명 + statusbar 범위 침범
        false : 불투명 + statusbar 범위 침범 x
      */}
      <StatusBar 
        style="auto" 
        translucent={false} 
      /> 

      <Stack screenOptions={{headerShown : false}} />
    </>
  );
}

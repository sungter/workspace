
import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'
import Ionicons from '@expo/vector-icons/Ionicons';

// app/(tabs)/_layout.jsx
const TabLayout = () => {
  return (
    <Tabs screenOptions={{
      headerShown : false , 
      tabBarActiveTintColor: 'skyblue', 
      tabBarInactiveTintColor: 'gray',
      tabBarStyle : {backgroundColor : '#fff', height : 60}
    }}>
      <Tabs.Screen
        name='index' //탭 터치시 보여줄 파일명(같은 폴더 즉, 같은 위치에 있어야함)
        options={{
          title : 'Home',
          tabBarIcon : ({ color, focused }) => <Ionicons name="home" size={24} color={color} />,
        }}
      />

      <Tabs.Screen 
        name='myPage'
        options={{
          title : 'MyPage',
          tabBarIcon : ({ color, focused }) => <Ionicons name="albums" size={24} color={color} />,
        }}
      />

      <Tabs.Screen 
        name='settings'
        options={{
          title : 'Setting',
          tabBarIcon : ({ color, focused }) => <Ionicons name="settings-sharp" size={24} color={color} />,
        }}
      />
    </Tabs>
  )
}

export default TabLayout

const styles = StyleSheet.create({})
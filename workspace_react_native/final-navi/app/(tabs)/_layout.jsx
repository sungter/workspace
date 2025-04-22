
import { SafeAreaView, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'
import Ionicons from '@expo/vector-icons/Ionicons';
import Header from '@/components/Header';

const TabLayout = () => {
  return (
    <SafeAreaView style={styles.container}>
      <Header />
      <View style={styles.tabArea}>
        <Tabs screenOptions={{headerShown : false}}>
          <Tabs.Screen 
            name='(home)'
            options={{
              title : '홈',
              tabBarIcon : ({color}) => <Ionicons name="home" size={24} color={color} />
            }}
          />
    
          <Tabs.Screen 
            name='(profile)'
            options={{
              title : '프로필',
              tabBarIcon : ({color}) => <Ionicons name="file-tray-full" size={24} color={color} />
            }}
          />
    
          <Tabs.Screen 
            name='(search)'
            options={{
              title : '검색',
              tabBarIcon : ({color}) => <Ionicons name="search" size={24} color={color} />
            }}
          />
    
        </Tabs>
      </View>
    </SafeAreaView>
  )
}

export default TabLayout

const styles = StyleSheet.create({
  container : {
    flex : 1,
  },

  tabArea : {
    flex : 1
  }
})
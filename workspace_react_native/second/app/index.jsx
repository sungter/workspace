
import { StatusBar, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native'
import Login from '../components/Login'
import CartList from '../components/CartList'

const MainScreen = () => {
  return (
    <SafeAreaView style={styles.container}>
      <StatusBar 
        barStyle={'light-content'}
        backgroundColor={'#555555'} //ios는 미적용
      />

      {/* <Login /> */}
      <CartList />
    </SafeAreaView>
  )
}

export default MainScreen

const styles = StyleSheet.create({
  container : {
    backgroundColor : '#F9F7F7',
    flex : 1
  }
})
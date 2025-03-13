
import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native'
import Login from '../components/Login'

const MainScreen = () => {
  return (
    <SafeAreaView style={styles.container}>
      <Login />
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
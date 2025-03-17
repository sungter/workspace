import { Keyboard, SafeAreaView, StatusBar, StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React from 'react'
import ToDoList from '../components/ToDoList'

const MainScreen = () => {
  return (
    <TouchableWithoutFeedback onPress={Keyboard.dismiss}>
      <SafeAreaView style={styles.mainContainer}>
        <StatusBar 
          barStyle={'light-content'}
          backgroundColor={'#555555'} //ios는 미적용
        />
        <ToDoList />
      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}

export default MainScreen

const styles = StyleSheet.create({
  mainContainer : {
    flex : 1
  }
})
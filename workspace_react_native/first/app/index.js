
import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import Style1 from '../components/Style1'
import Style2 from '../components/Style2'

//View -> div
//Text -> p *모든 글자는 반드시 Text 컴포넌트 안에서 작업
//버튼과 같이 터치 이벤트가 필요한 컴포넌트는 <Pressable> 컴포넌트를 사용한다.

const MainScreen = () => {
  return (
    // <Style1 />

    <Style2 />

  )
}

export default MainScreen

const styles = StyleSheet.create({})
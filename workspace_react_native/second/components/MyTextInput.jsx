
import { StyleSheet, Text, TextInput, View } from 'react-native'
import React from 'react'
import { COLOR } from '../constants/colors'

const MyTextInput = ({placeholder='', onChangeText, isPw=false}) => {
  return (

    <TextInput 
      style={styles.myInput}
      placeholder={placeholder}
      placeholderTextColor={COLOR.BTN_BACKGROUND_ACTIVE2_COLOR}
      secureTextEntry={isPw}
      //secureTextEntry //type = 'password'
      returnKeyType='next' //휴대폰 자판 UI의 완료를 -> 다음으로 변경
      autoCapitalize='none' //자동 대문자 변환 비활성화
      spellCheck={false} //맞춤법 검사 비활성화
      autoCorrect={false} //맞춤법 자동 수정 비활성화
      onChangeText={(text) => {onChangeText(text)}}
    />
  )
}

export default MyTextInput

const styles = StyleSheet.create({
  myInput : {
    borderColor : COLOR.BTN_BACKGROUND_ACTIVE_COLOR,
    borderWidth : 1,
    margin : 12,
    height : 40,
    padding : 10,
    borderRadius : 4,
  }
})
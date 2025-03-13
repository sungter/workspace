
import { StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import MyTextInput from './MyTextInput'
import MyButton from './MyButton'
import { COLOR } from '../constants/colors'

const Login = () => {
  const printHello = () => {
    console.log('안녕하세요')
  }

  const [id, setId] = useState('')
  const [pw, setPw] = useState('')
  

  // 객체형태로 할 때, 변수와 변경함수
  // const [data, setData] = useState({
  //   id : '',
  //   pw : ''
  // });

  // const changeData = (text, name) => {
  //   setData({
  //     ...data,
  //     [name] : text
  //   })
  // };
  

  return (
    <View>
      <Text style={styles.mainText} >Login</Text>



      {/* 객체로 받아서 사용할 때, */}
      {/* <TextInput value={data.id} onChangeText={text => changeData(text, 'id')} />
      <TextInput value={data.pw} onChangeText={text => changeData(text, 'pw')} /> */}


      
      {/* <Text style={styles.loginList} >Id</Text> */}
      <MyTextInput placeholder={'아이디 입력'} onChangeText={setId} />
      
      {/* <Text style={styles.loginList} >PW</Text> */}
      <MyTextInput placeholder={'비밀번호 입력'} onChangeText={setPw} isPw={true} />
      
      {/* alert으로 안녕하세요 */}
      <MyButton onPress={() => {alert('안녕하세요')}} />

      {/* console으로 안녕하세요 */}
      <MyButton 
        //onPress={() => {console.log('안녕하세요')}}
        onPress={printHello} // 함수를 props로 넘길때, () 소괄호 생략하고 넘겨야함.
        size='large' 
      />

      <MyButton 
        title='데이터 확인' 
        onPress={() => {alert(`Id = ${id}, Pw = ${pw}`)}}
        //onPress={() => {console.log(`id = ${data.id}, pw = ${data.pw}`)}}    //객체로 데이터 변경했을때 출력
      />
    </View>
  )
}

export default Login

const styles = StyleSheet.create({
  mainText : {
    fontSize : 30,
    fontWeight : '700',
    marginHorizontal : 'auto',
    color : COLOR.BTN_BACKGROUND_ACTIVE_COLOR
  },

  loginList : {
    fontSize : 16,
    fontWeight : '700',
    marginLeft : 20,
    color : COLOR.BTN_BACKGROUND_ACTIVE_COLOR,
    borderBottomWidth : 1,
    width : 40,
    textAlign : 'center',
    borderColor : COLOR.BTN_BACKGROUND_ACTIVE_COLOR
  }
})

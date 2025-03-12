import { Pressable, SafeAreaView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'

const Style2 = () => {
  const [id, setId] = useState('');

  
  return (
      <SafeAreaView style={styles.container}>
        
        <View style={styles.v1_2} >
          <Text style={styles.v1} >아이디</Text>
    
          <TextInput placeholder='아이디 입력' 
            style={styles.v2} 
            onChangeText={(text) => {setId(text)}} 
            //onChange={(e) => {setId(e.nativeEvent.text)}}
          ></TextInput>
        </View>
        
        
        
        <View style={styles.v1_2} >
          <Text style={styles.v1} >비밀번호</Text>
        
          <TextInput placeholder='비밀번호 입력' style={styles.v2} ></TextInput>
        </View>
  
        
        
        <Pressable onPress={() => {alert(`${id}님 로그인`)}} style={styles.v3} >
          <Text>로그인</Text>
        </Pressable>
  
      </SafeAreaView>
  )
}

export default Style2

const styles = StyleSheet.create({
  
  container :{
    paddingTop : 20,
    paddingBottom : 20,
    width : '90%',
    marginHorizontal : 'auto',
    marginTop : 30,
    borderRadius : 10,
    gap : 20
  },

  v1_2 : {
    flexDirection : 'row',
    justifyContent : 'space-evenly',
  },

  v1 : {
    fontSize : 16,
    fontWeight : 'bold',
    margin: 12,
    flex : 2,
    textAlign : 'center',
  },

  v2 : {
    height: 40,
    margin: 12,
    borderWidth: 1,
    padding: 10,
    borderRadius : 10,
    flex : 6
  },


  v3 : {
    marginLeft : 20,
    backgroundColor : 'lightskyblue',
    width : 60,
    alignItems : 'center',
    borderRadius : 4,
    padding : 4,
  }
})
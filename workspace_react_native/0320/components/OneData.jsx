
import { Image, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import { icon } from '../constants/icons'
import MyTextInput from './MyTextInput';

const OneData = ({i, e, deleteList, setDoList, doList}) => {
  //수정중인 상태 확인 변수
  const [isShow, setIsShow] = useState(true);

  //수정시 input태그에 입력받은 값 저장할 변수
  const [newData, setNewData] = useState('');


  const addData = doList.filter((e) => {return e.id !== i})

  return (
    isShow ? 
    <View key={i} style={styles.oneList} >
                    
      <Text style={styles.listText}>{e.text}</Text>

      <Pressable onPress={(e) => {setIsShow(false)}}>
        <Image 
          source={icon.ICON_EDIT}
          style={styles.iconBtn}
        />
      </Pressable>
      
      <Pressable onPress={(e) => {deleteList(i)}} >
        <Image 
          source={icon.ICON_DELETE} 
          style={styles.iconBtn}
        />
      </Pressable>
      
    </View>
    :
    <View key={i} style={styles.oneList}>
      <MyTextInput 
        onBlur={e => setIsShow(true)} 
        value={newData}
        onChangeText = {text => setNewData(text)}

        onSubmitEditing={(e) => {
          

          setDoList({
            ...addData,

          })
          
        }}
      />
    </View>
  )
}

export default OneData

const styles = StyleSheet.create({
  oneList : {
    flexDirection : 'row',
    borderWidth : 1,
    borderRadius : 6,
    justifyContent : 'space-between',
    gap : 10,
    padding : 6,
    alignItems : 'center',
    backgroundColor : '#dddddd'
  },

  listText : {
    flex : 1,
    fontWeight : '700',
    fontSize : 16
  },
})
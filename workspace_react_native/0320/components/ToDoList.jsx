import { Button, Image, Pressable, StyleSheet, Text, TextInput, TouchableOpacity, View } from 'react-native'
import React, { useState } from 'react'
import MyTextInput from './MyTextInput'
import MyButton from './MyButton'
import { data } from '../data/data'
import { icon } from '../constants/icons'
import OneData from './OneData'

const ToDoList = () => {
  //toDoList 데이터 변수
  const [doList, setDoList] = useState(data);

  //입력받은 데이터 저장할 변수
  const [insertData, setInsertData] = useState('');


  //delete 아이콘 클릭시 실행될 함수
  const deleteList = (i) => {
    const filterData = doList.filter((e) => {return e.id !== doList[i].id});

    setDoList(filterData)
    console.log(filterData)
  };

  return (
    <View>
      <Text>TO DO LIST</Text>


      <View style={styles.insertContainer}>
        <MyTextInput 
          placeholder='+ Add a Task' 
          value={insertData}
          onChangeText = {text => setInsertData(text)}

          onSubmitEditing={(e) => {
            const max = Math.max(...(doList.map((e, i) => {return e.id})))

            const newInsertData = {
              id : max + 1,
              text : insertData
            }

            setDoList([
              ...doList,
              newInsertData
            ])

            setInsertData('')
          }}
        />
      </View>
      

      <View style={styles.allList}>
        {
          doList.map((e, i) => {
            return(
              
              <OneData i={i} e={e} deleteList={deleteList} setDoList={setDoList} doList={doList} />
              
            )
          })
        }

      </View>


    </View>
  )
}

export default ToDoList

const styles = StyleSheet.create({
  
  insertContainer : {
    flexDirection : 'row',
    padding : 20,
    gap : 15
  },

  iconBtn : {
    tintColor : 'black',
  },

  iconClick : {
    tintColor : 'red'
  },

  allList :{
    padding : 10,
    gap : 10,
    backgroundColor : 'grey',
    margin : 20
  }
})
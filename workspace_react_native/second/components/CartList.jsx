import { Image, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import icon_edit from '@/assets/icons/edit.png'
import icon_delete from '@/assets/icons/delete.png' //@ : 최상위 위치에서...~
import { icon } from '../constants/icons'
import { data } from '../data/data'
import MyTextInput from './MyTextInput'

const CartList = () => {
  const [cartList, setCartList] = useState(data);

  const [newItem, setNewItem] = useState('');

  

  return (
    <View>
      <Text>CartList</Text>

      {/* <Text>
        <Image source={icon_edit} />
        <Image source={icon_delete} />
        <Image source={icon.ICON_EDIT} />
      </Text> */}

      {/* <View style={styles.container} >
        <Text style={styles.title} >달걀 한 판</Text>
        <Image source={icon.ICON_EDIT}/>
        <Image source={icon.ICON_DELETE}/>
      </View> */}
      
      {/* 컴포넌트로 제작하면 좋음 */}
      {
        cartList.map((e, i) => {
          return(
            <View key={i} style={styles.container} >
              <Text style={styles.title} >{e.item}</Text>
              <Image source={icon.ICON_EDIT}/>
              <Image source={icon.ICON_DELETE}/>
              <Text>{e.id}</Text>
            </View>
          )
        })
      }

      <View>
        <TextInput 
          style={styles.insertInput}
          returnKeyType='next'
          autoCapitalize='none'
          spellCheck={false}
          autoCorrect={false}
          value={newItem}
          onChangeText={(text) => {setNewItem(text)}}

          // 키보드의 완료, Enter 키를 눌렀을 때, 실행되는 이벤트 속성
          onSubmitEditing={() => {
            //max 구하기 (방법 1)
            // let max = cartList[0].id

            // for (const e of cartList){
            //   if(max < e.id){
            //     max = e.id
            //   }
            // }
            
            // max 구하기방법 2
            const newList = cartList.map((e , i) => {return e.id})
            const max = Math.max( ...newList)

            //저장할 객체를 생성
            const newData = {
              id : max + 1,
              item : newItem
            };

            setCartList([
              ...cartList,
              newData
            ]);

            setNewItem('')
          }}
        />
      </View>

    </View>
  )
}

export default CartList

const styles = StyleSheet.create({
  container : {
    borderWidth : 1,
    margin : 12,
    backgroundColor : '#eeeeee',
    borderRadius : 4,
    padding : 10,
    flexDirection : 'row',
    alignItems : 'center',
    justifyContent : 'space-between',
    gap : 10
  },

  title : {
    flex : 1,
    borderWidth : 1,
    fontSize : 18,
  },

  insertInput : {
    borderWidth : 1,
    margin : 12,
    borderRadius : 4,
  }
})
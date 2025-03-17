import { Image, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { icon } from '../constants/icons'

const Task = ({e, cartList, setCartList}) => {
  //각 상품이 수정 상태인지, 수정 상태가 아닌지 판단하는 변수
  const [isEditing, setIsEditing] = useState(false);

  //input 태그에 입력한 데이터
  //주의 ! props로 전달된 데이터를 state 변수의 초기값으로 설정하면 안됨.
  const [newText, setNewText] = useState('');

  useEffect(() => {
    setNewText(e.item)
  }, [e]);

  //장바구니 목록 데이터 수정
  const handleCartList = () => {
    // 상품목록에서 현재 수정 중인 id 찾기
    // 찾은 상품의 item 속성값을 input태그에 입력한 값으로 변경
    


    // ------ 1번풀이 --------- //
    // const copyCartList = [...cartList];
    // for(const cart of copyCartList){
    //   if(cart.id === e.id){
    //     cart.item = newText;
    //   }
    // };
    // setCartList(copyCartList);
    // ------ 1번풀이 끝 --------- //



    // ------ 2번풀이 --------- //
    const copyCartList = [...cartList]
    const findCart = copyCartList.find((cart) => {return cart.id === e.id});
    findCart.item = newText;
    setCartList([...copyCartList]);
    // ------ 2번풀이 끝 --------- //
  };

  return (
    <View style={styles.container} >
      {
        isEditing ? 
        <TextInput 
          style={styles.textInput} 
          autoFocus={true} 
          onBlur={() => {
            setIsEditing(false);
            setNewText(e.item);
          }}
          onChangeText={(text) => {setNewText(text)}}
          value={newText}
          onSubmitEditing={() => {handleCartList()}}
        />
        :
        <>
          <Text style={styles.title} >{e.item}</Text>
        
          <Pressable onPress={() => {setIsEditing(true)}}>
            <Image source={icon.ICON_EDIT}/>
          </Pressable>
  
          <Image source={icon.ICON_DELETE}/>
        </>
      }
      
    </View>
  )
}

export default Task

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
    fontSize : 18,
  },

  textInput : {
    borderWidth : 1,
    borderRadius : 6,
    width : '100%'
  }
})
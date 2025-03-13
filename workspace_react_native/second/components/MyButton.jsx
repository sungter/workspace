import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { COLOR } from '../constants/colors'

const MyButton = ({size='normal', onPress, title = 'Button'}) => {
  return (
    <Pressable 
      //style={[styles.btnContainer, styles[size]]}
      style={(e) => {
        return [styles.btnContainer, styles[size], e.pressed && styles.pressed]
      }}
      onPress={onPress}
    >
      <Text style={styles.btn}>{title}</Text>
    </Pressable>
  )
}

export default MyButton

const styles = StyleSheet.create({
  btnContainer : {
    borderColor : COLOR.BTN_BACKGROUND_ACTIVE2_COLOR,
    borderWidth : 1,
    height : 34,
    borderRadius : 6,
    backgroundColor : COLOR.BTN_BACKGROUND_COLOR,
    justifyContent : 'center',
    alignItems : 'center',
    paddingVertical : 2,
    paddingHorizontal : 4
  },

  btn : {
    fontWeight : 'bold',
    color : COLOR.BTN_BACKGROUND_ACTIVE_COLOR,
    fontStyle : 'italic'
  },
  
  normal : {
    width : '30%'
  },
  
  large : {
    width : '60%'
  },

  full : {
    width : '100%'
  },

  pressed : {
    opacity : 0.7
  }
})
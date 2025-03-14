import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

const MyButton = ({size = 'normal', title = 'Button', ...props}) => {
  return (
    <Pressable
      style={(e) => {
        return [
          styles.myButton,
          styles[size]
        ]
      }}

      {...props}
    >
      <Text style={styles.btn}>{title}</Text>
    </Pressable>
  )
}

export default MyButton

const styles = StyleSheet.create({
  myButton : {
    borderWidth : 1,
    borderRadius : 6,
    height : 40,
    justifyContent : 'center',
    alignItems : 'center',
    paddingVertical : 2,
    paddingHorizontal : 4,
  },

  btn : {
    fontWeight : '700',
  },

  normal : {
    width : '20%'
  },

  large : {
    width : '60%'
  },

  full : {
    width : '100%'
  }
})
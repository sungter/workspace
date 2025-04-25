import { Image, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import face from '@/assets/images/face-01.jpg'
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';

const Profile = ({writer, createDate}) => {
  return (
    <View style={styles.container}>
      <View style={styles.profileContainer}>
        <Image source={face} style={styles.profileImg} />
        
        <View style={{gap : 4}}>
          <Text style={styles.writer}>{writer}</Text>
          <Text style={styles.createDate}>{createDate}</Text>
        </View>
      </View>
      
      <Pressable style={({pressed}) => [styles.dots, pressed && styles.dotsPress]}>
        <MaterialCommunityIcons name="dots-vertical" size={18} color="black" />
      </Pressable>
    </View>
  )
}

export default Profile

const styles = StyleSheet.create({
  container : {
    flexDirection : 'row',
    justifyContent : 'space-between',
    paddingBottom : 10,
  },

  profileContainer : {
    flexDirection : 'row',
    justifyContent : 'center',
    alignItems : 'center',
    gap : 12,
  },

  profileImg : {
    width : 50,
    height : 50,
    borderWidth : StyleSheet.hairlineWidth,
    borderRadius : 25,
  },

  writer : {
    fontSize : 18,
    fontWeight : 'bold',
  },

  createDate : {
    fontSize : 12,
    color : 'grey',
  },

  dots : {
    borderRadius : 25,
    justifyContent : 'center'
  },

  dotsPress : {
    backgroundColor : '#eee',
  }
})
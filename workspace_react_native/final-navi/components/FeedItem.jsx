import { Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import Octicons from '@expo/vector-icons/Octicons';
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';
import Profile from './Profile';

const FeedItem = ({item}) => {
  const [isLike, setIsLike] =useState(false);

  return (
    <View style={styles.feedContainer}>
      <Profile writer={item.writer} createDate={item.createDate} />

      <Text style={styles.title}>{item.title}</Text>
      
      <Text style={styles.content} numberOfLines={2}>{item.content}</Text>

      <View style={styles.menuContainer}>
        <Pressable style={styles.menu} onPress={() => setIsLike(prev => !prev)}>
          {
            isLike ? 
            <Octicons name="heart-fill" size={20} color="crimson" />
            :
            <Octicons name="heart" size={20} color="crimson" />
          }
          <Text style={isLike && {color : 'crimson'}} >{item.likeCnt}</Text>
        </Pressable>

        <Pressable style={styles.menu}>
          <Octicons name="comment" size={20} color="grey" />
          <Text>{item.replyCnt}</Text>
        </Pressable>
        
        <Pressable style={styles.menu}>
          <MaterialCommunityIcons name="eye-outline" size={20} color="grey" />
          <Text>{item.readCnt}</Text>
        </Pressable>

      </View>
    </View>
  )
}

export default FeedItem

const styles = StyleSheet.create({
  title : {
    fontSize : 24,
    marginBottom : 12,
  },

  content : {
    fontSize : 14,
    color : '#666666',
  },

  feedContainer : {
    padding : 16,
  },

  menuContainer : {
    flexDirection : 'row',
    justifyContent : 'space-around',
    alignItems : 'center',
    borderTopWidth : StyleSheet.hairlineWidth,
    marginTop : 16,
  },

  menu : {
    flexDirection : 'row',
    justifyContent : 'center',
    alignItems : 'center',
    gap : 10,
    paddingVertical : 16,
    flex : 1,
  },

})
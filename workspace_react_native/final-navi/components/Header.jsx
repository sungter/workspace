import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useRouter } from 'expo-router'
import { colors } from '../constants/colorConstant';

const Header = () => {
  const router = useRouter();

  return (
    <View style={styles.headerContainder}>
      <Text style={styles.headerTitle}>Header</Text>
      <View style={styles.loginStatus}>
        <Pressable onPress={() => router.push('/auth/login')}>
          <Text>로그인</Text>
        </Pressable>
        
        <Pressable onPress={() => router.push('/auth/join')}>
          <Text>회원가입</Text>
        </Pressable>
      </View>
    </View>
  )
}

export default Header

const styles = StyleSheet.create({
  headerContainder : {
    height : 60,
    backgroundColor : colors.ORANGE_600,
    borderBottomEndRadius : 10,
    borderBottomStartRadius : 10,
    flexDirection : 'row',
    alignItems : 'center',
    justifyContent : 'space-between',
  },

  loginStatus : {
    marginRight : 10,
    flexDirection : 'row',
    gap : 10,
  },

  headerTitle : {
    marginLeft : 10,
    fontSize : 30,
    color : colors.WHITE,
  },
})
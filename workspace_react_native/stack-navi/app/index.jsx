
import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useRouter } from 'expo-router'

// app/index.jsx
const HomeScreen = () => {
  //react에서 useNavigate() 같음
  const router = useRouter();

  return (
    <View>
      <Text>첫 페이지 입니다.</Text>

      <Pressable onPress={() => {router.push('/detail')}}>
        <Text>디테일로 이동</Text>
      </Pressable>

      <Pressable 
        onPress={() => {
          router.push({
            pathname : '/detail', //경로
            params : {id : 'React', age : 30}, //가져갈 데이터
          })
        }}
      >
        <Text>디테일로 이동(데이터 가져가기)</Text>
      </Pressable>
    </View>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})

import { FlatList, Pressable, StyleSheet, View } from 'react-native'
import React from 'react'

import FeedItem from '@/components/FeedItem';
import { dummyData } from '../../../apis/dummyData';
import FontAwesome from '@expo/vector-icons/FontAwesome';

const HomeScreen = () => {
  const data = dummyData;

  return (
    <View style={styles.container}>
      <FlatList
        data={data}
        renderItem={({item}) => <FeedItem item={item} /> }
        // renderItem={(item) => { return <FeedItem /> } } //중괄호 생략시는 return 빼고 쓸 수 있음
        keyExtractor={(item) => item.id}
        contentContainerStyle={styles.listContainer} //리스트 디자인
        //onEndReached={loadMoreItems} //스크롤 끝에 도달했을 때 실행 (무한 스크롤 구현 시 사용)

        //당겨서 새로고침
        // refreshing={isRefreshing}
        // onRefresh={handleRefresh}

        //스크롤바 보일지 여부
        // showsVerticalScrollIndicator={false}
      />
      
      <Pressable style={({pressed}) => [styles.writeBtn, pressed && styles.writeBtnPress]}>
        <FontAwesome name="pencil-square-o" size={44} color="black" />
      </Pressable>
    </View>
  )
}

export default HomeScreen

const styles = StyleSheet.create({
  container : {
    flex : 1,
    backgroundColor : 'white',
  },

  listContainer : {
    flex : 1,
    paddingVertical : 14,
  },

  writeBtn : {
    position : 'absolute',
    justifyContent : 'center',
    alignItems : 'center',
    bottom : 40,
    right : 30,
    padding : 12,
    borderRadius : 20,
  },

  writeBtnPress : {
    backgroundColor : '#eee'
  },
})
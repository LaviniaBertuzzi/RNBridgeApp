/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import { NativeModules, View, StyleSheet, TouchableOpacity, Text, Platform } from 'react-native';

const RNBridgeApp = () => {

  const {AlertModule} = NativeModules

  const onPress = () => {
    Platform.OS === 'android'
    ? AlertModule.showAlert('Android Alert on stage!')
    : AlertModule.showAlert('iOS Alert on stage')
  };

  return (
    <View style={styles.container}>
      <TouchableOpacity style={styles.button} onPress={onPress} >
        <Text style={styles.text}>Click to invoke your native code</Text>
      </TouchableOpacity>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#FFFFFF',
    justifyContent: 'center',
    alignItems: 'center',
  },
  button: {
    backgroundColor: '#000000',
    padding: 10,
    borderRadius: 5,
  },
  text: {
    color: '#FFFFFF',
    fontSize: 18,
  },
});

export default RNBridgeApp;

//
//  ToastModule.m
//  RNBridgeApp
//
//  Created by Lavinia Bertuzzi on 07/03/23.
//

#import "React/RCTBridgeModule.h"
#import <UIKit/UIKit.h>

@interface
RCT_EXTERN_MODULE(ToastModule, NSObject)
RCT_EXTERN_METHOD(showToast:(NSString *)message)

+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

@end

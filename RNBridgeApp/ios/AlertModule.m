//
//  AlertModule.m
//  RNBridgeApp
//
//  Created by Lavinia Bertuzzi on 07/03/23.
//

#import "React/RCTBridgeModule.h"
#import <UIKit/UIKit.h>

@interface
RCT_EXTERN_MODULE(AlertModule, NSObject)
RCT_EXTERN_METHOD(showAlert:(NSString *)message)

@end

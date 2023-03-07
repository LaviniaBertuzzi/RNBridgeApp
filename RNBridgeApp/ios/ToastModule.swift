//
//  ToastModule.swift
//  RNBridgeApp
//
//  Created by Lavinia Bertuzzi on 07/03/23.
//

import Foundation
import UIKit

@objc(ToastModule)
class ToastModule: NSObject {
  
  @objc func showToast(_ message: String) {
    let alertController = UIAlertController(title: "Done", message: message, preferredStyle: .alert)
    let okAction = UIAlertAction(title: "OK", style: .default, handler: nil)
    alertController.addAction(okAction)
    
    DispatchQueue.main.async {
      if let rootViewController = UIApplication.shared.keyWindow?.rootViewController {
        rootViewController.present(alertController, animated: true, completion: nil)
      }
    }
  }
}

//
//  AlertModule.swift
//  RNBridgeApp
//
//  Created by Lavinia Bertuzzi on 07/03/23.
//

import Foundation
import UIKit

@objc(AlertModule)
class AlertModule: NSObject {
  
  // MARK: - Public methods
  
  @objc func showAlert(_ message: String) {
    let alertController = UIAlertController(title: "Done", message: message, preferredStyle: .alert)
    let okAction = UIAlertAction(title: "OK", style: .default, handler: nil)
    alertController.addAction(okAction)
    self.presentAlertController(alertController)
  }
  
  // MARK: - Private methods
  
  private func presentAlertController(_ alertController: UIAlertController) {
    DispatchQueue.main.async {
      if let rootViewController = UIApplication.shared.keyWindow?.rootViewController {
        rootViewController.present(alertController, animated: true, completion: nil)
      }
    }
  }
}

/**
 * Provides the interface needed to register a bridge module
 */

extension AlertModule: RCTBridgeModule {
  
  static func requiresMainQueueSetup() -> Bool {
    return true
  }
  
  static func moduleName() -> String! {
    return "AlertModule"
  }
}

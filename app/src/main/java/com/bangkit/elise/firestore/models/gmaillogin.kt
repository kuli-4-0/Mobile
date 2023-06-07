package com.bangkit.elise.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.jvm.JvmField

public class gmaillogin {
  @JvmField
  @PropertyName("email")
  public var email: String? = null

  @JvmField
  @PropertyName("password")
  public var password: String? = null
}

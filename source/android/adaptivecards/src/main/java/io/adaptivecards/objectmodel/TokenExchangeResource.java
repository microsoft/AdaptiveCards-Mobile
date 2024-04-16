/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class TokenExchangeResource {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected TokenExchangeResource(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TokenExchangeResource obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_TokenExchangeResource(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TokenExchangeResource() {
    this(AdaptiveCardObjectModelJNI.new_TokenExchangeResource__SWIG_0(), true);
  }

  public TokenExchangeResource(String id, String uri, String providerId) {
    this(AdaptiveCardObjectModelJNI.new_TokenExchangeResource__SWIG_1(id, uri, providerId), true);
  }

  public String GetId() {
    return AdaptiveCardObjectModelJNI.TokenExchangeResource_GetId__SWIG_0(swigCPtr, this);
  }

  public void SetId(String arg0) {
    AdaptiveCardObjectModelJNI.TokenExchangeResource_SetId(swigCPtr, this, arg0);
  }

  public String GetUri() {
    return AdaptiveCardObjectModelJNI.TokenExchangeResource_GetUri__SWIG_0(swigCPtr, this);
  }

  public void SetUri(String arg0) {
    AdaptiveCardObjectModelJNI.TokenExchangeResource_SetUri(swigCPtr, this, arg0);
  }

  public String GetProviderId() {
    return AdaptiveCardObjectModelJNI.TokenExchangeResource_GetProviderId__SWIG_0(swigCPtr, this);
  }

  public void SetProviderId(String arg0) {
    AdaptiveCardObjectModelJNI.TokenExchangeResource_SetProviderId(swigCPtr, this, arg0);
  }

  public boolean ShouldSerialize() {
    return AdaptiveCardObjectModelJNI.TokenExchangeResource_ShouldSerialize(swigCPtr, this);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.TokenExchangeResource_Serialize(swigCPtr, this);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.TokenExchangeResource_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static TokenExchangeResource Deserialize(ParseContext context, JsonValue json) {
    long cPtr = AdaptiveCardObjectModelJNI.TokenExchangeResource_Deserialize(ParseContext.getCPtr(context), context, JsonValue.getCPtr(json), json);
    return (cPtr == 0) ? null : new TokenExchangeResource(cPtr, true);
  }

  public static TokenExchangeResource DeserializeFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.TokenExchangeResource_DeserializeFromString(ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new TokenExchangeResource(cPtr, true);
  }

}

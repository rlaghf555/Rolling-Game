/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: Y:\\app\\src\\main\\java\\com\\android\\vending\\licensing\\ILicensingService.aidl
 */
package com.android.vending.licensing;
public interface ILicensingService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.vending.licensing.ILicensingService
{
private static final java.lang.String DESCRIPTOR = "com.android.vending.licensing.ILicensingService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.vending.licensing.ILicensingService interface,
 * generating a proxy if needed.
 */
public static com.android.vending.licensing.ILicensingService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.vending.licensing.ILicensingService))) {
return ((com.android.vending.licensing.ILicensingService)iin);
}
return new com.android.vending.licensing.ILicensingService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
java.lang.String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_checkLicense:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
com.android.vending.licensing.ILicenseResultListener _arg2;
_arg2 = com.android.vending.licensing.ILicenseResultListener.Stub.asInterface(data.readStrongBinder());
this.checkLicense(_arg0, _arg1, _arg2);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements com.android.vending.licensing.ILicensingService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void checkLicense(long nonce, java.lang.String packageName, com.android.vending.licensing.ILicenseResultListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(nonce);
_data.writeString(packageName);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_checkLicense, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_checkLicense = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void checkLicense(long nonce, java.lang.String packageName, com.android.vending.licensing.ILicenseResultListener listener) throws android.os.RemoteException;
}


package org.nekoboard.fang;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.util.Log;

/**
 * This class provides adoption of high level operation on low level
 * and servs as wrapper. Handles typical operations as connecting to, disconnecting,
 * reestablishing connection, reading data in serial manner. Implements features for BLE
 * support.
 */
public class BluetoothConnector{

    public static String CONNECTED    = "bt-fang-connection-start";
    public static String DISCONNECTED = "bt-fang-connection-end";
    public static String FAILED       = "bt-fang-connection-failed";
    private static final String TAG   = "NekoboardFang";

    Context context;

    boolean connected = false;

    BluetoothDevice btDevice;
    BluetoothSocket btSocket;

    public BluetoothConnector(Context context){
        this.context = context;
    }

}
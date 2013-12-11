package org.apache.cordova.sounds;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import android.media.AudioManager;

public class Sounds extends CordovaPlugin {
	private AudioManager audioManager = null;
	 
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
		if(this.audioManager==null) {
			this.audioManager = (AudioManager) this.cordova.getActivity().getSystemService("audio");
		}
		
		if (action.equals("tick")) {
			this.audioManager.playSoundEffect(AudioManager.FX_KEY_CLICK);
		} else {
			return false;
		}

        callbackContext.success();
        return true;
    }

}

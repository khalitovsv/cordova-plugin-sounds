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
		
		if (action.equals("click")) {
			this.audioManager.playSoundEffect(AudioManager.FX_KEY_CLICK);
		} else
		if (action.equals("delete")) {
			this.audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_DELETE);
		} else
		if (action.equals("invalid") && android.os.Build.VERSION.SDK_INT>=19) {
			this.audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_INVALID);
		} else
		if (action.equals("return")) {
			this.audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_RETURN);
		} else
		if (action.equals("spacebar")) {
			this.audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_SPACEBAR);
		} else
		if (action.equals("standard")) {
			this.audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
		} else
		if (action.equals("down")) {
			this.audioManager.playSoundEffect(AudioManager.FX_FOCUS_NAVIGATION_DOWN);
		} else
		if (action.equals("left")) {
			this.audioManager.playSoundEffect(AudioManager.FX_FOCUS_NAVIGATION_LEFT);
		} else
		if (action.equals("right")) {
			this.audioManager.playSoundEffect(AudioManager.FX_FOCUS_NAVIGATION_RIGHT);
		} else
		if (action.equals("up")) {
			this.audioManager.playSoundEffect(AudioManager.FX_FOCUS_NAVIGATION_UP);
		} else
		{
			return false;
		}

        callbackContext.success();
        return true;
    }

}

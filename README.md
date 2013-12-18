Cordova Sounds Plugin (Android only)
------------------------------------
You can play native Android sounds with that plugin.

Installation (Cordova CLI)
--------------------------
To install this plugin, follow the [Command-line Interface Guide](http://cordova.apache.org/docs/en/edge/guide_cli_index.md.html#The%20Command-line%20Interface).

    cordova plugin add https://github.com/khalitovsv/cordova-plugin-sounds.git

Usage
-----
    navigator.sounds.click();     // KEY_CLICK (aka Tick)
    navigator.sounds.delete();    // FX_KEYPRESS_DELETE
    navigator.sounds.invalid();   // FX_KEYPRESS_INVALID (API Level >= 19)
    navigator.sounds.return();    // FX_KEYPRESS_RETURN
    navigator.sounds.spacebar();  // FX_KEYPRESS_SPACEBAR
    navigator.sounds.standard();  // FX_KEYPRESS_STANDARD
    navigator.sounds.down();      // FX_FOCUS_NAVIGATION_DOWN
    navigator.sounds.left();      // FX_FOCUS_NAVIGATION_LEFT
    navigator.sounds.right();     // FX_FOCUS_NAVIGATION_RIGHT
    navigator.sounds.up();        // FX_FOCUS_NAVIGATION_UP

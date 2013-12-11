cordova.define("org.apache.cordova.sounds.Sounds", function(require, exports, module) {
	var exec = require('cordova/exec');
	var sounds = {
		tick:function() {
			exec(null, null, "Sounds", "tick", []);
		}
	};
	module.exports = sounds;
});

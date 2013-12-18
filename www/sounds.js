var exec = require('cordova/exec');
var sounds = {
	'click': function() {
		exec(null, null, 'Sounds', 'click', []);
	},
	'delete': function() {
		exec(null, null, 'Sounds', 'delete', []);
	},
	'invalid': function() {
		exec(null, null, 'Sounds', 'invalid', []);
	},
	'return': function() {
		exec(null, null, 'Sounds', 'return', []);
	},
	'spacebar': function() {
		exec(null, null, 'Sounds', 'spacebar', []);
	},
	'standard': function() {
		exec(null, null, 'Sounds', 'standard', []);
	},
	'down': function() {
		exec(null, null, 'Sounds', 'down', []);
	},
	'left': function() {
		exec(null, null, 'Sounds', 'left', []);
	},
	'right': function() {
		exec(null, null, 'Sounds', 'right', []);
	},
	'up': function() {
		exec(null, null, 'Sounds', 'up', []);
	}
};
module.exports = sounds;

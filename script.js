var fun1 = function(name) {
    print('Hi there from Javascript, ' + name);
    return "greetings from javascript";
};

var fun2 = function (object) {
    print("JS Class Definition: " + Object.prototype.toString.call(object));
  
};


var testJava = function () {
var NashornTestInvokeJavaFromJS = Java.type('com.shadab.java.core.java8.nashorn.NashornTestInvokeJavaFromJS');

var result = NashornTestInvokeJavaFromJS.callMeFromJS('John Doe');
print(result);  
};
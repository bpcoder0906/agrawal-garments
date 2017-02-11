/**
 * 
 */

// IIFE - Immediately Invoked Function Expression
(function($, window, document) {

	// The $ is now locally scoped

	// Listen for the jQuery ready event on the document
	$(function() {

		function userLogin(dynamicData) {

			return $.ajax({
				
				headers: {
			        'Accept': 'application/json',
			        'Content-Type': 'application/json'
				},
				url : "userActions.html/login",
				type : "POST",
				data :dynamicData
			});
		}

		var ele = $("#login-btn");
		ele.on({ "click" : function() {
			console.log("login request***");
			var dynamicData={};

			dynamicData=JSON.stringify(ConvertFormToJSON($("#loginForm")));
			
			console.log(dynamicData);

			var response = userLogin(dynamicData);

			response.done(function(data) {
				// Updates the UI based the ajax result
				
				if(data==true){
					window.location.href = "/dashboard.html";  
				}else{
					alert("Invalid user credentials!");
				}
				
			});

			response.fail(function(data) {
				// Updates the UI based the ajax result
				alert(data);
			});

			}
		});
		
		function ConvertFormToJSON(form){
		    var array = jQuery(form).serializeArray();
		    var json = {};
		    
		    jQuery.each(array, function() {
		        json[this.name] = this.value || '';
		    });
		    
		    return json;
		}

	});

	// The rest of the code goes here!

}(window.jQuery, window, document));
// The global jQuery object is passed as a parameter
